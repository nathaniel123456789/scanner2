import java.util.Scanner;

public class MyScanner
{
    public void run() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
                int input = scanner.nextInt();
            System.out.println(input * 3);
        }
    }      
 
    public static void main(String[] args) {
        MyScanner myScanner = new MyScanner();
        myScanner.run();
        }
    }
