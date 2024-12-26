package com.scaler.productservice.advices;

import com.scaler.productservice.dtos.ArithmeticExceptionDTO;
import com.scaler.productservice.dtos.ArrayIndexOutOfBoundExceptionDTO;
import com.scaler.productservice.dtos.NullPointerExceptionDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionAdvice {
    @ExceptionHandler(NullPointerException.class)
    public ResponseEntity<NullPointerExceptionDTO> handleNullPointerException() {
        NullPointerExceptionDTO dto = new NullPointerExceptionDTO();
        dto.setMessage("The requested data does not exist");
        return new ResponseEntity<>(dto, HttpStatus.BAD_REQUEST);
    }
@ExceptionHandler(ArrayIndexOutOfBoundsException.class)
    public ResponseEntity<ArrayIndexOutOfBoundExceptionDTO > handleArrayIndexOutOfBoundException() {
        ArrayIndexOutOfBoundExceptionDTO dto = new ArrayIndexOutOfBoundExceptionDTO();
        dto.setMessage("Cannot procces the request..");
        return new ResponseEntity<>(dto, HttpStatus.NOT_ACCEPTABLE);
    }
@ExceptionHandler(ArithmeticException.class)
    public ResponseEntity<ArithmeticExceptionDTO> handleArithmeticException() {
        ArithmeticExceptionDTO dto = new ArithmeticExceptionDTO();
        dto.setMessage("Something went wrong...");
        dto.setDetails("you tried to do stupid things!");
        return new ResponseEntity<>(dto, HttpStatus.OK);
    }
}
