package com.empresa.LoginSpringBoot.servicio;

import com.empresa.LoginSpringBoot.dto.UsuarioRegistroDTO;
import com.empresa.LoginSpringBoot.modelo.Usuario;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface UsuarioServicio extends UserDetailsService {
    Usuario guardar(UsuarioRegistroDTO registroDTO);
    public List<Usuario> listarUsuarios();
}
