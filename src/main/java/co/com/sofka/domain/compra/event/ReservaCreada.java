package co.com.sofka.domain.compra.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.generic.ClienteID;

public class ReservaCreada extends DomainEvent {
    private final ClienteID clienteId;

    public ReservaCreada(ClienteID clienteId) {
        super("compra.reservacreada");
        this.clienteId = clienteId;
    }

    public ClienteID getClienteId() {
        return clienteId;
    }
}
