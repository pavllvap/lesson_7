package task_3;

import java.util.Date;

public class ContractWithEmployee extends Document{

    private Date dateEndOfContract;
    private String name;

    public ContractWithEmployee() {
    }

    public ContractWithEmployee(int number, Date dateDocument, Date dateEndOfContract, String name) {
        super(number, dateDocument);
        this.dateEndOfContract = dateEndOfContract;
        this.name = name;
    }

    public Date getDateEndOfContract() {
        return dateEndOfContract;
    }

    public void setDateEndOfContract(Date dateEndOfContract) {
        this.dateEndOfContract = dateEndOfContract;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ContractWithEmployee{" +
                "dateEndOfContract=" + dateEndOfContract +
                ", name='" + name + '\'' +
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
