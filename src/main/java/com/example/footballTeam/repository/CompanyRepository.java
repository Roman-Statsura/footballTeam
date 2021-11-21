package com.example.footballTeam.repository;

import com.example.footballTeam.model.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyRepository extends JpaRepository<Company,Integer>, JpaSpecificationExecutor<Company> {
}
