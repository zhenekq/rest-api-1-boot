package com.epam.esm.repository;

import com.epam.esm.dto.CertificateDto;
import com.epam.esm.entity.Certificate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CertificateRepository extends CrudRepository<Certificate, Long> {

}
