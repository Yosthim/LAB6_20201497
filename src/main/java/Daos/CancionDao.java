package Daos;

import Beans.Cancion;
import Beans.Tour;

import java.sql.*;
import java.util.ArrayList;

public class CancionDao {
    private static String user = "root";
    private static String pass = "123456";
    private static String url = "jdbc:mysql://localhost:3306/lab6sw1?serverTimezone=America/Lima";

    public ArrayList<Cancion> obtenerListaRecomendados(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        ArrayList<Cancion> listaRecomendados = new ArrayList<>();
        String query = "select c.idcancion, c.nombre_cancion, c.banda FROM cancion c inner join reproduccion r on c.idcancion = r.cancion_idcancion\n" +
                "group by r.cancion_idcancion \n" +
                "having count(*) >2 order by count(*) desc;";
        try (Connection conn = DriverManager.getConnection(url, user, pass);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {

            while (rs.next()) {
                int id = rs.getInt(1);
                String nombre = rs.getString(2);
                String banda = rs.getString(3);

                listaRecomendados.add(new Cancion(id,nombre,banda));
            }

        } catch (SQLException e) {
            System.out.println("No se pudo realizar la busqueda");
        }
        return listaRecomendados;
    }

}
