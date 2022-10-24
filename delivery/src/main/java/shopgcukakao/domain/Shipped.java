package shopgcukakao.domain;

import shopgcukakao.domain.*;
import shopgcukakao.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class Shipped extends AbstractEvent {

    private Long id;
    private Long orderId;

    public Shipped(Delivery aggregate){
        super(aggregate);
    }
    public Shipped(){
        super();
    }
}
