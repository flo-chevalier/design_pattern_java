package strategy;

import static strategy.Itineraire.*;

public class Test {

    public static void main(String[] args) {
        Itineraire itineraire1 = ItineraireStrategie.getFonctionDeCalcul(VELO).apply("Metz", "Marly");
        Itineraire itineraire2 = ItineraireStrategie.getFonctionDeCalcul(PIETON).apply("Metz", "Marly");
        Itineraire itineraire3 = ItineraireStrategie.getFonctionDeCalcul(VOITURE).apply("Thionville", "Metz");
    }
}
