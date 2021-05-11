package factory;

/**
 * Classe pouvant fabriquer un {@link Animal}.
 */
public class FabriqueAnimal {
  public static final String CHAT = "chat";
  public static final String CHIEN = "chien";
  public static final String SERPENT = "serpent";

  /**
   * Permet de créer un {@link Animal}.
   */
  public static Animal creer(final String typeAnimal) throws Exception {
    switch (typeAnimal) {
      case CHAT:
        return new Chat();
      case CHIEN:
        return new Chien();
      case SERPENT:
        return new Serpent();
    }

    throw new Exception("Impossible de créer un " + typeAnimal);
  }
}
