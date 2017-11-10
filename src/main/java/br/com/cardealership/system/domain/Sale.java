package br.com.cardealership.system.domain;

import java.io.Serializable;
import java.util.Calendar;

import org.bson.types.ObjectId;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.data.annotation.Id;

public class Sale implements Serializable {

    private static final long serialVersionUID = 2017092801L;

    @Id
    private ObjectId saleId;

    @NotEmpty
    private Dealership dealership;

    @NotEmpty
    private Customer customer;

    @NotEmpty
    private Car car;

    @NotEmpty
    private Calendar saleDate;

    public ObjectId getSaleId() {
        return saleId;
    }

    public void setSaleId(ObjectId saleId) {
        this.saleId = saleId;
    }

    public Dealership getDealership() {
        return dealership;
    }

    public void setDealership(Dealership dealership) {
        this.dealership = dealership;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Calendar getSaleDate() {
        return saleDate;
    }

    public void setSaleDate(Calendar saleDate) {
        this.saleDate = saleDate;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((car == null) ? 0 : car.hashCode());
        result = prime * result + ((customer == null) ? 0 : customer.hashCode());
        result = prime * result + ((dealership == null) ? 0 : dealership.hashCode());
        result = prime * result + ((saleDate == null) ? 0 : saleDate.hashCode());
        result = prime * result + ((saleId == null) ? 0 : saleId.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (!(obj instanceof Sale))
            return false;
        Sale other = (Sale) obj;
        if (car == null) {
            if (other.car != null)
                return false;
        } else if (!car.equals(other.car))
            return false;
        if (customer == null) {
            if (other.customer != null)
                return false;
        } else if (!customer.equals(other.customer))
            return false;
        if (dealership == null) {
            if (other.dealership != null)
                return false;
        } else if (!dealership.equals(other.dealership))
            return false;
        if (saleDate == null) {
            if (other.saleDate != null)
                return false;
        } else if (!saleDate.equals(other.saleDate))
            return false;
        if (saleId == null) {
            if (other.saleId != null)
                return false;
        } else if (!saleId.equals(other.saleId))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Sale[" + (saleId != null ? "saleId:" + saleId + "|" : "")
                + (dealership != null ? "dealership:" + dealership + "|" : "")
                + (customer != null ? "customer:" + customer + "|" : "") + (car != null ? "car:" + car + "|" : "")
                + (saleDate != null ? "saleDate:" + saleDate : "") + "]";
    }
}
