package com.vehicle.Repository;

//import com.vechile.entity.vehicleDetail;
import com.vehicle.entity.vehicleDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface vehicleDetailRepository extends JpaRepository<vehicleDetail,Integer> {
   // int delete(int vehicleId);
}
