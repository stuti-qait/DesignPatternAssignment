package singleton;

public class EagerIntialization {

    private static EagerIntialization eg = new EagerIntialization();

    private EagerIntialization(){}

    public static EagerIntialization getInstance(){

        return eg;

    }

    public void view(){
        System.out.println("Its Eager Intialization");
    }
}
