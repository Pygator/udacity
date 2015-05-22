
/**
 * Write a description of class EqualStrings here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EqualStrings
{
    // instance variables - replace the example below with your own
    private int x;
    public static void main(String[] args)
    {
        String first = "Uda";
        String second = "city";
        String firstAndSecond = first + second;
        String third = "Udacity";
        if (firstAndSecond == third)
        {
            System.out.println("==: They are the same using ==");
        }
        else {
            System.out.println("==: firstAndSecond is " + firstAndSecond);
        }
                if (firstAndSecond.equals(third) )
        {
            System.out.println(".equal: They are the same using equal method");
        }
        else {
            System.out.println(".equal: firstAndSecond is " + firstAndSecond);
        }
    }
}
