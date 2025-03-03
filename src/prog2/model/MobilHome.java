package prog2.model;

public class MobilHome extends Allotjament {
    private boolean terrassaAmbBarbacoa;

    // Constructor
    public MobilHome(String nom, String id, int estadaMinimaAlta, int estadaMinimaBaixa, boolean terrassaAmbBarbacoa) {
        super(nom, id, estadaMinimaAlta, estadaMinimaBaixa);
        this.terrassaAmbBarbacoa = terrassaAmbBarbacoa;
    }

    // Implementació del mètode correcteFuncionament
    @Override
    public boolean correcteFuncionament() {
        return terrassaAmbBarbacoa;
    }

    @Override
    public String toString() {
        return super.toString() + ". MobilHome(terrassaAmbBarbacoa=" + terrassaAmbBarbacoa + ")";
    }
}