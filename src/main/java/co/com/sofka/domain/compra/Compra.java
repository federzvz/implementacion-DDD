package main.java.co.com.sofka.domain.compra;

import co.com.sofka.domain.compra.value.CompraID;
import co.com.sofka.generic.Fecha;
import co.com.sofka.domain.compra.value.ReservaID;
import co.com.sofka.domain.compra.value.TransaccionID;
import co.com.sofka.domain.generic.AggregateEvent;

public class Compra extends AggregateEvent<CompraID> {
    protected CompraID compraID;
    protected Fecha fecha;
    protected ReservaID reservaID;
    protected TransaccionID transaccionID;
    protected main.java.co.com.sofka.domain.compra.value.Monto monto;
    protected main.java.co.com.sofka.domain.compra.Transaccion transaccion;

    public Compra(CompraID compraID, TransaccionID transaccionID, ReservaID reservaID, main.java.co.com.sofka.domain.compra.value.Monto monto) {
        super(compraID);
        subscribe(new main.java.co.com.sofka.domain.compra.CompraEventChange(this));
        //appendChange(new PedidoCreado(clienteId)).apply();
    }
}
