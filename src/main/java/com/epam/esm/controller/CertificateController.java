package com.epam.esm.controller;

import com.epam.esm.dto.CertificateDto;
import com.epam.esm.service.impl.CertificateServiceImpl;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/certificates")
public class CertificateController {

    private final CertificateServiceImpl certificateService;

    public CertificateController(CertificateServiceImpl certificateService) {
        this.certificateService = certificateService;
    }


    @PostMapping("/add")
    public String addNewCertificate(@RequestBody CertificateDto certificateDto){
        certificateService.addNewCertificate(certificateDto);
        return "Certificate added";
    }
}
