package com.airplane.demo.entities;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

import java.text.SimpleDateFormat;
import java.util.Collection;

public class Vol {
    private SimpleIntegerProperty idVol;
    private SimpleStringProperty aerropDepart;
    private SimpleStringProperty aeroportArrivee;
    private SimpleStringProperty heureDepart;
    private SimpleStringProperty heureArrivee;
    private SimpleStringProperty dateDepart;
    private SimpleStringProperty dateArrivee;

    private SimpleIntegerProperty prix;


    private Collection<escale> escales;


    public int getIdVol() {
        return idVol.get();
    }

    public SimpleIntegerProperty idVolProperty() {
        return idVol;
    }

    public void setIdVol(int idVol) {
        this.idVol.set(idVol);
    }

    public String getAerropDepart() {
        return aerropDepart.get();
    }

    public SimpleStringProperty aerropDepartProperty() {
        return aerropDepart;
    }

    public void setAerropDepart(String aerropDepart) {
        this.aerropDepart.set(aerropDepart);
    }

    public String getAeroportArrivee() {
        return aeroportArrivee.get();
    }

    public SimpleStringProperty aeroportArriveeProperty() {
        return aeroportArrivee;
    }

    public void setAeroportArrivee(String aeroportArrivee) {
        this.aeroportArrivee.set(aeroportArrivee);
    }

    public String getHeureDepart() {
        return heureDepart.get();
    }

    public SimpleStringProperty heureDepartProperty() {
        return heureDepart;
    }

    public void setHeureDepart(String heureDepart) {
        this.heureDepart.set(heureDepart);
    }

    public String getHeureArrivee() {
        return heureArrivee.get();
    }

    public SimpleStringProperty heureArriveeProperty() {
        return heureArrivee;
    }

    public void setHeureArrivee(String heureArrivee) {
        this.heureArrivee.set(heureArrivee);
    }

    public String getDateDepart() {
        return dateDepart.get();
    }

    public SimpleStringProperty dateDepartProperty() {
        return dateDepart;
    }

    public void setDateDepart(String dateDepart) {
        this.dateDepart.set(dateDepart);
    }

    public String getDateArrivee() {
        return dateArrivee.get();
    }

    public SimpleStringProperty dateArriveeProperty() {
        return dateArrivee;
    }

    public void setDateArrivee(String dateArrivee) {
        this.dateArrivee.set(dateArrivee);
    }

    public int getPrix() {
        return prix.get();
    }

    public SimpleIntegerProperty prixProperty() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix.set(prix);
    }

    public Collection<escale> getEscales() {
        return escales;
    }
    public void setEscales(Collection<escale> escales) {
        this.escales = escales;
    }
}
