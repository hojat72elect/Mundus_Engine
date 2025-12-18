
package com.mbrlabs.mundus.editor.events

import com.mbrlabs.mundus.editorcommons.Subscribe

/**
 *  * @version 17-01-2016
 */
class SceneGraphChangedEvent {

    interface SceneGraphChangedListener {
        @Subscribe
        fun onSceneGraphChanged(event: SceneGraphChangedEvent)
    }

}
