package com.ahmed.buss;

import java.util.List;

import com.ahmed.buss.entities.Bus;
import com.ahmed.buss.repos.BusRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BussApplicationTests {
    @Autowired
    private BusRepository busRepository;
    @Test
    public void testCreateBus()
    {
    }
    @Test
    public void testFindBus()
    {
        Bus b = busRepository.findById(1L).get();
        System.out.println(b);
    }
    @Test
    public void testUpdateBus()
    {
    }
    @Test
    public void testDeleteProduit()
    {
        busRepository.deleteById(1L);;
    }

    @Test
    public void testListerTousProduits()
    {
        List<Bus> prods = busRepository.findAll();
        for (Bus p:prods)
        {
            System.out.println(p);
        }
    }
}

