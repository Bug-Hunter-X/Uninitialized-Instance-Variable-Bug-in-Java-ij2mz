public class MyClass {
    private int x;

    public MyClass(int x) {
        this.x = x; // Assign value to the instance variable
    }

    public int getX() {
        return x; // Return the value of the instance variable
    }
    public static void main(String[] args) {
        MyClass obj = new MyClass(10); // Explicit constructor call
        System.out.println(obj.getX()); // Accessing the instance variable after initialization
    }
}