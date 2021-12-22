package com.example.glamour.Model.Repository;

import com.example.glamour.Model.Entities.Designer;
import com.example.glamour.Model.Entities.Details;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetailsRepository extends JpaRepository<Details, Integer> {
}
