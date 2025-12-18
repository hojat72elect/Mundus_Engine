
package com.mbrlabs.mundus.editor.events

import com.mbrlabs.mundus.commons.assets.Asset
import com.mbrlabs.mundus.editorcommons.Subscribe

/**
 *  * @version 12-10-2016
 */
class AssetSelectedEvent(val asset: Asset) {

    interface AssetSelectedListener {
        @Subscribe
        fun onAssetSelected(event: AssetSelectedEvent)
    }
}
