package CS102;

import java.util.ArrayList;
import java.util.Scanner;

public class Project2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Project1.Account> accountList = new ArrayList<Project1.Account>();
        System.out.println("Enter an ID: ");
        int id = sc.nextInt();
        for (int i = 0; i < 10; i++) {
            Project1.Account account = new Project1.Account(i + 1, 100);
            accountList.add(account);
        }
        while((id = sc.nextInt()) > 9) {
            System.out.println("Enter a correct ID: ");
            id = sc.nextInt();
        }
        {
            System.out.println("Number is negative! System Shutdown!");
            System.exit(10);
        }
    }
}
