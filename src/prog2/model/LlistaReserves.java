package prog2.model;

import prog2.vista.ExcepcioReserva;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;


public class LlistaReserves implements InLlistaReserves {
    ArrayList<Reserva> reserves;
    public LlistaReserves() {
        this.reserves = new ArrayList<>();
    }

    @Override
    public void afegirReserva(Allotjament allotjament, Client client, LocalDate dataEntrada, LocalDate dataSortida) throws ExcepcioReserva {
        if(isEstadaMinima(allotjament, dataEntrada, dataSortida)){
            if(allotjamentDisponible(allotjament, dataEntrada, dataSortida)) {
                Reserva reserva = new Reserva(allotjament, client, dataEntrada, dataSortida);

                reserves.add(reserva);
            }
            else{
                throw new ExcepcioReserva("no està disponible");
            }
        }
        else{
            throw new ExcepcioReserva("No es compleix l'estada mínima");
        }

    }

    @Override
    public int getNumReserves() {
        return reserves.size();
    }

    //METODOS DE SOPORTE
    public boolean allotjamentDisponible(Allotjament allotjament, LocalDate dataEntrada, LocalDate dataSortida) {
        for (Reserva reserva : reserves) {
            if (reserva.getAllotjament().getId().equals(allotjament.getId())) {
               return reserva.getDataSortida().isBefore(dataEntrada) || reserva.getDataEntrada().isAfter(dataSortida);
            }
        }
        return true;
    }
    public boolean isEstadaMinima (Allotjament allotjament, LocalDate dataEntrada, LocalDate dataSortida) throws ExcepcioReserva {
        boolean compleix;
        InAllotjament.Temp temp = Camping.getTemporada(dataEntrada);

        long dies = ChronoUnit.DAYS.between(dataEntrada, dataSortida);
        compleix = dies >= allotjament.getEstadaMinima(temp);
        if(!compleix){
            throw new ExcepcioReserva("no compleixen l'estada mínima");
        }
        return true;
    }
}