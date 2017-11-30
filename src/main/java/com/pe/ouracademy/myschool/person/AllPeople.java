package com.pe.ouracademy.myschool.person;

import org.springframework.stereotype.Repository;

import com.pe.ouracademy.myschool.common.CRUDRepository;

@Repository
public interface AllPeople extends CRUDRepository<Person, Long> {
}
