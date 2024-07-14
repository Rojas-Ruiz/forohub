package com.alura.foro.hub.api.domain.respuestas;

import com.alura.foro.hub.api.domain.topicos.Topico;
import com.alura.foro.hub.api.domain.usuarios.Usuario;
import jakarta.validation.constraints.NotNull;

public record DatosActualizarRespuesta(@NotNull Long id, String mensaje, Topico topico , Usuario usuario, Boolean solucion) {
}
