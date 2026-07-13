package io.github.jopsantossilva2005.networkinventorymanager.dto;

import java.time.Instant;

public record HealthResponse(String status, String application, Instant timestamp) {

}
