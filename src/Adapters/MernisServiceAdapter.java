package Adapters;

import Abstract.IPersonCheckService;
import Entities.Customer;
import MernisReference.LKKKPSPublicSoap;

public class MernisServiceAdapter implements IPersonCheckService {

    @Override
    public boolean CheckIfRealPerson(Customer customer) throws Exception {
        LKKKPSPublicSoap client = new LKKKPSPublicSoap();
        return client.TCKimlikNoDogrula(customer.getNationalityId(),customer.getFirstname().toUpperCase(),customer.getLastName().toUpperCase(),customer.getDateofBirth());
    }
}
