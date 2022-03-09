package co.com.sofka.domain.compra.event;

import co.com.sofka.domain.compra.value.ReservaID;
import co.com.sofka.domain.compra.value.TransaccionID;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.generic.ClienteID;
import co.com.sofka.generic.Fecha;

public class CompraCreada extends DomainEvent {
    private final ClienteID clienteId;
    private final ReservaID reservaID;
    private final TransaccionID transaccionID;
    private final Fecha fecha;

    public CompraCreada(ClienteID clienteId, ReservaID reservaID, TransaccionID transaccionID, Fecha fecha) {
        super("compra.reservacrseada");
        this.clienteId = clienteId;
        this.reservaID = reservaID;
        this.transaccionID = transaccionID;
        this.fecha=fecha;
    }

    public ClienteID getClienteId() {
        return clienteId;
    }

    public ReservaID getReservaID() {
        return reservaID;
    }

    public TransaccionID getTransaccionID() {
        return transaccionID;
    }

    public Fecha Fecha() {
        return fecha;
    }
}
