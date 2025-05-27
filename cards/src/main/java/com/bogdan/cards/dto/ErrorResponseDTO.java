package com.bogdan.cards.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

@Schema(name = "ErrorResponse",
        description = "Schema to hold error response information")
public class ErrorResponseDTO {

    @Schema(description = "API path invoked by client.")
    private String apiPath;

    @Schema(description = "Error code representing the error happened.")
    private HttpStatus errorCode;

    @Schema(description = "Error message representing the error happened.")
    private String errorMsg;

    @Schema(description = "Time representing when the error happened.")
    private LocalDateTime errorTime;

    //Getter, Setter, ToString

    public ErrorResponseDTO(String apiPath, HttpStatus errorCode, String errorMsg, LocalDateTime errorTime) {
        this.apiPath = apiPath;
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
        this.errorTime = errorTime;
    }

    public String getApiPath() {
        return apiPath;
    }

    public void setApiPath(String apiPath) {
        this.apiPath = apiPath;
    }

    public HttpStatus getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(HttpStatus errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public LocalDateTime getErrorTime() {
        return errorTime;
    }

    public void setErrorTime(LocalDateTime errorTime) {
        this.errorTime = errorTime;
    }

    @Override
    public String toString() {
        return "ErrorResponseDTO{" +
                "apiPath='" + apiPath + '\'' +
                ", errorCode=" + errorCode +
                ", errorMsg='" + errorMsg + '\'' +
                ", errorTime=" + errorTime +
                '}';
    }
}
