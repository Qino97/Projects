package com.loogeoustc.ssh.service;

import org.springframework.transaction.annotation.Transactional;

import com.loogeoustc.ssh.dao.ProductDao;
import com.loogeoustc.ssh.domain.Product;

@Transactional
public class ProductService
{
    //业务层要注入DAO的类
    private ProductDao productDao;
    /**
     * @param productDao the productDao to set
     */
    public void setProductDao(ProductDao productDao)
    {
        this.productDao = productDao;
    }

    public void save(Product product)
    {
        // TODO Auto-generated method stub
        System.out.println("service is executing!");
        productDao.save(product);
    }
    
}
