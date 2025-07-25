package ra.edu.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ra.edu.model.dto.UserProfileDTO;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @PutMapping("/profile/edit")
    public ResponseEntity<?> editProfile(@RequestBody UserProfileDTO dto, Authentication authentication) {
        // Lấy username từ token
        String username = authentication.getName();
        // Thực hiện cập nhật thông tin
        return ResponseEntity.ok("Updated profile for " + username);
    }
}
