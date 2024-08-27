package August.ex_11082024.excar;

public class WagonR extends Engine{

    @Override
    void start() {

    }

    @Override
    void stop() {
        System.out.println("Stop the car");
    }

    @Override
    void speed() {
        System.out.println("100 km/h");

    }

    @Override
    void partGrarBox() {
        System.out.println("Gear Box Wagonr");
    }

    @Override
    void opencar() {
        System.out.println("Open the car");
    }

    void drive(){
         opencar();
         start();
         partGrarBox();
         speed();
         stop();
    }
}
