package prog2.model;
import java.time.LocalDate;

import prog2.vista.*;

import java.util.ArrayList;


public class Camping implements InCamping {

    private final String nom_;
    protected static ArrayList<Allotjament> allotjaments;
    private LlistaReserves reserves;
    private ArrayList<Client> clients;


    private String idAllotjament, mida, nomClient, dni, codiWifi, material;
    private float metres;
    private int habitacions, placesPersones, placesParquing;
    private boolean connexioElectrica, terrassa, tv, aireFred, serveisExtra, casaMascota, terrassaBarbacoa;

    //CONSTRUCTORS

    public Camping (String nom) {
        this.nom_ = nom;
        allotjaments = new ArrayList<>();
        this.reserves = new LlistaReserves();
        this.clients = new ArrayList<>();
    }

    //GETTERS
    @Override
    public String getNom() {
        return nom_;

    }

    @Override
    public LlistaReserves getLlistaReserves() {
        return null;
    }

    @Override
    public ArrayList<Allotjament> getLlistaAllotjaments() {
        return allotjaments;
    }

    @Override
    public ArrayList<Client> getLlistaClients() {
        return clients;
    }

    @Override
    public int getNumAllotjaments() {
        return allotjaments.size();
    }

    @Override
    public int getNumReserves() {
        return reserves.reserves.size();
    }

    @Override
    public int getNumClients() {
        return clients.size();
    }


    //OTROS CONSTRUCTORES
    @Override
    public void afegirClient(String nom_, String dni_) throws ExcepcioReserva {
        Client client = new Client(nom_, dni_);
        clients.add(client);
    }
    @Override
    public void afegirParcela(String nom_, String idAllotjament_, float metres, boolean connexioElectrica) {
        Parcela parcela = new Parcela(nom_, idAllotjament_, metres, connexioElectrica);
        allotjaments.add(parcela);
    }
    @Override
    public void afegirBungalow(String nom_, String idAllotjament_, String mida, int habitacions, int placesPersones, int placesParquing, boolean terrassa, boolean tv, boolean aireFred) {
        Bungalow bungalow = new Bungalow(nom_, idAllotjament_, mida, habitacions, placesPersones, placesParquing, terrassa, tv, aireFred);
        allotjaments.add(bungalow);
    }
    @Override
    public void afegirBungalowPremium(String nom_, String idAllotjament_, String mida, int habitacions, int placesPersones, int placesParquing, boolean terrassa, boolean tv, boolean aireFred, boolean serveisExtra, String codiWifi) {
        BungalowPremium bungalowPremium = new BungalowPremium(nom_, idAllotjament_, mida, habitacions, placesPersones, placesParquing, terrassa, tv, aireFred, serveisExtra, codiWifi);
        allotjaments.add(bungalowPremium);
    }
    @Override
    public void afegirGlamping(String nom_, String idAllotjament_, String mida, int habitacions, int placesPersones, String material, boolean casaMascota) {
        Glamping glamping = new Glamping(nom_, idAllotjament_, mida, habitacions, placesPersones, material, casaMascota);
        allotjaments.add(glamping);
    }
    @Override
    public void afegirMobilHome(String nom_, String idAllotjament_, String mida, int habitacions, int placesPersones, boolean terrassaBarbacoa) {
        MobilHome mobilHome = new MobilHome(nom_, idAllotjament_, mida, habitacions, placesPersones, terrassaBarbacoa);
        allotjaments.add(mobilHome);

    }
    @Override
    public void afegirReserva(String id_, String dni_, LocalDate dataEntrada, LocalDate dataSortida) throws ExcepcioReserva {
        // Busca client i allotjament
        Client client = buscarClient(dni_);
        Allotjament allotjament = buscarAllotjament(id_);

        // Verifica existències
        if (client == null || allotjament == null) {
            throw new ExcepcioReserva("Client o allotjament no trobat");
        }

        // Delega la lògica a LlistaReserves
        reserves.afegirReserva(allotjament, client, dataEntrada, dataSortida);
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

    //ESTOS DOS METODOS SIGUIENTES SON DE SOPORTE TAL Y COMO DICE EL PDF PAGINA 7, buscarAllotjament(); buscarClient();
    public Client buscarClient(String dni){
        for (Client client : clients) {
            if (client.getDni().equals(dni)) {
                return client;
            }
        }
        return null;
    }
    public Allotjament buscarAllotjament(String allotjamentID) {
        for (Allotjament allotjament : allotjaments) {
            if (allotjament.getId().equals(allotjamentID)) {
                return allotjament;
            }
        }
        return null;
    }
    public static InAllotjament.Temp getTemporada(LocalDate data) {
        LocalDate inicioAlta = LocalDate.of(data.getYear(), 3, 21);
        LocalDate finAlta = LocalDate.of(data.getYear(), 9, 20);

        if (!data.isBefore(inicioAlta) && !data.isAfter(finAlta)) {
            return InAllotjament.Temp.ALTA;
        } else {
            return InAllotjament.Temp.BAIXA;
        }
    }
}
