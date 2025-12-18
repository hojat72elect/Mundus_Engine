
package com.mbrlabs.mundus.editor.assets

import com.mbrlabs.mundus.commons.assets.Asset
import com.mbrlabs.mundus.commons.assets.MaterialAsset
import com.mbrlabs.mundus.commons.assets.TerrainLayerAsset
import com.mbrlabs.mundus.commons.assets.TextureAsset

/**
 *  * @version 17-10-2016
 */
interface AssetFilter {
    fun ignore(asset: Asset): Boolean
}

/**
 *  * @version 17-10-2016
 */
class AssetMaterialFilter : AssetFilter {
    override fun ignore(asset: Asset): Boolean {
        return asset !is MaterialAsset
    }
}

/**
 *  * @version 07-10-2016
 */
class AssetTextureFilter : AssetFilter {
    override fun ignore(asset: Asset): Boolean {
        return asset !is TextureAsset
    }
}


class AssetTerrainLayerFilter : AssetFilter {
    override fun ignore(asset: Asset): Boolean {
        return asset !is TerrainLayerAsset
    }
}