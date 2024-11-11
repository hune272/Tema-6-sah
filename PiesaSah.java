public abstract class PiesaSah {
    protected String numePiesa;
    protected int coordX;
    protected int coordY;

    public PiesaSah(String numePiesa, int coordX, int coordY) {
        this.numePiesa = numePiesa;
        this.coordX = coordX;
        this.coordY = coordY;
    }

    public abstract boolean mutaPiesa(int newCoordX, int newCoordY);

    public void setCoordonate(int newCoordX, int newCoordY) {
        this.coordX = newCoordX;
        this.coordY = newCoordY;
    }

    public String getNumePiesa() {
        return numePiesa;
    }

    public int getCoordX() {
        return coordX;
    }

    public int getCoordY() {
        return coordY;
    }
}
