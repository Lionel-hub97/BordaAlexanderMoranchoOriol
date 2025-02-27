package prog2.model;

public class Allotjament implements InAllotjament {


    private String nom;
    private String idAllotjament;
    private static long estadaMinimaALTA;
    private static long estadaMinimaBAIXA;

    @Override
    public String getNom() {
        return "";
    }

    @Override
    public void setNom(String nom) {

    }

    @Override
    public String getId() {
        return "";
    }

    @Override
    public void setId(String id) {

    }

    @Override
    public void setEstadaMinima(long estadaMinimaALTA_, long estadaMinimaBAIXA_) {

    }

    @Override
    public boolean correcteFuncionament() {
        return false;
    }

    @Override
    public long getEstadaMinima(model.InAllotjament.Temp temp) {
        return 0;
    }
}
