package com.portflio.demo.model;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Basic(optional = false)
    @Column(name = "ID",unique=true, nullable = false)
    private Long id_Company;
    private String name;
    private Long age;
    private String adress;
    private Long salaries;
    private Date created_at;

}
