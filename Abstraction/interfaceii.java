interface Animal {
    void sound();
}

interface Pet extends Animal {
    void name();
}

class interfaceii implements Pet {
    public void sound() {
        System.out.println("Dog barks.");
    }

    public void name() {
        System.out.println("Name: Tommy.");
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();
        dog.name();
    }
}
