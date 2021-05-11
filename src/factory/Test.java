package factory;

public class Test {

  public static void main(String[] args) throws Exception {
    Animal chat = FabriqueAnimal.creer(FabriqueAnimal.CHAT);
    Animal chien = FabriqueAnimal.creer(FabriqueAnimal.CHIEN);
    Animal serpent = FabriqueAnimal.creer(FabriqueAnimal.SERPENT);
    chat.seDeplacer();
    chien.seDeplacer();
    serpent.seDeplacer();
  }
}
