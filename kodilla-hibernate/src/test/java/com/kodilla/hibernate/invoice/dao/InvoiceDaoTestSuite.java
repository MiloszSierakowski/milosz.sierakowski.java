package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private ProductDao productDao;
    @Autowired
    private ItemDao itemDao;
    @Autowired
    private InvoiceDao invoiceDao;
    private static final String GRA = "Gra: Wiedzmin";
    private static final String OPONY = "Opony do peugeota";
    private static final String INVOICENUMBER = "123456789";

    @Test
    void testProductDaoSave() {
        Product product = new Product(GRA);
        productDao.save(product);
        String name = product.getName();

        List<Product> products = productDao.findByName(name);

        assertEquals(1, products.size());

        int id = products.get(0).getId();
        productDao.deleteById(id);
    }


    @Test
    void testItemDaoSave() {
        Product product = new Product(GRA);
        Item item = new Item(BigDecimal.valueOf(100), 12, BigDecimal.valueOf(1200));
        Item item1 = new Item(BigDecimal.valueOf(20), 5, BigDecimal.valueOf(100));

        product.getItems().add(item);
        product.getItems().add(item1);
        item1.setProduct(product);
        item.setProduct(product);
        productDao.save(product);

        List<Item> items = itemDao.findByProduct(product);

        assertEquals(2, items.size());

        int productId = items.get(0).getProduct().getId();

        productDao.deleteById(productId);

    }


    @Test
    void testInvoiceDaoSave() {
        Product product = new Product(OPONY);
        Product product1 = new Product(GRA);
        Item item = new Item(BigDecimal.valueOf(100), 12, BigDecimal.valueOf(1200));
        Item item1 = new Item(BigDecimal.valueOf(20), 5, BigDecimal.valueOf(100));
        Invoice invoice = new Invoice(INVOICENUMBER);
        invoice.getItems().add(item1);
        invoice.getItems().add(item);

        product.getItems().add(item);
        product1.getItems().add(item1);

        item1.setProduct(product1);
        item.setProduct(product);
        item1.setInvoice(invoice);
        item.setInvoice(invoice);

        invoiceDao.save(invoice);
        List<Item> items = itemDao.findByProduct(product);
        List<Item> items1 = itemDao.findByProduct(product1);

        List<Product> products = productDao.findByName(OPONY);
        List<Product> products1 = productDao.findByName(GRA);

        List<Invoice> invoices = invoiceDao.findByNumber(INVOICENUMBER);

        assertAll(
                () -> assertEquals(1, items.size()),
                () -> assertEquals(1, items1.size()),
                () -> assertEquals(1, products.size()),
                () -> assertEquals(1, products1.size()),
                () -> assertEquals(1, invoices.size())

        );

        int id = items.get(0).getInvoice().getId();
        invoiceDao.deleteById(id);

    }

}
