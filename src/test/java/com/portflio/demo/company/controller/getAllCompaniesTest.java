package com.portflio.demo.company.controller;

import com.portflio.demo.model.Company;
import org.junit.Test;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class getAllCompaniesTest extends ACompanyControllerTest {
    @Test
    public void testGetCompanies() throws IOException {
        when(companyService.getAllComapanies()).thenReturn(Arrays.asList(new Company(), new Company()));
        List<Company> myCompanies = companyController.getAllCompanies();
        assertNotNull(myCompanies);
        assertTrue(myCompanies.size() == 2);
        verify(companyService, times(1)).getAllComapanies();
    }
}
