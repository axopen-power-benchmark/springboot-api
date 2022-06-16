package fr.axopen.powerbenchmark.mapper;

import fr.axopen.powerbenchmark.bo.Ouvrier;
import fr.axopen.powerbenchmark.dto.OuvrierDTO;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface OuvrierMapper {
    OuvrierDTO ouvrierToOuvrierDTO(Ouvrier ouvrier);
}
