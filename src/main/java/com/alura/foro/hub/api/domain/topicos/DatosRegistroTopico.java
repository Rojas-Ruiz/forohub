package com.alura.foro.hub.api.domain.topicos;

import com.alura.foro.hub.api.domain.cursos.DatosCurso;
import com.alura.foro.hub.api.domain.usuarios.DatosUsuario;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DatosRegistroTopico(
        @NotBlank
        String titulo,
        @NotBlank
        String mensaje,
        @NotNull
        EstadoTopico estadoTopico,
        @NotNull
        @Valid
        DatosUsuario usuario,
        @NotNull
        @Valid
        DatosCurso curso
) {
}

