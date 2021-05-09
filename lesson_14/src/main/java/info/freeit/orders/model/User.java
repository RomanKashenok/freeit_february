package info.freeit.orders.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@ToString
@Getter @Setter
@NoArgsConstructor
public class User {

    private Long id;
    private String name;
    private boolean isActive;
    private Date created;



}
