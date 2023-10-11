public class MathCalc {
    public static void main(String[] args) {
        // Constants for the diameters of the Earth and Sun in miles
        double earthDiameter = 7600.0;
        double sunDiameter = 865000.0;

        // Calculate the radii of the Earth and Sun
        double earthRadius = earthDiameter / 2.0;
        double sunRadius = sunDiameter / 2.0;

        // Calculate the volume of the Earth and Sun
        double earthVolume = (4.0 / 3.0) * Math.PI * Math.pow(earthRadius, 3);
        double sunVolume = (4.0 / 3.0) * Math.PI * Math.pow(sunRadius, 3);

        // Calculate the ratio of the volume of the Sun to the volume of the Earth
        double volumeRatio = sunVolume / earthVolume;

        // Output the results
        System.out.println("The volume of the Earth is " + earthVolume + " cubic miles.");
        System.out.println("The volume of the Sun is " + sunVolume + " cubic miles.");
        System.out.println("The ratio of the volume of the Sun to the volume of the Earth is " + volumeRatio);
    }
}
