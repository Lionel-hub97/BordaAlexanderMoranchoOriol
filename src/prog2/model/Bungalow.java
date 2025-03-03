package prog2.model;
public class Bungalow extends Allotjament {
    private int numHabitacions;
    private int capacitat;
    private boolean aireFred;

    // Constructor
    public Bungalow(String nom, String id, int estadaMinimaAlta, int estadaMinimaBaixa, int numHabitacions, int capacitat, boolean aireFred) {
        super(nom, id, estadaMinimaAlta, estadaMinimaBaixa);
        this.numHabitacions = numHabitacions;
        this.capacitat = capacitat;
        this.aireFred = aireFred;
    }

    // Implementació del mètode correcteFuncionament
    @Override
    public boolean correcteFuncionament() {
        return aireFred;
    }

    @Override
    public String toString() {
        return super.toString() + ". Bungalow(numHabitacions=" + numHabitacions + ", capacitat=" + capacitat + ", aireFred=" + aireFred + ")";
    }
}
