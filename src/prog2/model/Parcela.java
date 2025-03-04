package prog2.model;

public class Parcela extends Allotjament {
    private float mida;
    private boolean connexioElectrica;

    // Constructor
    public Parcela(String nom, String id, float mida, boolean connexioElectrica) {
        super.setNom(nom);
        super.setEstadaMinima( 4,2);
        this.mida = mida;
        this.connexioElectrica = connexioElectrica;
    }

    public float getMida() {
        return mida;
    }
    public void setMida(float mida) {
        this.mida = mida;
    }
    public boolean isConnexioElectrica() {
        return connexioElectrica;
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