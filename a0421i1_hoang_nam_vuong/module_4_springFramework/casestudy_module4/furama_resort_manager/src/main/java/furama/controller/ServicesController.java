package furama.controller;

import furama.model.service.RentalType;
import furama.model.service.ServiceType;
import furama.model.service.Services;
import furama.service.service.IRentalTypeService;
import furama.service.service.IServiceService;
import furama.service.service.IServiceTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("service")
public class ServicesController {
    @Autowired
    IServiceService serviceService;
    @Autowired
    IServiceTypeService serviceTypeService;
    @Autowired
    IRentalTypeService rentalTypeService;
    @ModelAttribute("serviceTypeList")
    public Iterable<ServiceType> serviceTypeList(){
        return serviceTypeService.findAll();
    }
    @ModelAttribute("rentalTypeList")
    public Iterable<RentalType> rentalTypeList(){
        return rentalTypeService.findAll();
    }
    @GetMapping
    public String showListService(Model model) {
        Iterable<Services> servicesList = serviceService.findAll();
        model.addAttribute("servicesList",servicesList);
        return "service/list";
    }
}
