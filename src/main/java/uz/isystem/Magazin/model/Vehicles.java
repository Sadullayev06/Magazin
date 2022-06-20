package uz.isystem.Magazin.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter

@Entity
@Table(name = ("vehicles"))
public class Vehicles {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer merchantId;
    private Integer brandId;
    private Integer modelId;
    private Integer bodyTypeId;
    private String name;
    private Integer year;
    private String color;
    private Integer numberSits;
    private Boolean isNew;
    private Double price;
    private Integer conditionDurationType;
    private Integer conditionDuration;
    private Integer conditionPrice;
    private Boolean status;
    @Column(name = ("created_at"))
    private LocalDateTime createdAt;
    @Column(name = ("update_at"))
    private LocalDateTime updateAt;
    @Column(name = ("delete_at"))
    private LocalDateTime deleteAt;
}
