package com.ramondev.appointmentsystem.repository;

import com.ramondev.appointmentsystem.model.ServiceOffering;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ServiceOfferingRepository extends JpaRepository<ServiceOffering, UUID> {
}
