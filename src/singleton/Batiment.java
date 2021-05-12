package singleton;

/**
 * Cette classe est un singleton car je veux qu'il n'y ait qu'une seule instance dans toute l'application.
 */
public class Batiment {
  private static Batiment instance;

  private Batiment() {
    // le constructeur est privé
  }

  public static Batiment getInstance() {
    if (instance == null) {
      instance = new Batiment();
    }
    return instance;
  }

  public void faireQuelqueChose() {
    System.out.println("on fait quelque chose");
  }
}
