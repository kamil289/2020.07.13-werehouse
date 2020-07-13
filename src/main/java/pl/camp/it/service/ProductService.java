package pl.camp.it.service;

import java.util.Date;

public class ProductService {

    public void generateProduct(String categoryName,String productsName, int iloscSztuk, int kodKreskowy){

        Customer customer = new Customer();
        customer.setName(name);
        customer.setSurname(surname);
        customer.setPesel(Long.parseLong(pesel));

        Addres addres = new Addres();
        addres.setCity(RandomDataService.generateCity());
        addres.setStreet(RandomDataService.generateStreet());

        customer.setAddres(addres);

        Invoice invoice = new Invoice();
        invoice.setDate(new Date());
        invoice.setSignature(RandomDataService.generationInvoiceSignature());

        customer.getInvoices().add(invoice);

        Product product = new Product();
        product.setName(RandomDataService.generateProdactName());
        product.setPrice(RandomDataService.generateProductPrice());

        product.getCustomer().add(customer);
        customer.getProducts().add(product);

        customerDAO.saveCustomerToDatabase(customer);


    }
}
