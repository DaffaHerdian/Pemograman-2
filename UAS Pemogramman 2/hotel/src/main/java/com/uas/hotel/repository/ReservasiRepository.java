package com.uas.hotel.repository;

import com.uas.hotel.model.Reservasi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservasiRepository extends JpaRepository<Reservasi, Long> {
}