package com.portflio.demo.Controller;


import com.portflio.demo.model.Company;
import com.portflio.demo.service.CompanyService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@AllArgsConstructor
@RestController
public class CompanyController {

    @Autowired
    CompanyService companyService;
        @GetMapping(value = "/companies")
    public List<Company> getAllCompanies(){
        return  companyService.getAllComapanies();
    }
    @PostMapping(path = "/company")
    public Company addCompany(@RequestBody Company company) {
        return companyService.addCompany(company);
    }

    @PutMapping(path = "/companies")
    public Company updateCompany(@RequestBody Company company) {

        return companyService.updateCompany(company);
    }

    @GetMapping(path = "/companies/{idCompany}")
    public Optional<Company> getCompanyById(@PathVariable Long idCompany) {
        return companyService.getCompanyById(idCompany);
    }

    @DeleteMapping(path = "/companys/{idCompany}")
    public void deleteCompany(@PathVariable Long idCompany) {
        companyService.deleteCompany(idCompany);
    }

    

}
