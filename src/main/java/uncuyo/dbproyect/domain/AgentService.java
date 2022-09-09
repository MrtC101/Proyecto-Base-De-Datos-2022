/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uncuyo.dbproyect.domain;

import java.util.ArrayList;
import java.util.Collection;
import uncuyo.dbproyect.domain.Date;
import uncuyo.dbproyect.domain.Mail;
import uncuyo.dbproyect.domain.PhoneNumber;
import uncuyo.dbproyect.domain.FormatException;
import uncuyo.dbproyect.domain.AgentService;
import uncuyo.dbproyect.persistence.AgentDAO;

/**
 *
 * @author Martín
 */
public class AgentService {
    private AgentDAO dao;
    
    public AgentService(){
        dao = new AgentDAO();
    }

    public void createAgent(String role,String name,String lastName,Date bornDate,String national_id_number,String country,String state,String zone,String address,String houseNumb,String helthEnsuranceName,PhoneNumber emergencyPhone,PhoneNumber agentPhone,Mail mail) throws Exception{
        try{
           Agent agent = new Agent();
           agent.setRole(role);
           agent.setName(name);
           agent.setLastName(lastName);
           agent.setBornDate(bornDate);
           agent.setNationalIdNumber(national_id_number);
           agent.setGlobalLocation(country,state,zone);
           agent.setAddress(address + " " +houseNumb);
           agent.setHelathEnsurance(helthEnsuranceName);
           agent.setEmergencyPhone(emergencyPhone);
           agent.setAgentPhone(agentPhone);
           agent.setMail(mail);
           dao.insertAgentComplete(agent);
        }catch(Exception e){
            throw e;
        }
    }
     //sobre carga metodo UPDATE
    public void updateAgentRoleById(int agentId,String newRole)throws Exception{
        try{
            Agent agent = searchAgent(agentId).iterator().next();
            agent.setRole(newRole);
            dao.updateAgentRole(agent);
        }catch(Exception e){
            throw e;
        }
    }
    
    public void updateAgentNameById(int agentId,String name)throws Exception{
        try{
            Agent agent = searchAgent(agentId).iterator().next();
            agent.setName(name);
            dao.updateAgent(agent);
        }catch(Exception e){
            throw e;
     
        }
    }
    
    public void updateAgentLastNameById(int agentId,String lastName)throws Exception{
        try{
            Agent agent = searchAgent(agentId).iterator().next();
            agent.setLastName(lastName);
            dao.updateAgent(agent);
        }catch(Exception e){
            throw e;
        }
    }
    
    public void updateAgentBornDateById(int agentId,Date bornDate)throws Exception{
        try{
            Agent agent = searchAgent(agentId).iterator().next();
            agent.setBornDate(bornDate);
            dao.updateAgentPersonalData(agent);
        }catch(Exception e){
            throw e;
        }
    }
    public void updateAgentNationalIdNumberById(int agentId,String national_id_number)throws Exception{
        try{
            Agent agent = searchAgent(agentId).iterator().next();
            agent.setNationalIdNumber(national_id_number);
            dao.updateAgentPersonalData(agent);
        }catch(Exception e){
            throw e;
        }
    }
    public void updateAgentAddressById(int agentId,String address,String houseNumb)throws Exception{
        try{
            Agent agent = searchAgent(agentId).iterator().next();
            agent.setAddress(address + houseNumb);
            dao.updateAgentAddress(agent);
        }catch(Exception e){
            throw e;
        }
    }
    public void updateAgentHealthEnsuranceById(int agentId,String helthEnsuranceName)throws Exception{
        try{
            Agent agent = searchAgent(agentId).iterator().next();
            agent.setHelathEnsurance(helthEnsuranceName);
            dao.updateAgentHealthEnsurance(agent);
        }catch(Exception e){
            throw e;
        }
    }
    public void updateAgentPhoneNumberById(int agentId,PhoneNumber agentPhone)throws Exception{
        try{
            Agent agent = searchAgent(agentId).iterator().next();
            agent.setAgentPhone(agentPhone);
            dao.updateAgentContact(agent);
        }catch(Exception e){
            throw e;
        }
    }
    public void updateAgentEmergencyPhoneNumberById(int agentId,PhoneNumber emergencyPhone)throws Exception{
        try{
            Agent agent = searchAgent(agentId).iterator().next();
            agent.setEmergencyPhone(emergencyPhone);
            dao.updateAgentContact(agent);
        }catch(Exception e){
            throw e;
        }
    }
    
    public void updateAgentMailById(int agentId,Mail mail)throws Exception{
        try{
            Agent agent = searchAgent(agentId).iterator().next();
            agent.setMail(mail);
            dao.updateAgentContact(agent);
        }catch(Exception e){
            throw e;
        }
    }
    public void updateAgentGlobalLocationById(int agentId,String country,String state,String zone,String address,String houseNumb)throws Exception{
        try{
            Agent agent = searchAgent(agentId).iterator().next();
            agent.setGlobalLocation(country, state, zone);
            agent.setAddress(address + houseNumb);
            dao.updateAgentGlobalLocation(agent);
        }catch(Exception e){
            throw e;
        }
    }
    
    //sobre carga metodo DELETE
    public void deleteAgent(int agentId) throws Exception{
        try{
            Agent agent = dao.searchAgentByID(agentId).iterator().next();
            if(agent!=null){
                 dao.deleteAgent(agent);
            }else{
                throw new Exception("Agent not found to delete.");
            }
        }catch(Exception e){
            throw e;
        }
    }
    
    public void unsuscribeAgent(int agentId) throws Exception{
        try{
            Agent agent = dao.searchAgentByID(agentId).iterator().next();
            if(agent!=null){
                 dao.unsuscribeAgent(agent);
            }else{
                throw new Exception("Agent not found to unsuscribe.");
            }
        }catch(Exception e){
            throw e;
        }
    }
    
    //SOBRECARGA DE BUSQUEDA
    public Collection<Agent> searchAgent(int agentId) throws Exception{
        try{
            Collection<Agent> agents; 
            agents = dao.searchAgentByID(agentId);
            return agents;
        }catch(Exception e){
            throw e;
        }
    }

    public Collection<Agent> searchAgentByRole(String role) throws Exception{
        try{
            Collection<Agent> agentsList;
            agentsList = dao.searchAgentByRole(role);
            return agentsList;
        }catch(Exception e){
            throw e;
        }
    }
    public Collection<Agent> searchAgentByName(String Name) throws Exception{
        try{
            Collection<Agent> agentsList;
            agentsList = dao.searchAgentByName(Name);
            return agentsList;
        }catch(Exception e){
            throw e;
        }
    }
    
    public Collection<Agent> searchAgentByDate(Date bornDate) throws Exception{
        try{
            Collection<Agent> agentsList;
            agentsList = dao.searchAgentByBornDate(bornDate);
            return agentsList;
        }catch(Exception e){
            throw e;
        }
    }
    public Collection<Agent> searchAgentByNationalId(String national_id_number) throws Exception{
        try{
            Collection<Agent> agentsList;
            agentsList = dao.searchAgentByNationalId(national_id_number);
            return agentsList;
        }catch(Exception e){
            throw e;
        }
    }
    
    public Collection<Agent> searchAgentByAddress(String address) throws Exception{
        try{
            Collection<Agent> agentsList;
            agentsList = dao.searchAgentByMainAddress(address);
            return agentsList;
        }catch(Exception e){
            throw e;
        }
    }
    
    //Busca agentes que vivan entre esas 2 calles
    public Collection<Agent> searchAgentByPhoneNum(PhoneNumber agentPhone) throws Exception{
        try{
            Collection<Agent> agentsList;
            agentsList = dao.searchAgentByPhone(agentPhone);
            return agentsList;
        }catch(Exception e){
            throw e;
        }
    }
    //Busca agentes que vivan entre esas 2 calles
    public Collection<Agent> searchAgentByMail(Mail mail) throws Exception{
        try{
            Collection<Agent> agentsList;
            agentsList = dao.searchAgentByMail(mail);
            return agentsList;
        }catch(Exception e){
            throw e;
        }
    }
    
    //
    public Collection<Agent> searchAgentByCountry(String country) throws Exception{
        try{
            Collection<Agent> agentsList;
            agentsList = dao.searchAgentByCountry(country);
            return agentsList;
        }catch(Exception e){
            throw e;
        }
    }
    public Collection<Agent> searchAgentByState(String state) throws Exception{
        try{
            Collection<Agent> agentsList;
            agentsList = dao.searchAgentByState(state);
            return agentsList;
        }catch(Exception e){
            throw e;
        }
    }
    public Collection<Agent> searchAgentByZone(String zone) throws Exception{
        try{
            Collection<Agent> agentsList;
            agentsList = dao.searchAgentByZone(zone);
            return agentsList;
        }catch(Exception e){
            throw e;
        }
    }
    
    //TRAER LISTA DE AGENTES
    public Collection<Agent> getAllAgents() throws Exception{
        try{
            Collection<Agent> agentsList;
            agentsList = dao.getAgents();
            return agentsList;
        }catch(Exception e){
            throw e;
        }
    }
    
    public Collection<String> getAllRoles() throws Exception{
        try{
            Collection<String> rolesList;
            rolesList = dao.getRoles();
            return rolesList;
        }catch(Exception e){
            throw e;
        }
    }
    
    public Collection<String> getAllCountrys() throws Exception{
        try{
            Collection<String> countryList;
            countryList = dao.getCountrys();
            return countryList;
        }catch(Exception e){
            throw e;
        }
    }
    
    public Collection<String> getAllStates() throws Exception{
        try{
            Collection<String> statesList;
            statesList = dao.getStates();
            return statesList;
        }catch(Exception e){
            throw e;
        }
    }
    
    public Collection<String> getAllZones() throws Exception{
        try{
            Collection<String> zoneList;
            zoneList = dao.getZones();
            return zoneList;
        }catch(Exception e){
            throw e;
        }
    }
    
    public Collection<String[]> getGlobalLocations() throws Exception{
        try{
            Collection<String[]> GLList;
            GLList = dao.getGlobalLocations();
            return GLList;
        }catch(Exception e){
            throw e;
        }
    }
    
    public Collection<String> getAllAgentsPhones() throws Exception{
        try{
            Collection<String> phonesList;
            phonesList = dao.getAgentsPhones();
            return phonesList;
        }catch(Exception e){
            throw e;
        }
    }
    
    public Collection<String> getAllMails() throws Exception{
        try{
            Collection<String> mailList;
            mailList = dao.getAgentsMails();
            return mailList;
        }catch(Exception e){
            throw e;
        }
    }
}