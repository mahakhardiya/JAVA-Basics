public class interf {
    public static void main(String[] args) {
        Duck d1 = new Duck();
        d1.fly();
        d1.swim();
    }    
}
interface Flyable {
    void fly();
}

interface Swimmable {
    void swim();
}

class Duck implements Flyable, Swimmable {        
    public void fly() {
        System.out.println("Duck is flying.");
    }
    
    public void swim() {
        System.out.println("Duck is swimming.");
    }
}
