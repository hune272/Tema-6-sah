public class Tura extends PiesaSah {

    public Tura(int coordX, int coordY) {
        super("Tura", coordX, coordY);
    }

    @Override
    public boolean mutaPiesa(int newCoordX, int newCoordY) {
        if (newCoordX == coordX || newCoordY == coordY) {
            setCoordonate(newCoordX, newCoordY);
            return true;
        }
        return false;
    }
}
