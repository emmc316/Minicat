package minicat;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Control implements ActionListener, MouseListener, ChangeListener {

   
    Frame window = new Frame();
    int contadorClicks = 0;
    int contadorFiguras = 0;
    static String texto = "";

    public Control(Frame frame) {
        this.window = frame;
    }

    public Control() {
    }

    //Eventos de botones
    @Override
    public void actionPerformed(ActionEvent e) {
        int opcion;
        String archivo;
        switch (e.getActionCommand()) {
      
            case "i":
                encontrarFigura("i");
                window.panelPrincipal.pintarBlanco();
                window.panelPrincipal.pintor(texto);
                break;
            case "d":
                encontrarFigura("d");
                encontrarFigura("t");
                window.panelPrincipal.pintarBlanco();
                window.panelPrincipal.pintor(texto);
                break;
            case "a":
                encontrarFigura("a");
                window.panelPrincipal.pintarBlanco();
                window.panelPrincipal.pintor(texto);
                break;
            case "ab":
                encontrarFigura("ab");
                window.panelPrincipal.pintarBlanco();
                window.panelPrincipal.pintor(texto);
                break;
            case "+r":
                encontrarFigura("+r");
                window.panelPrincipal.pintarBlanco();
                window.panelPrincipal.pintor(texto);
                break;
            case "-r":
                encontrarFigura("-r");
                window.panelPrincipal.pintarBlanco();
                window.panelPrincipal.pintor(texto);
                break;
            case "+t":
                encontrarFigura("+t");
                window.panelPrincipal.pintarBlanco();
                window.panelPrincipal.pintor(texto);
                break;
            case "-t":
                encontrarFigura("-t");
                window.panelPrincipal.pintarBlanco();
                window.panelPrincipal.pintor(texto);
                break;
            default:
        }
    }

    public void encontrarFigura(String botonOrigen) {
        String txt[];
        txt = texto.split(",|\\n");
        int contador = 0;
        int lados = 0;
        for (int i = 0; i < txt.length; i++) {
            try {
                switch (txt[i].charAt(0)) {
                    case 'L':
                        lados = 2;
                        contador++;
                        break;
                    case 'T':
                        lados = 3;
                        contador++;
                        break;
                    case 'R':
                        lados = 4;
                        contador++;
                        break;
                    case 'P':
                        if (txt[i].charAt(1) == 'e') {
                            lados = 5;
                            contador++;
                        } else {
                            lados = Integer.valueOf(String.valueOf(txt[i].charAt(8)));
                            contador++;
                        }
                        break;
                    default:
                        break;
                }
            } catch (Exception e) {
            }
            if (contador == window.cbFiguras.getSelectedIndex() && window.cbFiguras.getSelectedIndex() != 0) {
                coordenadas(txt, i, lados, botonOrigen);
                i = txt.length;
            }
        }
    }

    public void coordenadas(String[] txt, int i, int puntos, String botonOrigen) {
        i = i - (puntos * 2) - 4;
        int[] y = new int[puntos];
        int[] x = new int[puntos];
        int k = 0;
        boolean band = true;
        for (int j = i; j < i + (puntos * 2); j++) {
            if (band) {
                int a = Integer.valueOf(txt[j]);
                x[k] = a;
                band = false;
            } else {
                int b = Integer.valueOf(txt[j]);
                y[k] = b;
                k++;
                band = true;
            }
        }
        switch (botonOrigen) {
            case "a":
                x = moverCoordenadas("x", botonOrigen, x, y);
                y = moverCoordenadas("y", botonOrigen, x, y);
                break;
            case "ab":
                x = moverCoordenadas("x", botonOrigen, x, y);
                y = moverCoordenadas("y", botonOrigen, x, y);
                break;
            case "d":
                x = moverCoordenadas("x", botonOrigen, x, y);
                y = moverCoordenadas("y", botonOrigen, x, y);
                break;
            case "i":
                x = moverCoordenadas("x", botonOrigen, x, y);
                y = moverCoordenadas("y", botonOrigen, x, y);
                break;
            case "r":
                x = moverCoordenadas("x", botonOrigen, x, y);
                y = moverCoordenadas("y", botonOrigen, x, y);
                break;
            case "t":
                x = moverCoordenadas("x", botonOrigen, x, y);
                y = moverCoordenadas("y", botonOrigen, x, y);
                break;
            case "+r":
                x = moverCoordenadas("x", botonOrigen, x, y);
                y = moverCoordenadas("y", botonOrigen, x, y);
                break;
            case "-r":
                x = moverCoordenadas("x", botonOrigen, x, y);
                y = moverCoordenadas("y", botonOrigen, x, y);
                break;
            case "+t":
                x = moverCoordenadas("x", botonOrigen, x, y);
                y = moverCoordenadas("y", botonOrigen, x, y);
                break;
            case "-t":
                x = moverCoordenadas("x", botonOrigen, x, y);
                y = moverCoordenadas("y", botonOrigen, x, y);
                break;
        }
        k = 0;
        String textoInicial = rearmarTexto(txt, puntos, i);
        band = true;
        for (int j = i; j < i + (puntos * 2); j++) {
            if (band) {
                txt[j] = String.valueOf(x[k]);
                band = false;
            } else {
                txt[j] = String.valueOf(y[k]);
                k++;
                band = true;
            }
        }
        String textoRemplazo = rearmarTexto(txt, puntos, i);
        texto = texto.replaceAll(textoInicial, textoRemplazo);

    }

    public String rearmarTexto(String[] txt, int puntos, int i) {
        String parteTexto = "";
        int k = 0;
        boolean band = true;
        for (int j = i; j < i + (puntos * 2) + 1; j++) {
            if (band && txt[j].length() > 0) {
                parteTexto += txt[j] + ",";
                band = false;
            } else {
                parteTexto += txt[j] + "\n";
                k++;
                band = true;
            }
            if (txt[j].length() == 0) {
                parteTexto += txt[j + 1] + "," + txt[j + 2] + "," + txt[j + 3] + "\n";
                parteTexto += txt[j + 4];
            }
        }
        return parteTexto;
    }

    public static String reemplazarTexto(String cadena, String busqueda, String reemplazo) {
        return cadena.replaceAll(busqueda, reemplazo);
    }

    public int[] moverCoordenadas(String xoy, String botonOrigen, int[] x, int[] y) {
        boolean band = true;
        if ("x".equals(xoy)) {
            switch (botonOrigen) {
                case "d":
                    for (int i = 0; i < x.length; i++) {
                        x[i] += 10;
                    }
                    break;
                case "i":
                    for (int i = 0; i < x.length; i++) {
                        x[i] -= 10;
                    }
                    break;
                case "+r":
                    for (int i = 0; i < x.length; i++) {
                        double angulo = 5;
                        double radian = x[i] * Math.cos(Math.toRadians(angulo));
                        radian -= y[i] * Math.sin(Math.toRadians(angulo));
                        x[i] = (int) radian;
                    }
                    break;
                case "-r":
                    for (int i = 0; i < x.length; i++) {
                        double angulo = 355;
                        double radian = x[i] * Math.cos(Math.toRadians(angulo));
                        radian -= y[i] * Math.sin(Math.toRadians(angulo));
                        x[i] = (int) radian;
                    }
                    break;
                case "+t":
                    for (int i = 0; i < x.length; i++) {
                        if (i % 2 == 0) {
                            x[i] = (int) (x[i] / 1.05);
                        } else {
                            x[i] = (int) (x[i] * 1.05);
                        }
                    }
                    break;
                case "-t":
                    for (int i = 0; i < x.length; i++) {
                        if (i % 2 == 0) {
                            x[i] = (int) (x[i] * 1.05);
                        } else {
                            x[i] = (int) (x[i] / 1.05);
                        }
                    }
                    break;
            }
            return x;
        } else {
            switch (botonOrigen) {
                case "a":
                    for (int i = 0; i < x.length; i++) {
                        y[i] -= 10;
                    }
                    break;
                case "ab":
                    for (int i = 0; i < x.length; i++) {
                        y[i] += 10;
                    }
                    break;
                case "+r":
                    for (int i = 0; i < x.length; i++) {
                        double angulo = 5;
                        double radian = x[i] * Math.sin(Math.toRadians(angulo));
                        radian += y[i] * Math.cos(Math.toRadians(angulo));
                        y[i] = (int) radian;
                    }
                    break;
                case "-r":
                    for (int i = 0; i < x.length; i++) {
                        double angulo = 355;
                        double radian = x[i] * Math.sin(Math.toRadians(angulo));
                        radian += y[i] * Math.cos(Math.toRadians(angulo));
                        y[i] = (int) radian;
                    }
                    break;
                case "+t":
                    for (int i = 0; i < x.length; i++) {
                        if (i % 2 == 0) {
                            y[i] = (int) (y[i] / 1.05);
                        } else {
                            y[i] = (int) (y[i] * 1.05);
                        }
                    }
                    break;
                case "-t":
                    for (int i = 0; i < x.length; i++) {
                        if (i % 2 == 0) {
                            y[i] = (int) (y[i] * 1.05);
                        } else {
                            y[i] = (int) (y[i] / 1.05);
                        }
                    }
                    break;
            }
            return y;
        }
    }

    //Eventos mouse
    @Override
    public void mouseClicked(MouseEvent me) {
        //Coordenadas linea
      /*  window.spR.setValue(255);
        window.spB.setValue(0);
        window.spG.setValue(0);*/
        if (window.rbLinea.isSelected()) {
            contadorClicks++;
            window.lbContador.setText("Puntos: " + String.valueOf(contadorClicks));
            texto += me.getX() + "," + me.getY() + "\n";
            if (contadorClicks == 2) {
                contadorClicks = 0;
                window.lbContador.setText("Puntos: 0");
                //texto += "\n" + String.valueOf(window.spR.getValue()) + "," + String.valueOf(window.spG.getValue()) + "," + String.valueOf(window.spB.getValue());
                texto += "\n255,0,0";
                texto += "\nLinea\n";
                window.cbFiguras.addItem("Linea" + contadorFiguras);
                contadorFiguras++;
                
            }
        } //Coordenadas triangulo
        else if (window.rbTriangulo.isSelected()) {
            contadorClicks++;
            window.lbContador.setText("Puntos: " + String.valueOf(contadorClicks));
            texto += me.getX() + "," + me.getY() + "\n";
            if (contadorClicks == 3) {
                contadorClicks = 0;
                window.lbContador.setText("Puntos: 0");
                //texto += "\n" + String.valueOf(window.spR.getValue()) + "," + String.valueOf(window.spG.getValue()) + "," + String.valueOf(window.spB.getValue());
                texto += "\n255,0,0";
                texto += "\nTriangulo\n";
                window.cbFiguras.addItem("Triangulo" + contadorFiguras);
                contadorFiguras++;
            }
        } //Coordenadas rectangulo
        else if (window.rbRectangulo.isSelected()) {
            contadorClicks++;
            window.lbContador.setText("Puntos: " + String.valueOf(contadorClicks));
            texto += me.getX() + "," + me.getY() + "\n";
            if (contadorClicks == 4) {
                contadorClicks = 0;
                window.lbContador.setText("Puntos: 0");
                //texto += "\n" + String.valueOf(window.spR.getValue()) + "," + String.valueOf(window.spG.getValue()) + "," + String.valueOf(window.spB.getValue());
                texto += "\n255,0,0";
                texto += "\nRectangulo\n";
                window.cbFiguras.addItem("Rectangulo" + contadorFiguras);
                contadorFiguras++;
            }
        } //Coordenadas pentagono
        else if (window.rbPentagono.isSelected()) {
            contadorClicks++;
            window.lbContador.setText("Puntos: " + String.valueOf(contadorClicks));
            texto += me.getX() + "," + me.getY() + "\n";
            if (contadorClicks == 5) {
                contadorClicks = 0;
                window.lbContador.setText("Puntos: 0");
                //texto += "\n" + String.valueOf(window.spR.getValue()) + "," + String.valueOf(window.spG.getValue()) + "," + String.valueOf(window.spB.getValue());
                texto += "\n255,0,0";
                texto += "\nPentagono\n";
                window.cbFiguras.addItem("Pentagono" + contadorFiguras);
                contadorFiguras++;
            }
        } //Coordenadas poligono
        else if (window.rbPoligono.isSelected()) {
            contadorClicks++;
            window.lbContador.setText("Puntos: " + String.valueOf(contadorClicks));
            texto += me.getX() + "," + me.getY() + "\n";
            if (contadorClicks == (Integer) window.spLado.getValue()) {
                contadorClicks = 0;
                window.lbContador.setText("Puntos: 0");
                //texto += "\n" + String.valueOf(window.spR.getValue()) + "," + String.valueOf(window.spG.getValue()) + "," + String.valueOf(window.spB.getValue());
                texto += "\n255,0,0";
                texto += "\nPoligono" + window.spLado.getValue() + "\n";
                window.cbFiguras.addItem("Poligono" + window.spLado.getValue() + " " + contadorFiguras);
                contadorFiguras++;
            }
        }
        window.panelPrincipal.pintor(texto);
    }

    @Override
    public void mousePressed(MouseEvent me) {
    }

    @Override
    public void mouseReleased(MouseEvent me) {
    }

    @Override
    public void mouseEntered(MouseEvent me) {
    }

    @Override
    public void mouseExited(MouseEvent me) {
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        //window.pnColor.setBackground(new Color((Integer) window.spR.getValue(), (Integer) window.spG.getValue(), (Integer) window.spB.getValue()));
    }

}
