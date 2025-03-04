package prog2.model;
import prog2.vista.ExcepcioReserva;

import java.time.LocalDate;

/**
 * Classe que representa una reserva en el càmping.
 */
public class Reserva {

    private Allotjament allotjament;  // Objecte Allotjament que representa l'allotjament reservat
    private Client client;             // Client que fa la reserva
    private LocalDate dataEntrada;     // Data d'entrada
    private LocalDate dataSortida;     // Data de sortida

    /**
     * Constructor de la classe Reserva.
     * @param allotjament l'allotjament que es reserva
     * @param client el client que realitza la reserva
     * @param dataEntrada la data d'entrada de la reserva
     * @param dataSortida la data de sortida de la reserva
     */
    public Reserva(Allotjament allotjament, Client client, LocalDate dataEntrada, LocalDate dataSortida) throws ExcepcioReserva {
        if(allotjament == null){
            throw new NullPointerException("Allotjament is null");
        }
        if(client == null){
            throw new NullPointerException("Client is null");
        }
        if(dataEntrada == null){
            throw new NullPointerException("DataEntrada is null");
        }
        if(dataSortida == null){
            throw new ExcepcioReserva("DataSortida is null");
        }
        if(dataSortida.isBefore(dataEntrada) || dataSortida.isEqual(dataEntrada)){
            throw new ExcepcioReserva("Dates incorrectes");
        }

        this.allotjament = allotjament;
        this.client = client;
        this.dataEntrada = dataEntrada;
        this.dataSortida = dataSortida;
    }

    // Getters i setters

    public Allotjament getAllotjament() {
        return allotjament;
    }

    public void setAllotjament(Allotjament allotjament) {
        this.allotjament = allotjament;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public LocalDate getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(LocalDate dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public LocalDate getDataSortida() {
        return dataSortida;
    }

    public void setDataSortida(LocalDate dataSortida) {
        this.dataSortida = dataSortida;
    }

    /**
     * Retorna la durada de l'estada en dies.
     * @return la durada de l'estada en dies.
     */
    public long getDuradaEstada() {
        return dataEntrada != null && dataSortida != null ? java.time.temporal.ChronoUnit.DAYS.between(dataEntrada, dataSortida) : 0;
    }

    @Override
    public String toString() {
        return "Reserva{" +
                "allotjament=" + allotjament.getNom() + // Mostrem el nom de l'allotjament
                ", client=" + client.getNom() +
                ", dataEntrada=" + dataEntrada +
                ", dataSortida=" + dataSortida +
                '}';
    }
}
