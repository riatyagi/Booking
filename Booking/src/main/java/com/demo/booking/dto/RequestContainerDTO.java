package com.demo.booking.dto;

import com.demo.booking.enums.ContainerType;

import java.security.Timestamp;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

/**
 * <p> RequestContainerDTO
 * </p>
 * @version 1.0
 * @author Riya Tyagi
 * @since 18-Oct-2020
 */
public class RequestContainerDTO {
    private Integer containerSize;
    private ContainerType containerType;
    @Size(min = 5, max = 20)
    private String origin;
    @Size(min = 5, max = 20)
    private String destination;
    @Min(value = 1)
    @Max(value = 100)
    private Integer quantity;
    private Timestamp timestamp;


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
