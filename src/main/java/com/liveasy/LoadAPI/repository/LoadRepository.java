package com.liveasy.LoadAPI.repository;

import com.liveasy.LoadAPI.entity.Load;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface LoadRepository extends JpaRepository<Load, Integer> {

    List<Load> findAllByShipperId(Integer shipperId);
}
