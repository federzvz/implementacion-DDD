package co.com.sofka.domain.compra.event;

import co.com.sofka.domain.compra.value.CompraID;
import co.com.sofka.domain.generic.DomainEvent;

public class TransaccionCreada extends DomainEvent {
    private final main.java.co.com.sofka.domain.compra.value.Monto monto;
    private final CompraID compraID;

    public TransaccionCreada(main.java.co.com.sofka.domain.compra.value.Monto monto, CompraID compraID) {
        super("compra.transaccioncreada");
        this.monto = monto;
        this.compraID = compraID;
    }

    public main.java.co.com.sofka.domain.compra.value.Monto getMonto() {
        return monto;
    }

    public CompraID getCompraID() {
        return compraID;
    }

}
