package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.IPersonCheckService;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager  {
     IPersonCheckService personCheckService;

    public StarbucksCustomerManager(IPersonCheckService _personCheckService) {
        this.personCheckService = _personCheckService;
    }

    @Override
    public void Save(Customer customer) throws Exception {
        if (personCheckService.CheckIfRealPerson(customer)) {
            super.Save(customer);
        }
        else{
           System.out.println("no");
        }
    }



}
