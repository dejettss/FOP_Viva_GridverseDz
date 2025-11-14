/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package v01;

/**
 *
 * @author Dzaky Arya
 */
import java.util.Scanner;
public class V01Q03 {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
        
        System.out.print("Please enter the number of inquaries: ");
        int T = input.nextInt();
        
        for(int d=1; d<=T;d++){
             
        System.out.print("Please enter the Height: ");
        int H = input.nextInt();
        System.out.print("Please enter the Style (A/P): ");
        String S = input.next();
        
        if(S.equals("A")){
            for(int i=1;i<=H;i++){
                for(int u=1;u<=i;u++){
                    System.out.print(i);
                }
                System.out.println();
            }       
    }
        if(S.equals("P")){
            for(int i=1;i<=H;i++){
                for(int s=H;s>=i;s--){
                    System.out.print(" ");
                }
                for(int u=1;u<=i;u++){
                    System.out.print(u);
                }
                for(int r=i-1;r>=1;r--){
                    System.out.print(r);
                }System.out.println();
            }
        }
    }
    }  
}
