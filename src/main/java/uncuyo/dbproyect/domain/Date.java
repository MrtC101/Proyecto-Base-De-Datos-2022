/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uncuyo.dbproyect.domain;
/**
 *
 * @author Martín
 */
public class Date {
    String day;
    String month;
    String year;
    
    public Date(String date) throws FormatException{
        date=date.strip();
        if(date.length()== 8){
            if(date.matches("(([0][1-9])|([1-2][0-9])|([3][0-2]))/(([0][1-9])|([1][0-2]))/(([0][1-9])|([1-9][0-9]))")){
                day = date.substring(0, 2);
                month = date.substring(3, 5);
                year = date.substring(6, 8);
            }else if(date.matches("(([1-9])|([0][1-9])|([1][0-2]))/(([0][1-9])|([1-2][0-9])|([3][0-2]))/(([0][1-9])|([1-9][0-9]))")){
                month = date.substring(0, 2);
                day = date.substring(3, 5);
                year = date.substring(6, 8);
            }else if( date.matches("(([0][1-9])|([1-2][0-9])|([3][0-2]))-(([1-9])|([0][1-9])|([1][0-2]))-(([0][1-9])|([1-9][0-9]))")){
                day = date.substring(0, 2);
                month = date.substring(3, 5);
                year = date.substring(6, 8);
            }else if(date.matches("(([1-9])|([0][1-9])|([1][0-2]))-(([0][1-9])|([1-2][0-9])|([3][0-2]))-(([0][1-9])|([1-9][0-9]))")){
                month = date.substring(0, 2);
                 day = date.substring(3, 5);
                year = date.substring(6, 8);
            }
        }else if(date.length() > 8 && date.length() <= 10){
            if(date.matches("(([0][1-9])|([1-2][0-9])|([3][0-2]))/(([0][1-9])|([1][0-2]))/[1-9]\\d{3}")){
                day = date.substring(0, 2);
                month = date.substring(3, 5);
                year = date.substring(6, 10);
            }else if(date.matches("(([1-9])|([0][1-9])|([1][0-2]))/(([0][1-9])|([1-2][0-9])|([3][0-2]))/[1-9]\\d{3}")){
                month = date.substring(0, 2);
                day = date.substring(3, 5);
                year = date.substring(6, 10);
            }else if( date.matches("(([0][1-9])|([1-2][0-9])|([3][0-2]))-(([1-9])|([0][1-9])|([1][0-2]))-[1-9]\\d{3}")){
                day = date.substring(0, 2);
                month = date.substring(3, 5);
                year = date.substring(6, 10);
            }else if(date.matches("(([1-9])|([0][1-9])|([1][0-2]))-(([0][1-9])|([1-2][0-9])|([3][0-2]))-[1-9]\\d{3}")){
                month = date.substring(0, 2);
                 day = date.substring(3, 5);
                year = date.substring(6, 10);
            }else if(date.matches("[1-9]\\d{3}-(([1-9])|([0][1-9])|([1][0-2]))-(([0][1-9])|([1-2][0-9])|([3][0-2]))")){
                day = date.substring(8, 10);
                month = date.substring(5, 7);
                year = date.substring(0, 4);
            }
        }else{
            throw new FormatException("Date posible formats are DD/MM/YY | DD-MM-YYYY | MM/DD/YY | YYYY-MM-DD");
        }
    }
    
    @Override
    public String toString(){
        return year+"-"+month+"-"+day;
    }
}
