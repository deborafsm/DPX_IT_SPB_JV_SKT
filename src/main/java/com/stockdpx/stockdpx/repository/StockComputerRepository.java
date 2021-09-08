package com.stockdpx.stockdpx.repository;

import com.stockdpx.stockdpx.model.Computador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StockComputerRepository extends JpaRepository<Computador, Long> {

}
