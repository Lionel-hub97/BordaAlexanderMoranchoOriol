package prog2.model;

public class Casa extends Allotjament {
    public enum Mida { PETITA, MITJANA, GRAN } // Enumeració per a la mida de la casa

    private Mida mida;
    private int numHabitacions;
    private int capacitatPlaces;

    // Constructor
    public Casa(Mida mida, int numHabitacions, int capacitatPlaces) {
        this.mida = mida;
        this.numHabitacions = numHabitacions;
        this.capacitatPlaces = capacitatPlaces;
    }

    // Getter i Setter per mida
    public Mida getMida() {
        return mida;
    }

    public void setMida(Mida mida) {
        this.mida = mida;
    }

    // Getter i Setter per número d'habitacions
    public int getNumHabitacions() {
        return numHabitacions;
    }

    public void setNumHabitacions(int numHabitacions) {
        this.numHabitacions = numHabitacions;
    }

    // Getter i Setter per capacitat de places
    public int getCapacitatPlaces() {
        return capacitatPlaces;
    }

    public void setCapacitatPlaces(int capacitatPlaces) {
        this.capacitatPlaces = capacitatPlaces;
    }
}
