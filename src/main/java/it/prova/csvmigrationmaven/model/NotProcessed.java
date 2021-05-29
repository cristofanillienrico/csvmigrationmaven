package it.prova.csvmigrationmaven.model;

public class NotProcessed {

    private Long id;
    private String codiceFiscale;

    public NotProcessed() {
    }

    public NotProcessed(String codiceFiscale, Long oldId) {
        this.codiceFiscale = codiceFiscale;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodiceFiscale() {
        return codiceFiscale;
    }

    public void setCodiceFiscale(String codiceFiscale) {
        this.codiceFiscale = codiceFiscale;
    }


    @Override
    public String toString() {
        return "NotProcessed{" +
                "id=" + id +
                ", codiceFiscale='" + codiceFiscale + '\'' +
                '}';
    }
}
