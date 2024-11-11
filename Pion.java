public class Pion extends PiesaSah {

    public Pion(int coordX, int coordY) {
        super("Pion", coordX, coordY);
    }

    @Override
    public boolean mutaPiesa(int newCoordX, int newCoordY) {
        if (newCoordX == coordX && newCoordY == coordY + 1) {
            setCoordonate(newCoordX, newCoordY);
            return true;
        }
        return false;
    }
}
