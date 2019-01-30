package factory;

public class PC implements Computer{

    @Override
    public void getConfiguration() {
        System.out.println("HDD="+"1 TB," +" Processor="+ "Intel core 2," + " RAM="+ "16 GB");

    }
}
