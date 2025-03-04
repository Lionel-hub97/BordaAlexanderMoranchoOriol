package prog2.model;

public class Parcela extends Allotjament {
    private double mida;
    private boolean connexioElectrica;

    // Constructor
    public Parcela(String nom, String id, float mida, boolean connexioElectrica) {
        super.setNom(nom);
        super.setEstadaMinima( 4,2);
        this.mida = mida;
        this.connexioElectrica = connexioElectrica;
    }


    // Implementació del mètode correcteFuncionament
    @Override
    public boolean correcteFuncionament() {
        return connexioElectrica;
    }

    @Override
    public String toString() {
        return  ". Parcela(mida=" + mida + ", connexioElectrica=" + connexioElectrica + ")";
    }
}