package fr.axopen.powerbenchmark.mapper;

import fr.axopen.powerbenchmark.bo.Chantier;
import fr.axopen.powerbenchmark.dto.ChantierDTO;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface ChantierMapper {
    ChantierDTO chantierToChantierDTO(Chantier chantier);
}
