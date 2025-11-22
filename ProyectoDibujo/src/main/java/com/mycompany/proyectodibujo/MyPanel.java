/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectodibujo;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.RenderingHints;
import java.awt.geom.AffineTransform;
import java.awt.geom.Arc2D;
import java.awt.geom.CubicCurve2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import javax.swing.JPanel;

/**
 *
 * @author Fox
 */
public class MyPanel extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
       
        
        float grosorLinea = 4.0f; // El grosor se especifica como float
        BasicStroke stroke = new BasicStroke(grosorLinea);
        g2d.setStroke(stroke);
        
        //Cabeza
        AffineTransform OG = g2d.getTransform();
        AffineTransform Cabeza = new AffineTransform();
        Cabeza.rotate(Math.toRadians(175), 450, 200);
        g2d.setTransform(Cabeza);
        g2d.draw(new Arc2D.Double(450, 200, 90, 60, 50, 100, Arc2D.OPEN));
        g2d.setTransform(OG);
        
        AffineTransform Cabeza1 = new AffineTransform();
        Cabeza1.rotate(Math.toRadians(215), 496, 228);
        g2d.setTransform(Cabeza1);
        g2d.draw(new Arc2D.Double(496, 228, 90, 60, 60, 100, Arc2D.OPEN));
        g2d.setTransform(OG);
        
        AffineTransform Cabeza2 = new AffineTransform();
        Cabeza2.rotate(Math.toRadians(230), 553, 267);
        g2d.setTransform(Cabeza2);
        g2d.draw(new Arc2D.Double(553, 267, 100, 30, 60, 100, Arc2D.OPEN));
        g2d.setTransform(OG);   
        
        g2d.drawLine(560, 260, 583, 322);
        
        AffineTransform Cabeza3 = new AffineTransform();
        Cabeza3.rotate(Math.toRadians(150), 385, 212);
        g2d.setTransform(Cabeza3);
        g2d.draw(new Arc2D.Double(385, 212, 70, 50, 50, 100, Arc2D.OPEN));
        g2d.setTransform(OG);
        
        AffineTransform Cabeza4 = new AffineTransform();
        Cabeza4.rotate(Math.toRadians(110), 344, 224);
        g2d.setTransform(Cabeza4);
        g2d.draw(new Arc2D.Double(344, 224, 100, 60, 50, 80, Arc2D.OPEN));
        g2d.setTransform(OG);
        
        g2d.drawLine(310, 300, 318, 335);
        
        AffineTransform Cabeza5 = new AffineTransform();
        Cabeza5.rotate(Math.toRadians(180), 647, 420);
        g2d.setTransform(Cabeza5);
        g2d.draw(new Arc2D.Double(647, 420, 400, 710, 50, 83, Arc2D.OPEN));
        g2d.setTransform(OG);
        
        //Cara
        g2d.fillOval(360, 275, 60, 60);
        g2d.fillOval(490, 275, 60, 60);
        g2d.setColor(Color.WHITE);
        g2d.fillOval(378, 283, 30, 25);
        g2d.fillOval(508, 283, 30, 25);
        
        g2d.setColor(Color.BLACK);
        int [] Narizx = {455, 435, 475};
        int [] Narizy = {330, 310, 310};
        
        g2d.fillPolygon(Narizx, Narizy, 3);
        
        AffineTransform Boca = new AffineTransform();
        Boca.rotate(Math.toRadians(160), 465, 340);
        g2d.setTransform(Boca);
        g2d.draw(new Arc2D.Double(465, 340, 50, 90, 35, 85, Arc2D.OPEN));
        g2d.setTransform(OG);
        
        AffineTransform Boca1 = new AffineTransform();
        Boca1.rotate(Math.toRadians(170), 498, 345);
        g2d.setTransform(Boca1);
        g2d.draw(new Arc2D.Double(498, 345, 50, 90, 45, 85, Arc2D.OPEN));
        g2d.setTransform(OG);
        
        float GrosorLinea = 2.0f; // El grosor se especifica como float
        BasicStroke stroke3 = new BasicStroke(GrosorLinea);
        g2d.setStroke(stroke3);
        
        int [] Colmillox = {435, 428, 442};
        int [] Colmilloy = {359, 349, 349};
        
        g2d.drawPolygon(Colmillox, Colmilloy, 3);
        
        int [] colmillox = {472, 465, 479};
        int [] colmilloy = {359, 349, 349};
        
        g2d.drawPolygon(colmillox, colmilloy, 3);
        
        g2d.draw(new Ellipse2D.Double(438, 329, 2, 2));
        g2d.draw(new Ellipse2D.Double(426, 331, 2, 2));
        g2d.draw(new Ellipse2D.Double(432, 324, 2, 2));
        g2d.draw(new Ellipse2D.Double(432, 336, 2, 2));
        g2d.draw(new Ellipse2D.Double(424, 322, 2, 2));
        
        g2d.draw(new Ellipse2D.Double(462, 329, 2, 2));
        g2d.draw(new Ellipse2D.Double(475, 331, 2, 2));
        g2d.draw(new Ellipse2D.Double(468, 324, 2, 2));
        g2d.draw(new Ellipse2D.Double(468, 336, 2, 2));
        g2d.draw(new Ellipse2D.Double(476, 322, 2, 2));
        
        //Orejas
        g2d.setStroke(stroke);
        g2d.drawLine(310, 205, 370,160);
        
        g2d.draw(new Arc2D.Double(308, 116, 60,130, 50, 150, Arc2D.OPEN));
        
        g2d.draw(new Line2D.Double(370, 160, 359, 134));
        
        g2d.drawLine(518, 160, 580,205);
             
        AffineTransform Oreja = new AffineTransform();
        Oreja.rotate(Math.toRadians(50), 600, 80);
        g2d.setTransform(Oreja);
        g2d.draw(new Arc2D.Double(605, 107, 60 ,120, 50, 155, Arc2D.OPEN));
        g2d.setTransform(OG);
        
        g2d.draw(new Line2D.Double(580, 205, 602, 150));
        
        float grosorLineas = 3.0f; // El grosor se especifica como float
        BasicStroke stroke1 = new BasicStroke(grosorLineas);
        g2d.setStroke(stroke1);
        g2d.drawLine(320, 197, 325, 150);
        
        g2d.draw(new Arc2D.Double(300, 150, 70, 50, 30, 70, Arc2D.OPEN));
        
        g2d.drawLine(570, 197, 569, 150);
        
        g2d.draw(new Arc2D.Double(530, 150, 70, 100, 80, 70, Arc2D.OPEN));
        
        //Melena
        g2d.setStroke(stroke);
        AffineTransform Melena = new AffineTransform();
        Melena.rotate(Math.toRadians(-20), 400, 100);
        g2d.setTransform(Melena);
        g2d.draw(new Arc2D.Double(332, 100, 90, 80, 30, 100, Arc2D.OPEN));
        g2d.setTransform(OG);
        
        AffineTransform Melena1 = new AffineTransform();
        Melena1.rotate(Math.toRadians(-20), 400, 100);
        g2d.setTransform(Melena1);
        g2d.draw(new Arc2D.Double(396, 112, 85, 120, 30, 90, Arc2D.OPEN));
        g2d.setTransform(OG);
        
        AffineTransform Melena2 = new AffineTransform();
        Melena2.rotate(Math.toRadians(10), 480, 100);
        g2d.setTransform(Melena2);
        g2d.draw(new Arc2D.Double(478, 96, 70, 130, 40, 92, Arc2D.OPEN));
        g2d.setTransform(OG);
        
        g2d.drawLine(536, 130, 551, 128);
        
        AffineTransform Melena3 = new AffineTransform();
        Melena3.rotate(Math.toRadians(55), 590, 160);
        g2d.setTransform(Melena3);
        g2d.draw(new Arc2D.Double(590, 160, 100, 70, 30, 100, Arc2D.OPEN));
        g2d.setTransform(OG);
        
        AffineTransform Melena4 = new AffineTransform();
        Melena4.rotate(Math.toRadians(140), 666, 293);
        g2d.setTransform(Melena4);
        g2d.draw(new Arc2D.Double(666, 293, 100, 100, 70, 120, Arc2D.OPEN));
        g2d.setTransform(OG);
        
        AffineTransform Melena5 = new AffineTransform();
        Melena5.rotate(Math.toRadians(150), 625, 360);
        g2d.setTransform(Melena5);
        g2d.draw(new Arc2D.Double(625, 360, 130, 50, 80, 110, Arc2D.OPEN));
        g2d.setTransform(OG);
        
        AffineTransform Melena6 = new AffineTransform();
        Melena6.rotate(Math.toRadians(185), 552, 445);
        g2d.setTransform(Melena6);
        g2d.draw(new Arc2D.Double(552, 445, 130, 80, 80, 110, Arc2D.OPEN));
        g2d.setTransform(OG);
        
        AffineTransform Melena7 = new AffineTransform();
        Melena7.rotate(Math.toRadians(225), 433, 478);
        g2d.setTransform(Melena7);
        g2d.draw(new Arc2D.Double(433, 478, 130, 99, 80, 110, Arc2D.OPEN));
        g2d.setTransform(OG);
        
        AffineTransform Melena8 = new AffineTransform();
        Melena8.rotate(Math.toRadians(185), 414, 429);
        g2d.setTransform(Melena8);
        g2d.draw(new Arc2D.Double(414, 429, 130, 99, 40, 75, Arc2D.OPEN));
        g2d.setTransform(OG);
        
        AffineTransform Melena9 = new AffineTransform();
        Melena9.rotate(Math.toRadians(255), 285, 419);
        g2d.setTransform(Melena9);
        g2d.draw(new Arc2D.Double(285, 419, 90, 140, 50, 85, Arc2D.OPEN));
        g2d.setTransform(OG);
        
        AffineTransform Melena10 = new AffineTransform();
        Melena10.rotate(Math.toRadians(235), 293, 365);
        g2d.setTransform(Melena10);
        g2d.draw(new Arc2D.Double(293, 365, 90, 150, 40, 75, Arc2D.OPEN));
        g2d.setTransform(OG);
        
        AffineTransform Melena11 = new AffineTransform();
        Melena11.rotate(Math.toRadians(275), 248, 292);
        g2d.setTransform(Melena11);
        g2d.draw(new Arc2D.Double(248, 292, 80, 120, 40, 95, Arc2D.OPEN));
        g2d.setTransform(OG);
        
        AffineTransform Melena12 = new AffineTransform();
        Melena12.rotate(Math.toRadians(292), 254, 232);
        g2d.setTransform(Melena12);
        g2d.draw(new Arc2D.Double(254, 232, 100, 120, 40, 95, Arc2D.OPEN));
        g2d.setTransform(OG);
        
        //Patas Delanteras
        g2d.drawLine(360, 424, 395, 505);
        g2d.drawLine(460, 452, 490, 505);
        
        g2d.drawOval(472, 504, 65, 58);
        g2d.drawOval(426, 504, 65, 58);
        g2d.drawOval(382, 504, 65, 58);
        
        g2d.setColor(new Color(214, 217, 223));
        g2d.fillOval(428, 507, 61, 54);
        
        g2d.setColor(Color.BLACK);
        AffineTransform PataD = new AffineTransform();
        PataD.rotate(Math.toRadians(110), 540, 426);
        g2d.setTransform(PataD);
        g2d.draw(new Arc2D.Double(540, 426, 100, 40, 50, 90, Arc2D.OPEN));
        g2d.setTransform(OG);
        
        //Patas Traseras
        AffineTransform PataT = new AffineTransform();
        PataT.rotate(Math.toRadians(170), 430, 436);
        g2d.setTransform(PataT);
        g2d.draw(new Arc2D.Double(430, 436, 120, 100, 40, 45, Arc2D.OPEN));
        g2d.setTransform(OG);
        
        AffineTransform PataT1 = new AffineTransform();
        PataT1.rotate(Math.toRadians(100), 337, 374);
        g2d.setTransform(PataT1);
        g2d.draw(new Arc2D.Double(337, 374, 120, 100, 40, 45, Arc2D.OPEN));
        g2d.setTransform(OG);
        
        AffineTransform PataT2 = new AffineTransform();
        PataT2.rotate(Math.toRadians(20), 210, 434);
        g2d.setTransform(PataT2);
        g2d.draw(new Arc2D.Double(210, 430, 120, 100, 20, 25, Arc2D.OPEN));
        g2d.setTransform(OG);
        
        g2d.drawOval(288, 502, 55, 48);
        g2d.drawOval(255, 502, 55, 48);
        g2d.drawOval(222, 502, 55, 48);
        
        g2d.setColor(new Color(214, 217, 223));
        g2d.fillOval(257, 505, 51, 44);
        
        g2d.setColor(Color.BLACK);
        g2d.drawLine(245, 502, 266, 465);
        
        AffineTransform PataT3 = new AffineTransform();
        PataT3.rotate(Math.toRadians(280), 255, 467);
        g2d.setTransform(PataT3);
        g2d.draw(new Arc2D.Double(255, 467, 102, 40, 50, 100, Arc2D.OPEN));
        g2d.setTransform(OG);
        
        //Cola
        AffineTransform Cola = new AffineTransform();
        Cola.rotate(Math.toRadians(170), 284, 391);
        g2d.setTransform(Cola);
        g2d.draw(new Arc2D.Double(284, 391, 80, 50, 40, 100, Arc2D.OPEN));
        g2d.setTransform(OG);
        
        AffineTransform Cola1 = new AffineTransform();
        Cola1.rotate(Math.toRadians(200), 258, 448);
        g2d.setTransform(Cola1);
        g2d.draw(new Arc2D.Double(258, 448, 80, 50, 40, 120, Arc2D.OPEN));
        g2d.setTransform(OG);
        
        AffineTransform Cola2 = new AffineTransform();
        Cola2.rotate(Math.toRadians(210), 192, 421);
        g2d.setTransform(Cola2);
        g2d.draw(new Arc2D.Double(192, 421, 60, 20, 40, 110, Arc2D.OPEN));
        g2d.setTransform(OG);
        
        AffineTransform Cola3 = new AffineTransform();
        Cola3.rotate(Math.toRadians(275), 150, 413);
        g2d.setTransform(Cola3);
        g2d.draw(new Arc2D.Double(150, 413, 80, 20, 10, 110, Arc2D.OPEN));
        g2d.setTransform(OG);
        
        AffineTransform Cola4 = new AffineTransform();
        Cola4.rotate(Math.toRadians(235), 205, 407);
        g2d.setTransform(Cola4);
        g2d.draw(new Arc2D.Double(205, 407, 80, 20, 10, 90, Arc2D.OPEN));
        g2d.setTransform(OG);
        
        g2d.drawLine(189, 380, 182, 350);
        g2d.drawLine(195, 412, 215, 385);
        
        AffineTransform Cola5 = new AffineTransform();
        Cola5.rotate(Math.toRadians(25), 150, 307);
        g2d.setTransform(Cola5);
        g2d.draw(new Arc2D.Double(160, 331, 90, 100, 40, 60, Arc2D.OPEN));
        g2d.setTransform(OG);
    }
}
