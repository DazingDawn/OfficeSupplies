public class DeskChair 
{
    public double angle = 45.0;
    public double rotation = 0.0;
    public double height = 3.0;
    public double newRotation = 0.0;
    public double rotate(rotChange)
    {
        newRotation = rotation + rotChange;
        if (newRotation <= 360.0 || newRotation >= 0.0)
        {
            rotation = newRotation;
        }
        else if (newRotation > 360.0)
        {
            
        }
    }

}