// Write the code to draw a tower of blocks that looks like the one in the link below:
// http://i.imgur.com/PvIGJkL.png
    
// Name the class BlockTower. Each block has a width of 40 and a height of 30. 
// There are three rows. The upper left-hand corner of the bottom row is at (20, 70)

// Create a custom color for the topmost color where red = 125, green=125, blue = 255. 
// For all the other colors, use predefined colors. 
// The colors from top to bottom are: custom, RED, PINK, BLUE, MAGENTA, CYAN


// HINT:
// The rectangle should have the attributes:
// x: 20
// y: 70
// width: 40
// height: 30
//
// You should set the color of the rectangle to blue by using the method:
// setColor(Color.somecolor); on the rectangle object that you created
//
// Don't forget to draw the rectangle by calling the fill() function




public class BlockTower
{
   public static void main(String[] args)
   {
       //TODO finish the draft to display the six blocks
       Rectangle bottom1 = new Rectangle(20,70,40,30);
       Rectangle bottom2 = new Rectangle(60,70,40,30);
       Rectangle bottom3 = new Rectangle(100,70,40,30);
       Rectangle middle1 = new Rectangle(40,40,40,30);
       Rectangle middle2 = new Rectangle(80,40,40,30);
       Rectangle top1 = new Rectangle(60,10,40,30);
       bottom1.setColor(Color.BLUE);
       bottom2.setColor(Color.MAGENTA);
       bottom3.setColor(Color.CYAN);
       middle1.setColor(Color.RED);
       middle2.setColor(Color.PINK);
       top1.setColor(new Color(125,125,255));
       // draw shapes
       bottom1.draw();
       bottom2.draw();
       bottom3.draw();
       middle1.draw();
       middle2.draw();
       top1.draw();
       //color fill
       bottom1.fill();
       bottom2.fill();
       bottom3.fill();
       middle1.fill();
       middle2.fill();
       top1.fill();
   }
}