package com.andri.service.Jpa;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import com.andri.service.model.Alamat;

import reactor.core.publisher.Flux;

//@Repository
public interface AlamatRepository2 extends ReactiveCrudRepository<Alamat, Integer> {
	Flux<Alamat> findAll(Pageable pageable);

	Flux<Alamat> findAll();
}