public class Hello{

// entry point to compile
// EVERYTHING wil be executed within that method
    public static void main(String[] args) {
    
        // System.out.println("Hello ninjas!");
        // System.out.println("Hello FROM JAVA!!!!!");
        
        // === VARIABLES ===
        //* PRIMITIVE
        boolean vote = true;
        int number = 33;
        double tax = 3.4;
        float π = 3.14f;
        char letter = 'a';

        //* Object types (Class wrappers)
        Boolean isAdmin = false;
        Integer width = 300;
        Double salePrice = 10.5;
        String name = "Bob"; 

        System.out.println(name.length());

        // --------------------------
        // * import the other class here
        Bob x = new Bob();
        x.sayHi("James");
        int someReturn = x.sum(100, 40);
        System.out.println(someReturn);
        

        //! instantiate the class
        OtherFile y = new OtherFile();
        System.out.println(y.message());
    }
}