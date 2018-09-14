package com.portflio.demo.company.Service;

import com.portflio.demo.model.Company;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;



public class addCompanyTest extends ACompanyService
{
    @Test
    public void testAddComapny(){
        Company company=new Company();
        doReturn(company).when(companyRepository).save(company);
        Company mycompnay =companyservice.addCompany(company);
        assertNotNull(mycompnay);
        assertEquals(company.getName(),mycompnay.getName());
        verify(companyRepository,times(1)).save(company);



    }
}
