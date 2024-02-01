public class DeskChair 
{
    public double angle = 45.0;
    public double rotation = 0.0;
    public double height = 3.0;
    public double newRotation = 0.0;
    public double newAngle = 0.0;

    public void rotate() 
    {
        newRotation = rotation + -10.0;
        if (newRotation <= 360.0 && newRotation >= 0.0) 
        {
            rotation = newRotation;
        } else if (newRotation > 360.0) 
        {
            rotation = newRotation - 360.0;
        } else if (newRotation < 0.0) 
        {
            rotation = newRotation + 360.0;
        }
    }
    public void changeAngle()
    {
        newAngle = angle + -10.0;
        if (newAngle <= 90.0 && newAngle >= 0.0) 
        {
            angle = newAngle;
        } 
        else if (newAngle > 90.0) 
        {
            angle = newAngle - 90.0;
        } 
        else if (newAngle < 0.0) 
        {
            angle = newAngle + 90.0;
        }
    }

    public static void main(String[] args) 
    {
        DeskChair deskChair = new DeskChair(); // Create an instance
        deskChair.rotate(); // Call the rotate method
        System.out.println("the old rotation was 0.0. the new rotation is " + deskChair.rotation + " and the expected value was 10.0.");
        deskChair.changeAngle();
        System.out.println("the old angle was 45.0. the new angle is " + deskChair.angle + " and the expected value was 35.0.");
    }
}
