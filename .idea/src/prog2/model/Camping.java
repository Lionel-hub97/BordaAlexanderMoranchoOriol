package prog2.model;
import java.time.LocalDate;
import java.util.*;
import prog2.vista.*;
import prog2.model.*;
import java.util.ArrayList;


public class Camping{

    private String nom;
    private ArrayList<Allotjament> allotjaments;
    private ArrayList<Reserva> reserves;
    private ArrayList<Client> clients;

    public Camping(String nom){
        this.nom = nom;
    }
    public Camping () {
        this.nom = "Camping del mar";
        this.allotjaments = new ArrayList<>();
        this.reserves = new ArrayList<>();
        this.clients = new ArrayList<>();
    }

    private String idAllotjament, mida, nomClient, dni, codiWifi, material;
    private float metres;
    private int habitacions, placesPersones, placesParquing;
    private boolean connexioElectrica, terrassa, tv, aireFred, serveisExtra, casaMascota, terrassaBarbacoa;

    public String getNom(){
        return this.nom;
    }






    /**
     * @return
     */

    public LlistaReserves getLlistaReserves() {
        return null;
    }

    /**
     * @return
     */

    public ArrayList<Allotjament> getLlistaAllotjaments() {
        return null;
    }

    /**
     * @return
     */
    public ArrayList<Client> getLlistaClients() {
        return null;
    }

    /**
     * @return
     */

    public int getNumAllotjaments() {
        return 0;
    }

    /**
     * @return
     */

    public int getNumReserves() {
        return 0;
    }

    /**
     * @return
     */

    public int getNumClients() {
        return 0;
    }

    /**
     * @param nom_ el nom del nou client.
     * @param dni_ el DNI del nou client.
     * @throws ExcepcioReserva
     */

    public void afegirClient(String nom_, String dni_) throws prog2.vista.ExcepcioReserva {

    }

    /**
     * @param nom_              el nom de la parcela.
     * @param idAllotjament_    l'identificador únic de l'allotjament.
     * @param metres            la mida de la parcela.
     * @param connexioElectrica true si disposa de connexió elèctrica, false altrament.
     */

    public void afegirParcela(String nom_, String idAllotjament_, float metres, boolean connexioElectrica) {

    }

    /**
     * @param nom_           el nom del bungalow.
     * @param idAllotjament_ l'identificador únic de l'allotjament.
     * @param mida           la mida del bungalow.
     * @param habitacions    el nombre d'habitacions del bungalow.
     * @param placesPersones el nombre màxim de places per a persones.
     * @param placesParquing el nombre de places de pàrquing disponibles.
     * @param terrassa       true si disposa de terrassa, false altrament.
     * @param tv             true si disposa de televisió, false altrament.
     * @param aireFred       true si disposa d'aire condicionat, false altrament.
     */

    public void afegirBungalow(String nom_, String idAllotjament_, String mida, int habitacions, int placesPersones, int placesParquing, boolean terrassa, boolean tv, boolean aireFred) {

    }

    /**
     * @param nom_
     * @param idAllotjament_
     * @param mida
     * @param habitacions
     * @param placesPersones
     * @param placesParquing
     * @param terrassa
     * @param tv
     * @param aireFred
     * @param serveisExtra   true si ofereix serveis extra.
     * @param codiWifi       el codi de la xarxa Wi-Fi.
     *                       (Altres paràmetres igual que `afegirBungalow`)
     */

    public void afegirBungalowPremium(String nom_, String idAllotjament_, String mida, int habitacions, int placesPersones, int placesParquing, boolean terrassa, boolean tv, boolean aireFred, boolean serveisExtra, String codiWifi) {

    }

    /**
     * @param nom_
     * @param idAllotjament_
     * @param mida
     * @param habitacions
     * @param placesPersones
     * @param material       el material del que està fet.
     * @param casaMascota    true si accepta mascotes.
     *                       (Altres paràmetres igual que `afegirBungalow`)
     */

    public void afegirGlamping(String nom_, String idAllotjament_, String mida, int habitacions, int placesPersones, String material, boolean casaMascota) {

    }

    /**
     * @param nom_
     * @param idAllotjament_
     * @param mida
     * @param habitacions
     * @param placesPersones
     * @param terrassaBarbacoa true si disposa de terrassa amb barbacoa.
     *                         (Altres paràmetres igual que `afegirBungalow`)
     */

    public void afegirMobilHome(String nom_, String idAllotjament_, String mida, int habitacions, int placesPersones, boolean terrassaBarbacoa) {

    }

    /**
     * @param id_         l'identificador de l'allotjament.
     * @param dni_        el DNI del client que fa la reserva.
     * @param dataEntrada la data d'entrada.
     * @param dataSortida la data de sortida.
     * @throws ExcepcioReserva
     */

    public void afegirReserva(String id_, String dni_, LocalDate dataEntrada, LocalDate dataSortida) throws ExcepcioReserva {

    }

    /**
     * @return
     */

    public float calculMidaTotalParceles() {
        return 0;
    }

    /**
     * @return
     */

    public int calculAllotjamentsOperatius() {
        return 0;
    }

    /**
     * @return
     */

    public Allotjament getAllotjamentEstadaMesCurta() {
        return null;
    }

    /** Acabar, dona errors:
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
     **/
}
