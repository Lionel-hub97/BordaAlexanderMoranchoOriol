package prog2.model;

public class Allotjament implements InAllotjament {


    private String nom;
    private String idAllotjament;
    private long estadaMinimaALTA;
    private long estadaMinimaBAIXA;
    private Temp temp;

    @Override
    public String getNom() {
        return nom;
    }

    @Override
    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String getId() {
        return idAllotjament;
    }

    @Override
    public void setId(String idAllotjament) {
        this.idAllotjament = idAllotjament;
    }

    @Override
    public long getEstadaMinima(Temp temp) {
        return switch (temp) {
            case ALTA -> estadaMinimaALTA;
            case BAIXA -> estadaMinimaBAIXA;
            default -> throw new IllegalArgumentException("Temporada no vàlida");
        };
    }

    @Override
    public void setEstadaMinima(long estadaMinimaALTA_, long estadaMinimaBAIXA_) {
        estadaMinimaALTA = estadaMinimaALTA_;
        estadaMinimaBAIXA = estadaMinimaBAIXA_;
    }


    public boolean correcteFuncionament(){
        return false;
    }


}
