package br.com.fiap.checkpoint2.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Positive;

@Entity
@Table(name = "Pedidos")
public class OrderModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty(message = "O preenchimento do nome do cliente é obrigatório")
    private String clientName;

    private LocalDate orderDate;

    @DecimalMin(value = "0.0", message = "O valor total não pode ser negativo")
    @Positive
    private BigDecimal totalValue;

    public OrderModel() {
    }

    public OrderModel(Long id, String clientName, LocalDate orderDate, BigDecimal totalValue) {
        this.id = id;
        this.clientName = clientName;
        this.orderDate = orderDate;
        this.totalValue = totalValue;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public BigDecimal getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(BigDecimal totalValue) {
        this.totalValue = totalValue;
    }

    @PrePersist
    public void prePersist() {
        if (this.orderDate == null) {
            this.orderDate = LocalDate.now();
        }
    }
}