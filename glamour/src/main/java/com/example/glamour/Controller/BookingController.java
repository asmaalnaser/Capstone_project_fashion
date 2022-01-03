package com.example.glamour.Controller;


import com.example.glamour.Model.Entities.Booking;

import com.example.glamour.Model.Services.BookingServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@CrossOrigin
public class BookingController {

    private final BookingServices bookingServices;

    @Autowired


    public BookingController(BookingServices bookingServices) {
        this.bookingServices = bookingServices;
    }

    @GetMapping(path = "api/booking")
    public List<Booking> getBooking() {
        return

                bookingServices.getBookings();
    }


    @GetMapping(path = "{bookingId}")
    public Optional<Booking> getBooking(@PathVariable(name = "bookingId") Integer bookingId) {
        return bookingServices.getBooking(bookingId);

    }

    @PostMapping("/booking/add")
    public void registerNewBooking(@RequestBody Booking booking){
        bookingServices.addNewDBooking(booking);
    }

    @DeleteMapping(path = "delete/booking")
    public void deleteBooking(@PathVariable("bookingId")String bookingId){
        int intbookingId = Integer.parseInt(bookingId);
        bookingServices.deleteBooking(intbookingId);
    }
}

