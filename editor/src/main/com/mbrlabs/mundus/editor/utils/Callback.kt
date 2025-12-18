
package com.mbrlabs.mundus.editor.utils

/**
 *  * @version 24-11-2015
 */
interface Callback<T> {

    fun done(result: T)

    fun error(msg: String)

}
