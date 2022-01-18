package com.example.glamour.Model.Services;
import com.example.glamour.Model.Entities.Booking;
import com.example.glamour.Model.Repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class BookingServices {


    private BookingRepository bookingRepository;

    @Autowired
    public BookingServices(BookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
    }


    public List<Booking> getBookings() {
        return bookingRepository.findAll();

    }

    public Optional<Booking> getBooking(Integer bookingId) {
        return bookingRepository.findById(bookingId);

    }
    public void addNewDBooking(Booking booking) {
        bookingRepository.save(booking);
    }
//    public void deleteBooking(Integer bookingId){
//        bookingRepository.deleteById(bookingId);
//    }

}
