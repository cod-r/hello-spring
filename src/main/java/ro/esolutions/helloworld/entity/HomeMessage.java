package ro.codr.helloworld.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class HomeMessage {

    @Id
    @GeneratedValue(generator = "home_message_gen_seq", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "home_message_gen_seq", sequenceName = "home_message_seq", allocationSize = 1)
    private Long id;

    private String message;
}
