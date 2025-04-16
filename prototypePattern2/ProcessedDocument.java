package prototypePattern2;

public class ProcessedDocument {

    public static void main(String[] args) {
        DocumentRegistry createFile = new DocumentRegistry();

        Document pdf = createFile.createPdf("annual_report_2024.pdf", "Acme Corp", 150);
        pdf.open();
        ((PdfDocument) pdf).printInfo();

        Document text = createFile.createText("meeting_notes.txt", "UTF-8", 250);
        text.open();
        ((TextDocument) text).printInfo();

        Document sheet = createFile.createSpreadsheet("sales_data_q1.xlsx", 1000, 20);
        sheet.open();
        ((SpreadsheetDocument) sheet).printInfo();

        Document summaryPdf = createFile.createPdf("summary_report.pdf", "Acme Corp", 30);
        summaryPdf.open();
    }
}
