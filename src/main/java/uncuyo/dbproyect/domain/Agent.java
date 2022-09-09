/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uncuyo.dbproyect.domain;
/**
 *
 * @author Martín
 */
public class Agent {

    /**
     * @return the Emergency_phone_num
     */
    public PhoneNumber getEmergencyPhone() {
        return Emergency_phone_num;
    }

    /**
     * @param Emergency_phone_num the Emergency_phone_num to set
     */
    public void setEmergencyPhone(PhoneNumber Emergency_phone_num) {
        this.Emergency_phone_num = Emergency_phone_num;
    }
    private int id;
    private String role;
    private String name;
    private String lastName;
    //Datos personales
    private String national_id_number;
    private Date bornDate;
    private String address;
    private String Country;
    private String State;
    private String Zone;
    //Obra social
    private String helath_ensurance;
    //Contacto
    private PhoneNumber Emergency_phone_num;
    private PhoneNumber phone_num;
    private Mail mail;
    
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }
    
     /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }
    
    /**
     * @return the role
     */
    public String getRole() {
        return role;
    }

    /**
     * @param role the role to set
     */
    public void setRole(String role) {
        this.role = role;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the national_id_number
     */
    public String getNationalIdNumber() {
        return national_id_number;
    }

    /**
     * @param national_id_number the national_id_number to set
     */
    public void setNationalIdNumber(String national_id_number) {
        this.national_id_number = national_id_number;
    }

    /**
     * @return the bornDate
     */
    public Date getBornDate() {
        return bornDate;
    }

    /**
     * @param bornDate the bornDate to set
     */
    public void setBornDate(Date bornDate) {
        this.bornDate = bornDate;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }
    /**
     * @param address the address to set
     */
    public void setAddress(String address){
        this.address = address;
    }
    /**
     * @return the helath_ensurance
     */
    public String getHelathEnsuranceName() {
        return helath_ensurance;
    }
    
    /**
     * @param helath_ensurance the helath_ensurance to set
     */
    public void setHelathEnsurance(String helath_ensurance) {
        this.helath_ensurance = helath_ensurance;
    }
    /**
     * @return the phone_num
     */
    public PhoneNumber getAgentPhone() {
        return phone_num;
    }

    /**
     * @param phone_num the phone_num to set
     */
    public void setAgentPhone(PhoneNumber phone_num) {
        this.phone_num = phone_num;
    }
    /**
     * @return the mail
     */
    public Mail getMail() {
        return mail;
    }

    /**
     * @param mail the mail to set
     */
    public void setMail(Mail mail) {
        this.mail = mail;
    }
    
    /**
     * @return the Country
     */
    public String getCountry() {
        return Country;
    }

    /**
     * @return the State
     */
    public String getState() {
        return State;
    }

    /**
     * @return the Zone
     */
    public String getZone() {
        return Zone;
    }
    
    /**
     * @param Country the Country to set
     * @param State the State to set
     * @param Zone the Zone to set
     */
    public void setGlobalLocation(String Country,String State,String Zone) {
        this.Country = Country;
        this.State = State;
        this.Zone = Zone;
    }

}