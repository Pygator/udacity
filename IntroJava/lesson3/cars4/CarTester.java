// BlueJ project: lesson3/cars4

// Write a tester program that prints the actual and
// expected gas level after the given method calls.

public class CarTester
{
    public static void main(String[] args)
    {
        Car car = new Car();
        car.drive(100);
        // TODO: Add 20 gallons and drive 100 miles
        car.addGas(20);
        // TODO: Print actual and expected gas level
        System.out.println(car.getGasInTank());
        int vTest = 20-100/50;
        System.out.println("Expected: " + vTest);

    }
}
