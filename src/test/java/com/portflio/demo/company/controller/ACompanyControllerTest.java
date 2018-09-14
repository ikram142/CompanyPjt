package com.portflio.demo.company.controller;

import com.portflio.demo.Controller.CompanyController;
import com.portflio.demo.service.CompanyService;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;



@RunWith(MockitoJUnitRunner.class)
public abstract  class ACompanyControllerTest {
    @Autowired
    CompanyController companyController;
    @Mock
    protected CompanyService companyService;
    @Before
    public void setUp() {
        companyController = new CompanyController(companyService);
    }


}