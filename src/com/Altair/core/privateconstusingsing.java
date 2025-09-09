class Singleton {
    private static Singleton instance;  // static reference

    private Singleton() {   // private constructor
        System.out.println("Singleton created");
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton(); // create only once
        }
        return instance;
    }
}

public class Main {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        System.out.println(s1 == s2); //  true
    }
}
