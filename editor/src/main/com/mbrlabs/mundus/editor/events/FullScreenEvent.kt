
package com.mbrlabs.mundus.editor.events

import com.mbrlabs.mundus.editorcommons.Subscribe

/**
 *  * @version 02-10-2016
 */
class FullScreenEvent(val isFullScreen: Boolean) {

    interface FullScreenEventListener {
        @Subscribe
        fun onFullScreenEvent(event: FullScreenEvent)
    }

}
