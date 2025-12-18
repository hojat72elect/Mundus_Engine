
package com.mbrlabs.mundus.editor.history

/**
 *  * @version 07-02-2016
 */
interface Command {

    fun execute()

    fun undo()

}
