/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao8;

/**
 *
 * @author lucas
 */
public class Funcionario {
        
        private String nome;
        private double salario;
        

   // a classe Funcionario não tem atributos para a Bonifição e o salário liquido, 
  //apenas seus métodos getters, que  realizam as fórmulas e retornam seus valores
       

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
  
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
        
    }

    public void setSalario(float salario) {
        this.salario = salario;
            
    }

    public double getBonificaçao() {
        
        double bonificaçao = 0.00;
        
         if (salario <=1000 ){
             bonificaçao = 0.20; //+20%
        }
        
        if (salario >1000 && salario <2000){
            bonificaçao = 0.10; //+10%
        }
       
        if (salario >=2000 ){
            bonificaçao = -0.10; //-10%
        }
        
        
        return bonificaçao; 
    }

    
    public double getSalarioLiquido() {
        return (salario * getBonificaçao()) + salario;
    }

   
}
