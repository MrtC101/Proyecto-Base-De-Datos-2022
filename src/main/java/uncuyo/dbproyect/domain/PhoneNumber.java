/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uncuyo.dbproyect.domain;

/**
 *
 * @author Martín
 */
public class PhoneNumber {
    String countryCode;
    String prefix;
    String subfix;
    
    public PhoneNumber(String num) throws FormatException{
        if(num.matches("\\+[0-9][0-9]?[0-9]?[ ]?[0-9][0-9]?[0-9]?[ ]?[0-9]{3}(([-])|([ ]))?[0-9]{4}")){
            int size=num.length();
            String[] numParts = num.split(" ");
            switch(numParts.length){
                case 4:
                    countryCode=numParts[0]+numParts[1];
                    prefix = numParts[2];
                    subfix = numParts[3];
                    break;
                case 3:
                    if(num.contains("-")){
                        countryCode=numParts[0]+numParts[1];
                        String[] fixes = numParts[2].split("-");
                        prefix = fixes[0];
                        subfix = fixes[1];    
                    }else{
                        int subfixlen = numParts[2].length();
                        int middlelen = numParts[1].length();
                        int codelen = numParts[0].length();
                        if(subfixlen==4){
                            if(middlelen == 3){
                                countryCode=numParts[0];
                                prefix = numParts[1];
                                subfix = numParts[2];
                            }else{
                                countryCode = numParts[0]+numParts[1].substring(0, middlelen-3);
                                prefix =  numParts[1].substring(middlelen-3, middlelen);
                                subfix = numParts[2];
                            }
                        }else{
                            countryCode=numParts[0] + numParts[1];
                            subfix = numParts[2].substring(subfixlen-4,subfixlen);
                            prefix= numParts[2].substring(0,subfixlen-4);
                            }
                    }
                    break;
                case 2:
                    if(num.contains("-")){
                        if(numParts[1].length()>8){
                            countryCode=numParts[0];
                            int numslen = numParts.length;
                            String codefixes = numParts[1].substring(numslen-8, numslen);
                            String splitedCode =numParts[1].substring(0 , numslen-8);
                            countryCode = countryCode + splitedCode;
                            String[] fixes = codefixes.split("-");
                            prefix=fixes[0];
                            subfix=fixes[1];
                        }else{
                            countryCode=numParts[0];
                            String[] fixes = numParts[1].split("-");
                            prefix=fixes[0];
                            subfix=fixes[1];
                        }
                    }else{
                        int subfixlen = numParts[1].length();
                        int codelen = numParts[0].length();
                        switch(subfixlen){
                            case 4:
                                subfix = numParts[1];
                                countryCode= numParts[0].substring(0,codelen-3);
                                prefix= numParts[0].substring(codelen-3,codelen);
                                break;
                            case 7:
                                countryCode= numParts[0];
                                subfix = numParts[1].substring(subfixlen-4,subfixlen);
                                prefix= numParts[1].substring(0,subfixlen-4);
                                break;
                            default:
                                subfix = numParts[1].substring(subfixlen-4,subfixlen);
                                prefix= numParts[1].substring(subfixlen-7,subfixlen-4);
                                countryCode= numParts[0] + numParts[1].substring(0,subfixlen-7);
                                break;
                        }
                    }
                    break;
                case 1:
                    prefix=num.substring(size-4, size);
                    subfix = num.substring(size-8, size-5);
                    countryCode = num.substring(0,size-8);
                    break;
            }
      }else{
            throw new FormatException("Phone format is +54 9 555-9999");
        }
    }
    
    @Override
    public String toString(){
        return countryCode+" "+prefix+"-"+subfix;
    }
}
