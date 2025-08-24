package com.tnsif.shoppingmallowner.repository;
import com.tnsif.shoppingmallowner.model.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShopRepository extends JpaRepository<Shop, Long>{

}
