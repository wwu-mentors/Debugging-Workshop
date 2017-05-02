import java.util.*;
public class Main {
   
   public static Node first;
   
   public static void main(String[] args){  
      walkPrettyArray();    
      bozo();
      linkedListStuff();
   }
   
   public static void walkPrettyArray(){
      int[] arrayW;
      
      //create and initialize an array
      arrayW = new int[3];
      for (int j = 0; j != arrayW.length; j++){
         arrayW[j] = j;
      }
      
      //prints out object ID, WRONG!
      System.out.println(arrayW);
      
      //uses static class to "pretty print"
      System.out.println(Arrays.toString(arrayW));
      
   }
   
   public static void bozo(){

      int[] arrayB = new int[5];
      // populate array
      for (int j = 0; j <= arrayB.length; j++){
         arrayB[j] = j;
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
