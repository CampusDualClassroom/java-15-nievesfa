package com.campusdual.classroom;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FreshMerchandise extends Merchandise {

    private Date expirationDate;
    private SimpleDateFormat sdf = new SimpleDateFormat( "dd-MM-yyyy");

    public FreshMerchandise(String name, String uniqueId, String responsibleId) {
        super(name, uniqueId, responsibleId);
    }

    public FreshMerchandise(String name, String uniqueId, String responsibleId, int zone, String area, String shelf, int quantity, Date expirationDate) {
        super(name, uniqueId, responsibleId, zone, area, shelf, quantity);
        this.expirationDate = expirationDate;
    }


    public Date getExpirationDate() {
        return this.expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

 // constructor para la fecha

    public String getFormattedDate(Date formattedDate){
        return this.sdf.format(this.getExpirationDate());
    }


    @Override
    public String getSpecificData() {
        StringBuilder builder = new StringBuilder();

        builder.append("Localización: ");
        builder.append(getLocation());
        builder.append("\n");
        builder.append("Caducidade: ");
        builder.append(sdf.format(getExpirationDate()));
        return builder.toString();
    }

    public void printSpecificData() {
        System.out.println("Datos de la mercancia");
        System.out.println(this.getSpecificData());

    }
}