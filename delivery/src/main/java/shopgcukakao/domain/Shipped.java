package shopgcukakao.domain;

import java.util.*;
import lombok.*;
import shopgcukakao.domain.*;
import shopgcukakao.infra.AbstractEvent;

@Data
@ToString
public class Shipped extends AbstractEvent {

    private Long id;
    private Long orderId;

    public Shipped(Delivery aggregate) {
        super(aggregate);
    }

    public Shipped() {
        super();
    }
}
