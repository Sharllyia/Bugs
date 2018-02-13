package com.legend.base.model.json.result;

import javax.validation.ConstraintViolation;
import java.util.ArrayList;
import java.util.Iterator;
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
        Set<ConstraintViolation<Object>> violationSet = (Set<ConstraintViolation<Object>>) object;
        List<Error> errors = new ArrayList<Error>();
        if (errors.isEmpty()) {
            return null;
        }
        Iterator iterator = violationSet.iterator();
        while (iterator.hasNext()) {
            ConstraintViolation constraintViolation = (ConstraintViolation) iterator.next();
            Error error = new Error();
            error.setField(String.valueOf(constraintViolation.getPropertyPath()));
            error.setMsg(constraintViolation.getMessage());
        }
        return errors;

    }
}
