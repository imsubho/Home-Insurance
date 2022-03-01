package com.subhadeep.restapi.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.subhadeep.restapi.entities.Homeowner;

public interface HomeownerDao extends JpaRepository<Homeowner, Long> {

}
