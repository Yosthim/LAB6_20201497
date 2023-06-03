package Servlets;

import Beans.Cancion;
import Daos.CancionDao;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "CancionServlet", value = "/listaCanciones")
public class CancionServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        CancionDao cancionDao = new CancionDao();
        ArrayList<Cancion> listaCanciones;
        RequestDispatcher view;
        String action = request.getParameter("a") == null ? "listapb" : "lista";
        if(action.equals("listapb")) {
            listaCanciones = cancionDao.listarCanciones(2);
            String titulo = "Lista de Canciones por Banda";
            String href = request.getContextPath() + "/listaCanciones?a=t";
            String boton = "<a class=\"btn btn-warning\" href=\""+href+"\">Mostrar todas las canciones</a>";

            request.setAttribute("listaCanciones", listaCanciones);
            request.setAttribute("titulo", titulo);
            request.setAttribute("boton", boton);

            view = request.getRequestDispatcher("listaCanciones.jsp");
            view.forward(request, response);
        } else {
            listaCanciones = cancionDao.listarCanciones(1);
            String titulo = "Lista de Canciones";
            String boton = "";

            request.setAttribute("listaCanciones", listaCanciones);
            request.setAttribute("titulo", titulo);
            request.setAttribute("boton", boton);

            view = request.getRequestDispatcher("listaCanciones.jsp");
            view.forward(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
