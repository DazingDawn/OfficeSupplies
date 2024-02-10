public class OfficeSuppliesTester 
{
    public static void main(String[] args)
    {
        int testsPassed = 0;
        System.out.println("Testing Counter.java!");
        Counter clicker = new Counter();
        testsPassed++;
        System.out.println("New counter created!");
        System.out.println("Trying to add to count...");
        clicker.click();
        testsPassed++;
        System.out.println("Done!");
        System.out.println("Trying to check count...");
        System.out.println("Current count is " + clicker.getClicks());
        testsPassed++;
        System.out.println("Trying to reset count...");
        clicker.reset();
        testsPassed++;
        System.out.println("Counter has passed " + testsPassed + "/4 tests!");
        testsPassed = 0;
        System.out.println("Testing DeskChair.java!");
        DeskChair deskChair = new DeskChair();
        deskChair.rotate(35.0);
        System.out.println("The old rotation was 0.0. The new rotation is " + deskChair.rotation + " and the expected value was 35.0.");
        deskChair.changeAngle();
        System.out.println("The old angle was 45.0. The new angle is " + deskChair.angle + " and the expected value was 35.0.");
        deskChair.changeHeight();
        System.out.println("The old height was 3.0. The new height is " + deskChair.height + " and the expected value was 0.0.");
        deskChair.move();
        System.out.println("The old X was 0.0. The new X is " + deskChair.x + " and the expected value was -10.0.");
        System.out.println("The old Y was 0.0. The new Y is " + deskChair.y + " and the expected value was 35.0.");

        fileCabinet fc = new fileCabinet("The King", "We are going to assasinate the king of England tomorrow at 8:00am", 101, false, 007);
        fc.openCabinet(111);
        fc.openCabinet(007);
        System.out.println(fc.getStatus());
        System.out.println(fc.getFileContent());
        System.out.println(fc.getFileNum());
        System.out.println(fc.getFileTitle());
        fc.closeCabinet();
        System.out.println(fc.getStatus());
    }
}
