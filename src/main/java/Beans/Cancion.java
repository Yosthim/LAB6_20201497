package Beans;

public class Cancion {
    int idcancion;
    String nombre_cancion;
    String idBanda;

    public Cancion(int idcancion, String nombre_cancion, String idBanda) {
        this.idcancion = idcancion;
        this.nombre_cancion = nombre_cancion;
        this.idBanda = idBanda;
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

    public String getIdBanda() {
        return idBanda;
    }

    public void setIdBanda(String idBanda) {
        this.idBanda = idBanda;
    }
}
