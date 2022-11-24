import java.util.Scanner;

public class Read {
    public static void scanner(){
        while(true){
            Scanner scanner = new Scanner(System.in);
            System.out.println("What's your name?");
            String first = scanner.nextLine();
            System.out.println("What's you age?");
            int second = Integer.parseInt(scanner.nextLine());
            if(second<0){
                System.out.println("Age must be positive number");
                break;
            }
            System.out.println("Your name is: " +first+ " Your age is: "+ second);
            System.out.println("Do you want to continue?");
            //Scanner newscanner = new Scanner(System.in);
            String answer = scanner.nextLine();
            if(answer.equals("no")){
                break;
            } else if(answer.equals("yes")){
                continue;
            } else {
                System.out.println("Answer has to be yes/no");
                break;
            }

        }









    }
}
