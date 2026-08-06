package com.ramondev.appointmentsystem.model.enums;

public enum AppointmentStatus {
    PENDING,    // Agendamento criado, aguardando confirmação
    CONFIRMED,  // Agendamento confirmado
    COMPLETED,  // Serviço realizado
    CANCELLED,  // Cancelado
    NO_SHOW     // Cliente não compareceu
}
