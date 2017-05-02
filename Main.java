import java.util.*;
public class Main {
   
   public static Node first;
   
   public static void main(String[] args){  
      walkPrettyArray();    
      bozo();
      linkedListStuff();
   }
   
   public static void walkPrettyArray(){
      int[] array;
      
      //create and initialize an array
      array = new int[3];
      for (int j = 0; j != array.length; j++){
         array[j] = j;
      }
      
      //prints out object ID, WRONG!
      System.out.println(array);
      
      //uses static class to "pretty print"
      System.out.println(Arrays.toString(array));
      
   }
   
   public static void bozo(){

      int[] array = new int[5];
      // populate array
      for (int j = 0; j <= array.length; j++){
         array[j] = j;
      }
   }
   
   public static void linkedListStuff(){
      first = new Node();
      Node pointer = first;
      Random r = new Random();
      for(int i = 0; i < r.nextInt(15)+1; i++){
         Node temp = new Node();
         temp.value = i;
         pointer.next = temp;
         pointer = temp;
      }
      
      Node temp = first;
      System.out.printf("%d\n",temp.value);
      while(temp != null){
         temp = temp.next;
         System.out.printf("%d\n",temp.value)
      }
   }
}