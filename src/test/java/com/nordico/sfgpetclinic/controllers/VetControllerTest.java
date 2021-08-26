package com.nordico.sfgpetclinic.controllers;

import com.nordico.controllers.VetController;
import com.nordico.sfgpetclinic.ControllerTests;
import com.nordico.fauxspring.Model;
import com.nordico.fauxspring.ModelAndView;
import com.nordico.model.Speciality;
import com.nordico.model.Vet;
import com.nordico.services.VetService;
import com.nordico.services.map.SpecialityMapService;
import com.nordico.services.map.VetMapService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*
    Author: jalnor
    Date: 7/21/2021 9:43 PM
    Project: guru.springframework.sfgpetclinic.controllers
*/
class VetControllerTest implements ControllerTests {

    // Declare Service Maps
    SpecialityMapService specialityMapService;
    VetService service;

    // Declare Vets
    Vet vet1, vet2;

    // Declare Set of specialties
    Set<Speciality> specialties = new HashSet<>();

    // Declare a VetController for testing
    VetController controller;

    Model model = new ModelAndView();

    List<Object> list = new ArrayList<>();

    @BeforeEach
    void setUp() {

        // Initialize specialtyMapService and then vetMapService
        specialityMapService = new SpecialityMapService();
        service = new VetMapService(specialityMapService);

        // Add specialties
        specialties.add(new Speciality("Trimmer"));
        specialties.add(new Speciality("Bather"));

        // Initialize Vets
        vet1 = new Vet(1L, "John", "Doe", specialties);
        vet2 = new Vet(2L, "Angela", "Doine", specialties);

        // Save vets to service
        service.save(vet1);
        service.save(vet2);

        // Initialize controller
        controller = new VetController(service);

    }

    @Test
    void listVets() {
        // Test that listVets method returns String
        assertEquals("vets/index", controller.listVets(model));

        // Test that vets were added to model
        assertEquals(service.findAll(), model.getMapObject("vets"));

    }
}