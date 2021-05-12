package state;

public class Bebe implements EtatHumain {
    @Override
    public void action(final Humain humain) {
        System.out.println("Le bébé devient enfant");
        humain.setEtat(new Enfant());
    }
}
