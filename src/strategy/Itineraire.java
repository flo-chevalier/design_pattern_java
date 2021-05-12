package strategy;

/**
 * Représente un itinéraire.
 */
public class Itineraire {
    public static final String VELO = "velo";
    public static final String PIETON = "pieton";
    public static final String VOITURE = "voiture";

    private final double distance;

    public Itineraire(final double distance) {
        this.distance = distance;
    }

    public double getDistance() {
        return distance;
    }
}
