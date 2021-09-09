package com.andri.service.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.andri.service.Jpa.AlamatRepository;
import com.andri.service.Jpa.AlamatRepository2;
import com.andri.service.model.Alamat;

import reactor.core.publisher.Flux;

@RestController
@RequestMapping(path = "/api/v1")
public class AlamatController {
	@Autowired
	AlamatRepository alamat;
	//@Autowired
	AlamatRepository2 alamat2;
	

	@GetMapping("/alamat/{page}")
	List<Alamat> getAlamat(@PathVariable int page) {
		Pageable secondPageWithFiveElements = PageRequest.of(page, 10000);
		return alamat.findAll(secondPageWithFiveElements).getContent();
	}

	@GetMapping("/alamat2/{page}")
	Flux<Alamat> getAlamat2(@PathVariable int page) {
		Pageable secondPageWithFiveElements = PageRequest.of(page, 10000);
		return alamat2.findAll(secondPageWithFiveElements);
	}
}
