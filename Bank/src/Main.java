import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Opening Message to start Banking Program. Either creates a new account or searches an existing one
        BankInterface bankInterface = new BankInterface();
        String response = scanner.nextLine();
        Account account = null;
        if (Objects.equals(response, "create")) {
            System.out.println("Please enter your first name that you would like listed on your account: ");
            response = scanner.nextLine();
            account = new Account(response);
        } else {
            bankInterface.searchAccount(response);
        }

        //User accessing account
        BankInterface.menu(account);
    }
}
