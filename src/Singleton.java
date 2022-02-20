public final class Singleton {

    // Thread-safe Singleton with lazy loading

    private static volatile Singleton instance;

    public String value;

    private Singleton(String value) {
        this.value = value;
    }

    public static Singleton getInstance(String value) {

        Singleton result = instance;
        if (result != null) {
            return result;
        }
        synchronized (Singleton.class) {
            if (instance == null) {
                instance = new Singleton(value);
            }
            return instance;
        }
    }
}

class TestMultiThread {

    public static void main(String[] args) {
        System.out.println("If you see the same value, then singleton was reused!\n" +
                "If you see different values, then 2 singletons were created!\n" +
                "RESULT:");
        Thread threadFoo = new Thread(new ThreadFoo());
        Thread threadBar = new Thread(new ThreadBar());
        threadFoo.start();
        threadBar.start();
    }

    static class ThreadFoo implements Runnable {
        @Override
        public void run() {
            Singleton singleton = Singleton.getInstance("FOO");
            System.out.println(singleton.value);
        }
    }

    static class ThreadBar implements Runnable {
        @Override
        public void run() {
            Singleton singleton = Singleton.getInstance("BAR");
            System.out.println(singleton.value);
        }
    }
}

/*
If you see the same value, then singleton was reused!
If you see different values, then 2 singletons were created!
RESULT:
FOO
FOO
*/