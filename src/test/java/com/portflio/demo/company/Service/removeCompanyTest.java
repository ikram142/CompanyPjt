package com.portflio.demo.company.Service;

import com.portflio.demo.model.Company;
import org.junit.Test;

import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class removeCompanyTest extends ACompanyService
{
    @Test
    public void testdeletecomapny(){
        Company company = Company.builder().id_Company(1L).build();
        doNothing().when(companyRepository).deleteById(1L);
        companyservice.deleteCompany(1L);
        verify(companyRepository, times(1)).deleteById(1L);

    }
}
