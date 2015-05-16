// Mad Hatter search
public class BookTester
{
    public static void main(String[] args)
    {
        Book alice = new Book("aliceInWonderland.txt");

        System.out.println("Actual: " + alice.firstOccurrenceOfMadHatter());
        System.out.println("Expected: -1");

        Book code = new Book("BookTester.java");
        System.out.println("Actual: " + code.firstOccurrenceOfMadHatter());
        System.out.println("Expected: 3");
    }
}
