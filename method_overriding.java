class method_overriding {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends method_overriding {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }

    public static void main(String[] args) {
        method_overriding myAnimal = new method_overriding();  // Animal object
        Dog myDog = new Dog();        // Dog object

        myAnimal.sound();
        myDog.sound();
    }
}
