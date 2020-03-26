package com.example.practica08;

import android.os.Parcel;
import android.os.Parcelable;


public class cPersona implements Parcelable {
    private String mail;
    private String nombre;
    private String telefono;
    private int edad;

    public cPersona(String mail, String nombre, int edad, String telefono) {
        this.mail = mail;
        this.nombre = nombre;
        this.edad = edad;
        this.telefono = telefono;
    }

    public cPersona(){
        this.mail = "";
        this.nombre = "";
        this.edad = 0;
        this.telefono = "";
    }

    public String getDatos(){
        return (this.nombre+" "+String.valueOf(this.edad)+" "+this.mail+" "+this.telefono);
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTelefono(){
        return  this.telefono;
    }

    public void setTelefono(String telefono){
        this.telefono = telefono;
    }

    protected cPersona(Parcel in) {
        mail = in.readString();
        nombre = in.readString();
        edad = in.readInt();
        telefono = in.readString();
    }
    @Override
    public int describeContents() {
        return 0;
    }
    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(mail);
        dest.writeString(nombre);
        dest.writeInt(edad);
        dest.writeString(telefono);
    }

    @SuppressWarnings("unused")
    public static final Parcelable.Creator<cPersona> CREATOR = new
            Parcelable.Creator<cPersona>() {
                @Override
                public cPersona createFromParcel(Parcel in) {
                    return new cPersona(in);
                }
                @Override
                public cPersona[] newArray(int size) {
                    return new cPersona[size];
                }
            };
}
