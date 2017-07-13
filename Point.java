package Practice_7;

/**
 * Created by jarek on 13.07.2017.
 */
public class Point {
    private int x;
    private int y;

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public Point(int first, int second) {
        this.x = first;
        this.y = second;
    }

    public String makeString() {
        String answer = "(" + this.x + ", " + this.y + ")";

        return answer;
    }

    public boolean isEqualTo(Point coord) {
        if ((coord.x == this.x) && (coord.y == this.y)) {
            return true;
        }
        return false;
    }

    public double distanceTo(Point coord) {
        double distance = Math.sqrt(Math.pow((coord.x - this.x), 2) + Math.pow((coord.y - this.y), 2));

        return distance;
    }

    public void move(int a, int b) {
        this.x = this.x + a;
        this.y = this.y + b;
    }

    public void moveToXY(int a, int b) {
        this.x = a;
        this.y = b;
    }
}
