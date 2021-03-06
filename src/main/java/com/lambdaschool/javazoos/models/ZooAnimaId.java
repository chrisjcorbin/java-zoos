package com.lambdaschool.javazoos.models;

import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class ZooAnimaId implements Serializable {
    private long zoo;

    private long animal;

    public ZooAnimaId() {
    }

    public ZooAnimaId(long zoo, long animal) {
        this.zoo = zoo;
        this.animal = animal;
    }

    public long getZoo() {
        return zoo;
    }

    public void setZoo(long zoo) {
        this.zoo = zoo;
    }

    public long getAnimal() {
        return animal;
    }

    public void setAnimal(long animal) {
        this.animal = animal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ZooAnimaId that = (ZooAnimaId) o;
        return this.zoo == that.zoo &&
                this.animal == that.animal;
    }

    @Override
    public int hashCode() {
        return 37;
    }
}
