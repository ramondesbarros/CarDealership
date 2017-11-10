package br.com.cardealership.system.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "dealership", schema = "spring_jpa_product")
public class Dealership implements Serializable {

    private static final long serialVersionUID = 2017092801L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "dealership_id")
    private Long idDealership;

    @NotEmpty
    private String name;

    @NotEmpty
    private String address;

    @NotEmpty
    private String zipCode;

    public Long getIdDealership() {
        return idDealership;
    }

    public void setIdDealership(Long idDealership) {
        this.idDealership = idDealership;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((address == null) ? 0 : address.hashCode());
        result = prime * result + ((idDealership == null) ? 0 : idDealership.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((zipCode == null) ? 0 : zipCode.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (!(obj instanceof Dealership))
            return false;
        Dealership other = (Dealership) obj;
        if (address == null) {
            if (other.address != null)
                return false;
        } else if (!address.equals(other.address))
            return false;
        if (idDealership == null) {
            if (other.idDealership != null)
                return false;
        } else if (!idDealership.equals(other.idDealership))
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (zipCode == null) {
            if (other.zipCode != null)
                return false;
        } else if (!zipCode.equals(other.zipCode))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Dealership[" + (idDealership != null ? "idDealership:" + idDealership + "|" : "")
                + (name != null ? "name:" + name + "|" : "") + (address != null ? "address:" + address + "|" : "")
                + (zipCode != null ? "zipCode:" + zipCode : "") + "]";
    }
}
