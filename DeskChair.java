public class DeskChair 
{
    public double angle = 45.0;
    public double rotation = 0.0;
    public double height = 3.0;
    public double newRotation = 0.0;
    public double rotate()
    {
        newRotation = rotation + 5;
        if (newRotation <= 360.0 || newRotation >= 0.0)
        {
            rotation = newRotation;
        }
        else if (newRotation > 360.0)
        {
            newRotation = newRotation - 360.0;
        }
        else if (newRotation < 0.0)
        {
            newRotation = newRotation + 360.0;
        }
    }
    System.out.println("the old rotation was 0.0. the new rotation is " + rotation + " and the expected value was 5.0.");

}