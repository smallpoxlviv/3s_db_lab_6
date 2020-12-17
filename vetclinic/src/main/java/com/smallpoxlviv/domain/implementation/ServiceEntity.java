package com.smallpoxlviv.domain.implementation;

import com.smallpoxlviv.domain.GeneralEntity;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "service", schema = "s3_db_lab_6", catalog = "")
public class ServiceEntity implements GeneralEntity {
    private Long id;
    private String name;
    private String description;
    private BigDecimal priceUsd;

    public ServiceEntity() {
    }

    public ServiceEntity(Long id, String name, String description, BigDecimal priceUsd) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.priceUsd = priceUsd;
    }

    @Id
    @Column(name = "id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "price_usd")
    public BigDecimal getPriceUsd() {
        return priceUsd;
    }

    public void setPriceUsd(BigDecimal priceUsd) {
        this.priceUsd = priceUsd;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ServiceEntity that = (ServiceEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (priceUsd != null ? !priceUsd.equals(that.priceUsd) : that.priceUsd != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (priceUsd != null ? priceUsd.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "ServiceEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", priceUsd=" + priceUsd +
                '}';
    }
}
