package fr.axopen.powerbenchmark.repository;

import fr.axopen.powerbenchmark.bo.Chantier;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.Optional;

@Repository
public interface ChantierRepository extends JpaRepository<Chantier, Long> {

    @Query("SELECT c FROM Chantier c WHERE c.numero = :numero")
    @EntityGraph(
            attributePaths = {"journaux"}
    )
    Optional<Chantier> findByNumero(@Param("numero") Long numero);

    @Modifying
    @Transactional
    @Query("UPDATE Chantier c SET c.description = :description, c.city = :city, c.city_cp = :city_cp, c.date_debut = :date_debut, c.date_fin = :date_fin, c.status = :status, c.lien_sharepoint = :lien_sharepoint, c.lien_files = :lien_files, c.lien_gearth = :lien_gearth, c.prix_moyen_moe_jour = :prix_moyen_moe_jour, c.prix_moyen_moe_nuit = :prix_moyen_moe_nuit, c.prix_moyen_materiel = :prix_moyen_materiel, c.journal_pointage_erp = :journal_pointage_erp WHERE c.numero = :numero")
    int updateChantier(@Param("numero") Long numero, @Param("description") String description, @Param("city") String city, @Param("city_cp") Long city_cp, @Param("date_debut") Date date_debut, @Param("date_fin") Date date_fin, @Param("status") String status, @Param("lien_sharepoint") String lien_sharepoint, @Param("lien_files") String lien_files, @Param("lien_gearth") String lien_gearth, @Param("prix_moyen_moe_jour") Double prix_moyen_moe_jour, @Param("prix_moyen_moe_nuit") Double prix_moyen_moe_nuit, @Param("prix_moyen_materiel") Double prix_moyen_materiel, @Param("journal_pointage_erp") String journal_pointage_erp);

}
