package com.tnsif.shoppingmallowner.shopservice;
import com.tnsif.shoppingmallowner.model.Shop;
import java.util.List;

public interface ShopService {
    Shop addShop(Shop shop);
    List<Shop> getAllShops();
    Shop updateShop(Long id, Shop shop);
    void deleteShop(Long id);
}
