package uz.isystem.Magazin.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApplicationsDto {
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
    private LocalDateTime createdAt;
    private LocalDateTime updateAt;
    private LocalDateTime deleteAt;

}
