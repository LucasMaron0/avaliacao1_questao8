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
        
        
        
        
    // a função  defineSalarioBonificaçao é chamada sempre que é atribuido um valor ao salário, ou seja
    // no construtor (que pede um nome e um salario) ou no setter. Bonifição e salário liquido nao podem ser definidos diretamente,
    // quando é atribuido um Salário a função defineSalarioBonificaçao já deifne esses dois valores automaticamente.
        
    public void defineSalarioBonificaçao(double salario){
         
        if (salario <=1000 ){
            bonificaçao = 1.20; //+20%
        }
        
        if (salario >1000 && salario <2000){
            bonificaçao = 1.10; //+10%
        }
       
        if (salario >=2000 ){
            bonificaçao = 0.90; //-10%
        }
         
        salarioLiquido = salario*bonificaçao;
     }   
     

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

    
 
     
        
}
