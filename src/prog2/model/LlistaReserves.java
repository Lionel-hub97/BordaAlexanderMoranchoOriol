package prog2.model;

import prog2.vista.ExcepcioReserva;

import java.time.LocalDate;
import java.util.ArrayList;

public class LlistaReserves implements InLlistaReserves {
    ArrayList<Reserva> reservas;
    public boolean isEstadaMinima (Allotjament allotjament, LocalDate dataEntrada, LocalDate dataSortida) {
        return false;
    }
    @Override
    public void afegirReserva(Allotjament allotjament, Client client, LocalDate dataEntrada, LocalDate dataSortida) throws ExcepcioReserva {
        if(isEstadaMinima(allotjament, dataEntrada, dataSortida)){
            Reserva reserva=new Reserva(allotjament,client,dataEntrada,dataSortida);

            reservas.add(reserva);
        }
        else{
            System.out.println("No cumpleix l'estada mínima. ");
        }

    }

    @Override
    public int getNumReserves() {
        return 0;
    }

    public boolean  allotjamentDisponible(Allotjament allotjament, LocalDate dataEntrada, LocalDate dataSortida) {
        return false;
    }


}