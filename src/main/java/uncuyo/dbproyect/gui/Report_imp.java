/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uncuyo.dbproyect.gui;
import java.util.ArrayList;
import java.util.Vector;
import uncuyo.dbproyect.domain.Mail;
import uncuyo.dbproyect.persistence.ReportDAO;
import javax.swing.table.DefaultTableModel;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.common.PDRectangle;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
/**
 *
 * @author Martín
 */
public class Report_imp {
    ReportDAO dao = new ReportDAO();
    
    public String getAgentsReport(DefaultTableModel tablemodel) throws Exception{
        
        Vector<Vector> matrix = tablemodel.getDataVector();
        String text="REPORT: "+dao.currentDate()+"\n";
        for(int i=0;i<tablemodel.getColumnCount();i++){
            text+=tablemodel.getColumnName(i)+"|";
        }
        text += "\n";
        for(Vector vector : matrix){
            for(Object obj : vector){
                text+=obj+"|";
            }
            text += "\n";
        }
        text+="END OF REPORT.\n";
        return text;
    }
    
    public void SaveReport(String report,String path) throws Exception{
        try{
            PDDocument doc = new PDDocument();
            PDPage pag = new PDPage(PDRectangle.A4);
            doc.addPage(pag);
            PDPageContentStream cont = new PDPageContentStream(doc,pag);
            
            String[] rows = report.split("\n");
            cont.beginText();
            cont.setFont(PDType1Font.COURIER_BOLD,14);
            int OffSet=770;
            cont.newLineAtOffset(30,OffSet);
            cont.showText("Martín Cogo App Report");
            cont.newLine();
            cont.newLineAtOffset(0,-30);
            OffSet-=30;
            cont.showText(rows[0]);
            cont.newLine();
            cont.setFont(PDType1Font.COURIER,8);
            for(int i=1;i<(rows.length-1);i++){
                if(OffSet<=60){
                    cont.endText();
                    cont.close();
                    pag = new PDPage(PDRectangle.A4);
                    doc.addPage(pag);
                    cont = new PDPageContentStream(doc,pag);
                    cont.beginText();
                    cont.setFont(PDType1Font.COURIER,8);
                    OffSet=770;
                    cont.newLineAtOffset(30,OffSet);
                }else{
                    OffSet-=15;
                    cont.newLineAtOffset(0, -15);
                }
                if(rows[i].length()>116){
                    cont.showText(rows[i].substring(0, 116));
                    cont.newLine();
                    OffSet-=15;
                    cont.newLineAtOffset(0, -15);
                    cont.showText(rows[i].substring(116, rows[i].length()));
                    cont.newLine();
                }else{
                    cont.showText(rows[i]);
                    cont.newLine();
                }
            }
            cont.newLineAtOffset(0, -20);
            cont.setFont(PDType1Font.COURIER_BOLD,14);
            cont.showText(rows[rows.length-1]);
            cont.endText();
            
            cont.close();
            
            doc.save(path);
            
        }catch(Exception e){
            throw e;
        }
    }
}
