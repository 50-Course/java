public class Methods {
  public static void main(String[] args) {
    String name = new String("Eri");  // name
    
    System.out.println(greet(name));
  }


  private static String greet(String str) {
      return "Hello, " + str;
  }

  protected static void exampleMethod() {
    System.out.rintln("This is the example method.");
  }

}
