package dsc.lab2.repositorios;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dsc.lab2.entidades.Usuario;

@Repository
public interface UsuarioDAO extends JpaRepository<Usuario, String>{
	Optional<Usuario> findByEmail(String email);

}
