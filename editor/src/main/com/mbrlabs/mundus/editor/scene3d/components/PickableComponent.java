
package com.mbrlabs.mundus.editor.scene3d.components;

/**
 * Mouse pickable by color code picking system.
 *
 *  * @version 24-02-2016
 */
public interface PickableComponent {

    void encodeRaypickColorId();

    void renderPick();
}
