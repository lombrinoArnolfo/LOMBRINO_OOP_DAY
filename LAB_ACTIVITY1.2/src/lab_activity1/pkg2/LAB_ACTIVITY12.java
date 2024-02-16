
package lab_activity1.pkg2;

import java.util.Scanner;


public class LAB_ACTIVITY12 {

    
    public static void main(String[] args) {
        
        Scanner in = new Scanner (System.in);
        
        System.out.println("Enter a message: ");
        String message = in.nextLine();
        
        int flag = 0;
        
        for (int i = 0; i <= message.length(); i++)
        {
            if (Character.isUpperCase(message.charAt(i)))
            {
                flag = 1;
            } 
            break;
        }
        
        if (flag ==1)
        {
            System.out.println("Jeje");
        }
        else
        {
            System.out.println("Uwu");
        }    
        
    }
    
}
