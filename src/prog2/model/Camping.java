package prog2.model;
import java.time.LocalDate;

import prog2.vista.*;

import java.util.ArrayList;


public class Camping implements InCamping {

    private final String nom;
    private ArrayList<Allotjament> allotjaments;
    private ArrayList<Reserva> reserves;
    private ArrayList<Client> clients;


    private String idAllotjament, mida, nomClient, dni, codiWifi, material;
    private float metres;
    private int habitacions, placesPersones, placesParquing;
    private boolean connexioElectrica, terrassa, tv, aireFred, serveisExtra, casaMascota, terrassaBarbacoa;

    public Camping(String nom){
        this.nom = nom;
    }
    public Camping () {
        this.nom = "Camping del mar";
        this.allotjaments = new ArrayList<>();
        this.reserves = new ArrayList<>();
        this.clients = new ArrayList<>();
    }

    @Override
    public String getNom() {
        return nom;
    }

    @Override
    public LlistaReserves getLlistaReserves() {
        return null;
    }

    @Override
    public ArrayList<Allotjament> getLlistaAllotjaments() {
        return null;
    }

    @Override
    public ArrayList<Client> getLlistaClients() {
        return null;
    }

    @Override
    public int getNumAllotjaments() {
        return 0;
    }

    @Override
    public int getNumReserves() {
        return 0;
    }

    @Override
    public int getNumClients() {
        return 0;
    }

    @Override
    public void afegirClient(String nom_, String dni_) throws ExcepcioReserva {

    }

    @Override
    public void afegirParcela(String nom_, String idAllotjament_, float metres, boolean connexioElectrica) {

    }

    @Override
    public void afegirBungalow(String nom_, String idAllotjament_, String mida, int habitacions, int placesPersones, int placesParquing, boolean terrassa, boolean tv, boolean aireFred) {

    }

    @Override
    public void afegirBungalowPremium(String nom_, String idAllotjament_, String mida, int habitacions, int placesPersones, int placesParquing, boolean terrassa, boolean tv, boolean aireFred, boolean serveisExtra, String codiWifi) {

    }

    @Override
    public void afegirGlamping(String nom_, String idAllotjament_, String mida, int habitacions, int placesPersones, String material, boolean casaMascota) {

    }

    @Override
    public void afegirMobilHome(String nom_, String idAllotjament_, String mida, int habitacions, int placesPersones, boolean terrassaBarbacoa) {

    }

    @Override
    public void afegirReserva(String id_, String dni_, LocalDate dataEntrada, LocalDate dataSortida) throws ExcepcioReserva {

    }

    @Override
    public float calculMidaTotalParceles() {
        return 0;
    }

    @Override
    public int calculAllotjamentsOperatius() {
        return 0;
    }

    @Override
    public Allotjament getAllotjamentEstadaMesCurta() {
        return null;
    }

    /* Acabar, dona errors:
     public static Allotjament.Temp getTemporada(LocalDate data) {
     int dia = data.getDayOfMonth();
     int mes = data.getMonthValue();
     Allotjament.getEstadaMinima()
     // Temporada ALTA: 21 març - 20 setembre

     if ((mes > 3 && mes < 9) || (mes == 3 && dia >= 21) || (mes == 9 && dia <= 20)) {

     }
     return Allotjament.Temp.ALTA;
     }
     // Temporada BAIXA: 21 setembre - 20 març
     else {
     return Allotjament.Temp.BAIXA;
     }
     */
}
