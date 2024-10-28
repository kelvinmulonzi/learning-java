class Animal {
    public void displayInfo() {
        System.out.println("I am an animal");
    }
}

class Dog extends Animal {
    @Override
    public void displayInfo() {
        System.out.println("I am a dog");
    }
}

 class Main1 {
    public static void main(String[] args) {
        Animal A1 = new Animal();
        Dog d1 = new Dog();
        A1.displayInfo();
    }
}