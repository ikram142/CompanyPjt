package com.portflio.demo.company.controller;

import com.portflio.demo.model.Company;
import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class addCompanyTest extends ACompanyControllerTest {
        @Test
        public void testAddCompany() {
            Company company = new Company();
            companyController.addCompany(company);
            verify(companyService, times(1)).addCompany((Mockito.any(Company.class)));
        }
}
