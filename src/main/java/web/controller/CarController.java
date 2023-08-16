package web.controller;

import Model.Car;
import Service.CarService;
import Service.CarServiceImp;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.awt.*;
import java.util.List;

@Controller
public class CarController {
    private final CarService carService = new CarServiceImp();
    @GetMapping(value = "/cars")
    public String getCar(@RequestParam(value = "count", required = false, defaultValue = "5") int count, ModelMap modelMap) {


        List<Car> cars = carService.getCar(count);
        if (count > cars.size()) {
            count = cars.size();
        }

        modelMap.addAttribute("car", cars.subList(0, count));
        return "carReturned";
    }

}
