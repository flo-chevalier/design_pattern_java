package state;

public class Mort implements EtatHumain {
    @Override
    public void action(final Humain humain) throws Exception {
        throw new Exception("Plus rien n'est possible après la mort");
    }
}
