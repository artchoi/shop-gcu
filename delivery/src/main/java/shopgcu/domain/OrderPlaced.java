package shopgcu.domain;

import shopgcu.domain.*;
import shopgcu.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class OrderPlaced extends AbstractEvent {

    private Long id;
    private Long productId;
    private Integer qty;
    private Long customerId;
}


