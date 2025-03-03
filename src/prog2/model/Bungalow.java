package prog2.model;

public class Bungalow extends Casa {


    private int placesParquing;
    private boolean terrassa;
    private boolean tv;
    private boolean aireFred;

    //CONSTRUCTOR
    public Bungalow(String nom, String idAllotjament, String  mida, int habitacions, int placesPersones, int placesParquing, boolean terrassa, boolean tv, boolean aireFred) {
        super(mida, habitacions, placesPersones );
        super.setEstadaMinima(7,4);
        super.setId(idAllotjament);
        super.setNom(nom);
        setPlacesParquing(placesParquing);
        setTerrassa(terrassa);
        setTv(tv);
        setAireFred(aireFred);
    }
    // Getter y Setter
    public int getPlacesParquing() {
        return placesParquing;
    }
    public void setPlacesParquing(int placesParquing) {
        this.placesParquing = placesParquing;
    }
    public boolean getTerrassa() {
        return terrassa;
    }
    public void setTerrassa(boolean terrassa) {
        this.terrassa = terrassa;
    }
    public boolean isTv() {
        return tv;
    }
    public void setTv(boolean tv) {
        this.tv = tv;
    }
    public boolean isAireFred() {
        return aireFred;
    }
    public void setAireFred(boolean aireFred) {
        this.aireFred = aireFred;
    }

    // Implementació del mètode correcteFuncionament
    public boolean correcteFuncionament(){
        return aireFred;
    }
    public String toString() {
        String x = "Nom="+getNom()+", Id="+getId()+", estada mínima en temp ALTA: "+getEstadaMinimaALTA()+", estada mínima en temp BAIXA: "+getEstadaMinimaBAIXA()+". Bungalow{mida="+getMida()+", connexioElectrica=true}";

    }
}
