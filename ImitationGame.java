
/**
 * Write a description of class ImitationGame here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class ImitationGame
{
   public static void main(String[] args)
   {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the code that you would like to encrypt: ");
       String userInput = sc.nextLine();
       System.out.println("By how many letters do you want to shift the code?: ");
       int shift=sc.nextInt();
       System.out.println("Encrypted Code: ");
       Cipher pie = new Cipher(userInput,shift);
       System.out.println("\nEnter the code you would like to decrypt: ");
       String decryptionInput = sc.next();
       System.out.println("By how many letters do you want the code to be shifted?: ");
       int dshift=sc.nextInt();
       System.out.println("Decrypted Code: ");
       Decryption pi = new Decryption(decryptionInput,dshift);
   }
    
}
