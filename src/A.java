abstract class A {

    abstract void greet();

    public void greet2() {
        System.out.println("jambo");
    }
}
    class B extends A {
        public void greet() {
            System.out.println("howdy");
        }
    }

    class C {
        public static void main(String[] args) {
            B b = new B();
            A a = new A() {
                @Override
                void greet() {

                }
            };
            b.greet();
            b.greet2();
        }
    }
