package task_3;

import java.util.Arrays;
import java.util.Date;

public class ContractSupplyGoods extends Document {

    private String typeOfGoods;
    private int amountOfGoods;

    public ContractSupplyGoods() {
    }

    public ContractSupplyGoods(int number, Date dateDocument, String typeOfGoods, int amountOfGoods) {
        super(number, dateDocument);
        this.typeOfGoods = typeOfGoods;
        this.amountOfGoods = amountOfGoods;
    }

    public String getTypeOfGoods() {
        return typeOfGoods;
    }

    public void setTypeOfGoods(String typeOfGoods) {
        this.typeOfGoods = typeOfGoods;
    }

    public int getAmountOfGoods() {
        return amountOfGoods;
    }

    public void setAmountOfGoods(int amountOfGoods) {
        this.amountOfGoods = amountOfGoods;
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

    @Override
    public String toString() {
        return "ContractSupplyGoods{" +
                "typeOfGoods='" + typeOfGoods + '\'' +
                ", amountOfGoods=" + amountOfGoods +
                "} " + super.toString();
    }




}
