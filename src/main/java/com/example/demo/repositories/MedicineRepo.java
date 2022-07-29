package com.example.demo.repositories;

import com.example.demo.model.Medicine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MedicineRepo extends JpaRepository<Medicine, Long> {
    List<Medicine> findByMedicineNameContainingOrderByMedicineNameAsc(String keyword);
}
