package br.com.cardealership.system.domain;

import java.io.Serializable;

import org.hibernate.validator.constraints.NotEmpty;

// @Table(schema = "spring_jpa_product")
public class MotorCycle extends Machine implements Serializable {

    private static final long serialVersionUID = -06102017001L;

    @NotEmpty
    private String name;

    @NotEmpty
    private Long price;

    @NotEmpty
    private String color;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((color == null) ? 0 : color.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((price == null) ? 0 : price.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (!(obj instanceof MotorCycle))
            return false;
        MotorCycle other = (MotorCycle) obj;
        if (color == null) {
            if (other.color != null)
                return false;
        } else if (!color.equals(other.color))
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (price == null) {
            if (other.price != null)
                return false;
        } else if (!price.equals(other.price))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "MotorCycle[" + (name != null ? "name:" + name + "|" : "")
                + (price != null ? "price:" + price + "|" : "") + (color != null ? "color:" + color : "") + "]";
    }
}
