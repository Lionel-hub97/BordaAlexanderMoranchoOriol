package prog2.model;
import java.time.LocalDate;

import prog2.vista.*;

import java.util.ArrayList;


public class Camping implements InCamping {

    private String nom;
    private ArrayList<Allotjament> allotjaments;
    private ArrayList<Client> clients;
    private LlistaReserves reserves;
    //CONSTRUCTORS

    public Camping (String nom) {
        this.nom = nom;
        allotjaments = new ArrayList<>();
        this.reserves = new LlistaReserves();
        this.clients = new ArrayList<>();
    }

    //GETTERS
    @Override
    public String getNom() {
        return nom;

    }

    @Override
    public LlistaReserves getLlistaReserves() {
        return reserves;
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
        clients.add(new Client(nom_, dni_));
    }
    @Override
    public void afegirParcela(String nom_, String idAllotjament_, float metres, boolean connexioElectrica) {
        allotjaments.add(new Parcela(nom_, idAllotjament_, metres, connexioElectrica));
    }
    @Override
    public void afegirBungalow(String nom_, String idAllotjament_, String mida, int habitacions, int placesPersones, int placesParquing, boolean terrassa, boolean tv, boolean aireFred) {
        allotjaments.add(new Bungalow(nom_, idAllotjament_, mida, habitacions, placesPersones, placesParquing, terrassa, tv, aireFred));
    }
    @Override
    public void afegirBungalowPremium(String nom_, String idAllotjament_, String mida, int habitacions, int placesPersones, int placesParquing, boolean terrassa, boolean tv, boolean aireFred, boolean serveisExtra, String codiWifi) {
        allotjaments.add(new BungalowPremium(nom_, idAllotjament_, mida, habitacions, placesPersones, placesParquing, terrassa, tv, aireFred, serveisExtra, codiWifi));
    }
    @Override
    public void afegirGlamping(String nom_, String idAllotjament_, String mida, int habitacions, int placesPersones, String material, boolean casaMascota) {
        allotjaments.add(new Glamping(nom_, idAllotjament_, mida, habitacions, placesPersones, material, casaMascota));
    }
    @Override
    public void afegirMobilHome(String nom_, String idAllotjament_, String mida, int habitacions, int placesPersones, boolean terrassaBarbacoa) {
        allotjaments.add(new MobilHome(nom_, idAllotjament_, mida, habitacions, placesPersones, terrassaBarbacoa));

    }
    @Override


    public void afegirReserva(String id_, String dni_, LocalDate dataEntrada, LocalDate dataSortida) throws ExcepcioReserva {
        Allotjament allotjament = buscarAllotjament(id_);
        Client client = buscarClient(dni_);

        if (allotjament == null) {
            throw new ExcepcioReserva("Allotjament amb ID " + id_ + " no trobat");
        }
        if (client == null) {
            throw new ExcepcioReserva("Client amb DNI " + dni_ + " no trobat");
        }

        reserves.afegirReserva(allotjament, client, dataEntrada, dataSortida);
    }
    @Override
    public float calculMidaTotalParceles() {
        float midatotal = 0;
        for(Allotjament allotjament: allotjaments) {
            if(allotjament instanceof Parcela parcela) {
                midatotal += parcela.getMida();
            }
        }
        return midatotal;
    }
    @Override
    public int calculAllotjamentsOperatius() {
        int comptador = 0;
        for(Allotjament allotjament: allotjaments) {
            if(allotjament.correcteFuncionament()) {
                comptador ++;
            }
        }
        return comptador;
    }
    @Override
    public Allotjament getAllotjamentEstadaMesCurta() {
        if (allotjaments.isEmpty()) {
            return null; // Retorna null si no hi ha allotjaments
        }
        Allotjament allotjamentMin = null;
        long minEstada = Long.MAX_VALUE;

        for(Allotjament allotjament: allotjaments) {
            long estada = allotjament.getEstadaMinima(InAllotjament.Temp.BAIXA);
            if(estada < minEstada) {
                minEstada = estada;
                allotjamentMin = allotjament;
            }

        }
        return allotjamentMin;
    }

    //METODOS DE SOPORTE
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
            if (allotjamentID.equals(allotjament.getId())) {// Compara amb l'string no nul
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
