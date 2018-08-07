package com.photo.web.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.photo.web.domain.Home;

@Repository
public interface HomeRepository extends CrudRepository<Home, Integer>{

}
