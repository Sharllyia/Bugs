package com.legend.module.core.model.json.result;



import com.legend.module.core.model.contant.message.exception.validate.ValidateExceptionMessage;

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

    public static List<AjaxError> validate(Object object) {
        if (object == null) {
            throw new ValidationException(ValidateExceptionMessage.OBJECT_IS_NULL);
        }
        Set<ConstraintViolation<Object>> violationSet = (Set<ConstraintViolation<Object>>) object;
        List<AjaxError> ajaxErrors = new ArrayList<AjaxError>();
        if (violationSet.isEmpty()) {
            return ajaxErrors;
        }
        for (Object aViolationSet : violationSet) {
            ConstraintViolation constraintViolation = (ConstraintViolation) aViolationSet;
            AjaxError ajaxError = new AjaxError();
            ajaxError.setField(String.valueOf(constraintViolation.getPropertyPath()));
            ajaxError.setMsg(constraintViolation.getMessage());
            ajaxErrors.add(ajaxError);
        }
        return ajaxErrors;

    }
}
