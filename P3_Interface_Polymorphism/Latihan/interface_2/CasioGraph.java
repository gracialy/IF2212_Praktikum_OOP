public class CasioGraph implements GraphCalculator {
    private Point point;
    private int batteryLevel;
    private boolean status;

    public CasioGraph(int x, int y){
        this.point = new Point(x, y);
        this.batteryLevel = 100;
        this.status = false;
    }

    public int add(int a, int b) {
        if (!this.status) return -1;

        this.batteryLevel -= 10;
        if (this.batteryLevel<0) this.status = false;
        return a+b;
    }
    public int substract(int a, int b) {
        if (!this.status) return -1;

        this.batteryLevel -= 10;
        if (this.batteryLevel<0) this.status = false;
        return a-b;
    }
    public int multiply(int a, int b) {
        if (!this.status) return -1;

        this.batteryLevel -= 10;
        if (this.batteryLevel<0) this.status = false;
        return a*b;
    }
    public double divide(int a, int b) {
        if (!this.status) return -1;

        this.batteryLevel -= 10;
        if (this.batteryLevel<0) this.status = false;
        return a/b;
    }
    public void start() {
        if (this.batteryLevel>0) this.status = true;
    }
    public void stop() {
        this.status = false;
    }
    public int checkBattery() {
        return this.batteryLevel;
    }

    public void shiftX(int shiftCount) {
        if (status) {
            this.batteryLevel -= 10;
            if (this.batteryLevel<0) this.status = false;
            point.setX(point.getX() + shiftCount);
        } 
    }
    public void shiftY(int shiftCount) {
        if (status) {
            this.batteryLevel -= 10;
            if (this.batteryLevel<0) this.status = false;
            point.setY(point.getY() + shiftCount);
        }
    }
    public double distance(int x, int y) {
        if (!status) return -1;

        this.batteryLevel -= 10;
        if (this.batteryLevel<0) this.status = false;
        int dx = point.getX() - x;
        int dy = point.getY() - y;
        return Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));
    }

    public Point getPoint() {
        return this.point;
    }
    public boolean getStatus() {
        return this.status;
    }

    public void charge() {
        this.batteryLevel = 100;
        this.status = true;
    }
}