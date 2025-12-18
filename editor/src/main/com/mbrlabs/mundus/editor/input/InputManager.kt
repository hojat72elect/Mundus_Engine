
package com.mbrlabs.mundus.editor.input

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.InputMultiplexer

/**
 *  * @version 07-12-2015
 */
class InputManager : InputMultiplexer() {

    init {
        Gdx.input.inputProcessor = this
    }

}
