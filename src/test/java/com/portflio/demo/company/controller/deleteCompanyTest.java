package com.portflio.demo.company.controller;
import com.portflio.demo.model.Company;
import org.junit.Test;
import org.mockito.Mockito;
public class deleteCompanyTest extends ACompanyControllerTest {
    @Test
    public void testDeleteCompany() {
        Company company = new Company();
        Mockito.doNothing().when(companyService).deleteCompany(company.getId_Company());
        companyController.deleteCompany(company.getId_Company());
        Mockito.verify(companyService, Mockito.times(1)).deleteCompany(company.getId_Company());
    }
}
