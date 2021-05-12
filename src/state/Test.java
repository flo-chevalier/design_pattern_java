package state;

public class Test {

    public static void main(String[] args) throws Exception {
        Humain humain = new Humain();

        humain.vieillir();
        humain.vieillir();
        humain.vieillir();
        humain.vieillir();
        humain.vieillir();
        humain.vieillir(); // leve une exception
    }
}
