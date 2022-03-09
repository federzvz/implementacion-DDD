package co.com.sofka.domain.compra.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.generic.ClienteID;
import co.com.sofka.domain.compra.value.ReservaID;

public class CrearReserva extends Command {
        private final ReservaID reservaID;
        private final ClienteID clienteID;

        public CrearReserva(ReservaID reservaID, ClienteID clienteId) {
            this.reservaID = reservaID;
            this.clienteID = clienteId;
        }

    public ReservaID getReservaID() {
        return reservaID;
    }

    public ClienteID getClienteID() {
        return clienteID;
    }
}
