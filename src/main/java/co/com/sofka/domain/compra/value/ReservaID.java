package co.com.sofka.domain.compra.value;

import co.com.sofka.domain.generic.Identity;

public class ReservaID extends Identity {
    private ReservaID(String id){
        super(id);
    }

    public ReservaID(){ }

    public static ReservaID of(String id) {
        return new ReservaID(id);
    }
}
