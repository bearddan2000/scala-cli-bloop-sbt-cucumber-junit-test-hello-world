package example;

public class Greeting {
    public static String greeting(String value){
      return "Hello World, " + value;
    }

    public static void main(String[] args){
        System.out.println(greeting("Spiderman"));
    }
}
