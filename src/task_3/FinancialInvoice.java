package task_3;

import java.util.Date;

public class FinancialInvoice extends Document{
    private double sumForAMonth;
    private int codeOfDepartment;

    public FinancialInvoice() {
    }

    public FinancialInvoice(int number, Date dateDocument, double sumForAMonth, int codeOfDepartment) {
        super(number, dateDocument);
        this.sumForAMonth = sumForAMonth;
        this.codeOfDepartment = codeOfDepartment;
    }

    public double getSumForAMonth() {
        return sumForAMonth;
    }

    public void setSumForAMonth(double sumForAMonth) {
        this.sumForAMonth = sumForAMonth;
    }

    public int getCodeOfDepartment() {
        return codeOfDepartment;
    }

    public void setCodeOfDepartment(int codeOfDepartment) {
        this.codeOfDepartment = codeOfDepartment;
    }

    @Override
    public String toString() {
        return "FinancialInvoice{" +
                "sumForAMonth=" + sumForAMonth +
                ", codeOfDepartment=" + codeOfDepartment +
                "} " + super.toString();
    }

    @Override
    public boolean addDocumentToRegister() {
        for (int i = 0; i < documents.length; i++){
            if (documents[i]==null){
                documents[i] = this;
                return true;
            }
        }
        return false;
    }

    @Override
    public void getDocumentInfo() {
        System.out.println(this.toString());
    }
}
