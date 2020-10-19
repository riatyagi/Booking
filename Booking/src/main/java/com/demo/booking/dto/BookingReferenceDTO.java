package com.demo.booking.dto;

import javax.validation.constraints.Min;

public class BookingReferenceDTO {
    @Min(value = 9)
    private String bookingRef;

    public String getBookingRef() {
        return bookingRef;
    }

    public void setBookingRef( String bookingRef ) {
        this.bookingRef = bookingRef;
    }


}
