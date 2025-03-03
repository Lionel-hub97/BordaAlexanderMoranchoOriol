package prog2.model;

public class BungalowPremium extends Bungalow {
    private boolean llençolsTovalloles;
    private String codiWifi;

    // Constructor
    public BungalowPremium(String nom, String id, int estadaMinimaAlta, int estadaMinimaBaixa, int numHabitacions, int capacitat, boolean aireFred, boolean llençolsTovalloles, String codiWifi) {
        super(nom, id, estadaMinimaAlta, estadaMinimaBaixa, numHabitacions, capacitat, aireFred);
        this.llençolsTovalloles = llençolsTovalloles;
        this.codiWifi = codiWifi;
    }

    // Implementació del mètode correcteFuncionament
    @Override
    public boolean correcteFuncionament() {
        return super.correcteFuncionament() && codiWifi.length() >= 8 && codiWifi.length() <= 16;
    }

    @Override
    public String toString() {
        return super.toString() + ". BungalowPremium(llençolsTovalloles=" + llençolsTovalloles + ", codiWifi=" + codiWifi + ")";
    }
}
