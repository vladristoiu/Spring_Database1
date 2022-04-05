package com.example.formatii_web_app.formatii;

import com.example.formatii_web_app.contracte.Contracte;

import javax.persistence.*;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="formatii")
public class Formatii {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = true,length = 45)
    private String nume;

    @Column(nullable = true)
    private Date data_infiintare;

    @Column(nullable = true)
    private Integer numar_albume;

    @Column(nullable = true, length = 45)
    private String gen_muzical;

    @Column(nullable = true, length = 45)
    private String tara_de_origine;

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

    public Date getData_infiintare() {
        return data_infiintare;
    }

    public void setData_infiintare(Date data_infiintare) {
        this.data_infiintare = data_infiintare;
    }

    public Integer getNumar_albume() {
        return numar_albume;
    }

    public void setNumar_albume(Integer numar_albume) {
        this.numar_albume = numar_albume;
    }

    public String getGen_muzical() {
        return gen_muzical;
    }

    public void setGen_muzical(String gen_muzical) {
        this.gen_muzical = gen_muzical;
    }

    public String getTara_de_origine() {
        return tara_de_origine;
    }

    public void setTara_de_origine(String tara_de_origine) {
        this.tara_de_origine = tara_de_origine;
    }

    public List<Contracte> getContracteList() {
        return contracteList;
    }

    public void setContracteList(List<Contracte> contracteList) {
        this.contracteList = contracteList;
    }
}
