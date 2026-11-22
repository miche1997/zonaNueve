package com.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * Operaciones CRUD de la tabla "productos".
 */
public class ProductoDAO {

    public void insertar(Productos p) throws SQLException {
        String sql = "INSERT INTO productos (nombre, precio, descripcion) VALUES (?, ?, ?)";
        try (Connection con = Conexion.obtenerConexion();
             PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            ps.setString(1, p.getNombre());
            ps.setDouble(2, p.getPrecio());
            ps.setString(3, p.getDescripcion());
            ps.executeUpdate();
            try (ResultSet claves = ps.getGeneratedKeys()) {
                if (claves.next()) {
                    p.setId(claves.getLong(1));
                }
            }
        }
    }

    public List<Productos> listar() throws SQLException {
        String sql = "SELECT id, nombre, precio, descripcion FROM productos ORDER BY id";
        List<Productos> lista = new ArrayList<>();
        try (Connection con = Conexion.obtenerConexion();
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                lista.add(leer(rs));
            }
        }
        return lista;
    }

    public Productos buscarPorId(long id) throws SQLException {
        String sql = "SELECT id, nombre, precio, descripcion FROM productos WHERE id = ?";
        try (Connection con = Conexion.obtenerConexion();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setLong(1, id);
            try (ResultSet rs = ps.executeQuery()) {
                return rs.next() ? leer(rs) : null;
            }
        }
    }

    public boolean actualizar(Productos p) throws SQLException {
        String sql = "UPDATE productos SET nombre = ?, precio = ?, descripcion = ? WHERE id = ?";
        try (Connection con = Conexion.obtenerConexion();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, p.getNombre());
            ps.setDouble(2, p.getPrecio());
            ps.setString(3, p.getDescripcion());
            ps.setLong(4, p.getId());
            return ps.executeUpdate() > 0;
        }
    }

    public boolean eliminar(long id) throws SQLException {
        String sql = "DELETE FROM productos WHERE id = ?";
        try (Connection con = Conexion.obtenerConexion();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setLong(1, id);
            return ps.executeUpdate() > 0;
        }
    }

    private Productos leer(ResultSet rs) throws SQLException {
        return new Productos(
                rs.getLong("id"),
                rs.getString("nombre"),
                rs.getDouble("precio"),
                rs.getString("descripcion"));
    }
}
