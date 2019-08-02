package service;
import dao.CustomerDao;
import domain.Customer;
import domain.PageBean;
import cn.itcast.commons.CommonUtils;
public class CustomerService {
    CustomerDao customerDao=new CustomerDao();

    public void add(Customer customer)
    {
        customerDao.add(customer);
    }
    public PageBean<Customer> findAll(int pc,int pr)
    {
        return customerDao.findAll(pc,pr);
    }
    public Customer find(String id)
    {
        return customerDao.find(id);
    }
    public void edit(Customer customer)
    {
        customerDao.edit(customer);
    }
    public void delete(String id)
    {
        customerDao.delete(id);
    }

    public  void batchAdd(){
        for (int i=0;i<100;++i)
        {
            Customer customer=new Customer();
            customer.setId(CommonUtils.uuid());
            customer.setName("customer"+i);
            customer.setGender(i%2==0?"male":"female");
            customer.setPhone("13476"+i);
            customer.setEmail("customer"+i+"@163.com");
            customer.setDescription("hello world");
            customerDao.add(customer);
        }

    }
    public PageBean<Customer> query(Customer customer,int pc,int pr)
    {
        return customerDao.query(customer,pc,pr);
    }
}
