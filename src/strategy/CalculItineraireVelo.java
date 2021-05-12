package strategy;

/**
 * Calcul l'itinéraire d'un piéton.
 */
public class CalculItineraireVelo {

    public Itineraire executer(final String depart, final String arrivee) {
        System.out.println("Je calcul l'itinéraire pour un vélo, entre " + depart + " et " + arrivee);
        return new Itineraire(0);
    }
}
