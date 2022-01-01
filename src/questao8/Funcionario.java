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
        private double bonificaçao;
        private double salarioLiquido;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        
        defineSalarioBonificaçao(salario);
        
        
        
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
        
         defineSalarioBonificaçao(salario);
                 
    }

    public double getBonificaçao() {
        return bonificaçao;
    }

    
    public double getSalarioLiquido() {
        return salarioLiquido;
    }

    
     public void defineSalarioBonificaçao(double salario){
         
        if (salario <=1000 ){
            bonificaçao = 1.20;
        }
        
        if (salario >1000 && salario <2000){
            bonificaçao = 1.10;
        }
       
        if (salario >=2000 ){
            bonificaçao = 0.90;
        }
         
        salarioLiquido = salario*bonificaçao;
     }   
     
     
        
}
