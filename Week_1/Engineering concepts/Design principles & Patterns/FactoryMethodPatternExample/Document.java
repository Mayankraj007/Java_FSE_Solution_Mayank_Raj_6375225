public interface Document {
    void open();
}

class WordDocument implements Document {
    public void open() {
        System.out.println("Opening a Word document.");
    }
}

class PdfDocument implements Document {
    public void open() {
        System.out.println("Opening a PDF document.");
    }
}

class ExcelDocument implements Document {
    public void open() {
        System.out.println("Opening an Excel document.");
    }
}
