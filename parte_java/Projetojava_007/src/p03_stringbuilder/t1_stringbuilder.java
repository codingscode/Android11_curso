
package p03_stringbuilder;


public class t1_stringbuilder {

   public static void main(String[] args) {
      StringBuilder builder = new StringBuilder("Bemvindo a");
      builder.append(" Java"); // mutable builder object
      // builder object points out "Bemvindo a Java"
      System.out.println(builder);
      System.out.println(builder.length());
      System.out.println(builder.insert(builder.length(), " Mundo"));
      System.out.println(builder.reverse());
      System.out.println(builder.reverse());
      System.out.println(builder.delete(0, 11));

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
