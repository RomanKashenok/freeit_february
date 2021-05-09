package info.freeit.orders.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
@NoArgsConstructor
public class Order {
    private Long id;
    private String comment;
    private User user;
}
