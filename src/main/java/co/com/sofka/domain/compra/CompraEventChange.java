package main.java.co.com.sofka.domain.compra;

import co.com.sofka.domain.compra.event.CompraCreada;
import co.com.sofka.domain.compra.value.CompraID;
import co.com.sofka.domain.generic.EventChange;
import co.com.sofka.generic.Fecha;

public class CompraEventChange extends EventChange {
    public CompraEventChange(main.java.co.com.sofka.domain.compra.Compra compra) {

        apply((CompraCreada event) -> {
            //Agregar reglas de dominio
            compra.transaccionID = event.getTransaccionID();
            compra.reservaID = event.getReservaID();
        });

        apply((CompraCreada event) -> {
            //Agregar reglas de dominio
            CompraID compraID = new CompraID();
            Fecha fecha = new Fecha();

            compra.transaccion = new main.java.co.com.sofka.domain.compra.Transaccion(compra.compraID,compra.transaccionID,compra.monto);
            var cantidadPedida = event.Fecha();
        });
    }
}
