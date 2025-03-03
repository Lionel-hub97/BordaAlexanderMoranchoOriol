package prog2.model;

public class Glamping extends Casa {

    private String material = "Tela";
    private boolean casaMascota = true;

    //CONSTRUCTOR
    public Glamping(String nom, String idAllotjament, Mida mida, int habitacions, int placesPersones, int placesParquing, boolean terrassa, boolean tv, boolean aireFred) {
        super(Casa.Mida.MITJANA, habitacions, placesPersones );
        super.setEstadaMinima(7,4);
        super.setId(idAllotjament);
        super.setNom(nom);
        setMaterial(material);
        setCasaMascota(casaMascota);

    }
    // Getter y Setter
    public String getMaterial() {
        return material;
    }
    public void setMaterial(String material) {
        this.material = material;
    }
    public boolean isCasaMascota() {
        return casaMascota;
    }
    public void setCasaMascota(boolean casaMascota) {
        this.casaMascota = casaMascota;
    }

}
