package tn.esprit.datacenterproject.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Foyer implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idFoyer;

    String nomFoyer;
    Long capaciteFoyer;


    @OneToOne(mappedBy = "foyer")
    @JsonIgnore
    Universite universite;

    @OneToMany(mappedBy = "foyer")
    @JsonIgnore
    Set<Bloc> blocs;

}
