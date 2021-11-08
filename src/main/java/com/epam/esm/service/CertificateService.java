package com.epam.esm.service;

import com.epam.esm.dto.CertificateDto;
import com.epam.esm.entity.Certificate;
import org.springframework.stereotype.Service;

public interface CertificateService {
    void addNewCertificate(CertificateDto certificate);
    CertificateDto getCertificateById(int certificateId);
}
