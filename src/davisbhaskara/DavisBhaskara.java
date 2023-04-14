
package davisbhaskara;

import java.util.Scanner;


public class DavisBhaskara {

    static Scanner sc = new Scanner(System.in);
   
    public static void main(String[] args) {
       
       System.out.println("Escreva os valores: a, b e c: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        Bhaskara b1 = new Bhaskara(a,b,c);
        
        b1.print();
    }
}


