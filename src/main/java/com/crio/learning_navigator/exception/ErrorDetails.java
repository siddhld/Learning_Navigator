package com.crio.learning_navigator.exception;

import java.util.Date;

public record ErrorDetails(Date timestamp, String message, String details ) {
}
