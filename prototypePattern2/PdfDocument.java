package prototypePattern2;

class PdfDocument implements Document {
    String fileName;
    String author;
    int pageCount;
    String name;

    public PdfDocument() {
        System.out.println("Creating a PDF Document prototype.");
    }

    public PdfDocument(String fileName, String author, int pageCount) {
        this.fileName = fileName;
        this.author = author;
        this.pageCount = pageCount;
    }

    @Override
    public Document clone() {
        return new PdfDocument(fileName, author, pageCount);
    }

    @Override
    public void open() {
        System.out.println("Opening PDF Document: " + fileName + " by " + author + " (" + pageCount + " pages)");
    }

    @Override
    public String getType() {
        return "PDF";
    }

    public void printInfo() {
        System.out.println("Type: " + getType() + ", File: " + fileName + ", Author: " + author + ", Pages: " + pageCount);
    }
}