/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uncuyo.dbproyect.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/**
 *
 * @author Martín
 */
public abstract class DAO {
    protected Connection connection=null;
    protected Statement stm = null;
    protected ResultSet rs = null;
    
    ///USUARIOS
    protected final String USER = "AppManager";
    protected final String PASSWORD = "AppPassword";
    protected final String DATABASE = "Institute";
    protected final String DRIVER = "com.mysql.cj.jdbc.Driver";
    ///CONECTARSE COMO APPLICACION
    protected void connectDB() throws Exception{
        try{
            Class.forName(DRIVER);
            //URL segun conectar como aplicacion o como otros usuarios
            String url = "jdbc:mysql://localhost:3232/"+DATABASE;
            connection = DriverManager.getConnection(url, USER, PASSWORD);
        }catch(ClassNotFoundException | SQLException e){
            throw e;
        }
    }
    
    protected void disconnectDB() throws SQLException{
        try{
            if(rs!=null){
                rs.close();
            }
            if(stm!=null){
                stm.close();
            }
            if(connection!=null){
                connection.close();
            }
        }catch(SQLException e){
            throw e;
        }
    }        
    
    protected void updateDB(String sql) throws Exception{
        try{
            stm = connection.createStatement();
            stm.executeUpdate(sql);
        }catch(SQLException e){
            throw e;
        }
    }
    
    protected void requestDB(String sql) throws Exception{
        try{
            this.connectDB();
            stm = connection.createStatement();
            rs = stm.executeQuery(sql);
        }catch(SQLException e){
            throw e;
        }
    }
           
}
