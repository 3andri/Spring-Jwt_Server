package com.andri.service.controller;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.webmvc.RepositoryRestController;

import com.andri.service.model.Alamat;

@RepositoryRestResource(path = "ala")
public interface AlamatRepo extends CrudRepository<Alamat,Integer>{

}
