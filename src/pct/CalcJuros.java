/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pct;

import java.util.Scanner;

/**
 *
 * @author Fernando Note
 */
public class CalcJuros {
    public static void main(String[] args) {
        double j, c, i, n;
        Scanner entrada = new Scanner(System.in);
        System.out.println("\n\t\t\t -- Calculadora de Juros --\n");
        System.out.print("Capital  (R$) : ");
        c = entrada.nextDouble();
        System.out.print("Taxa (%) : ");
        i = entrada.nextDouble();
        System.out.print("Prazo (meses) : ");
        n = entrada.nextDouble();
        j = c * i * n / 100;
        System.out.printf("Juros R$ %.2f.\n\n", j);
        
                
      
        
        
        
    }
    
}
