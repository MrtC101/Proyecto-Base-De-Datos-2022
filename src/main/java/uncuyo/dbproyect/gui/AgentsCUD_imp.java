/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uncuyo.dbproyect.gui;
import uncuyo.dbproyect.domain.Date;
import uncuyo.dbproyect.domain.Mail;
import uncuyo.dbproyect.domain.PhoneNumber;
import uncuyo.dbproyect.domain.FormatException;
import uncuyo.dbproyect.domain.AgentService;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.util.Collection;
/**
 *
 * @author Martín
 */
public class AgentsCUD_imp {
    private AgentService serv = new AgentService();
    
    public void SetRoleComboBoxModel(JComboBox List){
        try{
            Collection<String> Roles = serv.getAllRoles();
            List.setModel(new DefaultComboBoxModel(Roles.toArray()));
        }catch(Exception e){            
        }
    }
    public void SetCountryComboBoxModel(JComboBox List){
        try{
            Collection<String> countrys = serv.getAllCountrys();
            List.setModel(new DefaultComboBoxModel(countrys.toArray()));
        }catch(Exception e){ 
        }
    }
    public void SetStateComboBoxModel(JComboBox List){
        try{
            Collection<String> states = serv.getAllStates();
            List.setModel(new DefaultComboBoxModel(states.toArray()));
        }catch(Exception e){            
        }
    }
    public void SetZoneComboBoxModel(JComboBox List){
        try{
            Collection<String> zones = serv.getAllZones();
            List.setModel(new DefaultComboBoxModel(zones.toArray()));
        }catch(Exception e){            
        }
    }
    
    public void Create(String role, String name,String lastName, String bornDate,String national_id,String country,String state,String zone,String address,String StreetNum,String healthEnsuranceName,String emergencyPhone,String agentPhone,String mail) throws Exception,FormatException{
        //CHECK FORMAT
        try{
            Mail mail2 = new Mail(mail);
            Date bornDate2 = new Date(bornDate);
            PhoneNumber emergencyPhone2 = new PhoneNumber(emergencyPhone);
            PhoneNumber agentPhone2 = new PhoneNumber(agentPhone);
            serv.createAgent(role, name, lastName, bornDate2, national_id, country, state, zone, address, StreetNum, healthEnsuranceName, emergencyPhone2, agentPhone2, mail2);
        }catch(FormatException e){throw e;
        }catch(Exception e){throw e;
        }
    }
    //DELETE
    public void Delete(int id) throws Exception{
        try{
            serv.deleteAgent(id);
        }catch(Exception e){
            throw e;
        }
    }
    public void Unsuscribe(int id) throws Exception{
        try{
            serv.unsuscribeAgent(id);
        }catch(Exception e){
            throw e;
        }
    }
    
    public void UpdateName(int id,String name) throws Exception{
        try{
            serv.updateAgentNameById(id, name);
        }catch(Exception e){
                throw e;
            }
    }
    public void UpdateLastName(int id,String lastName) throws Exception{
        try{
            serv.updateAgentLastNameById(id, lastName);
        }catch(Exception e){
                throw e;
            }
    }
    public void UpdateBornDate(int id,Date bornDate) throws Exception{
        try{
            serv.updateAgentBornDateById(id, bornDate);
        }catch(Exception e){
                throw e;
            }
    }
    public void UpdateNationalNumber(int id,String nationalId) throws Exception{
        try{
            serv.updateAgentNationalIdNumberById(id, nationalId);
        }catch(Exception e){
                throw e;
            }
    }
    public void UpdateRole(int id,String role) throws Exception{
        try{
            serv.updateAgentRoleById(id, role);
        }catch(Exception e){
                throw e;
            }
    }
    
    public void UpdateAddress(int id,String country,String state,String zone,String street, String number) throws Exception{
        try{
            serv.updateAgentGlobalLocationById(id, country, state, zone, street, country);
            serv.updateAgentAddressById(id, street, country);
        }catch(Exception e){
                throw e;
            }
    }
    public void UpdateHealth(int id, String ensuranceName) throws Exception{
        try{
            serv.updateAgentHealthEnsuranceById(id, ensuranceName);
        }catch(Exception e){
                throw e;
            }
    }
    
    public void UpdateEmergencyPhone(int id, PhoneNumber phone) throws Exception{
        try{
            serv.updateAgentEmergencyPhoneNumberById(id, phone);
        }catch(Exception e){
                throw e;
            }
    }
    public void UpdatePhone(int id, PhoneNumber Phone) throws Exception{
        try{
            serv.updateAgentPhoneNumberById(id, Phone);
        }catch(Exception e){
                throw e;
            }
    }
    public void UpdateMail(int id,Mail mail) throws Exception{
        try{
            serv.updateAgentMailById(id, mail);
        }catch(Exception e){
                throw e;
            }
    }
}


