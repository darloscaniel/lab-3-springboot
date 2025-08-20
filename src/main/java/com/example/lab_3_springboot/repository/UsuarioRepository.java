package com.example.lab_3_springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.lab_3_springboot.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    
}
