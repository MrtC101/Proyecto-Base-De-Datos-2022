/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uncuyo.dbproyect.persistence;
import uncuyo.dbproyect.domain.Date;
import uncuyo.dbproyect.domain.Mail;
import uncuyo.dbproyect.domain.PhoneNumber;
import uncuyo.dbproyect.domain.FormatException;
import uncuyo.dbproyect.domain.AgentService;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import uncuyo.dbproyect.domain.Agent;
/**
 *
 * @author Martín
 */
public final class AgentDAO extends DAO{

    public void insertAgentComplete(Agent agent)throws Exception{
        String sql;
        try{
            if(agent == null){
                throw new Exception("Null object");
            }
            this.connectDB();
            sql="START TRANSACTION;";
            updateDB(sql);
            sql= "INSERT IGNORE INTO Country (name) VALUE (\""+ agent.getCountry()+"\");";
            updateDB(sql);
            sql = "INSERT IGNORE INTO State (name) VALUE (\""+ agent.getState()+"\");";
            updateDB(sql);
            sql="INSERT IGNORE INTO Zone (name) VALUE (\""+ agent.getZone()+"\");";
            updateDB(sql);
            sql="INSERT IGNORE INTO Global_Location (country_id,state_id,zone_id) VALUES ((SELECT id FROM country WHERE country.name=\""+ agent.getCountry()+"\"),(SELECT id FROM State WHERE State.name=\""+ agent.getState() +"\"),(SELECT id FROM Zone WHERE Zone.name=\""+ agent.getZone() +"\"));";
            updateDB(sql);
            sql="INSERT IGNORE INTO Address (global_location_id,street_name) VALUES ((SELECT GL.id FROM Global_Location AS GL INNER JOIN Country AS CO ON GL.country_id=CO.id INNER JOIN State AS ST ON GL.state_id=ST.id INNER JOIN Zone AS ZN ON GL.zone_id=ZN.id WHERE CO.name=\"" + agent.getCountry() + "\" AND ST.name=\""+ agent.getState() +"\" AND ZN.name=\""+ agent.getZone() +"\"),\""+agent.getAddress()+"\");";
            updateDB(sql);        
            sql="INSERT IGNORE INTO Contact_Information (phone_number,emergency_phone_number,mail_address) Values (\""+agent.getAgentPhone().toString()+"\",\""+agent.getEmergencyPhone().toString()+"\",\""+agent.getMail().toString()+"\");";
            updateDB(sql);
            sql="INSERT IGNORE INTO Health_Ensurance (name) VALUES(\""+ agent.getHelathEnsuranceName() +"\");";
            updateDB(sql);
            sql="INSERT INTO Agent_Personal_Data (name,last_name,national_id_number,born_date,address_id,health_ensurance_id,contact_info_id) VALUES (\"" + agent.getName() + "\",\""+ agent.getLastName() + "\",\"" + agent.getNationalIdNumber() + "\",\""+ agent.getBornDate().toString() +"\",(SELECT id FROM Address WHERE Address.street_name=\""+ agent.getAddress() +"\"),(SELECT id FROM Health_Ensurance WHERE Health_Ensurance.name=\""+ agent.getHelathEnsuranceName()+ "\"),(SELECT id FROM Contact_Information AS CI WHERE CI.phone_number=\""+ agent.getAgentPhone().toString() +"\" AND CI.mail_address=\""+ agent.getMail().toString() +"\" AND CI.emergency_phone_number=\""+agent.getEmergencyPhone().toString()+"\"));";
            updateDB(sql);
            sql="INSERT IGNORE INTO Role (name) Value (\""+ agent.getRole() +"\");";
            updateDB(sql);
            sql="INSERT INTO Agent (role_id,personal_data_id) VALUES( (SELECT id FROM Role WHERE Role.name=\"" + agent.getRole() +"\"),(SELECT id FROM Agent_Personal_Data WHERE Agent_Personal_Data.national_id_number=\"" + agent.getNationalIdNumber() + "\") );"; 
            updateDB(sql);
            updateDB("COMMIT;");
        }catch(Exception e){
            updateDB("ROLLBACK;");
            throw e;
        }finally{
            this.disconnectDB();    
        }
    }
    ///UPDATE
    public void updateAgent(Agent agent)throws Exception{
        String sql;
        try{
            if(agent == null){
                throw new Exception("Null object");
            }
            this.connectDB();
            sql="START TRANSACTION;";
            updateDB(sql);
            sql="UPDATE Agent_Personal_Data AS APD INNER JOIN Agent ON Agent.personal_data_id=APD.id SET name=\""+ agent.getName()+"\", last_name=\""+ agent.getLastName()+"\" WHERE Agent.id="+ agent.getId()+";";
            updateDB(sql);
            sql="COMMIT;";
            updateDB(sql);
        }catch(Exception e){
            sql= "ROLLBACK";
            updateDB(sql);
            throw e;
        }finally{
            this.disconnectDB();    
        }
    }
    
    public void updateAgentRole(Agent agent)throws Exception{
        String sql;
        try{
            if(agent == null){
                throw new Exception("Null object");
            }
            this.connectDB();
            sql = "START TRANSACTION;";
            updateDB(sql);
            sql = "INSERT IGNORE INTO Role (name) Value (\""+ agent.getRole() +"\");";
            updateDB(sql);
            sql = "UPDATE Agent SET role_id=(SELECT id FROM Role WHERE Role.name=\"" + agent.getRole() +"\") WHERE Agent.id="+ agent.getId()+";";
            updateDB(sql);
            sql="COMMIT;";
            updateDB(sql);
        }catch(Exception e){
            sql= "ROLLBACK";
            updateDB(sql);
            throw e;
        }
    }
    public void updateAgentPersonalData(Agent agent)throws Exception{
        String sql;
        try{
            if(agent == null){
                throw new Exception("Null object");
            }
            this.connectDB();
            sql = "START TRANSACTION;";
            updateDB(sql);
            sql = "UPDATE Agent_Personal_Data INNER JOIN Agent ON Agent_Personal_Data.id=Agent.personal_data_id SET national_id_number=\""+ agent.getNationalIdNumber()+"\", born_date=\""+ agent.getBornDate()+"\" WHERE Agent.id="+ agent.getId()+";";
            updateDB(sql);
            sql="COMMIT;";
            updateDB(sql);
        }catch(Exception e){
            sql= "ROLLBACK";
            updateDB(sql);
            throw e;
        }finally{
            this.disconnectDB();    
        }
    }
    public void updateAgentAddress(Agent agent)throws Exception{
        String sql;
        try{
            if(agent == null){
                throw new Exception("Null object");
            }
            this.connectDB();
            sql = "START TRANSACTION;";
            updateDB(sql);
            sql="UPDATE address INNER JOIN Agent_Personal_Data ON Address.id=Agent_personal_data.address_id INNER JOIN Agent ON Agent_Personal_Data.id=Agent.personal_data_id SET street_name=\""+ agent.getAddress()+"\" WHERE Agent.id="+ agent.getId()+" ;";
            updateDB(sql);
            sql="COMMIT;";
            updateDB(sql);
        }catch(Exception e){
            sql= "ROLLBACK";
            updateDB(sql);
            throw e;
        }finally{
            this.disconnectDB();    
        }
    }
    public void updateAgentHealthEnsurance(Agent agent)throws Exception{
        String sql;
        try{
            if(agent == null){
                throw new Exception("Null object");
            }
            this.connectDB();
            sql = "START TRANSACTION;";
            updateDB(sql);
            sql ="INSERT IGNORE INTO Health_Ensurance (name) Value (\""+ agent.getHelathEnsuranceName() +"\");";
            updateDB(sql);
            sql="UPDATE Agent_Personal_Data INNER JOIN Agent ON Agent_Personal_Data.id=Agent.personal_data_id SET health_Ensurance_id=(SELECT id FROM Health_Ensurance WHERE name=\""+ agent.getHelathEnsuranceName() +"\") WHERE Agent.id="+ agent.getId()+";";
            updateDB(sql);
            sql="COMMIT;";
            updateDB(sql);
        }catch(Exception e){
            sql= "ROLLBACK";
            updateDB(sql);
            throw e;
        }finally{
            this.disconnectDB();    
        }
    }
    
    public void updateAgentContact(Agent agent)throws Exception{
        String sql;
        try{
            if(agent == null){
                throw new Exception("Null object");
            }
            this.connectDB();
            sql = "START TRANSACTION;";
            updateDB(sql);
            sql = "UPDATE Contact_Information INNER JOIN Agent_Personal_Data ON Contact_Information.id=Agent_Personal_Data.contact_info_id INNER JOIN Agent ON Agent_Personal_Data.id=Agent.personal_data_id SET phone_number=\""+agent.getAgentPhone().toString()+"\",emergency_phone_number=\""+ agent.getEmergencyPhone().toString() +"\" , mail_address=\""+agent.getMail().toString()+"\" WHERE Agent.id="+ agent.getId()+";";
            updateDB(sql);
            sql="COMMIT;";
            updateDB(sql);
        }catch(Exception e){
            sql= "ROLLBACK";
            updateDB(sql);
            throw e;
        }finally{
            this.disconnectDB();    
        }
    }
    public void updateAgentGlobalLocation(Agent agent)throws Exception{
        String sql;
        try{
            if(agent == null){
                throw new Exception("Null object");
            }
            this.connectDB();
            sql = "START TRANSACTION;";
            updateDB(sql);
            sql = "INSERT IGNORE INTO Country (name) VALUE (\""+ agent.getCountry()+"\");";
            updateDB(sql);
            sql = "INSERT IGNORE INTO State (name) VALUE (\""+ agent.getState()+"\");";
            updateDB(sql);
            sql = "INSERT IGNORE INTO Zone (name) VALUE (\""+ agent.getZone()+"\");";
            updateDB(sql);
            sql = "INSERT IGNORE INTO Global_Location (country_id,state_id,zone_id) VALUES ((SELECT id FROM Country WHERE Country.name=\""+ agent.getCountry()+"\"),(SELECT id FROM State WHERE State.name=\""+ agent.getState() +"\"),(SELECT id FROM Zone WHERE Zone.name=\""+ agent.getZone() +"\"));";
            updateDB(sql);
            sql = "INSERT IGNORE INTO Address (global_location_id,street_name) VALUES ((SELECT GL.id FROM Global_Location AS GL INNER JOIN Country AS CO ON GL.country_id=CO.id INNER JOIN State AS ST ON GL.state_id=ST.id INNER JOIN Zone AS ZN ON GL.zone_id=ZN.id  WHERE CO.name=\"" + agent.getCountry() + "\" AND ST.name=\""+ agent.getState() +"\" AND ZN.name=\""+ agent.getZone() +"\"),street_name=\""+agent.getAddress()+"\");";
            updateDB(sql);
            sql = "UPDATE Address INNER JOIN Agent_Personal_Data ON Address.id=Agent_Personal_Data.address_id INNER JOIN Agent ON Agent_Personal_data.id=Agent.personal_data_id SET global_location_id = "
                    + "(SELECT GL.id FROM Global_Location AS GL INNER JOIN Country AS CO ON GL.country_id=CO.id INNER JOIN State AS ST ON GL.state_id=ST.id INNER JOIN Zone AS ZN ON GL.zone_id=ZN.id  WHERE CO.name=\"" + agent.getCountry() + "\" AND ST.name=\""+ agent.getState() +"\" AND ZN.name=\""+ agent.getZone() +"\")"
                    + ", street_name=\""+agent.getAddress()+"\" WHERE Agent.id="+agent.getId()+";";
            updateDB(sql);
            sql="COMMIT;";
            updateDB(sql);
        }catch(Exception e){
            sql= "ROLLBACK";
            updateDB(sql);
            throw e;
        }finally{
            this.disconnectDB();    
        }
        updateAgentAddress(agent);
    }
    
    ///DELTE
    public void deleteAgent(Agent agent)throws Exception{
        String sql;
        try{
            if(agent == null){
                throw new Exception("Null object");
            }
            
            this.connectDB();
            sql = "START TRANSACTION;";
            updateDB(sql);
            sql = "DELETE FROM Agent WHERE Agent.id=" +agent.getId()+";";
            updateDB(sql);
            sql="COMMIT;";
            updateDB(sql);
        }catch(Exception e){
            sql= "ROLLBACK";
            updateDB(sql);
            throw e;
        }finally{
            this.disconnectDB();    
        }
    }
    
    public void unsuscribeAgent(Agent agent) throws Exception{
        String sql;
        try{
            if(agent == null){
                throw new Exception("Null object");
            }
            
            this.connectDB();
            sql = "START TRANSACTION;";
            updateDB(sql);
            sql = "Update Agent SET LogOut=true, DateTo=Curdate() WHERE Agent.id=" +agent.getId()+";";
            updateDB(sql);
            sql="COMMIT;";
            updateDB(sql);
        }catch(Exception e){
            sql= "ROLLBACK";
            updateDB(sql);
            throw e;
        }finally{
            this.disconnectDB();    
        }
    }
    //SEARCH
    public Collection<Agent> searchAgentByID(int AgentId) throws SQLException, Exception{
        String sql ="SELECT AG.id AS \"ID\",Role.name AS \"Role\",APD.name AS \"Name\",APD.last_name AS \"Last Name\","
                + "APD.national_id_number AS \"National ID\",APD.born_date AS \"Born Date\",CI.phone_number AS \"Phone\","
                + "CI.mail_address AS \"Mail\",CI.emergency_phone_number AS \"Emergency Phone\","
                + "HE.name AS \"Health Ensurance\",Co.name AS \"Country\",St.name AS \"State\","
                + "Zo.name AS \"Zone\",AD.street_name AS \"Main Street\" "
                + "FROM (SELECT * FROM Agent WHERE id="+AgentId+") AS AG "
                + "INNER JOIN Role ON AG.role_id=Role.id "
                + "INNER JOIN Agent_Personal_Data AS APD ON APD.id=AG.personal_data_id "
                + "INNER JOIN Health_Ensurance AS HE ON HE.id=APD.health_ensurance_id "
                + "INNER JOIN Contact_Information AS CI ON CI.id=APD.contact_info_id "
                + "INNER JOIN Address AS AD ON AD.id=APD.address_id "
                + "INNER JOIN Global_Location AS GL ON GL.id=AD.global_location_id "
                + "INNER JOIN Country AS Co ON co.id=GL.country_id "
                + "INNER JOIN State AS St ON St.id=GL.state_id "
                + "INNER JOIN Zone AS Zo ON Zo.id=GL.zone_id "
                + "WHERE AG.LogOut=false;";
        try{
            return ExecuteSearch(sql);
        }catch(Exception e){
            disconnectDB();
            throw e;
        }
    }
 
    public Collection<Agent> searchAgentByRole(String role) throws SQLException, Exception{
        String sql ="SELECT AG.id AS \"ID\",Role.name AS \"Role\",APD.name AS \"Name\",APD.last_name AS \"Last Name\","
                + "APD.national_id_number AS \"National ID\",APD.born_date AS \"Born Date\",CI.phone_number AS \"Phone\","
                + "CI.mail_address AS \"Mail\",CI.emergency_phone_number AS \"Emergency Phone\","
                + "HE.name AS \"Health Ensurance\",Co.name AS \"Country\",St.name AS \"State\","
                + "Zo.name AS \"Zone\",AD.street_name AS \"Main Street\" "
                + "FROM (SELECT * FROM Role WHERE Role.name=\""+ role +"\") AS Role "
                + "INNER JOIN Agent AS AG ON AG.role_id=Role.id "
                + "INNER JOIN Agent_Personal_Data AS APD ON APD.id=AG.personal_data_id "
                + "INNER JOIN Health_Ensurance AS HE ON HE.id=APD.health_ensurance_id "
                + "INNER JOIN Contact_Information AS CI ON CI.id=APD.contact_info_id "
                + "INNER JOIN Address AS AD ON AD.id=APD.address_id "
                + "INNER JOIN Global_Location AS GL ON GL.id=AD.global_location_id "
                + "INNER JOIN Country AS Co ON Co.id=GL.country_id "
                + "INNER JOIN State AS St ON St.id=GL.state_id "
                + "INNER JOIN Zone AS Zo ON Zo.id=GL.zone_id "
                + "WHERE AG.LogOut=false;";
        try{
            return ExecuteSearch(sql);
        }catch(Exception e){
            disconnectDB();
            throw e;
        }
    }
    
    public Collection<Agent> searchAgentByName(String Name) throws SQLException, Exception{
         String sql ="SELECT AG.id AS \"ID\",Role.name AS \"Role\",APD.name AS \"Name\",APD.last_name AS \"Last Name\","
                + "APD.national_id_number AS \"National ID\",APD.born_date AS \"Born Date\",CI.phone_number AS \"Phone\","
                + "CI.mail_address AS \"Mail\",CI.emergency_phone_number AS \"Emergency Phone\","
                + "HE.name AS \"Health Ensurance\",Co.name AS \"Country\",St.name AS \"State\","
                + "Zo.name AS \"Zone\",AD.street_name AS \"Main Street\" "
                + "FROM (SELECT * FROM Agent_Personal_Data WHERE Agent_Personal_Data.name=\""+ Name +"\") AS APD "
                + "INNER JOIN Agent AS AG ON AG.personal_data_id=APD.id "
                + "INNER JOIN Role ON AG.role_id=Role.id "
                + "INNER JOIN Health_Ensurance AS HE ON HE.id=APD.health_ensurance_id "
                + "INNER JOIN Contact_Information AS CI ON CI.id=APD.contact_info_id "
                + "INNER JOIN Address AS AD ON AD.id=APD.address_id "
                + "INNER JOIN Global_Location AS GL ON GL.id=AD.global_location_id "
                + "INNER JOIN Country AS Co ON co.id=GL.country_id "
                + "INNER JOIN State AS St ON St.id=GL.state_id "
                + "INNER JOIN Zone AS Zo ON Zo.id=GL.zone_id "
                + "WHERE AG.LogOut=false;";
        try{
            return ExecuteSearch(sql);
        }catch(Exception e){
            disconnectDB();
            throw e;
        }
    }
    
    public Collection<Agent> searchAgentByBornDate(Date bornDate) throws SQLException, Exception{
        String sql ="SELECT AG.id AS \"ID\",Role.name AS \"Role\",APD.name AS \"Name\",APD.last_name AS \"Last Name\","
                    + "APD.national_id_number AS \"National ID\",APD.born_date AS \"Born Date\",CI.phone_number AS \"Phone\","
                    + "CI.mail_address AS \"Mail\",CI.emergency_phone_number AS \"Emergency Phone\","
                    + "HE.name AS \"Health Ensurance\",Co.name AS \"Country\",St.name AS \"State\","
                    + "Zo.name AS \"Zone\",AD.street_name AS \"Main Street\" "
                    + "FROM (SELECT * FROM Agent_Personal_Data WHERE born_date=\""+ bornDate.toString() +"\") AS APD "
                    + "INNER JOIN Agent AS AG ON AG.personal_data_id=APD.id "
                    + "INNER JOIN Role ON AG.role_id=Role.id "
                    + "INNER JOIN Health_Ensurance AS HE ON HE.id=APD.health_ensurance_id "
                    + "INNER JOIN Contact_Information AS CI ON CI.id=APD.contact_info_id "
                    + "INNER JOIN Address AS AD ON AD.id=APD.address_id "
                    + "INNER JOIN Global_Location AS GL ON GL.id=AD.global_location_id "
                    + "INNER JOIN Country AS Co ON co.id=GL.country_id "
                    + "INNER JOIN State AS St ON St.id=GL.state_id "
                    + "INNER JOIN Zone AS Zo ON Zo.id=GL.zone_id "
                    + "WHERE AG.LogOut=false;";
        try{
            return ExecuteSearch(sql);
        }catch(Exception e){
            disconnectDB();
            throw e;
        }
    }
    public Collection<Agent> searchAgentByNationalId(String nationalId)throws SQLException, Exception{
        String sql ="SELECT AG.id AS \"ID\",Role.name AS \"Role\",APD.name AS \"Name\",APD.last_name AS \"Last Name\","
                    + "APD.national_id_number AS \"National ID\",APD.born_date AS \"Born Date\",CI.phone_number AS \"Phone\","
                    + "CI.mail_address AS \"Mail\",CI.emergency_phone_number AS \"Emergency Phone\","
                    + "HE.name AS \"Health Ensurance\",Co.name AS \"Country\",St.name AS \"State\","
                    + "Zo.name AS \"Zone\",AD.street_name AS \"Main Street\" "
                    + "FROM (SELECT * FROM Agent_Personal_Data WHERE national_id_number=\""+ nationalId+"\") AS APD "
                    + "INNER JOIN Agent AS AG ON AG.personal_data_id=APD.id "
                    + "INNER JOIN Role ON AG.role_id=Role.id "
                    + "INNER JOIN Health_Ensurance AS HE ON HE.id=APD.health_ensurance_id "
                    + "INNER JOIN Contact_Information AS CI ON CI.id=APD.contact_info_id "
                    + "INNER JOIN Address AS AD ON AD.id=APD.address_id "
                    + "INNER JOIN Global_Location AS GL ON GL.id=AD.global_location_id "
                    + "INNER JOIN Country AS Co ON co.id=GL.country_id "
                    + "INNER JOIN State AS St ON St.id=GL.state_id "
                    + "INNER JOIN Zone AS Zo ON Zo.id=GL.zone_id "
                + "WHERE AG.LogOut=false;";
        try{
            return ExecuteSearch(sql);
        }catch(Exception e){
            disconnectDB();
            throw e;
        }
    }
    public Collection<Agent> searchAgentByMainAddress(String address)throws SQLException, Exception{
        String sql ="SELECT AG.id AS \"ID\",Role.name AS \"Role\",APD.name AS \"Name\",APD.last_name AS \"Last Name\","
                    + "APD.national_id_number AS \"National ID\",APD.born_date AS \"Born Date\",CI.phone_number AS \"Phone\","
                    + "CI.mail_address AS \"Mail\",CI.emergency_phone_number AS \"Emergency Phone\","
                    + "HE.name AS \"Health Ensurance\",Co.name AS \"Country\",St.name AS \"State\","
                    + "Zo.name AS \"Zone\",AD.street_name AS \"Main Street\" "
                    + "FROM (SELECT * FROM Address WHERE street_name=\""+ address +"\") AS AD "
                    + "INNER JOIN Agent_Personal_Data AS APD ON APD.address_id=AD.id "
                    + "INNER JOIN Health_Ensurance AS HE ON HE.id=APD.health_ensurance_id "
                    + "INNER JOIN Contact_Information AS CI ON CI.id=APD.contact_info_id "
                    + "INNER JOIN Agent AS AG ON AG.personal_data_id=APD.id "
                    + "INNER JOIN Role ON Role.id=AG.role_id "
                    + "INNER JOIN Global_Location AS GL ON GL.id=AD.global_location_id "
                    + "INNER JOIN Country AS Co ON Co.id=GL.country_id "
                    + "INNER JOIN State AS St ON St.id=GL.state_id "
                    + "INNER JOIN Zone AS Zo ON Zo.id=GL.zone_id "
                + "WHERE AG.LogOut=false;";
        try{
            return ExecuteSearch(sql);
        }catch(Exception e){
            disconnectDB();
            throw e;
        }
    }
 
    public Collection<Agent> searchAgentByPhone(PhoneNumber agentPhone)throws SQLException, Exception{
       String sql ="SELECT AG.id AS \"ID\",Role.name AS \"Role\",APD.name AS \"Name\",APD.last_name AS \"Last Name\","
                    + "APD.national_id_number AS \"National ID\",APD.born_date AS \"Born Date\",CI.phone_number AS \"Phone\","
                    + "CI.mail_address AS \"Mail\",CI.emergency_phone_number AS \"Emergency Phone\","
                    + "HE.name AS \"Health Ensurance\",Co.name AS \"Country\",St.name AS \"State\","
                    + "Zo.name AS \"Zone\",AD.street_name AS \"Main Street\" "
                    + "FROM (SELECT * FROM Contact_Information WHERE phone_number=\""+ agentPhone.toString() +"\") AS CI "
                    + "INNER JOIN Agent_Personal_Data AS APD ON APD.contact_info_id=CI.id "
                    + "INNER JOIN Agent AG ON AG.personal_data_id=APD.id " 
                    + "INNER JOIN Role ON Role.id=AG.role_id "
                    + "INNER JOIN Health_Ensurance AS HE ON HE.id=APD.health_ensurance_id "
                    + "INNER JOIN Address AS AD ON AD.id=APD.address_id "
                    + "INNER JOIN Global_Location AS GL ON GL.id=AD.global_location_id "
                    + "INNER JOIN Country AS Co ON Co.id=GL.country_id "
                    + "INNER JOIN State AS St ON St.id=GL.state_id "
                    + "INNER JOIN Zone AS Zo ON Zo.id=GL.zone_id "
               + "WHERE AG.LogOut=false;";
        try{
            return ExecuteSearch(sql);
        }catch(Exception e){
            disconnectDB();
            throw e;
        }
    }
      
    public Collection<Agent> searchAgentByMail(Mail mail)throws SQLException, Exception{
       String sql ="SELECT AG.id AS \"ID\",Role.name AS \"Role\",APD.name AS \"Name\",APD.last_name AS \"Last Name\","
                    + "APD.national_id_number AS \"National ID\",APD.born_date AS \"Born Date\",CI.phone_number AS \"Phone\","
                    + "CI.mail_address AS \"Mail\",CI.emergency_phone_number AS \"Emergency Phone\","
                    + "HE.name AS \"Health Ensurance\",Co.name AS \"Country\",St.name AS \"State\","
                    + "Zo.name AS \"Zone\",AD.street_name AS \"Main Street\" "
                    + "FROM (SELECT * FROM Contact_Information WHERE mail_address=\""+ mail.toString() +"\") AS CI "
                    + "INNER JOIN Agent_Personal_Data AS APD ON APD.contact_info_id=CI.id "
                    + "INNER JOIN Agent AG ON AG.personal_data_id=APD.id " 
                    + "INNER JOIN Role ON Role.id=AG.role_id "
                    + "INNER JOIN Health_Ensurance AS HE ON HE.id=APD.health_ensurance_id "
                    + "INNER JOIN Address AS AD ON AD.id=APD.address_id "
                    + "INNER JOIN Global_Location AS GL ON GL.id=AD.global_location_id "
                    + "INNER JOIN Country AS Co ON Co.id=GL.country_id "
                    + "INNER JOIN State AS St ON St.id=GL.state_id "
                    + "INNER JOIN Zone AS Zo ON Zo.id=GL.zone_id "
               + "WHERE AG.LogOut=false;";
        try{
            return ExecuteSearch(sql);
        }catch(Exception e){
            disconnectDB();
            throw e;
        }
    }
    public Collection<Agent> searchAgentByCountry(String country)throws SQLException, Exception{
        String sql ="SELECT AG.id AS \"ID\",Role.name AS \"Role\",APD.name AS \"Name\",APD.last_name AS \"Last Name\","
                    + "APD.national_id_number AS \"National ID\",APD.born_date AS \"Born Date\",CI.phone_number AS \"Phone\","
                    + "CI.mail_address AS \"Mail\",CI.emergency_phone_number AS \"Emergency Phone\","
                    + "HE.name AS \"Health Ensurance\",Co.name AS \"Country\",St.name AS \"State\","
                    + "Zo.name AS \"Zone\",AD.street_name AS \"Main Street\" "
                    + "FROM (SELECT * FROM Country WHERE name=\""+ country +"\") AS Co "
                    + "INNER JOIN Global_Location AS GL ON GL.country_id=Co.id "
                    + "INNER JOIN State AS St ON St.id=GL.state_id "
                    + "INNER JOIN Zone AS Zo ON Zo.id=GL.zone_id "
                    + "INNER JOIN Address AS AD ON AD.global_location_id=GL.id "
                    + "INNER JOIN Agent_Personal_Data AS APD ON APD.address_id=AD,id "
                    + "INNER JOIN Health_Ensurance AS HE ON HE.id=APD.health_ensurance_id "
                    + "INNER JOIN Contact_Information AS CI ON CI.id=APD.contact_info_id "
                    + "INNER JOIN Agent AS AG ON AG.personal_data_id=APD.id "
                    + "INNER JOIN Role ON role.id=AG.role_id "
                + "WHERE AG.LogOut=false;";
                    try{
            return ExecuteSearch(sql);
        }catch(Exception e){
            disconnectDB();
            throw e;
        }
    }
    public Collection<Agent> searchAgentByState(String state)throws SQLException, Exception{
        String sql ="SELECT AG.id AS \"ID\",Role.name AS \"Role\",APD.name AS \"Name\",APD.last_name AS \"Last Name\","
                    + "APD.national_id_number AS \"National ID\",APD.born_date AS \"Born Date\",CI.phone_number AS \"Phone\","
                    + "CI.mail_address AS \"Mail\",CI.emergency_phone_number AS \"Emergency Phone\","
                    + "HE.name AS \"Health Ensurance\",Co.name AS \"Country\",St.name AS \"State\","
                    + "Zo.name AS \"Zone\",AD.street_name AS \"Main Street\" "
                    + "FROM (SELECT * FROM State WHERE name=\""+ state +"\") AS St "
                    + "INNER JOIN Global_Location AS GL ON GL.country_id=St.id "
                    + "INNER JOIN Country AS Co ON Co.id=GL.state_id "
                    + "INNER JOIN Zone AS Zo ON Zo.id=GL.zone_id "
                    + "INNER JOIN Address AS AD ON AD.global_location_id=GL.id "
                    + "INNER JOIN Agent_Personal_Data AS APD ON APD.address_id=AD,id"
                    + "INNER JOIN Health_Ensurance AS HE ON HE.id=APD.health_ensurance_id "
                    + "INNER JOIN Contact_Information AS CI ON CI.id=APD.contact_info_id "
                    + "INNER JOIN Agent AS AG ON AG.personal_data_id=APD.id "
                    + "INNER JOIN Role ON role.id=AG.role_id "
                + "WHERE AG.LogOut=false;";
        try{
            return ExecuteSearch(sql);
        }catch(Exception e){
            disconnectDB();
            throw e;
        }
    }
    public Collection<Agent> searchAgentByZone(String zone)throws SQLException, Exception{
       String sql ="SELECT AG.id AS \"ID\",Role.name AS \"Role\",APD.name AS \"Name\",APD.last_name AS \"Last Name\","
                    + "APD.national_id_number AS \"National ID\",APD.born_date AS \"Born Date\",CI.phone_number AS \"Phone\","
                    + "CI.mail_address AS \"Mail\",CI.emergency_phone_number AS \"Emergency Phone\","
                    + "HE.name AS \"Health Ensurance\",Co.name AS \"Country\",St.name AS \"State\","
                    + "Zo.name AS \"Zone\",AD.street_name AS \"Main Street\" "
                    + "FROM (SELECT * FROM Zone WHERE name=\""+ zone +"\") AS Zo "
                    + "INNER JOIN Global_Location AS GL ON GL.country_id=Zo.id "
                    + "INNER JOIN Country AS Co ON Co.id=GL.state_id "
                    + "INNER JOIN State AS St ON St.id=GL.zone_id "
                    + "INNER JOIN Address AS AD ON AD.global_location_id=GL.id "
                    + "INNER JOIN Agent_Personal_Data AS APD ON APD.address_id=AD,id "
                    + "INNER JOIN Health_Ensurance AS HE ON HE.id=APD.health_ensurance_id "
                    + "INNER JOIN Contact_Information AS CI ON CI.id=APD.contact_info_id "
                    + "INNER JOIN Agent AS AG ON AG.personal_data_id=APD.id "
                    + "INNER JOIN Role ON role.id=AG.role_id "
               + "WHERE AG.LogOut=false;";
       try{
            return ExecuteSearch(sql);
        }catch(Exception e){
            disconnectDB();
            throw e;
        }
    }
    
    
    public Collection<Agent> getAgents()throws SQLException, Exception{
        String sql ="SELECT AG.id AS \"ID\",Role.name AS \"Role\",APD.name AS \"Name\",APD.last_name AS \"Last Name\","
                + "APD.national_id_number AS \"National ID\",APD.born_date AS \"Born Date\",CI.phone_number AS \"Phone\","
                + "CI.mail_address AS \"Mail\",CI.emergency_phone_number AS \"Emergency Phone\","
                + "HE.name AS \"Health Ensurance\",Co.name AS \"Country\",St.name AS \"State\","
                + "Zo.name AS \"Zone\",AD.street_name AS \"Main Street\" "
                + "FROM Agent AS AG "
                + "INNER JOIN Role ON AG.role_id=Role.id "
                + "INNER JOIN Agent_Personal_Data AS APD ON APD.id=AG.personal_data_id "
                + "INNER JOIN Health_Ensurance AS HE ON HE.id=APD.health_ensurance_id "
                + "INNER JOIN Contact_Information AS CI ON CI.id=APD.contact_info_id "
                + "INNER JOIN Address AS AD ON AD.id=APD.address_id "
                + "INNER JOIN Global_Location AS GL ON GL.id=AD.global_location_id "
                + "INNER JOIN Country AS Co ON Co.id=GL.country_id "
                + "INNER JOIN State AS St ON St.id=GL.state_id "
                + "INNER JOIN Zone AS Zo ON Zo.id=GL.zone_id "
                + "WHERE AG.LogOut=false;";
        try{
            return ExecuteSearch(sql);
        }catch(Exception e){
            disconnectDB();
            throw e;
        }
    }
    
    private Collection<Agent> ExecuteSearch(String sql) throws Exception{
        try{
            requestDB(sql);
            Collection<Agent> agentList = new ArrayList();
            if(rs == null){
                throw new Exception("No results found");
            }
            while(rs.next()){
                fillAgent(agentList);
            }
            disconnectDB();
            return agentList;
        }catch(Exception e){
            throw e;
        }
    }
    
    private void fillAgent(Collection<Agent> agentList) throws Exception{
        try{
        Agent agent = new Agent();
        agent.setId(rs.getInt("ID"));
        agent.setRole(rs.getString("Role"));
        agent.setName(rs.getString("Name"));
        agent.setLastName(rs.getString("Last Name"));
        agent.setBornDate(new Date(rs.getString("Born Date")));
        agent.setNationalIdNumber(rs.getString("National ID"));
        agent.setHelathEnsurance(rs.getString("Health Ensurance"));
        agent.setEmergencyPhone(new PhoneNumber(rs.getString("Emergency Phone")));
        agent.setGlobalLocation(rs.getString("Country"), rs.getString("State"), rs.getString("Zone"));
        agent.setAddress(rs.getString("Main Street"));
        agent.setAgentPhone(new PhoneNumber(rs.getString("Phone")));
        agent.setMail(new Mail(rs.getString("Mail")));           
        agentList.add(agent);
        }catch(Exception e){
            throw e;
        }
    }
    
    //Search others
    public Collection<String> getRoles()throws SQLException, Exception{
        try{
            String sql ="SELECT name FROM Role;";
            requestDB(sql);
            Collection<String> roles = new ArrayList<>();
            while(rs.next()){
                roles.add(rs.getString("name"));
            }
            disconnectDB();
            return roles;
        }catch(Exception e){
            disconnectDB();
            throw e;
        }
    }

    public Collection<String> getCountrys()throws SQLException, Exception{
        try{
            String sql ="SELECT name FROM Country;";
            requestDB(sql);
            Collection<String> countrys = new ArrayList<>();
            while(rs.next()){
                countrys.add(rs.getString("name"));
            }
            disconnectDB();
            return countrys;
        }catch(Exception e){
            disconnectDB();
            throw e;
        }
    }

    public Collection<String> getStates()throws SQLException, Exception{
        try{
            String sql ="SELECT name FROM State;";
            requestDB(sql);
            Collection<String> states = new ArrayList<>();
            while(rs.next()){
                states.add(rs.getString("name"));
            }
            disconnectDB();
            return states;
        }catch(Exception e){
            disconnectDB();
            throw e;
        }
    }

    public Collection<String> getZones()throws SQLException, Exception{
        try{
            String sql ="SELECT name FROM Zone;";
            requestDB(sql);
            Collection<String> zones = new ArrayList<>();
            while(rs.next()){
                zones.add(rs.getString("name"));
            }
            disconnectDB();
            return zones;
        }catch(Exception e){
            disconnectDB();
            throw e;
        }
    }

    public Collection<String[]> getGlobalLocations()throws SQLException, Exception{
        try{
            String sql ="SELECT Country.name AS \"Country\",State.name AS \"State\",Zone.name AS \"Zone\" "
                    + "FROM Global_Location AS GL "
                    + "INNER JOIN Country ON GL.country_id=Country.id "
                    + "INNER JOIN State ON GL.state_id=State.id "
                    + "INNER JOIN Zone ON GL.zone_id=Zone.id;";
            requestDB(sql);
            Collection<String[]> GlobalLocations = new ArrayList<>();
            while(rs.next()){
                String result[] ={rs.getString("Country"),rs.getString("State"), rs.getString("Zone")};
                GlobalLocations.add(result);
            }
            disconnectDB();
            return GlobalLocations;
        }catch(Exception e){
            disconnectDB();
            throw e;
        }
    }
    
    public Collection<String> getAgentsPhones()throws SQLException, Exception{
         try{
            String sql ="SELECT phone_number FROM Contact_Information;";
            requestDB(sql);
            Collection<String> phones = new ArrayList<>();
            while(rs.next()){
                phones.add(rs.getString("phone_number"));
            }
            disconnectDB();
            return phones;
        }catch(Exception e){
            disconnectDB();
            throw e;
        }
    }
    
    public Collection<String> getAgentsMails()throws SQLException, Exception{
         try{
            String sql ="SELECT mail_address FROM Contact_Information;";
            requestDB(sql);
            Collection<String> mails = new ArrayList<>();
            while(rs.next()){
                mails.add(rs.getString("mail_address"));
            }
            disconnectDB();
            return mails;
        }catch(Exception e){
            disconnectDB();
            throw e;
        }
    }
    
}
