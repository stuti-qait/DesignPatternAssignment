package factory;

public class ComputerFactory {


    public Computer getInstance(String Type){
        if(Type == null){
            return null;
        }
        if(Type.equalsIgnoreCase("PC")){
            return new PC();

        } else if(Type.equalsIgnoreCase("SERVER")){
            return new Server();

        }

        return null;
    }
}
