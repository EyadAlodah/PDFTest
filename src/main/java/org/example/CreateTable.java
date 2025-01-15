//package org.example;
//
//import com.itextpdf.io.font.PdfEncodings;
//import com.itextpdf.kernel.pdf.PdfWriter;
//import com.itextpdf.kernel.pdf.PdfDocument;
//import com.itextpdf.layout.Document;
//import com.itextpdf.layout.element.Paragraph;
//import com.itextpdf.layout.element.Table;
//import com.itextpdf.layout.element.Cell;
//import com.itextpdf.kernel.font.PdfFont;
//import com.itextpdf.kernel.font.PdfFontFactory;
//import com.itextpdf.io.font.constants.StandardFonts;
//import com.itextpdf.layout.property.BaseDirection;
//import com.itextpdf.layout.property.TextAlignment;
//import com.itextpdf.layout.property.VerticalAlignment;
//
//public class CreateTable {
//    public static void main(String[] args) {
//        String dest = "output_arabic.pdf"; // Output file path
//        String fontPath = "src/main/resources/fonts/arabic_font.ttf"; // Ensure correct path to an Arabic-supporting font
//
//        try {
//            PdfWriter writer = new PdfWriter(dest);
//            PdfDocument pdf = new PdfDocument(writer);
//            Document document = new Document(pdf);
//
//            PdfFont font = PdfFontFactory.createFont(fontPath, PdfEncodings.IDENTITY_H, true);
//
//            Table table = new Table(1); // One column
//            table.setTextAlignment(TextAlignment.RIGHT);
//            table.setBaseDirection(BaseDirection.RIGHT_TO_LEFT);
//
//            for (int i = 0; i < 6; i++) {
//                Cell cell = new Cell().add(new Paragraph("علي محمد " + i)
//                        .setFont(font)
//                        .setFontSize(12));
//                cell.setTextAlignment(TextAlignment.RIGHT);
//                cell.setBaseDirection(BaseDirection.RIGHT_TO_LEFT);
//                table.addCell(cell);
//            }
//
//            document.add(table);
//            document.close();
//            System.out.println("PDF with Arabic text created successfully.");
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//}
