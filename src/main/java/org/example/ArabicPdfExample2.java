package org.example;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import java.io.FileOutputStream;
import java.io.IOException;

public class ArabicPdfExample2 {
    public static void main(String[] args) {
        Document document = new Document();
        try {
            PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("arabic_example3.pdf"));
            document.open();

            // Use a font that supports Arabic glyphs
            BaseFont bf = BaseFont.createFont("./src/main/resources/fonts/arabic_font.ttf", BaseFont.IDENTITY_H, BaseFont.EMBEDDED);
            Font font = new Font(bf, 12);

            // Create a table with 1 column
            PdfPTable table = new PdfPTable(1);
            table.setRunDirection(PdfWriter.RUN_DIRECTION_RTL);

            // Create a cell that contains Arabic text
            PdfPCell cell = new PdfPCell(new Paragraph("السعر الإجمالي", font));
            table.addCell(cell);
                //test
            // Add another cell
            cell = new PdfPCell(new Paragraph("تفاصيل الفاتورة", font));
            table.addCell(cell);

            // Add the table to the document
            document.add(table);
            document.close();
            writer.close();
        } catch (DocumentException | IOException e) {
            e.printStackTrace();
        }
    }
}
