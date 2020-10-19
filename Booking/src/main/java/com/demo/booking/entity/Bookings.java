package com.demo.booking.entity;

import java.security.Timestamp;

import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import com.demo.booking.enums.ContainerType;

/**
 * <p>
 * Bookings
 * </p>
 * @version 1.0
 * @author Riya Tyagi
 * @since 18-Oct-2020
 */
@Table
public class Bookings {
    /**
     * id - String
     */
    @PrimaryKey
    private String id;
    private Integer containerSize;
    private ContainerType containerType;
    private String origin;

    private String destination;
    private Integer quantity;
    private Timestamp timestamp;


    public String getId() {
        return id;
    }

    public void setId( String id ) {
        this.id = id;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp( Timestamp timestamp ) {
        this.timestamp = timestamp;
    }

    public Integer getContainerSize() {
        return containerSize;
    }

    public void setContainerSize( Integer containerSize ) {
        this.containerSize = containerSize;
    }

    public ContainerType getContainerType() {
        return containerType;
    }

    public void setContainerType( ContainerType containerType ) {
        this.containerType = containerType;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin( String origin ) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination( String destination ) {
        this.destination = destination;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity( Integer quantity ) {
        this.quantity = quantity;
    }

}
