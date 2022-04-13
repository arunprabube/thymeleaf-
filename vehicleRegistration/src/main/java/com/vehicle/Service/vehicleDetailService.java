package com.vehicle.Service;

import com.vehicle.entity.vehicleDetail;

import java.util.List;

public interface vehicleDetailService {

    List<vehicleDetail> getAllVehicleDetail();

    vehicleDetail saveVehicleDetail(vehicleDetail vehicleDetail);

    vehicleDetail getByVehicleId(int vehicleId);

    vehicleDetail updateVehicleDetail(vehicleDetail vehicleDetail);

    void deleteVehicleId(int vehicleId);



    // List<vehicleDetail> listAll();
}
