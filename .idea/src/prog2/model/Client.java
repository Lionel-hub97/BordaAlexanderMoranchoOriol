package prog2.model;
import java.util.*;
import java.io.*;
import prog2.vista.*;
public class Client {
    // Atributs
    private String nom;
    private String dni;

    // Constructor
    public Client(String nom, String dni) throws ExcepcioReserva {
        this.nom = nom;
        setDni(dni);  // Utilitzem el setter per validar el DNI
    }

    // Getter per al nom
    public String getNom() {
        return nom;
    }

    // Getter per al DNI
    public String getDni() {
        return dni;
    }

    // Setter per al DNI amb validació
    public void setDni(String dni) throws ExcepcioReserva {
        if (dni == null || dni.length() != 9) {
            throw new ExcepcioReserva("DNI invàlid: ha de tenir exactament 9 caràcters.");
        }
        this.dni = dni;
    }

    // Mètode toString per imprimir la informació del client
    @Override
    public String toString() {
        return "Client: " + nom + " (DNI: " + dni + ")";
    }
}

