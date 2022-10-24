package shopgcukakao.domain;

import shopgcukakao.domain.*;
import shopgcukakao.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class OrderPlaced extends AbstractEvent {

    private Long id;
    private Long productId;
    private Integer qty;
    private Long orderId;
}


