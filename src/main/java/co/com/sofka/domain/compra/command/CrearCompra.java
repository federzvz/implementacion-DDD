package co.com.sofka.domain.compra.command;

import co.com.sofka.domain.compra.value.CompraID;
import co.com.sofka.domain.compra.value.ReservaID;
import co.com.sofka.domain.compra.value.TransaccionID;
import co.com.sofka.generic.ClienteID;
import co.com.sofka.generic.Fecha;

public class CrearCompra {
    private final CompraID compraID;
    private final Fecha fecha;
    private final ReservaID reservaID;
    private final TransaccionID transaccionID;

    public CrearCompra(CompraID compraID, Fecha fecha, ReservaID reservaID, TransaccionID transaccionID) {
        this.compraID = compraID;
        this.fecha = fecha;
        this.reservaID = reservaID;
        this.transaccionID = transaccionID;
    }

    public CompraID getCompraID() {
        return compraID;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public ReservaID getReservaID() {
        return reservaID;
    }

    public TransaccionID getTransaccionID() {
        return transaccionID;
    }
}
