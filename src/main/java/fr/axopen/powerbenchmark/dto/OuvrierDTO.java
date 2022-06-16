package fr.axopen.powerbenchmark.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OuvrierDTO implements Serializable {
    private Long id;
    private Long numero_chantier;
    private Long matricule_user;
    private String matricule;
    private Boolean unbind;
}
