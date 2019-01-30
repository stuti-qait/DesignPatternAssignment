package singleton;

public class LazyInitialization {

    private static LazyInitialization lz;

    private LazyInitialization(){}

    public static LazyInitialization getInstance(){
        if (lz==null){
            lz = new LazyInitialization();

        }
        return lz;
    }

    public void view(){
        System.out.println("iTS LAZY INITIALIZATION");
    }

}
