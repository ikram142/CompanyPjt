package com.portflio.demo.company.controller;

import com.portflio.demo.model.Company;
import org.junit.Test;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class removeCpmanyTest extends  ACompanyControllerTest {

    @Test
    public void deleteCompany(){
        Company company=new Company();
    doNothing().when(companyService).deleteCompany(company.getId_Company());
		companyController.deleteCompany(company.getId_Company());
    verify(companyService, times(1)).deleteCompany(company.getId_Company());

}}
