// !WITH_NEW_INFERENCE
// NI_EXPECTED_FILE
// See EA-76890 / KT-10843: NPE during analysis
fun lambda(x : Int?) = x?.<!OI;TYPE_INFERENCE_NO_INFORMATION_FOR_PARAMETER, FUNCTION_CALL_EXPECTED, NO_VALUE_FOR_PARAMETER!>let<!> <!NI;UNRESOLVED_REFERENCE, OI;DEBUG_INFO_ELEMENT_WITH_ERROR_TYPE!>l<!> {
    <!OI;CANNOT_INFER_PARAMETER_TYPE!>y<!> ->
    if (<!OI;DEBUG_INFO_ELEMENT_WITH_ERROR_TYPE!>y<!> <!NI;UNREACHABLE_CODE!><!NI;UNRESOLVED_REFERENCE, OI;DEBUG_INFO_ELEMENT_WITH_ERROR_TYPE!>><!> 0<!>) <!NI;UNREACHABLE_CODE!>return<!UNRESOLVED_REFERENCE!>@l<!> x<!>
    <!NI;UNREACHABLE_CODE, OI;DEBUG_INFO_ELEMENT_WITH_ERROR_TYPE!>y<!>
}<!NOT_NULL_ASSERTION_ON_LAMBDA_EXPRESSION!>!!<!>
