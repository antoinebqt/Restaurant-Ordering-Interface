package fr.teama.bff.controllers.dto;

import java.time.LocalDateTime;
import java.util.UUID;

public class OrderInformationDTO {
    public UUID tableOrderId;
    public long orderId;
    public LocalDateTime shouldBeReadyAt;

    public OrderInformationDTO() {
    }

    public OrderInformationDTO(UUID tableOrderId, long orderId, LocalDateTime shouldBeReadyAt) {
        this.tableOrderId = tableOrderId;
        this.orderId = orderId;
    }

    public UUID getTableOrderId() {
        return tableOrderId;
    }

    public void setTableOrderId(UUID tableOrderId) {
        this.tableOrderId = tableOrderId;
    }

    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public LocalDateTime getShouldBeReadyAt() {
        return shouldBeReadyAt;
    }

    public void setShouldBeReadyAt(LocalDateTime shouldBeReadyAt) {
        this.shouldBeReadyAt = shouldBeReadyAt;
    }
}
