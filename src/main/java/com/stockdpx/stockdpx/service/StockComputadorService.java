package com.stockdpx.stockdpx.service;

import com.stockdpx.stockdpx.model.Computador;

import java.util.List;

public interface StockComputadorService {
    List<Computador> findAll();
    Computador findById(long id);
    Computador save (Computador computador);
}
