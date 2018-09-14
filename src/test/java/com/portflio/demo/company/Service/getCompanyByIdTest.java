package com.portflio.demo.company.Service;

import com.portflio.demo.model.Company;
import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class getCompanyByIdTest extends ACompanyService {
    @Test
    public  void testGetCompanybyId(){

        doReturn(Optional.of(Company.builder().id_Company(1L).build())).when(companyRepository).findById(1l);
        Company mycompany = companyservice.getCompanyById(1L).get();
        assertNotNull(mycompany);
        assertTrue(mycompany.getId_Company() == 1L);
        verify(companyRepository,times(1)).findById(1L);
   }
}
