package main.java.co.com.sofka.domain.compra;

import co.com.sofka.domain.compra.value.CompraID;
import co.com.sofka.domain.compra.value.TransaccionID;
import co.com.sofka.domain.generic.Entity;
import main.java.co.com.sofka.domain.compra.value.Monto;

public class Transaccion extends Entity<CompraID> {
    private final TransaccionID transaccionID;
    private final main.java.co.com.sofka.domain.compra.value.Monto monto;
    private final CompraID compraID;

    public Transaccion(CompraID entityId, TransaccionID transaccionID, Monto monto) {
        super(entityId);
        this.transaccionID = transaccionID;
        this.monto = monto;
        this.compraID = entityId;
    }

    public TransaccionID TransaccionID() {
        return transaccionID;
    }

    public Monto Monto() {
        return monto;
    }

    public CompraID CompraID() {
        return compraID;
    }
}
