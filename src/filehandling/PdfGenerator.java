package filehandling;


import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class PdfGenerator {
    public static void main(String[] args) {
        String filePath = "/home/madhuri/workspace/2021/JavaFullStack13DecBatch/src/filehandling/PdfTest.pdf";
        Document document = new Document();
        try {
            PdfWriter.getInstance(document, new FileOutputStream(filePath));
            document.open();
            Paragraph paragraph = new Paragraph("Pdf file generated successfully");
            paragraph.setAlignment(Element.ALIGN_RIGHT);
            document.add(paragraph);
            document.close();
        } catch (DocumentException e) {
            throw new RuntimeException(e);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
