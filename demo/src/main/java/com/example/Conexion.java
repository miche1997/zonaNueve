package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Abre conexiones a la base de datos MySQL "zonanueve".
 *
 * Los datos de acceso se pueden cambiar con variables de entorno
 * (DB_URL, DB_USER, DB_PASSWORD). Si no existen, se usan los valores
 * por defecto de una instalación local (XAMPP: usuario root sin clave).
 */
public class Conexion {

    private static final String URL = valor("DB_URL",
            "jdbc:mysql://localhost:3306/zonanueve?useSSL=false&serverTimezone=America/Bogota&allowPublicKeyRetrieval=true");
    private static final String USUARIO = valor("DB_USER", "root");
    private static final String CLAVE = valor("DB_PASSWORD", "");

    public static Connection obtenerConexion() throws SQLException {
        return DriverManager.getConnection(URL, USUARIO, CLAVE);
    }

    private static String valor(String variable, String porDefecto) {
        String v = System.getenv(variable);
        return (v == null || v.isBlank()) ? porDefecto : v;
    }
}
