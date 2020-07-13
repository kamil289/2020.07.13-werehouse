package pl.camp.it.service;

import pl.camp.it.model.Category;
import pl.camp.it.model.Products;

public class CategoryService {


    public void generateAndSaveCategory(String categoryName) {

        Category category = new Category();
        category.setCategoryName(categoryName);
        category.setDelate(1);

        Products products = new Products();
        products.setCity(RandomDataService.generateCity());
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
