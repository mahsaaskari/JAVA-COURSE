// Define a class named CircleAndPlanets
public class CircleAndPlanets {
    // The main method is the entry point of the program
    public static void main(String[] args) {
        // Declare and initialize variables for radius, circle area, feet, and inches
        double radius = 0.0;
        double circleArea = 100.0;
        int feet = 0;
        int inches = 0;

        // Calculate the radius of a circle given its area
        radius = Math.sqrt(circleArea / Math.PI);
        // Calculate the whole feet part of the radius
        feet = (int) Math.floor(radius);
        // Calculate the remaining inches part of the radius
        inches = (int) Math.round(12.0 * (radius - feet));

        // Calculate the volume of the Earth
        double earthVolume = (4.0 / 3.0) * Math.PI * Math.pow((7600.0 / 2.0), 3.0);
        // Calculate the volume of the Sun
        double sunVolume = (4.0 / 3.0) * Math.PI * Math.pow((865000.0 / 2.0), 3.0);
        // Calculate the ratio of the volume of the Sun to the volume of the Earth
        double sunToEarthVolumeRatio = sunVolume / earthVolume;

        // Print the radius of a circle
        System.out.println("The radius of a circle with an area of 100 square units is\n " + feet + " feet " + inches
                + " inches");

        // Print the volume of the Earth, the volume of the Sun, and the ratio of their volumes
        System.out.println("The volume of the Earth is " + earthVolume + " cubic miles, "
                + "the volume of the Sun is "
                + sunVolume
                + " cubic miles, and the ratio of the volume of the Sun to the volume of the Earth is "
                + sunToEarthVolumeRatio);
    }
}






