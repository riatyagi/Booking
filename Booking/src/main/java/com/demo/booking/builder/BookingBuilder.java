package com.demo.booking.builder;

import com.demo.booking.dto.RequestContainerDTO;
import com.demo.booking.entity.Bookings;

/**
 * <p>
 * BookingBuilder
 * </p>
 * @version 1.0
 * @author Riya Tyagi
 * @since 18-Oct-2020
 */
public class BookingBuilder {

    /**
     * <p>
     * </p>
     * @param requestContainerDTO
     * @return
     */
    public Bookings convertToEntity( final RequestContainerDTO requestContainerDTO ) {
        final Bookings booking = new Bookings();
        booking.setContainerSize( requestContainerDTO.getContainerSize() );
        booking.setContainerType( requestContainerDTO.getContainerType() );
        booking.setDestination( requestContainerDTO.getDestination() );
        booking.setOrigin( requestContainerDTO.getOrigin() );
        booking.setTimestamp( requestContainerDTO.getTimestamp() );
        booking.setQuantity( requestContainerDTO.getQuantity() );
        return booking;
    }

}
