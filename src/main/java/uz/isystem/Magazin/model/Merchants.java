package uz.isystem.Magazin.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter

@Entity
@Table(name = ("merchants"))
public class Merchants {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer userId;
    private String slug;
    private String name;
    private String imageThumb;
    private Boolean isFeatured;
    private String phone;
    private String mobile;
    private String email;
    private String website;
    private String address;
    private String country;
    private Boolean status;
    @Column(name = ("created_at"))
    private LocalDateTime createdAt;
    @Column(name = ("update_at"))
    private LocalDateTime updateAt;
    @Column(name = ("delete_at"))
    private LocalDateTime deleteAt;
}
