package prog2.model;

public abstract class Allotjament implements InAllotjament {


    private String nom;
    private String idAllotjament;
    private long estadaMinimaALTA;
    private long estadaMinimaBAIXA;



    //CONSTRUCTOR
    public Allotjament(String nom, String id, int estadaMinimaAlta, int estadaMinimaBaixa) {
        this.nom = nom;
        this.idAllotjament = id;
        this.estadaMinimaALTA = estadaMinimaAlta;
        this.estadaMinimaBAIXA = estadaMinimaBaixa;
    }
    //GETTERS Y SETTERS
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

        };
    }
    @Override
    public void setEstadaMinima(long estadaMinimaALTA, long estadaMinimaBAIXA) {
        this.estadaMinimaALTA = estadaMinimaALTA;
        this.estadaMinimaBAIXA = estadaMinimaBAIXA;
    }
    public long getEstadaMinimaBAIXA() {
        return estadaMinimaBAIXA;
    }
    public long getEstadaMinimaALTA() {
        return estadaMinimaALTA;
    }

    public abstract boolean correcteFuncionament();
    public String toString(){
        return "Nom="+getNom()+", Id="+getId()+", estada mínima en temp ALTA: "+getEstadaMinimaALTA()+", estada mínima en temp BAIXA: "+getEstadaMinimaBAIXA()+".";
        //"Nom=Allotjament Test, Id=ID001, estada mínima en temp ALTA: 5, estada mínima en temp BAIXA: 3."
    }
}
