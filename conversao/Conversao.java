/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversao;
import java.util.Scanner;
/**
 *
 * @author Administrador
 */
public class Conversao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           
        System.out.println("digite a primeira média");
        Scanner scanner = new Scanner(System.in);
        String m1 = scanner.nextLine();
        
        
         
        System.out.println("digite a Segunda média");
        String m2 = scanner.nextLine();
        
        Aluno a1 = new Aluno(m1, m2);
        a1.CalcularMedia();
        
        System.out.println("A média é: ");
        System.out.println(a1.Getmedia());
        
    }

}
