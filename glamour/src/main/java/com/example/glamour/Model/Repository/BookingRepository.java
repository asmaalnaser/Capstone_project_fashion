package com.example.glamour.Model.Repository;

import com.example.glamour.Model.Entities.Booking;
import com.example.glamour.Model.Entities.Designer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface BookingRepository extends JpaRepository<Booking, Integer> {

    }

