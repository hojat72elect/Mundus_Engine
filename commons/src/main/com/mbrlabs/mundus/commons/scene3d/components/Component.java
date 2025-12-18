
package com.mbrlabs.mundus.commons.scene3d.components;

import com.mbrlabs.mundus.commons.scene3d.GameObject;

/**
 *  * @version 16-01-2016
 */
public interface Component {

    GameObject getGameObject();

    void update(float delta);

    Type getType();

    void setType(Type type);

    void remove();

    Component clone(GameObject go);

    enum Type {
        MODEL, TERRAIN, LIGHT, PARTICLE_SYSTEM, WATER, CUSTOM_PROPERTIES, PHYSICS, NAVMESH, TERRAIN_MANAGER
    }
}
