package edu.unl.raikes.day21;

/**
 * This is ZombieInvasion.java, packaged within edu.unl.raikes.day21.
 */
public class ZombieInvasion {

    /**
     * The main method.
     *
     * @param args This program does not accept any arguments.
     */
    public static void main(String[] args) {
        // this is an object - a real thing made from the blueprint
        Town ourTown = new Town("Steveville", "Steve Cooper", 0, 0);

        // this is another object
        Town bettendorf = new Town("Bettendorf", "Paula Ortez", -.5, 1.5);
        System.out.println("Aaaaahhh!!! Zombie invasion! ");

        ourTown.setMayorName("Val");
        System.out.println("This is " + ourTown.getMayorName() + " at " + ourTown.getName()
                + " central command. We need to warn our neighbors.");

        // non static version
        double distanceToBettendorf = ourTown.distance(bettendorf);

        System.out.println(bettendorf.getName() + " is " + distanceToBettendorf + " miles away.");
        System.out.println(bettendorf);
        System.out.println(ourTown);
    }

}
