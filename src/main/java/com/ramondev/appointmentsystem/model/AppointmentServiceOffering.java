package com.ramondev.appointmentsystem.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "appointment_service_offerings")
public class AppointmentServiceOffering {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "appointment_id", nullable = false)
    private Appointment appointment;

    @ManyToOne
    @JoinColumn(name = "service_offering_id", nullable = false)
    private ServiceOffering serviceOffering;

    @Column(name = "price_at_moment")
    private BigDecimal priceAtMoment;

    @Column(name = "created_at")
    private LocalDateTime createdAt = LocalDateTime.now(ZoneId.of("America/Sao_Paulo"));
}
