package com.ramondev.appointmentsystem.repository;

import com.ramondev.appointmentsystem.model.AppointmentServiceOffering;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AppointmentServiceOfferingRepository extends JpaRepository<AppointmentServiceOffering, UUID> {
}
