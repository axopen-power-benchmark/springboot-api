package fr.axopen.powerbenchmark.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Classe globale qui va définir les exceptions sur l'API
 *
 * @see Exception
 */
@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
public class AxopenException extends Exception {

    public AxopenException(String message) {
        super(message);
    }

    public AxopenException(String message, Throwable e) {
        super(message, e);
    }
}
