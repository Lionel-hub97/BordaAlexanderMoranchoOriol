package prog2.model;

public class Glamping extends Allotjament {
    private String tipusTenda; // "tela" o "fusta"
    private boolean casaPerMascotes;

    // Constructor
    public Glamping(String nom, String id, int estadaMinimaAlta, int estadaMinimaBaixa, String tipusTenda, boolean casaPerMascotes) {
        super(nom, id, estadaMinimaAlta, estadaMinimaBaixa);
        this.tipusTenda = tipusTenda;
        this.casaPerMascotes = casaPerMascotes;
    }

    // Implementació del mètode correcteFuncionament
    @Override
    public boolean correcteFuncionament() {
        return casaPerMascotes;
    }

    @Override
    public String toString() {
        return super.toString() + ". Glamping(tipusTenda=" + tipusTenda + ", casaPerMascotes=" + casaPerMascotes + ")";
    }
}