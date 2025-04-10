package org.abstractica.bricksystem;

public class BrickFactory {
    public static Brick createBrick(String type){
        if ("rect".equalsIgnoreCase(type)) return new RectangleBrick();
        if ("u".equalsIgnoreCase(type)) return new UShapedBrick();
        if ("l".equalsIgnoreCase(type)) return new LShapedBrick();
        return null;
    }
}
