package com.mbrlabs.mundus.editor.events

import com.mbrlabs.mundus.editorcommons.Subscribe

/**
 *  * @version June 02, 2022
 */
class ComponentRemovedEvent {
    interface ComponentRemovedListener {
        @Subscribe
        fun onComponentRemoved(event: ComponentRemovedEvent)
    }
}