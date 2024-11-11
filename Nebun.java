public class Nebun extends PiesaSah {

    public Nebun(int coordX, int coordY) {
        super("Nebun", coordX, coordY);
    }

    @Override
    public boolean mutaPiesa(int newCoordX, int newCoordY) {
        if (Math.abs(newCoordX - coordX) == Math.abs(newCoordY - coordY)) {
            setCoordonate(newCoordX, newCoordY);
            return true;
        }
        return false;
    }
}
