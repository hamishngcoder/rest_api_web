package com.project.repository;

import java.math.BigInteger;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.model.Consumer;

public interface ConsumerRepository extends JpaRepository<Consumer, Long> {

}
