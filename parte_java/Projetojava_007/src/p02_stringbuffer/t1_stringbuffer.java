
package p02_stringbuffer;


public class t1_stringbuffer {

   public static void main(String[] args) {
      StringBuffer buffer = new StringBuffer("Bemvindo a");
      buffer.append(" Java"); // mutable buffer object
      // buffer object points out "Bemvindo a Java"
      System.out.println(buffer);
      System.out.println(buffer.length());
      System.out.println(buffer.insert(buffer.length(), " Mundo"));
      System.out.println(buffer.reverse());
      System.out.println(buffer.reverse());
      System.out.println(buffer.delete(0, 11));

   }

}
/*
Bemvindo a Java
15
Bemvindo a Java Mundo
odnuM avaJ a odnivmeB
Bemvindo a Java Mundo
Java Mundo

*/
