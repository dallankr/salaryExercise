public class car {



        private String model;
        private int year;
    private String brand;
    private String make;

    private int speed;



    public void accelerate(int speed){
        this.speed = speed;
    }

    public void stop() {
        this.speed = 0;
    }

    public boolean isStopped() {
        return this.speed == 0;
    }
    public int currentSpeed() {
        return speed;
    }

}
