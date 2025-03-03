package prog2.model;

public class MobilHome extends Casa {
    private boolean terrassaAmbBarbacoa;

    // Constructor
    public MobilHome(String nom, String idAllotjament, String mida, int habitacions, int placesPersones, boolean terrassaBarbacoa) {
        super(mida, habitacions, placesPersones);
        this.terrassaAmbBarbacoa = terrassaBarbacoa;
        super.setEstadaMinima(7,4);
        super.setId(idAllotjament);
        super.setNom(nom);
        setTerrassaAmbBarbacoa(terrassaBarbacoa);
    }


    //GETTERS Y SETTERS
    public boolean isTerrassaAmbBarbacoa() {
        return terrassaAmbBarbacoa;
    }

    public void setTerrassaAmbBarbacoa(boolean terrassaAmbBarbacoa) {
        this.terrassaAmbBarbacoa = terrassaAmbBarbacoa;
    }


    // Implementació del mètode correcteFuncionament
    @Override
    public boolean correcteFuncionament() {
        return terrassaAmbBarbacoa;
    }

    @Override
    public String toString() {
        return ". MobilHome(terrassaAmbBarbacoa=" + terrassaAmbBarbacoa + ")";
    }
}