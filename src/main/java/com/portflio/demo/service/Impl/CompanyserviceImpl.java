package com.portflio.demo.service.Impl;

import com.portflio.demo.model.Company;
import com.portflio.demo.repository.CompanyRepository;
import com.portflio.demo.service.CompanyService;
import lombok.Builder;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Builder
@Setter
@Service
public class CompanyserviceImpl implements CompanyService {

    @Autowired
    CompanyRepository companyRepository;


    @Override
    public List<Company> getAllComapanies() {
        return companyRepository.findAll();
    }
    @Override
    public Company addCompany(Company company)
    {
        return companyRepository.save(company);
    }
    @Override
    public Company updateCompany(Company company) {

        return companyRepository.save(company);
    }

    @Override
    public Optional<Company> getCompanyById(Long idCompany) {
        return companyRepository.findById(idCompany);
    }

    @Override
    public void deleteCompany(Long idCompany) {

       companyRepository.deleteById(idCompany);
    }


}
