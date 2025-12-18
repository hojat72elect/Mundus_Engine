
package com.mbrlabs.mundus.editor.events

import com.mbrlabs.mundus.commons.scene3d.GameObject
import com.mbrlabs.mundus.editorcommons.Subscribe

/**
 *  * @version 21-01-2016
 */
class GameObjectSelectedEvent(var gameObject: GameObject?, var activateSelection: Boolean = true) {

    interface GameObjectSelectedListener {
        @Subscribe
        fun onGameObjectSelected(event: GameObjectSelectedEvent)
    }

}
