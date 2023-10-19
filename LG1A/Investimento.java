public abstract class Investimento { 
     private String nome; 
     private double valorInvestido; 
  
  
     public Investimento(String nome, double valorInvestido { 
         this.nome = nome; 
         this.valorInvestido = valorInvestido; 
     } 
  
     // Método abstrato para calcular o retorno do investimento 
     public abstract double calcularRetorno(); 
  
     // Método para exibir informações do investimento 
     public void mostrarInformacoes() { 
         System.out.println("Nome do Investimento: " + nome); 
         System.out.println("Valor Investido: R$" + valorInvestido); 
         System.out.println("Retorno do Investimento: R$" + calcularRetorno()); 
     } 
 }