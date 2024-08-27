package August.ex_11082024.excar;

public class Tesla extends Engine{
    @Override
    void start() {
        System.out.println("starting tesla");
    }

    @Override
    void stop() {
        System.out.println("Stoping Tesla");

    }

    @Override
    void speed() {
        System.out.println("Speed of Tesla is 300 km/hour");
    }

    @Override
    void partGrarBox() {
        System.out.println("Electric ");
    }

    @Override
    void opencar() {
        System.out.println("Open tesla car ");
    }

    void drive(){
        opencar();
        start();
        partGrarBox();
        stop();
    }
}
