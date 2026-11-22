package com.example;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        // 1. Probar que la conexión funciona
        try (Connection con = Conexion.obtenerConexion()) {
            System.out.println("Conectado a: " + con.getMetaData().getURL());
        } catch (SQLException e) {
            System.out.println("No se pudo conectar a la base de datos: " + e.getMessage());
            return;
        }

        // 2. Listar los productos guardados
        ProductoDAO dao = new ProductoDAO();
        try {
            for (Productos p : dao.listar()) {
                System.out.println(p);
            }
        } catch (SQLException e) {
            System.out.println("Error al consultar productos: " + e.getMessage());
        }
    }
}
