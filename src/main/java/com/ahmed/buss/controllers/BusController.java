package com.ahmed.buss.controllers;

import com.ahmed.buss.entities.Bus;
import com.ahmed.buss.service.BusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BusController {
    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Autowired
     BusService busService;

    @RequestMapping("/showCreate")
    public String showCreate() {
        return "createBus";
    }

    @RequestMapping("/saveBus")
    public String saveProduit(@ModelAttribute("bus") Bus bus,
                              @RequestParam("date") String date,
                              ModelMap modelMap) throws
            ParseException {
//conversion de la date
        SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
        Date dateMisenService = dateformat.parse(String.valueOf(date));
        bus.setDateMiseEnService(dateMisenService);

        Bus saveBus = busService.saveBus(bus);
        String msg = "bus enregistré avec Id " + saveBus.getIdBus();
        modelMap.addAttribute("msg", msg);
        return "redirect:/ListeBus";
    }

    @RequestMapping("/ListeBus")
    public String listeBus(ModelMap modelMap,
                           @RequestParam (name="page",defaultValue = "0") int page,
                           @RequestParam (name="size", defaultValue = "5") int size)
    {
        Page<Bus> bus = busService.getAllBusParPage(page, size);
        modelMap.addAttribute("bus", bus);
        modelMap.addAttribute("pages", new int[bus.getTotalPages()]);
        modelMap.addAttribute("currentPage", page);
        return "listeBus";
    }

    @RequestMapping("/supprimerBus")
    public String supprimerBus(@RequestParam("id") Long id,
                               ModelMap modelMap,
                               @RequestParam (name="page",defaultValue = "0") int page,
                               @RequestParam (name="size", defaultValue = "5") int size)
    {
        busService.deleteBusById(id);
        Page<Bus> bus = busService.getAllBusParPage(page, size);
        modelMap.addAttribute("bus", bus);
        modelMap.addAttribute("pages", new int[bus.getTotalPages()]);
        modelMap.addAttribute("currentPage", page);
        return "listeBus";
    }

    @RequestMapping("/modifierBus")
    public String editerBus(@RequestParam("id") Long id, ModelMap modelMap)
    {
        Bus b = busService.getBus(id);
        modelMap.addAttribute("bus", b);
        return "editerBus";
    }

    @RequestMapping("/updateBus")
    public String updateBus(@ModelAttribute("bus") Bus bus,
                            @RequestParam("date") String date,
                            ModelMap modelMap) throws
            ParseException {
//conversion de la date
        SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
        Date dateMisenService = dateformat.parse(String.valueOf(date));
        bus.setDateMiseEnService(dateMisenService);

        busService.updateBus(bus);
        Page<Bus> buss = busService.getAllBusParPage(0, 5);
        modelMap.addAttribute("bus", bus);
        modelMap.addAttribute("pages", new int[buss.getTotalPages()]);
        modelMap.addAttribute("currentPage", 0);
        return "redirect:/ListeBus";
    }
}
