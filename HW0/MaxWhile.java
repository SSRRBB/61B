public class MaxWhile {
   public static int max(int[] m) {
      int i = 1;
      int max = m[0];
      
      while (i < m.length){
          if (m[i] > max){
              max = m[i];
          }
          i++;
      }
       return max;
   }
   public static void main(String[] args) {
      int[] m = new int[]{9, 2, 15, 2, 22, 10, 6}; 
      System.out.println(max(m));
   }
}