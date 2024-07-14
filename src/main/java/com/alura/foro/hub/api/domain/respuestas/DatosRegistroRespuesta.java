package com.alura.foro.hub.api.domain.respuestas;

import com.alura.foro.hub.api.domain.topicos.Topico;
import com.alura.foro.hub.api.domain.usuarios.Usuario;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DatosRegistroRespuesta(
        @NotBlank
        String mensaje,
        @NotNull
        Topico topico,
        @NotNull
        Usuario usuario
) {
}

