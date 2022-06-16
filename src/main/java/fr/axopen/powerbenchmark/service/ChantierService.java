package fr.axopen.powerbenchmark.service;

import fr.axopen.powerbenchmark.bo.Chantier;
import fr.axopen.powerbenchmark.dto.ChantierDTO;
import fr.axopen.powerbenchmark.mapper.ChantierMapper;
import fr.axopen.powerbenchmark.repository.ChantierRepository;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Optional;
import java.util.Random;


@Service
public class ChantierService {
    private final ChantierRepository chantierRepository;
    private final ChantierMapper chantierMapper;

    public ChantierService(ChantierRepository chantierRepository, ChantierMapper chantierMapper) {
        this.chantierRepository = chantierRepository;
        this.chantierMapper = chantierMapper;
    }

    public ChantierDTO getRandomChantier() {
        Long id = getRandomLong(0, 999);

        Optional<Chantier> optionalChantier = this.chantierRepository.findByNumero(id);
        if (optionalChantier.isPresent()) {
            return this.chantierMapper.chantierToChantierDTO(optionalChantier.get());
        }
        throw new IllegalArgumentException("Id inconnu");
    }

    public void randomUpdate() {
        Long id = getRandomLong(0, 999);

        Chantier chantier = new Chantier();

        chantier.setNumero(id);
        chantier.setDescription(this.getRandomString(12));
        chantier.setCity(this.getRandomString(12));
        chantier.setCity_cp(this.getRandomLong(0, 99999));
        chantier.setDate_debut(this.getRandomDate(0, 2000000000));
        chantier.setDate_fin(this.getRandomDate(0, 2000000000));
        chantier.setStatus(this.getRandomString(12));
        chantier.setLien_sharepoint(this.getRandomString(12));
        chantier.setLien_files(this.getRandomString(12));
        chantier.setLien_gearth(this.getRandomString(12));
        chantier.setPrix_moyen_moe_jour((double) this.getRandomInteger(0, 100));
        chantier.setPrix_moyen_moe_nuit((double) this.getRandomInteger(0, 100));
        chantier.setPrix_moyen_materiel((double) this.getRandomInteger(0, 100));
        chantier.setJournal_pointage_erp(this.getRandomString(12));

        this.chantierRepository.updateChantier(chantier.getNumero(), chantier.getDescription(), chantier.getCity(), chantier.getCity_cp(), chantier.getDate_debut(), chantier.getDate_fin(), chantier.getStatus(), chantier.getLien_sharepoint(), chantier.getLien_files(), chantier.getLien_gearth(), chantier.getPrix_moyen_moe_jour(), chantier.getPrix_moyen_moe_nuit(), chantier.getPrix_moyen_materiel(), chantier.getJournal_pointage_erp());
    }

    private Date getRandomDate(int min, int max) {
        return new Date(this.getRandomInteger(min, max)); // int pas assez grand
    }
    private Long getRandomLong(int min, int max) {
        return (long) this.getRandomInteger(min, max);
    }

    private Integer getRandomInteger(int min, int max) {
        Random rand = new Random();
        return (rand.nextInt(max - min) + min);
    }

    private String getRandomString(Integer size) {
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        int numChars = chars.length();


        StringBuilder result = new StringBuilder();
        for (int i = 0; i < size; ++i) {
            result.append(chars.charAt(this.getRandomInteger(0, numChars)));
        }

        return result.toString();
    }
}
