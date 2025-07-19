package br.com.elvisassis.sbootexp_secutiry.api;

import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class FooController {

    @GetMapping("/public")
    public ResponseEntity<String> publicRoute() {
        return ResponseEntity.ok("Public route ok");
    }

    @GetMapping("/private")
    @SecurityRequirement(name = "bearerAuth")
    public ResponseEntity<String> privateRoute(Authentication authentication) {
        System.out.println(authentication.getClass());
        return ResponseEntity.ok("Private route ok! Usuário conectado: " + authentication.getName());
    }

    @GetMapping("/admin")
    @PreAuthorize("hasRole('ADMIN')")
    @SecurityRequirement(name = "bearerAuth")
    public ResponseEntity<String> adminRoute() {
        return ResponseEntity.ok("Admin route ok!");
    }
}
