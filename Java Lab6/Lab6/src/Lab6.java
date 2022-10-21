public class Lab6 {

  public static void main(String[] args) {
    solution();
  }

  public static void solution(){
      System.out.println(maximum(2,8,20,3,4));
      System.out.println(maximum(2.7,3.8,5.5,6.7,9.7));
  }

  public static <T extends Comparable<T>> T maximum(T a, T b, T c, T d, T e){
      T max = a;

      if(b.compareTo(max) > 0){
        max = b;
      }

      if(c.compareTo(max) > 0){
        max = c;
      }

      if(d.compareTo(max) > 0){
        max = d;
      }

      if(e.compareTo(max) > 0){
        max = e;
      }

      return max;
  }
  
}