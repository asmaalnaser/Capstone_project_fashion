package com.example.glamour.Controller;
import com.example.glamour.Model.Entities.Booking;
import com.example.glamour.Model.Services.BookingServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "https://glamourasma.herokuapp.com/")
@RestController
@RequestMapping
public class BookingController {

    private BookingServices bookingServices;

    @Autowired
    public BookingController(BookingServices bookingServices) {
        this.bookingServices = bookingServices;
    }




    @GetMapping (path = "/booking")
    public List<Booking> getBooking() {
        return bookingServices.getBookings();
    }


    @GetMapping(path = "booking/{bookingId}")
    public Optional<Booking> getBooking(@PathVariable(name = "bookingId") Integer bookingId) {
        return bookingServices.getBooking(bookingId);

    }

    @PostMapping("booking/add")
    public void registerNewBooking(@RequestBody Booking booking){
        bookingServices.addNewDBooking(booking);
    }


    @DeleteMapping(path = "delete/booking/{bookingId}")
    public void deleteBooking(@PathVariable("bookingId")String bookingId){
        int intbookingId = Integer.parseInt(bookingId);
        bookingServices.deleteBooking(intbookingId);
    }
}

