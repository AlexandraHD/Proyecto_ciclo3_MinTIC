package beans;

import java.util.Date;

public class Encontrado {
    private int id_encontrado;
    private String username;
    private int id_mascota;
    private String estado;
    private String ciudad_encontrado;
    private Date fecha_encontrado;
    private String persona_encontro;
    private String detalles;

    public Encontrado(int id_encontrado, String username, int id_mascota, String estado, String ciudad_encontrado, Date fecha_encontrado, String persona_encontro, String detalles) {
        this.id_encontrado = id_encontrado;
        this.username = username;
        this.id_mascota = id_mascota;
        this.estado = estado;
        this.ciudad_encontrado = ciudad_encontrado;
        this.fecha_encontrado = fecha_encontrado;
        this.persona_encontro = persona_encontro;
        this.detalles = detalles;
    }

    public int getId_encontrado() {
        return id_encontrado;
    }

    public void setId_encontrado(int id_encontrado) {
        this.id_encontrado = id_encontrado;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getId_mascota() {
        return id_mascota;
    }

    public void setId_mascota(int id_mascota) {
        this.id_mascota = id_mascota;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCiudad_encontrado() {
        return ciudad_encontrado;
    }

    public void setCiudad_encontrado(String ciudad_encontrado) {
        this.ciudad_encontrado = ciudad_encontrado;
    }

    public Date getFecha_encontrado() {
        return fecha_encontrado;
    }

    public void setFecha_encontrado(Date fecha_encontrado) {
        this.fecha_encontrado = fecha_encontrado;
    }

    public String getPersona_encontro() {
        return persona_encontro;
    }

    public void setPersona_encontro(String persona_encontro) {
        this.persona_encontro = persona_encontro;
    }

    public String getDetalles() {
        return detalles;
    }

    public void setDetalles(String detalles) {
        this.detalles = detalles;
    }

    @Override
    public String toString() {
        return "Encontrado{" + "id_encontrado=" + id_encontrado + ", username=" + username + ", id_mascota=" + id_mascota + ", estado=" + estado + ", ciudad_encontrado=" + ciudad_encontrado + ", fecha_encontrado=" + fecha_encontrado + ", persona_encontro=" + persona_encontro + ", detalles=" + detalles + '}';
    }
    
    
}
