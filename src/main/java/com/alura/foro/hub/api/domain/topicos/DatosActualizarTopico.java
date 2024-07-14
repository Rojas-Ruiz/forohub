package com.alura.foro.hub.api.domain.topicos;

import com.alura.foro.hub.api.domain.cursos.Curso;
import com.alura.foro.hub.api.domain.usuarios.Usuario;
import jakarta.validation.constraints.NotNull;

public record DatosActualizarTopico(@NotNull Long id, String titulo, String mensaje, EstadoTopico estadoTopico, Usuario usuario, Curso curso) {

}

