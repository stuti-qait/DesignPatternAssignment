package singleton;

public class Main {
    public static void main(String[] args) {
        LazyInitialization lazy = LazyInitialization.getInstance();
        lazy.view();

        EagerIntialization eager = EagerIntialization.getInstance();
        eager.view();

        ThreadSingleton thread = ThreadSingleton.getInstance();
        thread.view();
    }
}
