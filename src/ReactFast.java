import java.util.Scanner;

public class ReactFast {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("Hey, Type a sentence at the end of count down and I'll tell you how many milliseconds you took to do it.");
        Thread.sleep(1500);
        System.out.println("3");
        Thread.sleep(1000);
        System.out.println("2");
        Thread.sleep(1000);
        System.out.println("1");
        Thread.sleep(1000);

        System.out.println("GO !!!!!!!!!");
        long startTime = System.currentTimeMillis();    //gets current time before user types.

        Scanner scanner = new Scanner(System.in);
        scanner.next();
        long stopTime = System.currentTimeMillis();     //gets current time after user types.

        long reactionTime = stopTime - startTime ;

        System.out.println("Amazing!!! You took " + reactionTime + "ms to type This.");
        Thread.sleep(500);
        System.out.println("Remember, You can always do Better.");


    }
}
