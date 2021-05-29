package it.prova.csvmigrationmaven.model;

import com.opencsv.bean.CsvBindByName;

import java.util.Date;

public class CsvModel {

    @CsvBindByName(column = "nome")
    private String nome;

    @CsvBindByName(column = "cognome")
    private String cognome;

    @CsvBindByName(column = "codice_fiscale")
    private String codiceFiscale;

    @CsvBindByName(column = "data")
    private Date data;

    @CsvBindByName(column = "numero_sinistri")
    private Integer numeroSinistri;

    public CsvModel() {
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getCodiceFiscale() {
        return codiceFiscale;
    }

    public void setCodiceFiscale(String codiceFiscale) {
        this.codiceFiscale = codiceFiscale;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Integer getNumeroSinistri() {
        return numeroSinistri;
    }

    public void setNumeroSinistri(Integer numeroSinistri) {
        this.numeroSinistri = numeroSinistri;
    }

    @Override
    public String toString() {
        return "CsvModel{" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", codiceFiscale='" + codiceFiscale + '\'' +
                ", data=" + data +
                ", numeroSinistri=" + numeroSinistri +
                '}';
    }
}
