package ru.otus.otuskotlin.catalogue.transport.common.validators.fields

import ru.otus.otuskotlin.catalogue.transport.common.validators.HandleError
import ru.otus.otuskotlin.catalogue.transport.common.validators.IValidator
import ru.otus.otuskotlin.catalogue.transport.common.validators.ValidationResult
import ru.otus.otuskotlin.catalogue.transport.common.validators.rules.IsEmptyValidator
import ru.otus.otuskotlin.catalogue.transport.common.validators.rules.ValidatorRegex

class LabelValidator: IValidator<String>{
    override fun validate(arg: String): ValidationResult {
        val result = ValidationResult()
        if(!result.add(IsEmptyValidator().validate(arg).error).isOK)
            return result
        return result
    }
}