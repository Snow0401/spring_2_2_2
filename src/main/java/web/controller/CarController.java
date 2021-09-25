package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;
import web.service.CarServiceImp;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class CarController {

    @Autowired
    private CarServiceImp carServiceImp;

    @GetMapping(value = "/cars")
    public String printCars (@RequestParam(value = "count", required = false) Integer count, ModelMap model){
        model.addAttribute("cars", carServiceImp.getCarByCount(count));
        return "cars";

    }

}
