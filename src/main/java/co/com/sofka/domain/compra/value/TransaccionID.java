package co.com.sofka.domain.compra.value;

import co.com.sofka.domain.generic.Identity;

public class TransaccionID extends Identity {
    private TransaccionID(String id){
        super(id);
    }

    public TransaccionID(){ }

    public static TransaccionID of(String id) {
        return new TransaccionID(id);
    }
}
