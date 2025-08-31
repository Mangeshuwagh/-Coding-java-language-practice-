public class ClassNotFoundExceptionExample {

    public static void main(String[] args) {
        try {
            // Attempting to load a class dynamically
            Class<?> cls = Class.forName("com.example.NonExistentClass");
            System.out.println("Class loaded successfully: " + cls.getName());
        } catch (ClassNotFoundException e) {
            // Handling ClassNotFoundException
            System.out.println("Exception occurred: Class not found.");
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Program continues...");
    }
}
