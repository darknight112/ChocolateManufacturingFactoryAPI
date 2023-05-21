package com.Hisham.Task3.Reposetory;

import com.Hisham.Task3.Models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public class ProductReposetory extends JpaRepository<Product, Long>  {
}
