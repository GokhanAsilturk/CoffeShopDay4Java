import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {

    public static void main(String[] args) throws Exception {
     //DateFormat yas = new SimpleDateFormat("");
        //Customer customer = new Customer();
     BaseCustomerManager customerManager = new NeroCustomerManager(new MernisServiceAdapter());
     customerManager.Save(new Customer('1',"Gökhan","Asiltürk",
             "1998","18964889890") );





    }
}
