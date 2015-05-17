//A landscape designer needs a program to make calculations in meters about a front yard 
//given its width and length in feet.  Write a class YardCalculator with a constructor that takes 
//the width and length in feet as arguments
//public YardCalculator(double length, double width)

//Provide methods :

//public double perimeter() which returns the perimeter in meters
//public double area() which returns the area in square meters
//public double diagonal() which returns the diagonal in meters

//1 foot = 0.3048 meters.

//Define and use a constant for the conversion factor. Define it in the class itself, 
//outside any method, so all methods in any class can see it.

//      public static final double METERS_PER_FOOT = 0.3048;

//HINT: diagonal = square root of (width^2 plus height^2)

// Need help starting this question? In the lesson titled 
// "Starting points: Problem Set Questions", go to the
// problem titled "Problem Set 3 - Question 1" for some tips on 
// how to begin. 

public class YardCalculator
{
     private double myLength;
     private double myWidth;
     public static final double METERS_PER_FOOT = 0.3048;
     
   /**
    * Constructs a YardCalculator with the given parameters
    * @param theLength the length of the yard
    * @param theWidth the width of the yard
    */
   public YardCalculator(double theLength, double theWidth)
   {
     myLength = theLength;
     myWidth = theWidth;
   }

   /**
    * Gets the perimeter of the yard
    * @return the perimeter
    */
   public double perimeter()
   {
      double myPerimeter = METERS_PER_FOOT * ((2*this.myLength) + (2*this.myWidth));
      return myPerimeter;
   }

   /**
    * Gets the area of the yard
    * @return the area
    */
   public double area()
   {
      double myArea = (METERS_PER_FOOT * this.myLength) * (METERS_PER_FOOT * this.myWidth);
      return myArea;
   }

    /**
    * Gets the diagonal of the yard
    * @return the diagonal
    */
   public double diagonal()
   {
     double mydiagonal = METERS_PER_FOOT * (Math.sqrt(Math.pow(this.myLength,2) + Math.pow(this.myWidth,2) ));
     return mydiagonal;
   }

}
