package prog2.model;

public class BungalowPremium extends Bungalow {

    private boolean serveisExtra;
    private String codiWifi;

    // Constructor
    public BungalowPremium(String nom, String idAllotjament, int habitacions, int placesPersones, int placesParquing, boolean terrassa, boolean tv, boolean aireFred, boolean serveisExtra, String codiWifi) {
        super(nom, idAllotjament, habitacions, placesPersones, placesParquing, terrassa, tv, aireFred);
        setLlençolsTovalloles(serveisExtra);
        setCodiWifi(codiWifi);
    }

    // Getters y Setters
    public boolean getserveisExtra() {
        return serveisExtra;
    }
    public void setLlençolsTovalloles(boolean llençolsTovalloles) {
        this.serveisExtra = llençolsTovalloles;
    }
    public String getCodiWifi() {
        return codiWifi;
    }
    public void setCodiWifi(String codiWifi) {
        this.codiWifi = codiWifi;
    }

    public
}
