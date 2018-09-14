package com.portflio.demo.service;

import com.portflio.demo.model.Company;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;



public interface CompanyService {
    public List<Company> getAllComapanies();
    Company addCompany(Company company);

    Company updateCompany(Company company);

    void deleteCompany(Long idCompany);

    Optional<Company> getCompanyById(Long idCompany);
}
