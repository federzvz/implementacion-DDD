package co.com.sofka.generic;

import co.com.sofka.domain.generic.Identity;

public class ClienteID extends Identity {
    private ClienteID(String id){
        super(id);
    }

    public ClienteID(){ }

    public static ClienteID of(String id) {
        return new ClienteID(id);
    }
}

