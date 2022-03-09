package co.com.sofka.generic;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Date;
import java.util.Objects;

public class Fecha implements ValueObject<Date> {
    private final Date value;


    public Fecha() {
        this(new Date());
    }

    public Fecha(Date value) {
        this.value = Objects.requireNonNull(value);
        if(value.getDay()<=0){
            throw new IllegalArgumentException("El valor dia no es valido.");
        }
        if(value.getMonth()<=0){
            throw new IllegalArgumentException("El valor mes no es valido.");
        }
        if(value.getYear()<=0){
            throw new IllegalArgumentException("El valor año no es valido.");
        }
    }

    public Date value() {
        return value;
    }
}
