package fr.axopen.powerbenchmark.mapper;

import fr.axopen.powerbenchmark.bo.Chef;
import fr.axopen.powerbenchmark.dto.ChefDTO;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface ChefMapper {
    ChefDTO chefToChefDTO(Chef chef);
}
