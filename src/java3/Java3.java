/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java3;


public class Java3 {

   
    public static void main(String[] args) {
         int num;
    System.out.println("Enter an Integer number:");


    Scanner input = new Scanner(System.in);
    num = input.nextInt();

   
    if ( num % 2 == 0 )
        System.out.println("Entered number is even");
     else
        System.out.println("Entered number is odd");
        
    }
    
}
