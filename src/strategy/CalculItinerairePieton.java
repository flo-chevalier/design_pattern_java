package strategy;

/**
 * Calcul l'itinéraire d'un piéton.
 */
public class CalculItinerairePieton {

    public Itineraire executer(final String depart, final String arrivee) {
        System.out.println("Je calcule l'itinéraire pour un piéton, entre " + depart + " et " + arrivee);
        return new Itineraire(0);
    }
}
