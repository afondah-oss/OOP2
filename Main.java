// OOP1.java

public class Main {

    //instance variable (within a class but outside  method)
    int instanceVariable = 10;

    // static variable with initial value
    static int staticVariable = 20;

    // Method 
    public void printVariables() {
        
        // local variable(inside method)
        int Wage = 30;

        System.out.println("Wage = " + Wage);
        System.out.println("Instance Variable = " + this.instanceVariable);
        System.out.println("Static Variable = " + Main.staticVariable);
    }

    public static void main(String[] args) {
        // Create an instance of the class to access the instance method
       Main= new Main();

        // Call the method to print the variable values
        demoObject.printVariables();
    }
}