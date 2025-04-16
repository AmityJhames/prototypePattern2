package prototypePattern2;

class DocumentRegistry {
    private PdfDocument pdfPrototype;
    private TextDocument textDocumentPrototype;
    private SpreadsheetDocument spreadsheetPrototype;

    public DocumentRegistry() {
        this.pdfPrototype = new PdfDocument();
        this.textDocumentPrototype = new TextDocument();
        this.spreadsheetPrototype = new SpreadsheetDocument();
    }

    public Document createPdf(String fileName, String author, int pageCount) {
        PdfDocument pdf = (PdfDocument) pdfPrototype.clone();
        pdf.fileName = fileName;
        pdf.author = author;
        pdf.pageCount = pageCount;
        return pdf;
    }

    public Document createText(String filePath, String encoding, int wordCount) {
        TextDocument text = (TextDocument) textDocumentPrototype.clone();
        text.filePath = filePath;
        text.encoding = encoding;
        text.wordCount = wordCount;
        return text;
    }

    public Document createSpreadsheet(String name, int rows, int columns) {
        SpreadsheetDocument sheet = (SpreadsheetDocument) spreadsheetPrototype.clone();
        sheet.spreadsheetName = name;
        sheet.rowCount = rows;
        sheet.columnCount = columns;
        return sheet;
    }
}