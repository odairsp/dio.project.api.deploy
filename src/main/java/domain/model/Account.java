package domain.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity(name = "tb_account")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String number;
    private String agency;

    @Column(scale = 13, precision = 2)
    private Number balance;
    @Column(name = "additional_limit", scale = 13, precision = 2)
    private Number limit;

}
