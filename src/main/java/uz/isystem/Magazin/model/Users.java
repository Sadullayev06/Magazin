package uz.isystem.Magazin.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter

@Entity
@Table(name = ("users"))
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer userTypeId;
    private String username;
    private String password;
    private String email;
    private String token;
    private String firstName;
    private String lastName;
    private String avatar;
    private String phone;
    private LocalDateTime birth;
    private String address;
    private String address2;
    private Integer cityId;
    private String postcode;
    private String qrCode;
    private LocalDateTime emailVerifiedAt;
    private LocalDateTime phoneVerifiedAt;
    private Boolean status;
    @Column(name = ("created_at"))
    private LocalDateTime createdAt;
    @Column(name = ("update_at"))
    private LocalDateTime updateAt;
    @Column(name = ("delete_at"))
    private LocalDateTime deleteAt;
}
