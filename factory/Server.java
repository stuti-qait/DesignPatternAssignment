package factory;

public class Server implements Computer{

    @Override
    public void getConfiguration() {
        System.out.println("HDD="+"8 TB," +" Processor="+  "Intel XEON," + " RAM="+ "32 GB");
    }
}
