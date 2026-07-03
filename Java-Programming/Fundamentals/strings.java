public  class strings {
    public static void main(String[] args) {
        String greeting = "Hello, World!";
        System.out.println(greeting);

        // Concatenation
        String firstName = "John";
        String lastName = "Doe";
        String fullName = firstName + " " + lastName;
        System.out.println("Full Name: " + fullName);

        // String length
        int length = greeting.length();
        System.out.println("Length of greeting: " + length);

        // Substring
        String sub = greeting.substring(0, 5);
        System.out.println("Substring: " + sub);

        // Replace
        String newGreeting = greeting.replace("World", "Java");
        System.out.println("New Greeting: " + newGreeting);
    }
    
}
