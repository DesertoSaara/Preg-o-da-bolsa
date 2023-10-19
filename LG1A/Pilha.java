public class Pilha { 
     private int [] valores; 
     private int tamanho; 
     private int topo = -1; 
  
     public Pilha(int tamanho) { 
         setTamanho(tamanho); 
         this.valores = new int[tamanho]; 
     } 
  
     public int getTamanho() { 
         return tamanho; 
     } 
  
     public void setTamanho(int tamanho) { 
         this.tamanho = tamanho; 
     } 
  
     public int getTopo() { 
         return topo; 
     } 
  
     public void push(int valor)throws Exception{ 
         if(this.topo == this.tamanho - 1) 
           valores[(++this.topo)] = valor; 
         else 
             throw new Exception("Pilha atingiu seu tamanho maxímo"); 
     } 
  
     public void pop() throws Exception{ 
         if(this.topo > -1) 
             this.topo--; 
         else 
             throw new Exception("Pilha já vazia"); 
     } 
 }