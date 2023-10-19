public class DynamicList<T> { 
     private Node<T> head; 
     private int size; 
  
     private static class Node<T> { 
         private T data; 
         private Node<T> next; 
  
         public Node(T data) { 
             this.data = data; 
             this.next = null; 
         } 
     } 
  
     public DynamicList() { 
         this.head = null; 
         this.size = 0; 
     } 
  
     public void add(T data) { 
         Node<T> newNode = new Node<>(data); 
         if (head == null) { 
             head = newNode; 
         } else { 
             Node<T> current = head; 
             while (current.next != null) { 
                 current = current.next; 
             } 
             current.next = newNode; 
         } 
         size++; 
     } 
  
     public T get(int index) { 
         if (index < 0 || index >= size) { 
             throw new IndexOutOfBoundsException(); 
         } 
         Node<T> current = head; 
         for (int i = 0; i < index; i++) { 
             current = current.next; 
         } 
         return current.data; 
     } 
  
     public int size() { 
         return size; 
     } 
     public void addfirst(T data){ 
         Node<T> newNode = new Node<>(data); 
         head = newNode; 
  
     } 
  
 } 