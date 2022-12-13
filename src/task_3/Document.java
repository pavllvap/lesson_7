package task_3;

import java.util.Date;


public abstract class Document implements RegisterAddable {

    private int number;
    private Date dateDocument;

    public Document() {
    }

    public Document(int number, Date dateDocument) {
        this.number = number;
        this.dateDocument = dateDocument;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Date getDateDocument() {
        return dateDocument;
    }

    public void setDateDocument(Date dateDocument) {
        this.dateDocument = dateDocument;
    }

    @Override
    public String toString() {
        return "Document{" +
                "number=" + number +
                ", dateDocument=" + dateDocument +
                '}';
    }

    @Override
    public abstract boolean addDocumentToRegister();


    @Override
    public abstract void getDocumentInfo();

}
