package fr.axopen.powerbenchmark.mapper;

import fr.axopen.powerbenchmark.bo.Journal;
import fr.axopen.powerbenchmark.dto.JournalDTO;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface JournalMapper {
    JournalDTO journalToJournalDTO(Journal journal);
}
