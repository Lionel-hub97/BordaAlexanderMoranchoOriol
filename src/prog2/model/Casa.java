package prog2.model;

public abstract class Casa extends Allotjament {
    public enum Mida { PETITA, MITJANA, GRAN } // Enumeració per a la mida de la casa

    private Mida mida;
    private int numHabitacions;
    private int capacitatPersones;

    // Constructor
    public Casa(String mida, int numHabitacions, int capacitatPersones) {
        this.mida = getMida(mida);
        this.numHabitacions = numHabitacions;
        this.capacitatPersones = capacitatPersones;
    }

    //GETTERS Y SETTERS
    public Mida getMida(String mida) {
        return switch (mida) {
            case "PETITA" -> Mida.PETITA;
            case "MITJANA" -> Mida.MITJANA;
            case "GRAN" -> Mida.GRAN;
            default -> throw new IllegalArgumentException("Temporada no vàlida");
        };
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
