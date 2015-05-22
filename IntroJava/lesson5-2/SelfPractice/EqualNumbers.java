
/**
 * Write a description of class EqualNumbers here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EqualNumbers
{
    // instance variables - replace the example below with your own
    private int x;
    public static void main(String[] args)
    {
        double original = 2;
        double root = Math.sqrt(original);
        double rootSquared = root * root;
        final double EPSILON = 1E-12;
        if (rootSquared == original)
        {
            System.out.println("==: They are the same");
        }
        else
        {
            System.out.println("==: rootSquared is " + rootSquared);
        }
        
        if (Math.abs(rootSquared-original) < EPSILON)
        {
            System.out.println("Epsilon: They are the same");
        }
        else
        {
            System.out.println("Epsilon:  rootSquared is " + rootSquared);
        }
    }
}
