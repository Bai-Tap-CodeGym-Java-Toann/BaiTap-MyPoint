public class Point {
    private double x = 0;
    private double y = 0;
    private String name = "";

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public Point(int x, int y, String name) {
        this.x = x;
        this.y = y;
        this.name = name;
    }

    public Point(String name) {
        this.name = name;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
    }

    public double distance(Point point) {
        double distanceX = Math.abs(this.x - point.x);
        double distanceY = Math.abs(this.y - point.y);
        return Math.sqrt(distanceX*distanceX+distanceY*distanceY);
    }
}
