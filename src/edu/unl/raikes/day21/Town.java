package edu.unl.raikes.day21;

// this is a class - a blueprint
public class Town {
    // public means anyone has access to read/modify
    // nothing is included means anyone in same package can read/modify
    // protected - ignore this for now
    // private - no one but "this" can modify
    static int population = 12;
    private String name;
    private String mayorName;
    private Point location;
    private boolean isElectionSeason = false;
    
    /**
     * 
     * @param name
     * @param mayorName
     * @param x
     * @param y
     */
    public Town(String name, String mayorName, double x, double y) {
        this.name = name;
        this.mayorName = mayorName;
        this.location = new Point(x, y);
        System.out.println("makin a new town");
        population++;
    }
    
    /**
     * Finds distance between two towns.
     * @param otherTown Town current town is being compared to.
     * @return Distance between two towns.
     */
    public double distance(Town otherTown) {
        return this.location.distance(otherTown.getLocation());
    }

    /**
     * Gets the object's name.
     *
     * @return the name
     */
    public String getName() {
        return this.name;
    }

    /**
     * Sets the object's name.
     *
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the object's mayorName.
     *
     * @return the mayorName
     */
    public String getMayorName() {
        return this.mayorName;
    }

    /**
     * Sets the object's mayorName.
     *
     * @param mayorName the mayorName to set
     */
    public void setMayorName(String mayorName) {
        if (this.isElectionSeason) {
            this.mayorName = mayorName;
        }
    }
    
    /**
     * Gets location.
     * @return location
     */
    public Point getLocation() {
        return this.location;
    }
    
    /**
     * Sets location.
     * @param location What location will be set to
     */
    public void setLocation(Point location) {
        this.location = location;
    }
    
    /**
     * Prints the town's name and its mayor.
     */
    @Override
    public String toString() {
        return "I'm a town called " + this.name + " and my mayor is the honorable " + this.mayorName + ". I am located at " + this.location;
    }

}
