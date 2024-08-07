package wint.webchat.entities.user;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.Objects;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Role implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRole;
    @Basic
    @Column(name = "roleName", nullable = true, length = 100)
    private String roleName;

    @OneToMany(mappedBy = "roleUser" )
    private Set<UserRole> listUserRole;

    public Role(Long idRole, String roleName) {
        this.idRole = idRole;
        this.roleName = roleName;
    }
}
