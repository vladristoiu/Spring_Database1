package com.example.formatii_web_app.contracte;

import com.example.formatii_web_app.formatii.Formatii;
import com.example.formatii_web_app.membri.Membri;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name="contracte")
public class Contracte {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = true)
    private Date data_semnare;

    @Column(nullable = true)
    private Date data_finalizare;

    @Column(nullable = true, length = 45)
    private String clauza_de_prelungire;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="idformatie")
    private Formatii formatie;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="idmembru")
    private Membri membru;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getData_semnare() {
        return data_semnare;
    }

    public void setData_semnare(Date data_semnare) {
        this.data_semnare = data_semnare;
    }

    public Date getData_finalizare() {
        return data_finalizare;
    }

    public void setData_finalizare(Date data_finalizare) {
        this.data_finalizare = data_finalizare;
    }

    public String getClauza_de_prelungire() {
        return clauza_de_prelungire;
    }

    public void setClauza_de_prelungire(String clauza_de_prelungire) {
        this.clauza_de_prelungire = clauza_de_prelungire;
    }

    public Formatii getFormatie() {
        return formatie;
    }

    public void setFormatie(Formatii formatie) {
        this.formatie = formatie;
    }

    public Membri getMembru() {
        return membru;
    }

    public void setMembru(Membri membru) {
        this.membru = membru;
    }
}
