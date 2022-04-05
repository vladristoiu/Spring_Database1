package com.example.formatii_web_app.membri;

import com.example.formatii_web_app.contracte.Contracte;
import jdk.jfr.Registered;

import javax.persistence.*;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name="membri")
public class Membri{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = true,length = 45)
    private String nume;

    @Column(nullable = true)
    private String prenume;

    @Column(nullable = true)
    private Date data_nasterii;

    @Column(nullable = true)
    private String nationalitate;

    @Column(nullable = true)
    private Float avere;

    @OneToMany(targetEntity = Contracte.class, mappedBy = "id", cascade = CascadeType.ALL)
    private List<Contracte> contracteList = new ArrayList<>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public Date getData_nasterii() {
        return data_nasterii;
    }

    public void setData_nasterii(Date data_nasterii) {
        this.data_nasterii = data_nasterii;
    }

    public String getNationalitate() {
        return nationalitate;
    }

    public void setNationalitate(String nationalitate) {
        this.nationalitate = nationalitate;
    }

    public Float getAvere() {
        return avere;
    }

    public void setAvere(Float avere) {
        this.avere = avere;
    }

    public List<Contracte> getContracteList() {
        return contracteList;
    }

    public void setContracteList(List<Contracte> contracteList) {
        this.contracteList = contracteList;
    }
}
