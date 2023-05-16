
package p01_strings;


public class t1_stringexemplo {

   public static void main(String[] args) {
      String s = "Programação Java";
      String s1 = "Programação Java";
      
      String sobj = new String("Programação Java");
      String sobj1 = new String("Programação Java");
      
      System.out.println("s: " + s);
      System.out.println("s1: " + s1);
      System.out.println("sobj: " + sobj);
      System.out.println("sobj1: " + sobj1);

      /*
      '==' operator matches the references
      equals() method matches values or contents
      */
      System.out.println("s == s1 : " + (s == s1));
      System.out.println("s == sobj : " + (s == sobj));
      System.out.println("s.equals(s1) : " + (s.equals(s1)));
      System.out.println("s.equals(sobj) : " + (s.equals(s1)));
      System.out.println("sobj == sobj1 : " + (sobj == sobj1));
      System.out.println("sobj.equals(sobj1) : " + sobj.equals(sobj1));
      System.out.println();

   }

}
/*
s: Programação Java
s1: Programação Java
sobj: Programação Java
sobj1: Programação Java
s == s1 : true
s == sobj : false
s.equals(s1) : true
s.equals(sobj) : true
sobj == sobj1 : false
sobj.equals(sobj1) : true


*/
