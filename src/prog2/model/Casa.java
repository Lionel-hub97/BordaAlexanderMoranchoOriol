package prog2.model;

public class Casa extends Allotjament {
    public enum Mida { PETITA, MITJANA, GRAN } // Enumeració per a la mida de la casa

    private Mida mida;
    private int numHabitacions;
    private int capacitatPersones;

    // Constructor
    public Casa(Mida mida, int numHabitacions, int capacitatPersones) {
        this.mida = mida;
        this.numHabitacions = numHabitacions;
        this.capacitatPersones = capacitatPersones;
    }
    public Mida getMida() {
        return mida;
    }

    public void setMida(Mida mida) {
        this.mida = mida;
    }
    public int getNumHabitacions() {
        return numHabitacions;
    }

    public void setNumHabitacions(int numHabitacions) {
        this.numHabitacions = numHabitacions;
    }
    public int getCapacitatPersones() {
        return capacitatPersones;
    }

    public void setCapacitatPersones(int capacitatPersones) {
        this.capacitatPersones = capacitatPersones;
    }
}
