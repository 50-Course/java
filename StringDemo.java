// ********************
// Working with Strings
// and string methods
//
// ********************


public class StringDemo {
  // main method
  public static void main(String[] args) {
    System.out.println("Panda by Desiigner");

  
    String str1 = "Sam";
    String str2 = "";
    String str3 = "Ade";

    System.out.println(str1.concat(str3));

    String flavor1 = "mango";
    System.out.println(flavor1.equals("Mango"));

    System.out.println(str3.length());
    System.out.println(str1.indexOf("a"));
    System.out.println(returnBitchValue(str3, 'A'));

  }

  private static int returnBitchValue(String str, char c) {
    return str.indexOf(String.valueOf(c));
  }
}
