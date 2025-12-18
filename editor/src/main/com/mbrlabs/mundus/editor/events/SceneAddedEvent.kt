
package com.mbrlabs.mundus.editor.events

import com.mbrlabs.mundus.commons.Scene
import com.mbrlabs.mundus.editorcommons.Subscribe

/**
 *  * @version 21-01-2016
 */
class SceneAddedEvent(var scene: Scene?) {

    interface SceneAddedListener {
        @Subscribe
        fun onSceneAdded(event: SceneAddedEvent)
    }

}
