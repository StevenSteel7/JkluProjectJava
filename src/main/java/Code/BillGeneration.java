/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code;


import com.itextpdf.kernel.color.Color;
import com.itextpdf.kernel.color.DeviceRgb;
import com.itextpdf.kernel.geom.PageSize;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.border.Border;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.property.TextAlignment;
import com.itextpdf.layout.property.VerticalAlignment;
import java.io.FileNotFoundException;


/**
 *
 * @author surya
 */
public class BillGeneration {
    public static void PdfGeneration(String Name, String InvocieNumber, String MobNumber, String Date, 
            String kNumber , String Rate,String AllowedCapacity, String UnitsConsumed, 
            String ConnectionType, String DueDate, String FinalPrice) throws FileNotFoundException {
        String path = "G:\\Bills\\First.pdf";
        PdfWriter pdfwriter = new PdfWriter(path);
        PdfDocument pdfdocument = new PdfDocument(pdfwriter);
        pdfdocument.addNewPage();
        Document document = new Document(pdfdocument);
        pdfdocument.setDefaultPageSize(PageSize.A4);
        
        float col = 280f;
        float columnwidth[] = {col,col};
        Table table = new Table(columnwidth);
        table.setBackgroundColor(new DeviceRgb(63, 169, 219))
                .setFontColor(Color.WHITE);
        table.addCell(new Cell().add(new Paragraph("INVOICE"))
        .setTextAlignment(TextAlignment.CENTER)
        .setVerticalAlignment(VerticalAlignment.MIDDLE)
        .setMarginTop(30f)
        .setMarginBottom(30f)
        .setFontSize(30f)
        .setBorder(Border.NO_BORDER));
        table.addCell(new Cell().add("ECharge\n# 75 Lenin Street")
        .setTextAlignment(TextAlignment.RIGHT)
        .setMarginTop(30f)
        .setMarginBottom(30)
        .setBorder(Border.NO_BORDER)
        .setMarginRight(10f)
        );
        
        float colWidth[] = {80,300,100,80};
        Table customerInfoTable = new Table(colWidth);
        
        customerInfoTable.addCell(new Cell(0,4)
        .add("Customer Information")
        .setBold());
        
        customerInfoTable.addCell(new Cell().add("Name"));
        customerInfoTable.addCell(new Cell().add(Name));
        customerInfoTable.addCell(new Cell().add("Invoice No."));
        customerInfoTable.addCell(new Cell().add(InvocieNumber));
        
        customerInfoTable.addCell(new Cell().add("Mo. No."));
        customerInfoTable.addCell(new Cell().add(MobNumber));
        customerInfoTable.addCell(new Cell().add("Date:"));
        customerInfoTable.addCell(new Cell().add(Date));
        
        customerInfoTable.addCell(new Cell().add("K ID"));
        customerInfoTable.addCell(new Cell().add(kNumber));
        customerInfoTable.addCell(new Cell().add("Rate"));
        customerInfoTable.addCell(new Cell().add(Rate));
        
        customerInfoTable.addCell(new Cell().add("Capacity"));
        customerInfoTable.addCell(new Cell().add(AllowedCapacity));
        customerInfoTable.addCell(new Cell().add("Units Consumed"));
        customerInfoTable.addCell(new Cell().add(UnitsConsumed));
        
        customerInfoTable.addCell(new Cell().add("Connection Type"));
        customerInfoTable.addCell(new Cell().add(ConnectionType));
        customerInfoTable.addCell(new Cell().add("Due Date:"));
        customerInfoTable.addCell(new Cell().add(DueDate));
        
        Table TotalCharges = new Table(colWidth);
        
        TotalCharges.addCell(new Cell(0,4)
        .add("Total").setBackgroundColor(new DeviceRgb(255, 165, 0))
        .setBold());
        
        TotalCharges.addCell(new Cell().add("Total"));
        TotalCharges.addCell(new Cell().add(FinalPrice));
        
        
        
        document.add(table);
        document.add(new Paragraph("\n"));
        document.add(customerInfoTable);
        document.add(new Paragraph("\n"));
        document.add(TotalCharges);
        document.close();

    }
}
