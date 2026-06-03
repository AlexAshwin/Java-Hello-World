public class Main {
    public static void main(String[] args) {
        // Print a welcome message
        System.out.println("Hello and welcome to Java!");
        System.out.println("-------------------------");

        // Example 1: Working with variables and conditions
        int temperature = 25;
        System.out.println("The current temperature is " + temperature + "°C.");

        if (temperature > 30) {
            System.out.println("It's a hot day!");
        } else if (temperature >= 15 && temperature <= 30) {
            System.out.println("The weather is pleasant.");
        } else {
            System.out.println("It's a cold day!");
        }

        System.out.println("-------------------------");

        // Example 2: A simple loop counting from 1 to 5
        System.out.println("Starting a loop countdown:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Count: " + i);
        }

        System.out.println("-------------------------");
        System.out.println("Execution finished successfully!");
    }
}