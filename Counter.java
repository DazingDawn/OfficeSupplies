public class Counter 
{
    private int clicks;
    public Counter() 
    {
        clicks = 0;
    }
    public int getClicks() 
    {
        return clicks;
    }
    public void click() 
    {
        clicks++;
    }
    public void reset() 
    {
        clicks = 0;
    }
}