package task_3;

import java.util.Arrays;
import java.util.Date;

public class Test {
    public static void main(String[] args) {

        Document document1 = new ContractSupplyGoods(1, new Date(), "Notebook", 10);
        Document document2 = new ContractWithEmployee(2, new Date(), new Date(), "Alex");
        Document document3 = new FinancialInvoice(3, new Date(), 150065.564, 14);
        document1.addDocumentToRegister();
        document1.getDocumentInfo();
        document2.addDocumentToRegister();
        document2.getDocumentInfo();
        document3.addDocumentToRegister();
        document3.getDocumentInfo();
        System.out.println(Arrays.toString(RegisterAddable.documents));

    }


}
