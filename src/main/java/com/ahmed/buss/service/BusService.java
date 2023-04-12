package com.ahmed.buss.service;

import com.ahmed.buss.entities.Bus;
import org.springframework.data.domain.Page;

import java.util.List;

public interface BusService {
    Bus saveBus(Bus b);
    Bus updateBus(Bus b);
    void deleteBus(Bus b);
    void deleteBusById(Long id);
    Bus getBus(Long id);
    List<Bus> getAllBuses();
    Page<Bus> getAllBusParPage(int page, int size);
}