package Day01_ProgrammingElement;

public class VolumeEarth {
    public static void main(String[] args) {
        double radius = 6378; // in km
        double volumeKm = (4.0 / 3) * Math.PI * Math.pow(radius, 3);
        double volumeMiles = volumeKm * 0.239913; // 1 km³ = 0.239913 mi³

        System.out.println("The volume of Earth in cubic kilometers is " + volumeKm +
                           " and cubic miles is " + volumeMiles);
    }
}
