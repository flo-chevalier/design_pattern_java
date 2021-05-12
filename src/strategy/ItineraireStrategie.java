package strategy;

import java.util.Arrays;
import java.util.function.BiFunction;

/**
 * Design Pattern Strategie permettant de faire appel à la bonne méthode de calcul,
 * en fonction du type d'itinéraire.
 */
public enum ItineraireStrategie {
    PIED(Itineraire.PIETON, ItineraireStrategie::calculerPourPieton),
    VELO(Itineraire.VELO, ItineraireStrategie::calculerPourVelo),
    VOITURE(Itineraire.VOITURE, ItineraireStrategie::calculerPourVoiture),
    DEFAUT(null, ItineraireStrategie::calculerPourVoiture);

    private final String typeItineraire;
    private final BiFunction<String, String, Itineraire> fonctionDeCalcul;

    ItineraireStrategie(final String typeItineraire,
                        final BiFunction<String, String, Itineraire> fonctionCalcul) {
        this.typeItineraire = typeItineraire;
        this.fonctionDeCalcul = fonctionCalcul;
    }

    private static Itineraire calculerPourPieton(final String depart, final String arrivee) {
        return new CalculItinerairePieton().executer(depart, arrivee);
    }

    private static Itineraire calculerPourVelo(final String depart, final String arrivee) {
        return new CalculItineraireVelo().executer(depart, arrivee);
    }

    private static Itineraire calculerPourVoiture(final String depart, final String arrivee) {
        return new CalculItineraireVoiture().executer(depart, arrivee);
    }

    private static ItineraireStrategie of(final String typeItineraire) {
        return Arrays.stream(values())
                     .filter(v -> v.typeItineraire.equals(typeItineraire))
                     .findFirst()
                     .orElse(DEFAUT);
    }

    public static BiFunction<String, String, Itineraire> getFonctionDeCalcul(final String typeItineraire) {
        return of(typeItineraire).fonctionDeCalcul;
    }
}
