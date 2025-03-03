package prog2.model;

public class Glamping extends Casa {

    private nom = "Glamping Nord";
    private idAllotjament = "106G";
    mida = "Petita";
    habitacions =1;
    placesPersones = 2;
    private String material = "Tela";
    private boolean casaMascota = true;

    public Glamping(String nom, String idAllotjament, Mida mida, int habitacions, int placesPersones, int placesParquing, boolean terrassa, boolean tv, boolean aireFred) {
        super(Casa.Mida.MITJANA, habitacions, placesPersones );
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
    public boolean isTerrassa() {
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


}
