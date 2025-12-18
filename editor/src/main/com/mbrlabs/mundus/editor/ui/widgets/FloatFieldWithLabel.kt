
package com.mbrlabs.mundus.editor.ui.widgets

import com.kotcrab.vis.ui.util.FloatDigitsOnlyFilter

/**
 *  * @version 18-02-2016
 */
class FloatFieldWithLabel : TextFieldWithLabel {

    constructor(labelText: String, width: Int, allowNegative: Boolean) : super(labelText, width) {
        textField.textFieldFilter = FloatDigitsOnlyFilter(allowNegative)
    }

    constructor(labelText: String, width: Int) : super(labelText, width) {
        textField.textFieldFilter = FloatDigitsOnlyFilter(true)
    }

    fun isValid(): Boolean {
        // A failsafe catchall to see if its valid
        try {
            java.lang.Float.parseFloat(textField.text)
            textField.isInputValid = true
            return true
        } catch (ex: NumberFormatException) {
            textField.isInputValid = false
            return false
        }
    }

    val float: Float
        get() {
            if (isValid()) {
                return java.lang.Float.parseFloat(textField.text)
            }
            return 0f
        }

}
