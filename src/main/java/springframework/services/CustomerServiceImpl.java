package springframework.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import springframework.domain.Customer;
import springframework.domain.DomainObject;

import java.math.BigDecimal;
import java.util.*;
@Service
@Profile("map")
public class CustomerServiceImpl extends AbstractMapService implements CustomerService{
    @Override
    public List<DomainObject> listAll() {
        return super.listAll();
    }

    @Override
    public Customer getById(Integer id) {
        return (Customer) super.getById(id);
    }

    @Override
    public Customer saveOrUpdate(Customer domainObject) {
        return (Customer)super.saveOrUpdate(domainObject);
    }

    @Override
    protected void loadDomainObjects() {
        domainMap = new HashMap<>();
        Customer customer1 = new Customer();
        customer1.setFirstName("Sayidbek");
        customer1.setLastName("Komiljonov");
        customer1.setEmail("sayidslaw@gmail.com");
        customer1.setAddressLine1("134040 Getty");
        customer1.setAddressLine2("sjja");
        customer1.setCity("Newcastle");
        customer1.setId(1);
        customer1.setState("WA");
        customer1.setZipCode("98059");
        domainMap.put(1,customer1);

    }

    @Override
    public void delete(Integer id) {
        super.delete(id);
    }
}
