package furama.model.customer;

import furama.util.CustomIdGenerator;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "customer_seq")
        @GenericGenerator(name = "customer_seq", strategy = "furama.util.CustomIdGenerator",
                parameters = {
                        @Parameter(name = CustomIdGenerator.INCREMENT_PARAM, value = "1"),
                        @Parameter(name = CustomIdGenerator.VALUE_PREFIX_PARAMETER, value = "KH-"),
                        @Parameter(name = CustomIdGenerator.NUMBER_FORMAT_PARAMETER, value = "%05d")})
    private String id;

}
