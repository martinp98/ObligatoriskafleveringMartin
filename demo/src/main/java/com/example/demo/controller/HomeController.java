package com.example.demo.controller;

import com.example.demo.model.Car;
import com.example.demo.repository.CarRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.context.request.WebRequest;

@Controller
public class HomeController {



    CarRepository carRepository;
    public HomeController(CarRepository carRepository){
        this.carRepository = carRepository;
    }



    @GetMapping("/")
    public String index(Model model)
    {
        model.addAttribute("cars", carRepository.findAll());

        return "index";
    }

    @GetMapping("/create")
    public String create(Model model)
    {
        return "create";
    }

    @PostMapping("/create")
    public String create(WebRequest request)
    {
        String navn = request.getParameter("navn");
        int pris = Integer.parseInt(request.getParameter("hastighed"));

        Car car = new Car(navn, pris);

        carRepository.save(car);

        return "redirect:/";
    }




}
