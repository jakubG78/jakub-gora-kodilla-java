package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave() {
        //Given
        Product railTracks = new Product("Rail Tracks");
        Product railScrews = new Product("Rail Screws");
        Product railSupports = new Product("Rail Supports");

        Item firstItem = new Item(new BigDecimal(2000), 150, new BigDecimal(300000));
        Item secondItem = new Item(new BigDecimal(300), 10, new BigDecimal(3000));
        Item thirdItem = new Item(new BigDecimal(50000), 4, new BigDecimal(200000));

        Invoice invoice = new Invoice("FV04/2020");

        railTracks.getItems().add(firstItem);
        railScrews.getItems().add(secondItem);
        railSupports.getItems().add(thirdItem);
        firstItem.setProduct(railTracks);
        secondItem.setProduct(railScrews);
        thirdItem.setProduct(railSupports);
        invoice.getItems().add(firstItem);
        invoice.getItems().add(secondItem);
        invoice.getItems().add(thirdItem);
        firstItem.setInvoice(invoice);
        secondItem.setInvoice(invoice);
        thirdItem.setInvoice(invoice);

        //When
        invoiceDao.save(invoice);
        int invoiceId = invoice.getId();

        //Then
        Assert.assertNotEquals(0, invoiceId);

        //CleanUp
        invoiceDao.deleteById(invoiceId);
    }
}
