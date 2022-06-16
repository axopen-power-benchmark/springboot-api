package fr.axopen.powerbenchmark.mapper;

import fr.axopen.powerbenchmark.bo.Depense;
import fr.axopen.powerbenchmark.dto.DepenseDTO;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface DepenseMapper {
    DepenseDTO depenseToDepenseDTO(Depense depense);
}
