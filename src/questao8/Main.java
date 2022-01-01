/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package questao8;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class Main {
    
   static  ArrayList <Funcionario> funcionarios = new ArrayList();
   static Scanner input = new Scanner(System.in);

    
    public static void main(String[] args) {

        registraFuncionarios();
        imprimeFuncionarios();
        

    }
    
    
    public static void registraFuncionarios(){
        
        System.out.println("Quantos usuários deseja registrar? ");
        int numeroRegistros = Integer.parseInt(input.nextLine());
        
        
        
        for(int i = 0; i < numeroRegistros;i++){
        
        String nomeFuncionario;
        double salario;
        Funcionario funcionario;
        
        System.out.println("Nome do funcionário: ");
        nomeFuncionario = input.nextLine();
        
        System.out.println("Salario: ");
        salario = Double.parseDouble(input.nextLine());
        
        funcionario = new Funcionario(nomeFuncionario, salario);
        funcionarios.add(funcionario);
        
        
    }    
        
        
    }
    
    
    
    public static void imprimeFuncionarios(){
        
        
        for(Funcionario f:funcionarios){
        
        String tipo;
        if ( f.getSalario()>=2000){
            
            tipo = "Desconto: ";
        }else{
         
            tipo = "Bonificação: ";
        }
        
        System.out.println("Nome: " + f.getNome() );
        System.out.println("Salario: " + f.getSalario());
        System.out.println(tipo + " " + ((f.getBonificaçao()*100 )-100) + "%" );
        System.out.println("Salario Liquido: " + f.getSalarioLiquido() );
    }
        
    }
    
}
