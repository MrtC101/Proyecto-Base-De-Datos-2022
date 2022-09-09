/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uncuyo.dbproyect.domain;

/**
 *
 * @author Martín
 */
public class Mail {
    String prefix;
    String domain;
    
    public Mail(String add) throws FormatException{
        if(add.matches("((([A-Z])|([a-z])|([0-9]))+(([_])|([.])|([-]))?(([A-Z])|([a-z])|([0-9]))+)*@((([A-Z])|([a-z])|([0-9]))+[-]?)+(.[a-z]{2,}+)+")){
            String[] parts = add.split("@");
            prefix = parts[0];    
            domain = parts[1];
        }else{
            throw new FormatException("Mail format is incorrect");
        }
    }
    
    @Override
    public String toString(){
        return prefix+"@"+domain;
    }
}
