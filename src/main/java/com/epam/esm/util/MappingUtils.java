package com.epam.esm.util;

import com.epam.esm.dto.CertificateDto;
import com.epam.esm.entity.Certificate;

import java.util.ArrayList;
import java.util.List;

public class MappingUtils {

    private MappingUtils() {
    }

    public static CertificateDto mapToCertificateDto(Certificate certificate) {
        CertificateDto dto = new CertificateDto();

        dto.setId(certificate.getId());
        dto.setName(certificate.getName());
        dto.setDescription(certificate.getDescription());
        dto.setPrice(certificate.getPrice());
        dto.setDuration(certificate.getDuration());
        dto.setCreateDate(certificate.getCreateDate());
        dto.setLastUpdateDate(certificate.getLastUpdateDate());

        return dto;
    }

    public static Certificate mapToCertificate(CertificateDto dto) {
        Certificate certificate = new Certificate();

        certificate.setId(dto.getId());
        certificate.setName(dto.getName());
        certificate.setDescription(dto.getDescription());
        certificate.setPrice(dto.getPrice());
        certificate.setDuration(dto.getDuration());
        certificate.setCreateDate(dto.getCreateDate());
        certificate.setLastUpdateDate(dto.getLastUpdateDate());

        return certificate;
    }

    public static List<CertificateDto> mapToListCertificateDto(List<Certificate> list) {
        List<CertificateDto> certificatesDto = new ArrayList<>();
        list.forEach((el) -> certificatesDto.add(MappingUtils.mapToCertificateDto(el)));
        return certificatesDto;
    }

}
