package shopgcukakao.domain;

import java.util.*;
import lombok.*;
import shopgcukakao.domain.*;
import shopgcukakao.infra.AbstractEvent;

@Data
@ToString
public class OrderPlaced extends AbstractEvent {

    private Long id;
    private Long productId;
    private Integer qty;
    private Long orderId;

    public OrderPlaced(Order aggregate) {
        super(aggregate);
    }

    public OrderPlaced() {
        super();
    }
}
