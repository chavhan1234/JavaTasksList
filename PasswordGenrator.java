import java.security.SecureRandom;
import java.util.Scanner;

public class PasswordGenrator{
    public static void main(String[]args){

        Scanner sc=new Scanner(System.in);
        SecureRandom random=new SecureRandom();

        String chars="ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "abcdefghijklmnopqrstuvwxyz"
                     + "0123456789@#$!";

            System.out.println("Enter your password length :");
            int length=sc.nextInt();

            if(length <8){
                System.out.println("Password length must me atleast 8");
                return;
            }

            String Password="";

           for (int i = 0; i < length; i++) {
            int index = random.nextInt(chars.length());
            Password += chars.charAt(index);
        }

            System.out.println("Genrated Password :"+Password);

    }
}
