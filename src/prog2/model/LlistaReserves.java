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
    public boolean isEstadaMinima (Allotjament allotjament, LocalDate dataEntrada, LocalDate dataSortida) {
        InAllotjament.Temp temp = Camping.getTemporada(dataEntrada);

        long dies = ChronoUnit.DAYS.between(dataEntrada, dataSortida);

        return dies > allotjament.getEstadaMinima(temp);
    }
    @Override
    public void afegirReserva(Allotjament allotjament, Client client, LocalDate dataEntrada, LocalDate dataSortida) throws ExcepcioReserva {
        if(isEstadaMinima(allotjament, dataEntrada, dataSortida)){
            if(allotjamentDisponible(allotjament, dataEntrada, dataSortida)) {
                Reserva reserva = new Reserva(allotjament, client, dataEntrada, dataSortida);

                reserves.add(reserva);
            }
            else{
                throw new ExcepcioReserva("Allotjament no disponible per les dates sol·licitades");
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

    public boolean  allotjamentDisponible(Allotjament allotjament, LocalDate dataEntrada, LocalDate dataSortida) {

        for(Allotjament allotjament1 : Camping.allotjaments){
            boolean disponible = false;
            if(allotjament1.equals(allotjament)){
                disponible = true;

                for(Reserva reserva : reserves){
                    if(reserva.getAllotjament().equals(allotjament)){
                        disponible = (reserva.getDataSortida().isBefore(dataEntrada) || reserva.getDataEntrada().isAfter(dataSortida));
                        if(!disponible){
                            break;
                        }
                    }
                }
            }
            if(disponible){
                return true;
            }
        }
        return false;

    }


}