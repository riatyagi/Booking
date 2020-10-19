package com.demo.booking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.booking.dto.BookingReferenceDTO;
import com.demo.booking.dto.RequestContainerDTO;
import com.demo.booking.service.BookingService;

/**
 * <p>
 * BookingController
 * </p>
 * @version 1.0
 * @author Riya Tyagi
 * @since 18-Oct-2020
 */
@RestController
@RequestMapping("/bookings")
public class BookingController
    extends BaseController {

    @Autowired
    BookingService bookingService;

    @PostMapping
    public ResponseEntity<Boolean> checkAvailableBookings( @RequestBody final RequestContainerDTO requestContainerDTO ) {

        try {
            return new ResponseEntity<>( bookingService.checkAvailableBookings( requestContainerDTO ), HttpStatus.OK );
        } catch( Exception e ) {
            e.printStackTrace();
            throw new InternalError( "Sorry there was a problem processing your request." );
        }
    }

    // Assumption:Both the post end-point cannot be same so adding mapping for this one
    @PostMapping(value = "/create")
    public ResponseEntity<BookingReferenceDTO> createBookings( @RequestBody final RequestContainerDTO requestContainerDTO ) {

        try {
            return new ResponseEntity<>( bookingService.createBookings( requestContainerDTO ), HttpStatus.OK );
        } catch( Exception e ) {
            e.printStackTrace();
            throw new InternalError( "Sorry there was a problem processing your request." );
        }
    }
}
