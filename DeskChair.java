public class DeskChair 
{
    public double angle = 45.0;
    public double rotation = 0.0;
    public double height = 3.0;
    public double x = 0.0;
    public double y = 0.0;
    public double newRotation = 0.0;
    public double newAngle = 0.0;
    public double newHeight = 0.0;
    public double newX = 0.0;
    public double newY = 0.0;

    public void rotate() 
    {
        newRotation = rotation + -10.0;
        if (newRotation <= 360.0 && newRotation >= 0.0) 
        {
            rotation = newRotation;
        } 
        else if (newRotation > 360.0) 
        {
            rotation = newRotation - 360.0;
        } 
        else if (newRotation < 0.0) 
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
    public void changeHeight()
    {
        newHeight = height + -10.0;
        if (newHeight <= 8.0 && newHeight >= 0.0) 
        {
            height = newHeight;
        } 
        else if (newHeight > 8.0) 
        {
            newHeight = 8.0;
        } 
        else if (newHeight < 0.0) 
        {
            newHeight = 0.0;
        }
    }
    public void move()
    {
        newX = x + -10.0;
        newY = y + 35;
        if (newX <= 50.0 && newX >= -50.0) 
        {
            x = newX;
        } 
        else if (newX > 50.0) 
        {
            newX = 50.0;
        } 
        else if (newX < -50.0) 
        {
            newX = -50.0;
        }
        if (newY <= 50.0 && newY >= -50.0) 
        {
            y = newY;
        } 
        else if (newY > 50.0) 
        {
            newY = 50.0;
        } 
        else if (newY < -50.0) 
        {
            newY = -50.0;
        }

    }
    public static void main(String[] args) 
    {
        DeskChair deskChair = new DeskChair(); // Create an instance
        deskChair.rotate(); // Call the rotate method
        System.out.println("the old rotation was 0.0. the new rotation is " + deskChair.rotation + " and the expected value was 10.0.");
        deskChair.changeAngle();
        System.out.println("the old angle was 45.0. the new angle is " + deskChair.angle + " and the expected value was 35.0.");
        deskChair.changeHeight();
        System.out.println("the old height was 3.0. the new height is " + deskChair.height + " and the expected value was 0.0.");
        deskChair.move();
        System.out.println("the old X was 0.0. the new X is " + deskChair.x + " and the expected value was -10.0.");
        System.out.println("the old Y was 0.0. the new Y is " + deskChair.y + " and the expected value was 35.0.");
    }
}
