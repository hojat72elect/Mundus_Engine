
package com.mbrlabs.mundus.editor.events

import com.mbrlabs.mundus.editorcommons.Subscribe

/**
 * Indicates a change in the static settings each TerrainBrush shares (strength,
 * radius, ...)

 *  * @version 07-02-2016
 */
class GlobalBrushSettingsChangedEvent {

    interface GlobalBrushSettingsChangedListener {
        @Subscribe
        fun onSettingsChanged(event: GlobalBrushSettingsChangedEvent)
    }

}
