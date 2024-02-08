public class DeskChair 
{
    public double angle = 45.0;
    public double rotation = 0.0;
    public double height = 3.0;
    public double x = 0.0;
    public double y = 0.0;

    public void rotate(double newRotation) 
    {
        rotation += newRotation;
        if (rotation >= 360.0) 
        {
            rotation -= 360.0;
        } 
        else if (rotation < 0.0) 
        {
            rotation += 360.0;
        }
    }

    public void changeAngle() 
    {
        angle -= 10.0;
        if (angle < 0.0) 
        {
            angle += 90.0;
        }
    }

    public void changeHeight() 
    {
        height -= 10.0;
        if (height < 0.0) 
        {
            height = 0.0;
        }
    }

    public void move() 
    {
        x -= 10.0;
        y += 35.0;
        if (x < -50.0) 
        {
            x = -50.0;
        } 
        else if (x > 50.0) 
        {
            x = 50.0;
        }
        if (y < -50.0) 
        {
            y = -50.0;
        } 
        else if (y > 50.0) 
        {
            y = 50.0;
        }
    }
}
