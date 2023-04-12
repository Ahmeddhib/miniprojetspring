package com.ahmed.buss.service;

import com.ahmed.buss.entities.Bus;
import com.ahmed.buss.repos.BusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.List;

public class BusServiceImpl implements BusService {

    @Autowired
    BusRepository busRepository;

    @Override
    public Bus saveBus(Bus b) {
       return busRepository.save(b);
    }

    @Override
    public Bus updateBus(Bus b) {
        return busRepository.save(b);
    }

    @Override
    public void deleteBus(Bus b) {
        busRepository.delete(b);
    }

    @Override
    public void deleteBusById(Long id) {
        busRepository.deleteById(id);
    }

    @Override
    public Bus getBus(Long id) {
        return busRepository.findById(id).get();
    }

    @Override
    public List<Bus> getAllBuses() {
        return busRepository.findAll();
    }

    @Override
    public Page<Bus> getAllBusParPage(int page, int size) {
        return busRepository.findAll(PageRequest.of(page, size));
    }
}
