package Lekcja1KlasyAnonimowe;

class outer {
    private int x;

    private void doSomething() {
        final int localVar = 5;

        class Inner {
            public void innerMethod() {
                x = 5;
                System.out.println(localVar);
            }
        }

        new Inner().innerMethod();
    }
}
