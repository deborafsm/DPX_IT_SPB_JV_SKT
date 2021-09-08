package com.stockdpx.stockdpx.service.serviceimp;

import com.stockdpx.stockdpx.model.Computador;
import com.stockdpx.stockdpx.repository.StockComputerRepository;
import com.stockdpx.stockdpx.service.StockComputadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class StockComputadorServiceImpl implements StockComputadorService {

    @Autowired
    StockComputerRepository stockComputerRepository;

    @Override
    public List<Computador> findAll(){
        return  stockComputerRepository.findAll();
    }

    @Override
    public Computador findById(long id) {
        return stockComputerRepository.findById(id).get();
    }

    @Override
    public Computador save(Computador computador) {
        return stockComputerRepository.save(computador);
    }



}
