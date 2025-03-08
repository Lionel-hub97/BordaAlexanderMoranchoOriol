
package prog2.vista;
import prog2.model.*;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 * Classe per gestionar els allotjaments del Càmping del Mar.
 * @author lauraigual
 */
public class GestorCamping {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println();

        Camping campingMar = new Camping("Camping del Mar");

        omplirDadesModel(campingMar);

        ferReserves(campingMar);

        // Calcular la mida total de les parcel·les (en M^2) del Càmping i mostrar un missatge de la següent manera:
        // >> La mida total de les parcel·les del Càmping del Mar és de X m^2)
        System.out.println("\n >> La mida total de les parcel·les del Càmping del Mar és "+ campingMar.calculMidaTotalParceles() + "m^2");
        //--------------------------------------------------------------------------------------------------------------------
        // Per completar


        // Mostrar el número total d'allotjaments del Càmping i el número d'allotjaments que estan operatius amb el següent missatge:
        // >> El número total d'allotjaments del Càmping és X dels quals X allotjaments estan operatius.
        System.out.println("\n >> El número total d'allotjaments del càmping és "+ campingMar.getNumAllotjaments() + " dels quals " + campingMar.calculAllotjamentsOperatius() + " allotjaments estan operatius.");

        //--------------------------------------------------------------------------------------------------
        // Per completar

        // Mostrar l'allotjament amb estada mínima de la temporada baixa més curta amb el següent missatge:
        // >> L'allotjament amb estada mínima de la temporada baixa més curta és el següent:
        System.out.println("\n >> L'allotjament amb estada mínima de la temporada baixa més curta és el següent: "+ campingMar.getAllotjamentEstadaMesCurta().toString());

        //--------------------------------------------------------------------------------------------------
        // Per completar
       
    }
    
    /**
     * Mètode de classe per afegir parcel·les, bungalows, bungalows premium, glampings, mobil-home i clients al càmping.
     * @param camping L'objecte de tipus Camping que anem a omplir
     */
    private static void omplirDadesModel(Camping camping){
        
        
        // Afegir parcel·les:
        //------------------------------
        String nom = "Parcel·la Nord";
        String idAllotjament = "100P";
        float metres = 64.0f;
        boolean connexioElectrica = true;

        camping.afegirParcela(nom, idAllotjament, metres, connexioElectrica);

        nom = "Parcel·la Sud";
        idAllotjament = "101P";
        
        camping.afegirParcela(nom, idAllotjament, metres, connexioElectrica);


        // Afegir bungalows:
        //------------------------------
        nom = "Bungalow Est";
        idAllotjament = "102B";
        String mida = "Mitjana";
        int habitacions =2;
        int placesPersones = 6;
        int placesParquing = 1;
        boolean terrassa = true;
        boolean tv= true;
        boolean aireFred = true;

        camping.afegirBungalow(nom, idAllotjament, mida, habitacions, placesPersones, placesParquing, terrassa, tv, aireFred);

        nom = "Bungalow Oest";
        idAllotjament = "103B";
        mida = "Mitjana";
        habitacions =2;
        placesPersones = 4;
        placesParquing = 1;
        terrassa = true;
        tv= false;
        aireFred = false;

        camping.afegirBungalow(nom, idAllotjament, mida, habitacions, placesPersones, placesParquing, terrassa, tv, aireFred);

        // Afegir bungalows premium:
        //------------------------------
        nom = "Bungallow Nord";
        idAllotjament = "104BP";
        mida = "Gran";
        habitacions =2;
        placesPersones = 6;
        placesParquing = 2;
        terrassa = true;
        tv= false;
        aireFred = false;
        boolean serveisExtra = true;
        String codiWifi = "CampingDelMarBP1";
        
        camping.afegirBungalowPremium(nom, idAllotjament, mida, habitacions, placesPersones, placesParquing, terrassa, tv, aireFred, serveisExtra, codiWifi);

        nom = "Bungallow Sud";
        idAllotjament = "105BP";
        mida = "Gran";
        habitacions =2;
        placesPersones = 6;
        placesParquing = 1;
        terrassa = true;
        tv= false;
        aireFred = false;
        serveisExtra = true;
        codiWifi = "CampingDelMarBP2";

        camping.afegirBungalowPremium(nom, idAllotjament, mida, habitacions, placesPersones, placesParquing, terrassa, tv, aireFred, serveisExtra, codiWifi);

        // Afegir Glamping:
        //------------------------------

        nom = "Glamping Nord";
        idAllotjament = "106G";
        mida = "Petita";
        habitacions =1;
        placesPersones = 2;
        String material = "Tela";
        boolean casaMascota = true;

        camping.afegirGlamping(nom, idAllotjament, mida, habitacions, placesPersones, material, casaMascota);

        nom = "Glamping Sud";
        idAllotjament = "107G";
        mida = "Petita";
        habitacions =1;
        placesPersones = 2;
        material = "Tela";
        casaMascota = false;

        camping.afegirGlamping(nom, idAllotjament, mida, habitacions, placesPersones, material, casaMascota);

        // Afegir Mobil-Home:
        //------------------------------
        nom = "Mobil-Home Nord";
        idAllotjament = "108MH";
        mida = "Petita";
        habitacions =1;
        placesPersones = 2;
        boolean terrassaBarbacoa = true;

        camping.afegirMobilHome(nom, idAllotjament, mida, habitacions, placesPersones, terrassaBarbacoa);

        nom = "Mobil-Home Sud";
        idAllotjament = "109MH";
        mida = "Mitjana";
        habitacions =2;
        placesPersones = 4;
        terrassaBarbacoa = false;

        camping.afegirMobilHome(nom, idAllotjament, mida, habitacions, placesPersones, terrassaBarbacoa);


        // Afegir clients:
        //------------------------------
        String nomClient="Patricia Fernandez";
        String dni="12345678X";
        try {
            camping.afegirClient(nomClient, dni);
        } catch (ExcepcioReserva ex) {
            System.out.println(ex.getMessage());
        }

        nomClient = "Lluís Plans";
        dni="78659101A";
        try {
            camping.afegirClient(nomClient, dni);
        } catch (ExcepcioReserva ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    /**
     * Mètode per fer reserves d'allotjaments.
     * @param camping
     */


    private static void ferReserves(Camping camping) {
        // Reserva 1 (Ja està implementada)
        String dni = "12345678X";
        String idAllotjament = "100P";
        LocalDate dataEntrada = LocalDate.of(2025, 2, 20);
        LocalDate dataSortida = LocalDate.of(2025, 2, 28);

        try {
            camping.afegirReserva(idAllotjament, dni, dataEntrada, dataSortida);
        } catch (ExcepcioReserva ex) {
            System.out.println(ex.getMessage());
        }

        // Reserva 2 (Per completar)
        dni = "78659101A";
        idAllotjament = "100P";
        dataEntrada = LocalDate.of(2025, 2, 25);
        dataSortida = LocalDate.of(2025, 2, 28);

        try {
            camping.afegirReserva(idAllotjament, dni, dataEntrada, dataSortida);
        } catch (ExcepcioReserva ex) {
            System.out.println(ex.getMessage()); // Mostrarà error per solapament de dates
        }

        // Reserva 3 (Per completar)
        dni = "789101A";
        idAllotjament = "300S";
        dataEntrada = LocalDate.of(2025, 2, 25);
        dataSortida = LocalDate.of(2025, 2, 28);

        try {
            camping.afegirReserva(idAllotjament, dni, dataEntrada, dataSortida);
        } catch (ExcepcioReserva ex) {
            System.out.println(ex.getMessage()); // Mostrarà error per allotjament no trobat
        }
    }


    //PRUEBAS DE AFEGIR CLIENT Y RESERVES POSTERIORS
    /*
    //PRUEBAS DE AFEGIR CLIENT Y RESERVES POSTERIORS
    private static void ferReserves(Camping camping) {
        // Reserva 1 (Ja està implementada)
        String dni = "12345678X";
        String idAllotjament = "100P";
        LocalDate dataEntrada = LocalDate.of(2025, 2, 20);
        LocalDate dataSortida = LocalDate.of(2025, 2, 28);

        try {
            camping.afegirReserva(idAllotjament, dni, dataEntrada, dataSortida);
        } catch (ExcepcioReserva ex) {
            System.out.println(ex.getMessage());
        }

        // Afegir nous allotjaments
        // 1. Nou Bungalow
        String nom = "Bungalow Est Nord";
        idAllotjament = "110B"; // Nou ID
        String mida = "Gran";
        int habitacions = 2;
        int placesPersones = 6;
        int placesParquing = 1;
        boolean terrassa = true;
        boolean tv = true;
        boolean aireFred = true;

        camping.afegirBungalow(nom, idAllotjament, mida, habitacions, placesPersones, placesParquing, terrassa, tv, aireFred);
        System.out.println("Nou Bungalow Est Nord afegit!");

        // 2. Nou Bungalow Premium
        nom = "Bungalow Premium Nord";
        idAllotjament = "111BP"; // Nou ID
        mida = "Gran";
        habitacions = 2;
        placesPersones = 4;
        placesParquing = 1;
        terrassa = true;
        tv = false;
        aireFred = true;
        boolean serveisExtra = true;
        String codiWifi = "BungalowPremium123";

        camping.afegirBungalowPremium(nom, idAllotjament, mida, habitacions, placesPersones, placesParquing, terrassa, tv, aireFred, serveisExtra, codiWifi);
        System.out.println("Nou Bungalow Premium afegit!");

        // 3. Nou Glamping
        nom = "Glamping Est";
        idAllotjament = "112G"; // Nou ID
        mida = "Petita";
        habitacions = 1;
        placesPersones = 2;
        String material = "Tela";
        boolean casaMascota = false;

        camping.afegirGlamping(nom, idAllotjament, mida, habitacions, placesPersones, material, casaMascota);
        System.out.println("Nou Glamping Est afegit!");

        // 4. Nou Mobil-Home
        nom = "Mobil-Home Nord";
        idAllotjament = "113MH"; // Nou ID
        mida = "Mitjana";
        habitacions = 2;
        placesPersones = 4;
        boolean terrassaBarbacoa = true;

        camping.afegirMobilHome(nom, idAllotjament, mida, habitacions, placesPersones, terrassaBarbacoa);
        System.out.println("Nou Mobil-Home Nord afegit!");

        // Realitzar reserves abans i després de les dates de la reserva existent

        // Reserva abans de la reserva 1
        dni = "78659101A";
        idAllotjament = "110B";  // Bungalow Est Nord
        dataEntrada = LocalDate.of(2025, 2, 15);
        dataSortida = LocalDate.of(2025, 2, 19);

        try {
            camping.afegirReserva(idAllotjament, dni, dataEntrada, dataSortida);
            System.out.println("Reserva abans de la reserva 1 afegida amb èxit al Bungalow Est Nord!");
        } catch (ExcepcioReserva ex) {
            System.out.println(ex.getMessage());
        }

        // Reserva després de la reserva 1
        dni = "789101A";
        idAllotjament = "110B";  // Bungalow Est Nord
        dataEntrada = LocalDate.of(2025, 3, 1);
        dataSortida = LocalDate.of(2025, 3, 5);

        try {
            camping.afegirReserva(idAllotjament, dni, dataEntrada, dataSortida);
            System.out.println("Reserva després de la reserva 1 afegida amb èxit al Bungalow Est Nord!");
        } catch (ExcepcioReserva ex) {
            System.out.println(ex.getMessage());
        }

        // Reserva per al nou Bungalow Premium
        dni = "12345678X";
        idAllotjament = "111BP";  // Bungalow Premium Nord
        dataEntrada = LocalDate.of(2025, 3, 5);
        dataSortida = LocalDate.of(2025, 3, 10);

        try {
            camping.afegirReserva(idAllotjament, dni, dataEntrada, dataSortida);
            System.out.println("Reserva afegida amb èxit al Bungalow Premium Nord!");
        } catch (ExcepcioReserva ex) {
            System.out.println(ex.getMessage());
        }

        // Reserva per al nou Glamping
        dni = "78659101A";
        idAllotjament = "112G";  // Glamping Est
        dataEntrada = LocalDate.of(2025, 3, 1);
        dataSortida = LocalDate.of(2025, 3, 5);

        try {
            camping.afegirReserva(idAllotjament, dni, dataEntrada, dataSortida);
            System.out.println("Reserva afegida amb èxit al Glamping Est!");
        } catch (ExcepcioReserva ex) {
            System.out.println(ex.getMessage());
        }

        // Reserva per al Mobil-Home
        dni = "789101A";
        idAllotjament = "113MH";  // Mobil-Home Nord
        dataEntrada = LocalDate.of(2025, 3, 10);
        dataSortida = LocalDate.of(2025, 3, 15);

        try {
            camping.afegirReserva(idAllotjament, dni, dataEntrada, dataSortida);
            System.out.println("Reserva afegida amb èxit al Mobil-Home Nord!");
        } catch (ExcepcioReserva ex) {
            System.out.println(ex.getMessage());
        }

        // Reserva per al Mobil-Home després de la reserva de Glamping
        dni = "12345678X";
        idAllotjament = "113MH";  // Mobil-Home Nord
        dataEntrada = LocalDate.of(2025, 3, 20);
        dataSortida = LocalDate.of(2025, 3, 25);

        try {
            camping.afegirReserva(idAllotjament, dni, dataEntrada, dataSortida);
            System.out.println("Reserva afegida amb èxit al Mobil-Home Nord!");
        } catch (ExcepcioReserva ex) {
            System.out.println(ex.getMessage());
        }
    }
    */

    }
    

