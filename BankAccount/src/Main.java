import user.User;
import java.util.Scanner;
import java.util.List;

public class Main {
    public static void  main (String[] args){
        Scanner in = new Scanner(System.in);

        int STARS = 36;
        float balance;
        String name;
        String option = "";
        float newBalance;
        String thirdName;
        float value;

        System.out.println("*".repeat(STARS));
        System.out.println("Welcome to Bank Account");
        System.out.println("*".repeat(STARS));
        System.out.println();
        System.out.println();

        System.out.println("*".repeat(15)+"LOGIN"+"*".repeat(16));
        System.out.println("Type your Name: ");
        name = in.nextLine();
        System.out.println("Type your Initial Balance: ");
        balance = in.nextFloat();
        in.nextLine();
        User user = new User(name, balance);

        System.out.println();
        System.out.println("*".repeat(STARS));
        System.out.println("Customer initial data: ");
        System.out.println();
        System.out.println("Name: " + " ".repeat(13) + user.getName());
        System.out.println("Account Type: " + " ".repeat(5) + "Checking");
        System.out.println("Initial Balance: " + " ".repeat(2) + user.getBalance());

        System.out.println();
        do {
            System.out.println("*".repeat(STARS));
            System.out.println(
                """
                Choose the operation type:
                
                1 - See balance
                2 - Receive
                3 - Transfer
                4 - Exit
                """);
            option = in.nextLine();

            switch (option) {
                case "1":
                    System.out.println("*".repeat(STARS));
                    System.out.println("Account Balance: " + user.getBalance());
                    break;
                case "2":
                    System.out.println("Sender name: ");
                    thirdName = in.nextLine();

                    System.out.println("Value: ");
                    while(!in.hasNextFloat()){
                        System.out.println("*".repeat(STARS));
                        System.out.println("Not a valid value!! ");
                        in.next();
                        System.out.println("*".repeat(STARS));
                    }
                    newBalance = in.nextFloat();
                    in.nextLine();

                    user.setBalance(user.getBalance()+newBalance);

                    break;
                case "3":
                    System.out.println("Receiver name: ");
                    thirdName = in.nextLine();

                    System.out.println("Value: ");
                    while(!in.hasNextFloat()){
                        System.out.println("*".repeat(STARS));
                        System.out.println("Not a valid value!! ");
                        System.out.println("*".repeat(STARS));
                        in.next();
                    }
                    newBalance = in.nextFloat();
                    in.nextLine();
                    if (user.getBalance()< newBalance){
                        System.out.println("*".repeat(STARS));
                        System.out.println("Not enough balance!");
                        System.out.println("Actual balance: " + user.getBalance());
                        System.out.println("*".repeat(STARS));
                    }
                    else if (newBalance > 0 ) {
                        newBalance = newBalance * -1;
                        user.setBalance(user.getBalance()+newBalance);
                    }else{
                        System.out.println("*".repeat(STARS));
                        System.out.println("Not a valid value!! ");
                        System.out.println("*".repeat(STARS));
                    }
                    break;
                case "4":
                    System.out.println("Thank you!!");
                    break;
                default:
                    System.out.println("*".repeat(STARS));
                    System.out.println("Not a valid option!");
            };
        } while (!option.equals("4"));
    }
}
