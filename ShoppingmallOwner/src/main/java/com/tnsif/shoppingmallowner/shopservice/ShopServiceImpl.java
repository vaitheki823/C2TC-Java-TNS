package com.tnsif.shoppingmallowner.shopservice;

import com.tnsif.shoppingmallowner.model.Shop;
import com.tnsif.shoppingmallowner.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class ShopServiceImpl implements ShopService {
    @Autowired
    private ShopRepository shopRepository;

    @Override
    public Shop addShop(Shop shop) {
        shop.setStatus("Active");
        return shopRepository.save(shop);
    }

    @Override
    public List<Shop> getAllShops() {
        return shopRepository.findAll();
    }

    @Override
    public Shop updateShop(Long id, Shop shopDetails) {
        Shop shop = shopRepository.findById(id).orElse(null);
        if (shop != null) {
            shop.setName(shopDetails.getName());
            shop.setOwnerName(shopDetails.getOwnerName());
            shop.setCategory(shopDetails.getCategory());
            shop.setContactInfo(shopDetails.getContactInfo());
            shop.setStatus(shopDetails.getStatus());
            return shopRepository.save(shop);
        }
        return null;
    }

    @Override
    public void deleteShop(Long id) {
        shopRepository.deleteById(id);
    }

}
