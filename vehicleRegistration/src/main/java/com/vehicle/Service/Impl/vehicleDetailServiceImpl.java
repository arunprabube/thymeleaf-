package com.vehicle.Service.Impl;

import com.vehicle.Repository.vehicleDetailRepository;
import com.vehicle.Service.vehicleDetailService;
import com.vehicle.entity.vehicleDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class vehicleDetailServiceImpl implements vehicleDetailService {


    @Autowired
    private vehicleDetailRepository vehicleDetailRepository;

    @Override
    public List<vehicleDetail> getAllVehicleDetail() {
        return vehicleDetailRepository.findAll();
    }

    @Override
    public vehicleDetail saveVehicleDetail(vehicleDetail vehicleDetail) {
        return vehicleDetailRepository.save(vehicleDetail);
    }

    @Override
    public vehicleDetail getByVehicleId(int vehicleId) {
        return vehicleDetailRepository.findById(vehicleId).get();
    }

    @Override
    public vehicleDetail updateVehicleDetail(vehicleDetail vehicleDetail) {
        return vehicleDetailRepository.save(vehicleDetail);
    }

    @Override
    public void deleteVehicleId(int vehicleId) {
        vehicleDetailRepository.deleteById(vehicleId);
    }
}
