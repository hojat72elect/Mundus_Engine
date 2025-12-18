
package com.mbrlabs.mundus.editor.events

import com.mbrlabs.mundus.editorcommons.Subscribe

/**
 * @author jake-goldsmith
 * @version January 14, 2023
 */
class MaterialDuplicatedEvent {
    interface MaterialDuplicatedEventListener {
        @Subscribe
        fun onMaterialDuplicated(event: MaterialDuplicatedEvent)
    }
}
