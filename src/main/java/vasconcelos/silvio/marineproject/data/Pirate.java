package vasconcelos.silvio.marineproject.data;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "pirate_bounty")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter

public class Pirate {
    @Id
    private String name ;
    private String bounty;
}
