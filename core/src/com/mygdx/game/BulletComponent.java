package com.mygdx.game;

import com.uwsoft.editor.renderer.components.TransformComponent;

/**
 * Created by Jaden on 15/11/2015.
 */
public class BulletComponent {
    public float x;
    public float y;
    public float scaleX	=	1f;

    BulletComponent(TransformComponent component) {
        x = component.x;
        y = component.y;
        scaleX = component.scaleX;

    }
}
