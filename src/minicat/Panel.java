/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minicat;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

/**
 *
 * @author crufi
 */
public class Panel extends javax.swing.JPanel {

    int[] colores = new int[3];

    public Panel() {
        initComponents();
    }
    
    public void pintarBlanco(){
        Graphics g = this.getGraphics();
        Graphics2D g2d = (Graphics2D) g;
         g2d.setStroke(new BasicStroke(5));
        g2d.setColor(Color.white);
        g2d.fillRect(0, 0, 1000, 1000);
    }

    public void pintor(String texto) {
        String txt[];
        txt = texto.split(",|\\n");
        for (int i = 0; i < txt.length; i++) {
            try {
                switch (txt[i].charAt(0)) {
                    case 'L':
                        colores(txt, i);
                        coordenadas(txt, i, 2);
                        break;
                    case 'T':
                        colores(txt, i);
                        coordenadas(txt, i, 3);
                        break;
                    case 'R':
                        colores(txt, i);
                        coordenadas(txt, i, 4);
                        break;
                    case 'P':
                        if (txt[i].charAt(1) == 'e') {
                            colores(txt, i);
                            coordenadas(txt, i, 5);
                        } else {
                            colores(txt, i);
                            coordenadas(txt, i, Integer.valueOf(String.valueOf(txt[i].charAt(8))));
                        }
                        break;
                    default:
                        break;
                }
            } catch (Exception e) {
            }

        }
    }

    public void pintar(int[] x, int[] y) {
        Graphics g = this.getGraphics();
        Graphics2D g2d = (Graphics2D) g;
         g2d.setStroke(new BasicStroke(5));
        for (int i = 0; i < 3; i++) {
        }
        g2d.setColor(new Color(colores[2], colores[1], colores[0]));
        if (x.length == 2) {
            g2d.drawLine(x[0], y[0], x[1], y[1]);
        }
        g2d.fillPolygon(x, y, x.length);
    }

    public void colores(String[] txt, int i) {
        colores[0] = Integer.valueOf(txt[i - 1]);
        colores[1] = Integer.valueOf(txt[i - 2]);
        colores[2] = Integer.valueOf(txt[i - 3]);
    }

    public void coordenadas(String[] txt, int i, int puntos) {
        i = i - (puntos * 2) - 4;
        int[] y = new int[puntos];
        int[] x = new int[puntos];
        int k = 0;
        for (int j = 0; j < puntos * 2; j++) {
            if (j % 2 == 0) {
                int a = Integer.valueOf(txt[i]);
                x[k] = a;
            } else {
                int b = Integer.valueOf(txt[i]);
                y[k] = b;
                k++;
            }
            i++;
        }
        pintar(x, y);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
