package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.google.zxing.qrcode.encoder.QRCode;
import com.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

}
