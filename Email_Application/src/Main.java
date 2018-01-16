import java.util.*;

public class Main {
    public static void main (String [] args) {
        String tempName = "Alexxa hello";
        System.out.println("Testing");
        String name;
        String[] nameSplit;

        Scanner scanner=new Scanner(System.in);
        Utils utils = new Utils();

        System.out.println("Welcome to the mailbox generator");
        System.out.println("Enter your name: ");
        //name=scanner.nextLine();
        nameSplit=utils.splitName(tempName);

        Email email = new Email(nameSplit[0],nameSplit[1]);




    }

}
