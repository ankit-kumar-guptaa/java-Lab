// Singleton.java
class Singleton {
    private static Singleton instance; // The single instance of the class
    
    // Private constructor to prevent instantiation
    private Singleton() {
        // Initialization code here
        System.out.println("Singleton instance created.");
    }
    
    // Public static method to get the instance of the Singleton class
    public static Singleton getInstance() {
        if (instance == null) { // If instance is not created yet
            instance = new Singleton(); // Create a new instance
        }
        return instance; // Return the single instance
    }
}

class Main {
    public static void main(String[] args) {
        System.out.println("------------Made By Navneet Kumar 20/1362---------");
        Singleton obj1 = Singleton.getInstance(); // Get the Singleton instance
        Singleton obj2 = Singleton.getInstance(); // Get the Singleton instance again
        
        // Verify that obj1 and obj2 refer to the same object
        if (obj1 == obj2) {
            System.out.println("obj1 and obj2 refer to the same object.");
        } else {
            System.out.println("obj1 and obj2 refer to different objects.");
        }
    }
}
