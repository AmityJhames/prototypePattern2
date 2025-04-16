package prototypePattern2;

class SpreadsheetDocument implements Document {
    String spreadsheetName;
    int rowCount;
    int columnCount;

    public SpreadsheetDocument() {
        System.out.println("Creating a Spreadsheet Document prototype.");
    }

    public SpreadsheetDocument(String spreadsheetName, int rowCount, int columnCount) {
        this.spreadsheetName = spreadsheetName;
        this.rowCount = rowCount;
        this.columnCount = columnCount;
    }

    @Override
    public Document clone() {
        return new SpreadsheetDocument(spreadsheetName, rowCount, columnCount);
    }

    @Override
    public void open() {
        System.out.println("Opening Spreadsheet Document: " + spreadsheetName + " (" + rowCount + " rows, " + columnCount + " columns)");
    }

    @Override
    public String getType() {
        return "Spreadsheet";
    }

    public void printInfo() {
        System.out.println("Type: " + getType() + ", Name: " + spreadsheetName + ", Rows: " + rowCount + ", Columns: " + columnCount);
    }
}