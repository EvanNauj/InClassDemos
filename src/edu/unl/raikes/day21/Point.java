package edu.unl.raikes.day21;

/**
 * Represents an x,y point on the map.
 */
public class Point {
    private double x;
    private double y;

    /**
     * Constructs Point object.
     * @param x The x coordinate
     * @param y The y coordinate
     */
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Finds the distance between two points.
     * @param otherPoint Another point
     * @return The distance between the current point and otherPoint
     */
    public double distance(Point otherPoint) {
        return distance(this, otherPoint);
    }
    
    
    /**
     * A static method to find the distance between two points.
     * @param firstPoint The first point
     * @param otherPoint The second point
     * @return The distance between the two points
     */
    public static double distance(Point firstPoint, Point otherPoint) {
        double deltaX = otherPoint.getX() - firstPoint.getX();
        double deltaY = otherPoint.getY() - firstPoint.getY();

        double squares = Math.pow(deltaX, 2) + Math.pow(deltaY, 2);
        return Math.sqrt(squares);
    }

    /**
     * Gets x.
     * @return x
     */
    public double getX() {
        return this.x;
    }

    /**
     * Sets x.
     * @param x What x will be set to
     */
    public void setX(double x) {
        this.x = x;
    }

    /**
     * Gets y.
     * @return y
     */
    public double getY() {
        return this.y;
    }
    
    /**
     * Sets y.
     * @param y What y will be set to
     */
    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "[x=" + this.x + ", y=" + this.y + "]";
    }
    
    

}
