package singleton;

public class Test {

  public static void main(String[] args) {
    final Batiment batiment = Batiment.getInstance();
    batiment.faireQuelqueChose();
  }
}
