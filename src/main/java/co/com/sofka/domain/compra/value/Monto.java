package main.java.co.com.sofka.domain.compra.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Monto implements ValueObject<Double>{
    private final Double value;
    private final String moneda;

    public Monto(Double value, String moneda) {
        this.value = Objects.requireNonNull(value);
        this.moneda = Objects.requireNonNull(moneda);
        if(value <= 0){
            throw new IllegalArgumentException("El valor no puede ser cero o negativo.");
        }
        if(!moneda.equals("USD")){
            throw new IllegalArgumentException("La moneda no esta en USD.");
        }
    }

    public Double value() {
        return value;
    }

    public String moneda() {
        return moneda;
    }


}
