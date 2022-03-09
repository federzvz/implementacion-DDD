package main.java.co.com.sofka.domain.compra.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Date;
import java.util.Objects;

public class Detalle implements ValueObject<String> {
    private final String value;

    public Detalle(String value) {
        this.value = Objects.requireNonNull(value);
        if(value.length()<=10){
            throw new IllegalArgumentException("El Detalle contiene menos de 10 carácteres.");
        }
    }

    public String value() {
        return value;
    }
}
