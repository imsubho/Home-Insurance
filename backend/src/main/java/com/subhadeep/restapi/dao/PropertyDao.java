package com.subhadeep.restapi.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.subhadeep.restapi.entities.Property;

public interface PropertyDao extends JpaRepository<Property, Long> {

}
