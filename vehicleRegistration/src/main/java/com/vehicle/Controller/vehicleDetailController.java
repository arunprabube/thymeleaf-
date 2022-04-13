package com.vehicle.Controller;


import com.vehicle.Service.vehicleDetailService;
import com.vehicle.entity.vehicleDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class vehicleDetailController {

    @Autowired
    private vehicleDetailService vehicleDetailService;



    @RequestMapping("/")
    public String viewHomePage(Model model) {
        List<vehicleDetail> listProducts = vehicleDetailService.getAllVehicleDetail();
        model.addAttribute("listVehicle", listProducts);

        return "index";
    }

    @RequestMapping("/new")
    public String showNewVehiclePage(Model model) {
        vehicleDetail vehicleDetail = new vehicleDetail();
        model.addAttribute("vehicleDetail", vehicleDetail);

        return "new_vehicleDetail";
    }

    @PostMapping("/save")
    public String saveProduct(@ModelAttribute("vehicleDetail") vehicleDetail vehicleDetail) {
        vehicleDetailService.saveVehicleDetail(vehicleDetail);

        return "redirect:/";
    }

    @GetMapping("/vehicle/edit/{id}")
    public String EditVehicleDetail(@PathVariable int vehicleId,@ModelAttribute("vehicle") vehicleDetail vehicleDetail,Model model) {
       model.addAttribute("vehicle",vehicleDetailService.getByVehicleId(vehicleId));
       return "edit_vehicleDetail";
    }

    @PostMapping("/vehicle/{vehicleId}")
    public String updateVehicleId(@PathVariable int vehicleId,@ModelAttribute("vehicle") vehicleDetail vehicleDetail,Model model ){
        vehicleDetail alterVehicle = vehicleDetailService.getByVehicleId(vehicleId);
        alterVehicle.setVehicleId(vehicleId);
        alterVehicle.setRegNo(vehicleDetail.getRegNo());
        alterVehicle.setChassisNo(vehicleDetail.getChassisNo());
        alterVehicle.setOwnerName(vehicleDetail.getOwnerName());
        alterVehicle.setVehicleClass(vehicleDetail.getVehicleClass());
        alterVehicle.setModel(vehicleDetail.getModel());
        alterVehicle.setRegnUpto(vehicleDetail.getRegnUpto());
        alterVehicle.setRegNo(vehicleDetail.getRegNo());
        alterVehicle.setInsuranceUpto(vehicleDetail.getInsuranceUpto());
        alterVehicle.setEmiNorms(vehicleDetail.getEmiNorms());
        alterVehicle.setRegDate(vehicleDetail.getRegDate());
        alterVehicle.setEngineNo(vehicleDetail.getEngineNo());
        alterVehicle.setFuel(vehicleDetail.getFuel());
        alterVehicle.setTaxUpto(vehicleDetail.getTaxUpto());
        alterVehicle.setPuccUpto(vehicleDetail.getPuccUpto());
        alterVehicle.setRcStatus(vehicleDetail.getRcStatus());

        vehicleDetailService.updateVehicleDetail(alterVehicle);
        return "redirect:/";
    }


    @RequestMapping("/delete/{vehicleId}")
    public String deleteProduct(@PathVariable(name = "vehicleId") int vehicleId) {
        vehicleDetailService.deleteVehicleId(vehicleId);
        return "redirect:/";
    }

}
