import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your message (57 letter limit): ");
        String msg = in.nextLine();
        SafeInput.prettyHeader(msg);
    }
}