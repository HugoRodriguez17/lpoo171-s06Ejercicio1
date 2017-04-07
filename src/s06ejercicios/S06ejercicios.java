/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s06ejercicios;

/**
 *
 * @author alumno
 */
import java.util.Scanner;
public class S06ejercicios {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("EJERCICIO S06");
        System.out.println("");
        
        String nombre01 ="";
        int cantidad01=0;
        double precio01=0;
        
        String nombre02 ="";
        int cantidad02=0;
        double precio02=0;
        
        String nombre03 ="";
        int cantidad03=0;
        double precio03=0;
        
        Scanner sc =new Scanner(System.in);
        
        System.out.println("Ingrese \"nombre\"producto 01:");
        nombre01=sc.next();
        
        System.out.println("Ingrese \"cantidad\"producto 01:");
        cantidad01=sc.nextInt();
        
        System.out.println("Ingrese \"precio\"producto 01:");
        precio01=sc.nextDouble();
        
        System.out.println("Ingrese \"nombre\"producto 02:");
        nombre02=sc.next();
        
        System.out.println("Ingrese \"cantidad\"producto 02:");
        cantidad02=sc.nextInt();
        
        System.out.println("Ingrese \"precio\"producto 02:");
        precio02=sc.nextDouble();
        
        System.out.println("Ingrese \"nombre\"producto 03:");
        nombre03=sc.next();
        
        System.out.println("Ingrese \"cantidad\"producto 03:");
        cantidad03=sc.nextInt();
        
        System.out.println("Ingrese \"precio\"producto 03:");
        precio03=sc.nextDouble();
        
        
        double subtotal=0;
        subtotal+=cantidad01+precio01;
        subtotal+=cantidad02+precio02;
        subtotal+=cantidad03+precio03;
        
        double impuesto=subtotal*0.18;
        double total=subtotal+impuesto;
        
        
        
    }
    
}
