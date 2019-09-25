/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package savings;
import java.util.Scanner;
/**
 *
 * @author dymoo6791
 */
public class Savings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double totalSpent,total,grandTotal;
        System.out.print("Please enter amount spent: $");
        totalSpent = in.nextDouble();
        
        if ((totalSpent>=00.01)&&(totalSpent<= 40.00)){
            total = totalSpent*0.10;
            total = total*100;
            total = Math.round(total);
            total = total/100;
            grandTotal = totalSpent - total;
            System.out.println("You are saving 10%");
            System.out.println("You save $" + total);
            System.out.println("Your total is " + grandTotal);
        }
        else if ((totalSpent>=40.01)&&(totalSpent<= 80.00)){
            total = totalSpent*0.20;
            total = total*100;
            total = Math.round(total);
            total = total/100;
            grandTotal = totalSpent - total;
            System.out.println("You are saving 20%");
            System.out.println("You save $" + total);
            System.out.println("Your total is " + grandTotal);
        }
        else if ((totalSpent>=80.01)&&(totalSpent<= 120.00)){
            total = totalSpent*0.30;
            total = total*100;
            total = Math.round(total);
            total = total/100;
            grandTotal = totalSpent - total;
            System.out.println("You are saving 30%");
            System.out.println("You save $" + total);
            System.out.println("Your total is " + grandTotal);
        }
        else if ((totalSpent>=80.01)&&(totalSpent<= 120.00)){
            total = totalSpent*0.30;
            total = total*100;
            total = Math.round(total);
            total = total/100;
            grandTotal = totalSpent - total;
            System.out.println("You are saving 30%");
            System.out.println("You save $" + total);
            System.out.println("Your total is " + grandTotal);
        } else if (totalSpent >=120.01){
        total = totalSpent*0.40;
            total = total*100;
            total = Math.round(total);
            total = total/100;
            grandTotal = totalSpent - total;
            System.out.println("You are saving 40%");
            System.out.println("You save $" + total);
            System.out.println("Your total is " + grandTotal);
        }
    }
    
}
