package com.portflio.demo.company.Service;

import com.portflio.demo.repository.CompanyRepository;
import com.portflio.demo.service.Impl.CompanyserviceImpl;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;


@RunWith(MockitoJUnitRunner.class)
public abstract class ACompanyService {
    @Mock
     protected CompanyserviceImpl companyservice;
    @Mock
    protected CompanyRepository companyRepository;

    @Before
    public void setUp() {
        companyservice = CompanyserviceImpl.builder().companyRepository(companyRepository).build();

    }
}
