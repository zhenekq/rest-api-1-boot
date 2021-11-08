package com.epam.esm.service.impl;

import com.epam.esm.dto.CertificateDto;
import com.epam.esm.entity.Certificate;
import com.epam.esm.entity.Tag;
import com.epam.esm.repository.CertificateRepository;
import com.epam.esm.repository.TagRepository;
import com.epam.esm.service.CertificateService;
import com.epam.esm.util.MappingUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Arrays;
import java.util.Set;

@Service
@Transactional
public class CertificateServiceImpl implements CertificateService {

    private final CertificateRepository certificateRepository;
    private final TagRepository tagRepository;

    @Autowired
    public CertificateServiceImpl(CertificateRepository certificateRepository, TagRepository tagRepository) {
        this.certificateRepository = certificateRepository;
        this.tagRepository = tagRepository;
    }

    private CrudRepository<Certificate, Long> repository;

    @Override
    public void addNewCertificate(CertificateDto certificateDto) {
        Set<Tag> tags = certificateDto.getTags();
        Certificate certificate = MappingUtils.mapToCertificate(certificateDto);
        System.out.println(certificate);
        System.out.println(tags);
        certificateRepository.save(certificate);
        tagRepository.saveAll(tags);
    }

    @Override
    public CertificateDto getCertificateById(int certificateId) {
        return null;
    }
}
