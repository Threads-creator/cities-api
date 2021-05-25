package com.github.thiagosaopaulo.citiesapi.countries.entitys;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pais")
public class Country {

    @Id
    private Long id;

    @Column(name = "nome")
    private String name;

    @Column(name = "nome_pt")
    private String portugueseName;

    @Column(name = "sigla")
    private String cod;

    private Integer bacen;

    public Country() {
    }


    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPortugueseName() {
        return portugueseName;
    }

    public String getCod() {
        return cod;
    }

    public Integer getBacen() {
        return bacen;
    }
}
