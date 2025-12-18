
package com.mbrlabs.mundus.editor.events

import com.mbrlabs.mundus.commons.assets.Asset
import com.mbrlabs.mundus.editorcommons.Subscribe

/**
 *  * @version 02-10-2016
 */
class AssetImportEvent(val asset: Asset) {

    interface AssetImportListener {
        @Subscribe
        fun onAssetImported(event: AssetImportEvent)
    }

}
