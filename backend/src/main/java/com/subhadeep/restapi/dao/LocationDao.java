package com.subhadeep.restapi.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.subhadeep.restapi.entities.Location;

public interface LocationDao extends JpaRepository<Location, Long> {

}
