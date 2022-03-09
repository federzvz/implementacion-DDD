package main.java.co.com.sofka.domain.compra.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Marca implements ValueObject<String> {
    private final String value;

    public Marca(String value) {
        this.value = Objects.requireNonNull(value);
        if(value.length()<=1){
            throw new IllegalArgumentException("El nombre de la marca debe tener mas de 1 caracter.");
        }
    }

    public String value() {
        return value;
    }
}
