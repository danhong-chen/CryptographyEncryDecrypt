/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package part1;

import java.util.Scanner;

/**
 *
 * @author vivianchen
 */
public class encrptyDecry {

    public static void main(String[] args) {
        System.out.println("********* Password Encryption******** ");
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter an 8-character password to encrypt:");
        String password = input.nextLine();
        //encryption
        if (password.length()!= 8) {
            System.out.print("The password need to be exactly length of 8");
            System.exit(0);
        }
        System.out.print("Please enter your Caesar Key: ");
        int key = input.nextInt();
        String na = "";
        for (int i = 0; i < password.length(); i++) {
            int function = (int) password.charAt(i) + key;
            while (function > 126) {
                function -= 95;
            }
            na += (char) function;
        }
        System.out.println("Using the Caesar Cipher, your Encrypted password is " + na);
        System.out.println(); 
        String temp = input.nextLine();
        System.out.println("********* Password Decryption*********");
        System.out.print("Please enter a password to decrypt: ");
        String decrPass = input.nextLine();
        if (decrPass.length() != 8) {
            System.out.print("The password need to be exactly length of 8");
            System.exit(0);
        }
        System.out.print("Please enter your Caesar Key: ");
        int decrKey = input.nextInt();
        String ra = "";
        for (int i = 0; i < decrPass.length(); i++) {
            int function = (int) decrPass.charAt(i) - decrKey;
            while (function < 32) {
                function += 95;
            }
            ra += (char) function;
        }
        System.out.println("Using the Caesar Cipher, your Decrypted Password is " + ra);
        System.out.println(); 
        System.out.println("Original Plaintext Password: " + password);
        System.out.println("Decrypted Plaintext Password: " + ra);
        if (password.equals(ra)) {
            System.out.println("these two password are equivalent");
        }
        if (password.equals(ra) == false) {
            System.out.println("These two passwords are not equivalent");
        }
    }
}
