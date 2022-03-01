package com.subhadeep.restapi.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.subhadeep.restapi.entities.Policy;

public interface PolicyDao extends JpaRepository<Policy, Long> {
	List<Policy> findByUsername(String username);

	Policy findByQuotationId(Long quotationId);
}
