package com.demo.booking.repository;

import org.springframework.data.cassandra.repository.CassandraRepository;

import com.demo.booking.entity.Bookings;

/**
 * <p>
 * BookingRepository
 * </p>
 * @version 1.0
 * @author Riya Tyagi
 * @since 18-Oct-2020
 */
public interface BookingRepository
    extends CassandraRepository<Bookings, String> {

}

