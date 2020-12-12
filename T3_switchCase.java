import java.util.Scanner;

public class T3_switchCase {
    public static void main(String[] args) {
        int choice;
        String name, str="";
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter your name : ");
        name = sc.nextLine();
        System.out.print("\nEnter your choice : \n1.Hi\n2.Hey\n3.Hello\nInput: ");
        choice = sc.nextInt();

        switch(choice)
        {
            case 1: str = "Hi " + name; break;
            case 2: str = "Hey " + name; break;
            case 3: str = "Hello " + name; break;

            default: str = "Invalid input !"; break;
        }

        System.out.println("\n"+str+" :)");
    }
}
