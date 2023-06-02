package Beans;

public class Cancion {
    int idcancion;
    String nombre_cancion;
    String banda;

    public Cancion(int idcancion, String nombre_cancion, String banda) {
        this.idcancion = idcancion;
        this.nombre_cancion = nombre_cancion;
        this.banda = banda;
    }

    public int getIdcancion() {
        return idcancion;
    }

    public void setIdcancion(int idcancion) {
        this.idcancion = idcancion;
    }

    public String getNombre_cancion() {
        return nombre_cancion;
    }

    public void setNombre_cancion(String nombre_cancion) {
        this.nombre_cancion = nombre_cancion;
    }

    public String getBanda() {
        return banda;
    }

    public void setBanda(String banda) {
        this.banda = banda;
    }
}
