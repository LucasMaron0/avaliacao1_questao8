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
        
        private double bonificacao;
        

   // a classe Funcionario não tem atributos para a Bonifição e o salário liquido, 
  //apenas seus métodos getters, que  realizam as fórmulas e retornam seus valores
       

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        
        defineBonificacao();
  
    }
    
    // método defineBonificacao é chamado sempre que é atribuido um salário, ou seja,
    // no construtor ou no setSalario, este método define o valor da bonificacao de acordo
    // com o valor do salário. Este valor não pode ser alterado de outra forma. 
    
    // a classe tem 3 métodos getters personalizados, um para retornar a bonificação em porcentagem,
    // um para  a bonificação em reias e outro para o salário liquido, nenhum desses valores são atributos,
    // apenas possuem getters que retornam o valor desejado.
    
    
    
    private void defineBonificacao(){
        
        if (salario <=1000 ){
             bonificacao = 0.20; //+20%
        }
        
        if (salario >1000 && salario <2000){
            bonificacao = 0.10; //+10%
        }
       
        if (salario >=2000 ){
            bonificacao = -0.10; //-10%
        }
        
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
        defineBonificacao();
    }


    // método que retorna a bonificação em porcentagem    

    public double getBonificacaoPorcentagem() {  
 
    //realiza a conta *100 para pegar o valor em %, já que fica armazendo como multiplicador,  EX: 0.10, (0.10*100) = 10% 
        return bonificacao*100; 
    }

    // método que retorna bonificação em reais
    
    public double getBonificacaoValor(){
        
        return salario * bonificacao;
    }
    
    // retorna salário liquido
    
    public double getSalarioLiquido() {
        return (salario * bonificacao) + salario;
    }

   
}
