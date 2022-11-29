package com.codeup.weywotspringblog.repositories;

import com.codeup.weywotspringblog.models.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SupplierRepository extends JpaRepository<Supplier, Long> {
    Supplier findById(long id);
}
