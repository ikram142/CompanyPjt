package com.portflio.demo.company.Service;

import com.portflio.demo.model.Company;
import org.junit.Test;
import org.springframework.http.MediaType;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.*;


public class getAllCompaniesTest extends ACompanyService {
    @Test
    public void testGetExercices() throws Exception {
        when(companyRepository.findAll()).thenReturn(Arrays.asList(new Company(),new Company()));
        List<Company> cpmanies = companyservice.getAllComapanies();
        assertNotNull(cpmanies);
        assertEquals(2, cpmanies.size());
        verify(companyRepository, times(1)).findAll();
    }

}
