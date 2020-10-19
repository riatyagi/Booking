package com.demo.booking.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.client.RestTemplate;

import com.demo.booking.builder.BookingBuilder;
import com.demo.booking.dto.AvailableSpaceResponse;
import com.demo.booking.dto.BookingReferenceDTO;
import com.demo.booking.dto.RequestContainerDTO;
import com.demo.booking.repository.BookingRepository;
import com.demo.booking.service.BookingService;

/**
 * <p>
 * BookingServiceImpl
 * </p>
 * @version 1.0
 * @author Riya Tyagi
 * @since 18-Oct-2020
 */
public class BookingServiceImpl
    implements BookingService {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private BookingRepository bookingRepository;

    @Autowired
    private BookingBuilder bookingBuilder;

    @Value("${booking.url}")
    private String url;

    /**
     * @throws Exception
     * @see com.demo.booking.service.BookingService#checkAvailableBookings(com.demo.booking.dto.RequestContainerDTO)
     */
    @Override
    public Boolean checkAvailableBookings( final RequestContainerDTO requestContainerDTO )
        throws Exception {
        validateInput( requestContainerDTO.getContainerSize() );
        final AvailableSpaceResponse availableSpace = callAvailableBookingService();
        // here I have assumed that the available quantity we want should be greater than available space.
        // if this check is not needed it can be removed
        return requestContainerDTO.getQuantity() >= availableSpace.getAvailableSpace() ? true : false;

    }

    // Note: Throwing generic Exception , here custom exception can also be created and thrown- skipping exception handling part of this assignment
    private void validateInput( final Integer containerSize )
        throws Exception {
        if ( !( containerSize.intValue() == 20 || containerSize.intValue() == 40 ) ) {
            throw new Exception();
        }

    }

    private AvailableSpaceResponse callAvailableBookingService() {
        return restTemplate.getForObject( url, AvailableSpaceResponse.class );

    }

    @Override
    public BookingReferenceDTO createBookings( final RequestContainerDTO requestContainerDTO )
        throws Exception {
        validateInput( requestContainerDTO.getContainerSize() );
        bookingRepository.save( bookingBuilder.convertToEntity( requestContainerDTO ) );
        return null;
    }

}
