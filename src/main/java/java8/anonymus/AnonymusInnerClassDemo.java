package java8.anonymus;

public class AnonymusInnerClassDemo {
    public static void main(String[] args) {
        Runnable r = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("in Runnable Thread"+Thread.currentThread().getName());
                }
            }
        };
        /*
         *  Anonymus Inner class can extends Concrete class
         *  Anonymus Inner Class can extends Abstract Class
         *  Anonymus Inner class can Implements interface which contains multiple methods.
         *
         * If Interface contains only one abstract method then only we can go for Lambda expression.
         * In other casses we cannot able to create lambda expression for that interface.
         * Thats why Lambda expression only supports functional Interface.
         */
        Runnable runnable = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("In Runnable Lambda"+ Thread.currentThread().getName());
            }
        };
        Thread t = new Thread(r);
        t.start();
        t = new Thread(runnable);
        t.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("In main thread"+Thread.currentThread().getName());
        }
    }
}
