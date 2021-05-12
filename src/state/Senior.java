package state;

public class Senior implements EtatHumain {
    @Override
    public void action(final Humain humain) {
        System.out.println("Le sénior meurt");
        humain.setEtat(new Mort());
    }
}
