public class LearnJava {
    /*
     * 
     * You will often see Java programs that have either static or public attributes and methods.
     In the example above, we created a static method, which means that it can be accessed without creating an object of the class, unlike public, which can only be accessed by objects:
    */
    
    /* The dot (.) is used to access the object's attributes and methods.
    To call a method in Java, write the method name followed by a set of parentheses (), followed by a semicolon (;).
    A class must have a matching filename (Main and Main.java). */

    //  public method
    public void testMyMethod() {
        System.out.println("Public methods must be called by creating objects");
    }
    
    //  static method 

    static void myStaticMethod() {
      System.out.println("Static methods can be called without creating objects");
    }

    static int add(int x, int y){
       int result= x+y;
       return result;
    }
    
    static float percentage() {
        int maxScore = 500;
        int userScore = 423;
        float percentage = (float) userScore / maxScore * 100.0f;
        return percentage;
    }
    
    // Access Methods With an Object
    /*
     * Example
      Create a Car object named myCar. Call the fullThrottle() and speed() methods on the myCar object, and run the program:
    */

    //  create a fullthrottle method

    public void fullThrottle() {
         System.out.println("The car is going as fast as it can!");
    }

    //  create a spped method;

    public void speed(int maxSpeed) {
        System.out.println("Max speed is: " + maxSpeed);
    }
    public static void main(String[] args) throws Exception {
        int result = add(10, 5);
        int x = -2147483648; // this int range starting from negative number to positvie number like 2147483647 
        // boolean b = true;  this boolean example  first one true  and secod one getting error because cannot find symbole found variable True and required boolean
        // boolean b = True;
        // boolean b = "True"; 

        //  another example for boolean 
        // int y = 0;
        // if (y) { // incompatible error bcause if conditon to boolean but getting int value
        //     System.out.println("hell0");
        // } else {
        //     System.out.println("Hi");
        // }

        LearnJava testRunMethod=  new LearnJava(); // create an object from LearnJava;
        testRunMethod.testMyMethod(); // call the public method on the object

        //  static method without creating a object we should called directly 
        myStaticMethod();
        //  create a my myCar object 
        LearnJava myCar = new LearnJava();
        myCar.fullThrottle();
        myCar.speed(200);

        System.out.println(x);

        System.out.println(result);
        float percentages = percentage();
        System.out.println(percentages);
    }
}

