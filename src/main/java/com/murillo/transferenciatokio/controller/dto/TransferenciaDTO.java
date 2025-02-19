package com.murillo.transferenciatokio.controller.dto;

import java.util.Date;

public record TransferenciaDTO(String contaOrigem, String contaDestino, String valorTransferencia, Date dataTransferencia) {
}
