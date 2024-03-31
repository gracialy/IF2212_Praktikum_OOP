public class PoliceCar implements TrackableVehicle {
    private String plateNumber;
    private Point gpsPosition;
    private int speed;
    private String direction;
    private int wheel;
    private String fuelType;
    private boolean started;

    public PoliceCar(String plateNumber, Point gpsPosition, 
                    int speed, int wheel, String fuelType) {
        this.plateNumber = plateNumber;
        this.gpsPosition = gpsPosition;
        this.speed = speed;
        this.direction = "North";
        this.wheel = wheel;
        this.fuelType = fuelType;
        this.started = false;
    }

    public String getPlateNumber() {
        return this.plateNumber;
    }
    public Point getGPSPosition() {
        return this.gpsPosition;
    }

    public int getNumberOfWheels() {
        return this.wheel;
    }
    public int getMaxSpeed() {
        return this.speed;
    }
    public String getFuelType() {
        return this.fuelType;
    }
    public boolean getStarted() {
        return this.started;
    }
    public void start() {
        this.started = true;
    }
    public void stop(){
        this.started = false;
    }
    public void turn(String direction){
        this.direction = direction;
    }
}