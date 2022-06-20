package uz.isystem.Magazin.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter

@Entity
@Table(name = ("applications"))
public class Applications {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer typeId;
    private Integer userId;
    private Integer merchantId;
    private Integer vehicleId;
    private String vehicleDetails;
    private Double price;
    private Integer conditionDurationType;
    private Integer conditionDuration;
    private Double conditionPrice;
    private Integer processStatusId;
    private Boolean status;
    @Column(name = ("created_at"))
    private LocalDateTime createdAt;
    @Column(name = ("update_at"))
    private LocalDateTime updateAt;
    @Column(name = ("delete_at"))
    private LocalDateTime deleteAt;
}
