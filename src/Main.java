
class Parent {

    private int privateVariable = 5;    // Private variable, not accessible in Child class
    int parentVariable = 10;

    public void parentMethod() {
        System.out.println("This is a method from the Parent class.");
    }
}

class Child extends Parent {
    int childVariable = 20;

    public void childMethod() {
        System.out.println("This is a method from the Child class.");
    }
}


class Main {
    public static void main(String[] args) throws Exception {
        
        Child example = new Child();
        example.childMethod(); // Calls method from Child class

        example.parentMethod(); // Calls method from Parent class
        
    
    }
}
