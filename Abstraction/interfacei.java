interface Greet {
    void sayHello();
}

class interfacei implements Greet {
    public void sayHello() {
        System.out.println("Hello from Interface!");
    }

    public static void main(String[] args) {
        HelloWorld obj = new HelloWorld();
        obj.sayHello();
    }
}
