package main.java.co.com.sofka.domain.compra.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Insumo implements ValueObject<String> {
    private final String value;

    public Insumo(String value) {
        this.value = Objects.requireNonNull(value);
        if(value.length()<=10){
            throw new IllegalArgumentException("La descripcion del Insumo debe tener mas de 10 caracteres.");
        }
    }

    public String value() {
        return value;
    }
}
