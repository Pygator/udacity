public class RectangleDemo
{
    public static void main(String[] args)
    {
        Rectangle box = new Rectangle(60,90,20,30);
        box.draw();
        //box.translate(200, 100);
        Rectangle box1 = new Rectangle(60,90,20,30);
        box1.draw();
        box1.translate(20, 30);
    }
}
