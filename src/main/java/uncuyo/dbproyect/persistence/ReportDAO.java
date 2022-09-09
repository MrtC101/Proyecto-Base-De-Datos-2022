/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uncuyo.dbproyect.persistence;
/**
 *
 * @author Martín
 */
public class ReportDAO extends DAO{
    
    public ReportDAO(){
        super();
    }
    
    public int NumberOfAgents()throws Exception{
        String sql;
        try{
            sql = "SELECT COUNT(id) AS number FROM Agent;";
            requestDB(sql);
            if(rs == null){
                throw new Exception("results found");
            }
            rs.next();
            int result = rs.getInt("number");
            disconnectDB();
            return result;
        }catch(Exception e){
            throw e;
        }
    }
    public int NumberOfRole(String role)throws Exception{
        String sql;
        try{
            sql = "SELECT COUNT(Agent.id) AS number FROM Agent INNER JOIN Role ON Agent.role_id=Role.id WHERE Role.name=\""+role+"\";";
            requestDB(sql);
            if(rs == null){
                throw new Exception("No results found");
            }
            rs.next();
            int result = rs.getInt("number");
            disconnectDB();
            return result;
        }catch(Exception e){
            throw e;
        }
    }
    public String currentDate()throws Exception{
        String sql;
        try{
            sql = "SELECT curdate() AS date;";
            requestDB(sql);
            if(rs == null){
                throw new Exception("No results found");
            }
            rs.next();
            String result = rs.getDate("date").toString();
            disconnectDB();
            return result;
        }catch(Exception e){
            throw e;
        }
    }
}
