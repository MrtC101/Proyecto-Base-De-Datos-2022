 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uncuyo.dbproyect.gui;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import uncuyo.dbproyect.domain.Agent;
import uncuyo.dbproyect.domain.AgentService;
import uncuyo.dbproyect.domain.Date;
import uncuyo.dbproyect.domain.FormatException;
import uncuyo.dbproyect.domain.PhoneNumber;
import uncuyo.dbproyect.domain.Mail;

/**
 *
 * @author Martín
 */
public class AgentsSearch_imp {
    private AgentService serv = new AgentService();
    
    //MODELS AND TABLES
    private void setFields(DefaultTableModel model,Object[] fields){
        model.setColumnCount(fields.length);
        model.setColumnIdentifiers(fields);
    };
    
    private void removeRows(DefaultTableModel model){
        int rows = model.getRowCount();
        for(int i = rows-1; i >= 0;i--){
            model.removeRow(i);
        }
    };
    
    public void SetTableModel(JTable table,Collection<Agent> ResultSet,ArrayList field){
        //tabla
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        setFields(model,field.toArray());
        removeRows(model);
        
        Iterator RSiter = ResultSet.iterator();
        while(RSiter.hasNext()){
            Agent Ag=(Agent) RSiter.next();
            ArrayList row = new ArrayList();
        if(field.contains("ID")){
            row.add(Ag.getId());
        }
        if(field.contains("Role")){
            row.add(Ag.getRole());
        }
        if(field.contains("Name")){
            row.add(Ag.getName());
        }
        if(field.contains("Last Name")){
            row.add(Ag.getLastName());
        }
        if(field.contains("Natinal ID")){
            row.add(Ag.getNationalIdNumber());
        }
        if(field.contains("Born Date")){
            row.add(Ag.getBornDate());
        }
        if(field.contains("Phone")){
            row.add(Ag.getAgentPhone());
        }
        if(field.contains("Mail")){
            row.add(Ag.getMail());
        }
        if(field.contains("Emergency Phone")){
            row.add(Ag.getEmergencyPhone());
        }
        if(field.contains("Health Ensurance")){
            row.add(Ag.getHelathEnsuranceName());
        }
        if(field.contains("Country")){
            row.add(Ag.getCountry());
        }
        if(field.contains("State")){
            row.add(Ag.getState());
        }
        if(field.contains("Zone")){
            row.add(Ag.getZone());
        }
        if(field.contains("Street")){
            row.add(Ag.getAddress());
        }
        model.addRow(row.toArray());
        }
    }
     
    //Overrload
    public void SetTableModel(JTable table,Iterator ResultSet,String[] field){
        //tabla
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        setFields(model,field);
        removeRows(model);
        while(ResultSet.hasNext()){
            Object obj = ResultSet.next();
            if( obj instanceof String){
                ArrayList row = new ArrayList();
                row.add(obj);
                model.addRow(row.toArray());
            }else if(obj instanceof String[]){
                model.addRow((Object[]) obj);
            }
        }
    }
    
    public void SetRoleComboBoxModel(JComboBox List){
        try{
            Collection<String> Roles = serv.getAllRoles();
            List.setModel(new DefaultComboBoxModel(Roles.toArray()));
        }catch(Exception e){            
        }
    }
    
    public void SearchID(int id,JTable table,ArrayList field) throws Exception{
        try{
            SetTableModel(table,serv.searchAgent(id),field);
        }catch(Exception e){
            throw e;
        }
    }
    public void SearchRole(String value,JTable table,ArrayList field) throws Exception{
        try{
            SetTableModel(table,serv.searchAgentByRole(value),field);
        }catch(Exception e){
            throw e;
        }
    }
    
    public void SearchName(String value,JTable table,ArrayList field) throws Exception{
        try{
            SetTableModel(table,serv.searchAgentByName(value),field);
        }catch(Exception e){
            throw e;
        }
    }
    public void SearchNational(String value,JTable table,ArrayList field) throws Exception{
        try{
            SetTableModel(table,serv.searchAgentByNationalId(value),field);
        }catch(Exception e){
            throw e;
        }
    }
    /*public void SearchEnsurance(String value,JTable table,ArrayList field) throws Exception{
        try{
            SetTableModel(table,serv.(value),field);
        }catch(Exception e){
            throw e;
        }
    }*/
    public void SearchPhone(String value,JTable table,ArrayList field) throws Exception{
        try{
            SetTableModel(table,serv.searchAgentByPhoneNum(new PhoneNumber(value)),field);
        }catch(Exception e){
            throw e;
        }
    }
  /*  public void SearchEmergency(String value,JTable table,ArrayList field) throws Exception{
        try{
            SetTableModel(table,serv.,field);
        }catch(Exception e){
            throw e;
        }
    }*/
    public void SearchMail(String value,JTable table,ArrayList field) throws Exception{
        try{
            SetTableModel(table,serv.searchAgentByMail(new Mail(value)),field);
        }catch(Exception e){
            throw e;
        }
    }
    
    public void SearchAddress(String value,JTable table,ArrayList field) throws Exception{
        try{
            SetTableModel(table,serv.searchAgentByAddress(value),field);
        }catch(Exception e){
            throw e;
        }
    }
    
    public void SearchAgents(JTable table,ArrayList field) throws Exception{
        try{
            SetTableModel(table,serv.getAllAgents(),field);
        }catch(Exception e){
            throw e;
        }
    }
    
    public void SearchCountrys(JTable table,String[] field) throws Exception{
        try{
            SetTableModel(table,serv.getAllCountrys().iterator(),field);
        }catch(Exception e){
            throw e;
        }
    }
    public void SearchStates(JTable table,String[] field) throws Exception{
        try{
            SetTableModel(table,serv.getAllStates().iterator(),field);
        }catch(Exception e){
            throw e;
        }
    }
    public void SearchZones(JTable table,String[] field) throws Exception{
        try{
            SetTableModel(table,serv.getAllZones().iterator(),field);
        }catch(Exception e){
            throw e;
        }
    }
    public void SearchGlobalLocations(JTable table,String[] field) throws Exception{
        try{
            SetTableModel(table,serv.getGlobalLocations().iterator(),field);
        }catch(Exception e){
            throw e;
        }
    }
    public void SearchMails(JTable table,String[] field) throws Exception{
        try{
            SetTableModel(table,serv.getAllMails().iterator(),field);
        }catch(Exception e){
            throw e;
        }
    }
    public void SearchPhones(JTable table,String[] field) throws Exception{
        try{
            SetTableModel(table,serv.getAllAgentsPhones().iterator(),field);
        }catch(Exception e){
            throw e;
        }
    }
}
