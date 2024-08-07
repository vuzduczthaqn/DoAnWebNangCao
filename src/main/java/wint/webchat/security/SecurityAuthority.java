package wint.webchat.security;

import lombok.AllArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import wint.webchat.entities.user.Role;
import wint.webchat.entities.user.UserRole;

@AllArgsConstructor
public class SecurityAuthority implements GrantedAuthority {
    private final UserRole userRole;
    @Override
    public String getAuthority() {
        return userRole.getRoleUser().getRoleName();
    }
}
