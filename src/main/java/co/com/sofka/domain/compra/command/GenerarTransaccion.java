package co.com.sofka.domain.compra.command;

import co.com.sofka.domain.compra.value.CompraID;
import co.com.sofka.domain.generic.Command;
import main.java.co.com.sofka.domain.compra.value.Monto;

public class GenerarTransaccion extends Command {
    private final main.java.co.com.sofka.domain.compra.value.Monto monto;
    private final CompraID compraID;

    public GenerarTransaccion(Monto monto, CompraID compraID) {
        this.monto = monto;
        this.compraID = compraID;
    }

    public Monto getMonto() {
        return monto;
    }

    public CompraID getCompraID() {
        return compraID;
    }
}
