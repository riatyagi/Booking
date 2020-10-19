package com.demo.booking.service;

import com.demo.booking.dto.BookingReferenceDTO;
import com.demo.booking.dto.RequestContainerDTO;

/**
 * <p>
 * BookingService
 * </p>
 * @version 1.0
 * @author Riya Tyagi
 * @since 18-Oct-2020
 */
public interface BookingService {
    /**
     * <p>
     * </p>
     * @param requestContainerDTO
     * @return boolean
     * @throws Exception
     */
    Boolean checkAvailableBookings( RequestContainerDTO requestContainerDTO )
        throws Exception;

    /**
     * <p>
     * </p>
     * @param requestContainerDTO
     * @return BookingReferenceDTO({@link BookingReferenceDTO}
     * @throws Exception
     */
    BookingReferenceDTO createBookings( RequestContainerDTO requestContainerDTO )
        throws Exception;

}

