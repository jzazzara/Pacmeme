// FinalProject.java
// Student Version


import java.awt.*;
import java.applet.*;


public class FinalProject extends Applet
{

	public void paint(Graphics g)
	{
		
		//Background Graphics
		Expo.setBackground(g,Expo.black);
		Expo.setColor(g,Expo.blue);
		Expo.drawRoundedRectangle(g, 50, 50, 250, 175, 4); //1
		Expo.drawRoundedRectangle(g, 0, 225, 100, 300, 4); //2
		Expo.drawRoundedRectangle(g, 0, 350, 100, 425, 4); //3
		Expo.drawRoundedRectangle(g, 50, 475, 100, 525, 4); //4
		Expo.drawRoundedRectangle(g, 150, 225, 250, 350, 4); //5
		Expo.drawRoundedRectangle(g, 150, 400, 200, 575, 4); //6
		Expo.drawRoundedRectangle(g, 50, 575, 300, 600, 4 ); //7
		Expo.drawRoundedRectangle(g, 250, 450, 300, 525, 4); //8
		Expo.drawRoundedRectangle(g, 300, 175, 325, 400, 4); //9
		Expo.drawRoundedRectangle(g, 300, 50, 425, 125, 4); //10
		Expo.drawRoundedRectangle(g, 350, 550, 400, 649, 4); //11
		Expo.drawRoundedRectangle(g, 475, 0, 525, 125, 4); //12
		Expo.drawRoundedRectangle(g, 375, 175, 625, 200, 4); //13
		Expo.drawRoundedRectangle(g, 475, 200, 525, 250, 4); //14
		Expo.drawRoundedRectangle(g, 375, 300, 625, 400, 4); //15, 16, 17
		Expo.drawRoundedRectangle(g, 350, 450, 650, 500, 4); //18
		Expo.drawRoundedRectangle(g, 450, 500, 550, 550, 4); //19
		Expo.drawRoundedRectangle(g, 450, 600, 550, 650, 4); //20
		Expo.drawRoundedRectangle(g, 575, 50, 700, 125, 4); //21
		Expo.drawRoundedRectangle(g, 675, 175, 700, 400, 4); //22
		Expo.drawRoundedRectangle(g, 700, 450, 750, 525, 4); //23
		Expo.drawRoundedRectangle(g, 600, 550, 650, 649, 4); //24
		Expo.drawRoundedRectangle(g, 750, 50, 950, 175, 4); //25
		Expo.drawRoundedRectangle(g, 750, 225, 850, 350, 4); //26
		Expo.drawRoundedRectangle(g, 900, 225, 1000, 300, 4); //27
		Expo.drawRoundedRectangle(g, 900, 350, 1000, 425, 4); //28
		Expo.drawRoundedRectangle(g, 800, 400, 850, 575, 4); //29
		Expo.drawRoundedRectangle(g, 700, 575, 950, 600, 4); //30
		Expo.drawRoundedRectangle(g, 900, 475, 950, 525, 4); //31
		Expo.drawRoundedRectangle(g, 0, 1, 1000, 650, 4); //Outside Box
		
		Expo.setColor(g, Expo.black);
		Expo.fillRectangle(g, 0, 300, 5, 350); //Left Black Thing
		Expo.fillRectangle(g, 999, 300, 1005, 350); //Right Black Thing
		
		//Dots
		Expo.setColor(g, Expo.yellow);
		
	}
		
	public void init()
	{
		Rectangle area1 = new Rectangle(50, 50, 200, 125); //1
		Rectangle area2 = new Rectangle(0, 225, 100, 75); //2
		Rectangle area3 = new Rectangle(0, 350, 100, 75); //3
		Rectangle area4 = new Rectangle(50, 475, 50, 50); //4
		Rectangle area5 = new Rectangle(150, 225, 100, 125); //5
		Rectangle area6 = new Rectangle(150, 400, 50, 175); //6
		Rectangle area7 = new Rectangle(50, 575, 50, 25); //7
		Rectangle area8 = new Rectangle(250, 450, 250, 75); //8
		Rectangle area9 = new Rectangle(300, 175, 50, 225); //9
		Rectangle area10 = new Rectangle(300, 50, 25, 75); //10
		Rectangle area11 = new Rectangle(350, 550, 125, 99); //11
		Rectangle area12 = new Rectangle(475, 0, 50, 125); //12
		Rectangle area13 = new Rectangle(375, 175, 50, 25); //13
		Rectangle area14 = new Rectangle(475, 200, 225, 50); //14
		Rectangle area151617 = new Rectangle(375, 300, 50, 100); //15, 16, 17
		Rectangle area18 = new Rectangle(350, 450, 225, 50); //18
		Rectangle area19 = new Rectangle(450, 500, 300, 50); //19
		Rectangle area20 = new Rectangle(450, 600, 100, 50); //20
		Rectangle area21 = new Rectangle(575, 50, 125, 75); //21
		Rectangle area22 = new Rectangle(675, 175, 25, 225); //22
		Rectangle area23 = new Rectangle(700, 450, 50, 75); //23
		Rectangle area24 = new Rectangle(600, 550, 50, 99); //24
		Rectangle area25 = new Rectangle(750, 50, 200, 125); //25
		Rectangle area26 = new Rectangle(750, 225, 100, 125); //26
		Rectangle area27 = new Rectangle(900, 225, 100, 75); //27
		Rectangle area28 = new Rectangle(900, 350, 100, 75); //28
		Rectangle area29 = new Rectangle(800, 400, 50, 175); //29
		Rectangle area30 = new Rectangle(700, 575, 250, 25); //30
		Rectangle area31 = new Rectangle(900, 475, 50, 50); //31
		Rectangle areaOutside = new Rectangle(0, 1, 1000, 649); //Outside Box
		
		
	}
	
	
}



