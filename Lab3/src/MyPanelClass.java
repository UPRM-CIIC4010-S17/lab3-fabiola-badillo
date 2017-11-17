import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Polygon;
import java.awt.Rectangle;

import javax.swing.JPanel;
 
public class MyPanelClass extends JPanel {
            /**
	 * 
	 */
	private static final long serialVersionUID = 7057541440811488699L;

			public void paintComponent(Graphics g) {
                        super.paintComponent(g);
 
                        //Compute interior coordinates
                        Insets myInsets = this.getInsets();
                        int x1 = myInsets.left;
                        int y1 = myInsets.top;
                        int x2 = getWidth() - myInsets.right - 1;
                        int y2 = getHeight() - myInsets.bottom - 1;
                        int width = x2 - x1;
                        int height = y2 - y1;
 
                        //Paint the background
                        //g.setColor(Color.GREEN);
                        //g.fillRect(x1, y1, width + 1, height + 1);
                      //Draw a border
                        //g.setColor(Color.RED);
                        //g.drawRect(x1, y1, width, height);
                        //g.setColor(Color.BLACK);
                        //g.drawRect(x1+20, y1+20, width-40, height-40);
                        //g.setColor(Color.WHITE);
                        //g.drawLine(x1, y1, x2, y2);
                        //g.setColor(Color.BLUE);
                        //g.drawLine(x2, y1, x1, y2);
                        
                        //g.setColor(Color.CYAN);
                        //g.fillOval(width/2 -27, height/2 -27, 55, 55);
                        
                       /* Polygon p = new Polygon();
                        p.addPoint(x1 + 5, y1 + 25);
                        p.addPoint(x1 + 20, y1 + 10);
                        p.addPoint(x1 + 35, y1 + 25);
                        p.addPoint(x1 + 25, y1 + 25);
                        p.addPoint(x1 + 25, y1 + 45);
                        p.addPoint(x1 + 15, y1 + 45);
                        p.addPoint(x1 + 15, y1 + 25);
                        g.setColor(Color.DARK_GRAY);
                        g.fillPolygon(p);*/
                        
                     /*   Polygon p2 = new Polygon();//star
                        p2.addPoint(x1 + 25, y1 + 73);
                        p2.addPoint(x1 + 41, y1 + 73);
                        p2.addPoint(x1 + 47, y1 + 58);
                        p2.addPoint(x1 + 53, y1 + 73);
                        p2.addPoint(x1 + 69, y1 + 73);
                        p2.addPoint(x1 + 56, y1 + 83);
                        p2.addPoint(x1 + 61, y1 + 98);
                        p2.addPoint(x1 + 47, y1 + 88);
                        p2.addPoint(x1 + 34, y1 + 98);
                        p2.addPoint(x1 + 38, y1 + 83);
                        g.setColor(Color.RED);
                        g.drawPolygon(p2);*/
                        
                    //Puerto Rico Flag
                        g.setColor(Color.RED);
                        g.fillRect(x1, y1, width + 1, height + 1);
                      //stripes
                        g.setColor(Color.WHITE);
                        g.fillRect(0, height/5, width, height/5);
                        g.fillRect(0, (3*height)/5, width, height/5);
                       
                       //triangle
                        Polygon p3 = new Polygon();
                        p3.addPoint(x1, y1);
                        p3.addPoint(width/2, height/2);
                        p3.addPoint(x1, height);
                        g.setColor(Color.BLUE);
                        g.fillPolygon(p3); 
                        
                        Polygon p2 = new Polygon();//star
                        p2.addPoint(x1 + 25*3, y1 + 73*3);
                        p2.addPoint(x1 + 41*3, y1 + 73*3);
                        p2.addPoint(x1 + 47*3, y1 + 58*3);
                        p2.addPoint(x1 + 53*3, y1 + 73*3);
                        p2.addPoint(x1 + 69*3, y1 + 73*3);
                        p2.addPoint(x1 + 56*3, y1 + 83*3);
                        p2.addPoint(x1 + 61*3, y1 + 98*3);
                        p2.addPoint(x1 + 47*3, y1 + 88*3);
                        p2.addPoint(x1 + 34*3, y1 + 98*3);
                        p2.addPoint(x1 + 38*3, y1 + 83*3);
                        p2.translate(width/200 - 55, height/100 - 75);
                        g.setColor(Color.WHITE);
                        g.fillPolygon(p2);
                        
                                                
                     
                        /*Polygon p2 = new Polygon();//star
                        int xBar = width / 10;
                        int yBar = height / 2;
                        int scalarFactorX = width/300;
                        int scalarFactorY = height/300;
                        p2.addPoint(((x1 + 25 - xBar)*scalarFactorX) + xBar , ((y1 + 73 - yBar)*scalarFactorY) + yBar);
                        p2.addPoint(((x1 + 41 - xBar)*scalarFactorX) + xBar, ((y1 + 73 - yBar)*scalarFactorY) + yBar);
                        p2.addPoint(((x1 + 47 - xBar)*scalarFactorX) + xBar, ((y1 + 58 - yBar)*scalarFactorY) + yBar);
                        p2.addPoint(((x1 + 53 - xBar)*scalarFactorX) + xBar, ((y1 + 73 - yBar)*scalarFactorY) + yBar);
                        p2.addPoint(((x1 + 69 - xBar)*scalarFactorX) + xBar, ((y1 + 73 - yBar)*scalarFactorY) + yBar);
                        p2.addPoint(((x1 + 56 - xBar)*scalarFactorX) + xBar, ((y1 + 83 - yBar)*scalarFactorY) + yBar);
                        p2.addPoint(((x1 + 61 - xBar)*scalarFactorX) + xBar, ((y1 + 98 - yBar)*scalarFactorY) + yBar);
                        p2.addPoint(((x1 + 47 - xBar)*scalarFactorX) + xBar, ((y1 + 88 - yBar)*scalarFactorY) + yBar);
                        p2.addPoint(((x1 + 34 - xBar)*scalarFactorX) + xBar, ((y1 + 98 - yBar)*scalarFactorY) + yBar);
                        p2.addPoint(((x1 + 38 - xBar)*scalarFactorX) + xBar, ((y1 + 83 - yBar)*scalarFactorY) + yBar);
                        g.setColor(Color.WHITE);
                        g.fillPolygon(p2);*/

                        
                        
                      
            }
			
}