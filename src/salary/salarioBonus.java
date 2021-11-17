package salary;

import java.util.Scanner;

public class salarioBonus {
 
    public static void main(String[] args){
 
    Scanner dados = new Scanner(System.in);
    
    String nome;
    double salario, vendas, total;
    
    nome = dados.nextLine();
    salario = dados.nextDouble();
    vendas = dados.nextDouble();
 
    total = salario + ((vendas*15)/100);
    
    System.out.println("TOTAL = " + total);
    }
 
}