package org.example;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.*;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;

import com.itextpdf.tool.xml.XMLWorkerHelper;


public class HtmlToPDFs {
    public static void main(String[] args) {
        Document document = new Document();
        try {
            String html = "<html><body>"
                    + "<h1 style='text-align: center;'>مرحبا بالعالم</h1>" // "Hello, World" in Arabic
                    + "<p>هذا مثال على نص عربي في مستند PDF.</p>" // Sample Arabic text in a PDF document.
                    + "</body></html>";

            PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(new File("arabic_example4.pdf")));
            document.open();
            BaseFont bf = BaseFont.createFont("./src/main/resources/fonts/arabic_font.ttf", BaseFont.IDENTITY_H, BaseFont.EMBEDDED);
            Font font = new Font(bf, 12);

            XMLWorkerHelper.getInstance().parseXHtml(writer, document,
                    new ByteArrayInputStream(html.getBytes(Charset.forName("UTF-8"))));
        } catch (DocumentException | IOException e) {
            e.printStackTrace();
        }finally {
            document.close();
        }
    }
}
