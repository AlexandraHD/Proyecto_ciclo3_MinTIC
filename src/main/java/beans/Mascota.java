package beans;

import java.util.Date;

public class Mascota {
    private int id_mascota;
    private String tipo;
    private String nombre_mascota;
    private String raza;
    private int edad;
    private String tamano;
    private String peso;
    private String color;
    private String ciudad;
    private String ruta_foto;
    private Date fecha_perdido;
    private String otros;

    public Mascota(int id_mascota, String tipo, String nombre_mascota, String raza, int edad, String tamano, String peso, String color, String ciudad, String ruta_foto, Date fecha_perdido, String otros) {
        this.id_mascota = id_mascota;
        this.tipo = tipo;
        this.nombre_mascota = nombre_mascota;
        this.raza = raza;
        this.edad = edad;
        this.tamano = tamano;
        this.peso = peso;
        this.color = color;
        this.ciudad = ciudad;
        this.ruta_foto = ruta_foto;
        this.fecha_perdido = fecha_perdido;
        this.otros = otros;
    }

    public int getId_mascota() {
        return id_mascota;
    }

    public void setId_mascota(int id_mascota) {
        this.id_mascota = id_mascota;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombre_mascota() {
        return nombre_mascota;
    }

    public void setNombre_mascota(String nombre_mascota) {
        this.nombre_mascota = nombre_mascota;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getRuta_foto() {
        return ruta_foto;
    }

    public void setRuta_foto(String ruta_foto) {
        this.ruta_foto = ruta_foto;
    }

    public Date getFecha_perdido() {
        return fecha_perdido;
    }

    public void setFecha_perdido(Date fecha_perdido) {
        this.fecha_perdido = fecha_perdido;
    }

    public String getOtros() {
        return otros;
    }

    public void setOtros(String otros) {
        this.otros = otros;
    }

    @Override
    public String toString() {
        return "Mascota{" + "id_mascota=" + id_mascota + ", tipo=" + tipo + ", nombre_mascota=" + nombre_mascota + ", raza=" + raza + ", edad=" + edad + ", tamano=" + tamano + ", peso=" + peso + ", color=" + color + ", ciudad=" + ciudad + ", ruta_foto=" + ruta_foto + ", fecha_perdido=" + fecha_perdido + ", otros=" + otros + '}';
    }
        
}
