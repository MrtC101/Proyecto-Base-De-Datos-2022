/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uncuyo.dbproyect.OLDgui;
import uncuyo.dbproyect.domain.Mail;
import uncuyo.dbproyect.persistence.ReportDAO;
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
    
    public String getAgentsReport() throws Exception{
        try{
            String text ="REPORT: "+dao.currentDate()+"\n"
            + "Number of Agents: "+dao.NumberOfAgents()+"\n"
            + "Number of Students: "+dao.NumberOfRole("Student")+"\n"
            + "Number of Coaching Teachers: "+dao.NumberOfRole("Coaching Teacher")+"\n"
            + "Number of Teachers: "+dao.NumberOfRole("Teacher")+"\n"
            + "Number of Administratives: "+dao.NumberOfRole("Administrative")+"\n"
            + "Number of Concierges: "+dao.NumberOfRole("Concierge")+"\n"
            + "Number of Supervisors: "+dao.NumberOfRole("Supervisor")+"\n"
            + "Number of Teacher Supervisors: "+dao.NumberOfRole("Teacher Supervisor")+"\n"
            
            + "END OF REPORT.\n";
            return text;
        }catch(Exception e){
            throw e;
        }
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
            cont.newLineAtOffset(30, 770);
            cont.showText("Martín Cogo App Report");
            cont.newLine();
             cont.newLineAtOffset(0,-30);
            cont.showText(rows[0]);
            cont.newLine();
            cont.setFont(PDType1Font.COURIER,8);
            for(int i=1;i<(rows.length-1);i++){
                cont.newLineAtOffset(0, -15);
                cont.showText(rows[i]);
                cont.newLine();    
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
