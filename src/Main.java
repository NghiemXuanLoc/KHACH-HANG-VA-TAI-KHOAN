/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contest14.B8;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Bai8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] idCustomer = sc.nextLine().split(":");
        String[] fullName = sc.nextLine().split(":");
        String[] gender = sc.nextLine().split(":");
        String[] idAccount = sc.nextLine().split(":");
        String[] balance = sc.nextLine().split(":");
        Customer customer = new Customer(Integer.parseInt(idCustomer[1].trim()), fullName[1].trim(), gender[1].trim().charAt(0));
        Account x = new Account(Integer.parseInt(idAccount[1].trim()), customer, Double.parseDouble(balance[1].trim().substring(0, balance[1].length() - 2)));

        sc.nextLine();
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String thaoTac = sc.nextLine();
            String[] arr = thaoTac.split("\\s+");
            if (arr[0].equals("withdraw")) {
                x.withdraw(Double.parseDouble(arr[1]));
            } else {
                x.deposit(Double.parseDouble(arr[1]));
            }
        }
        System.out.println("-------------------");
        System.out.println(x);
    }
}
