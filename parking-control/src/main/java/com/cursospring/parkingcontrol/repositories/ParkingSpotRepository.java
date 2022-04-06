package com.cursospring.parkingcontrol.repositories;

import com.cursospring.parkingcontrol.models.ParkingSpotModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ParkingSpotRepository extends JpaRepository<ParkingSpotModel, UUID> {
//  validar existencia do N° Placa no Condominio
    boolean existsByLicensePlateCar(String licensePlateCar);
//  validar existencia do N° da vaga
    boolean existsByParkingSpotNumber(String parkingSpotNumber);
//  validar existencia de Registro para esse APTO ou BLOCO
    boolean existsByApartmentAndBlock(String apartment, String block);

}


