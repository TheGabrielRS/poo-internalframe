package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import com.mysql.jdbc.Driver;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.concurrent.locks.Condition;

/**
 *
 * @author gabrielsa
 */
public class Gerenciador {

    private Connection con;
    
    
    public void connect(){
        try{
        new Driver();
        this.con = DriverManager.getConnection(
          "jdbc:mysql://localhost:3306/homer","root","123456");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    
    public void checkConnection(){
        if(con == null)
            this.connect();
    }
    
    public boolean fazLogin(String usuario, String senha){
        try{
        PreparedStatement stmt = con.prepareStatement("SELECT usuario FROM login WHERE usuario = ? and senha = ?");
        stmt.setString(1, usuario);
        stmt.setString(2, senha);
        ResultSet rs = stmt.executeQuery();
        while(rs.next()){
            return true;
        }
        return false;
        }
        catch(Exception e){
            e.printStackTrace();
            return false;
        }
    }
    
    public boolean fazCadastro(){
        return true;
    }
}