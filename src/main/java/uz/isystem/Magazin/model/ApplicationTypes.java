package uz.isystem.Magazin.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter

@Entity
@Table(name = ("applicationtypes"))
public class ApplicationTypes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    private String displayName;
    private String displayClass;
    private String displayIcon;
    private Boolean status;
    @Column(name = ("created_at"))
    private LockModeType createdAt;
    @Column(name = ("update_at"))
    private LockModeType updateAt;
    @Column(name = ("delete_at"))
    private LockModeType deleteAt;
}
