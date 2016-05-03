/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import controle.C;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Usuario;

/**
 *
 * @author max
 */
public class UsuarioDAO {

    private PreparedStatement pst;
    private ResultSet rs;
    private Connection conn;
    private String sql;

    public List<Usuario> getUsuario() throws ClassNotFoundException, SQLException {

        List<Usuario> usuarios = new ArrayList<>();
        sql = "SELECT * FROM  usuario;";
        conn = C.cd();
        pst = conn.prepareStatement(sql);
        rs = pst.executeQuery();
        while (rs.next()) {
            Usuario u = new Usuario();
            u.setId(rs.getInt("id"));
            u.setNome(rs.getString("nome"));
            u.setPsw(rs.getString("senha"));

            usuarios.add(u);

        }
        C.db();
        return usuarios;

    }

    public boolean inserirUsuario(Usuario u) {
        sql = "INSERT INTO usuario (nome,senha) VALUES (?,?);";
        try {
            conn = C.cd();
            pst = conn.prepareStatement(sql);
            pst.setString(1, u.getNome());
            pst.setString(2, u.getPsw());
            pst.execute();
            C.db();
            return true;
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

}
