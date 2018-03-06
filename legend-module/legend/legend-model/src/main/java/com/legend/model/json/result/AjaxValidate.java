package com.legend.model.json.result;


import com.legend.model.contant.message.exception.validate.ValidateExceptionMessage;

import javax.validation.ConstraintViolation;
import javax.validation.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * @author Administrator
 * @date 2018/2/12
 */
public class AjaxValidate {

    private String field;

    private String defaultMessage;

    public static List<Error> validate(Object object) {
        if (object == null) {
            throw new ValidationException(ValidateExceptionMessage.OBJECT_IS_NULL);
        }
        Set<ConstraintViolation<Object>> violationSet = (Set<ConstraintViolation<Object>>) object;
        List<Error> errors = new ArrayList<Error>();
        if (violationSet.isEmpty()) {
            return errors;
        }
        for (Object aViolationSet : violationSet) {
            ConstraintViolation constraintViolation = (ConstraintViolation) aViolationSet;
            Error error = new Error();
            error.setField(String.valueOf(constraintViolation.getPropertyPath()));
            error.setMsg(constraintViolation.getMessage());
            errors.add(error);
        }
        return errors;

    }
}
