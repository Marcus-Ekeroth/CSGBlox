package org.abstractica.bricksystem;

import org.abstractica.javacsg.Geometry3D;
import org.abstractica.javacsg.JavaCSG;
import org.abstractica.javacsg.JavaCSGFactory;

public class UShapedBrick implements Brick {

    JavaCSG csg = JavaCSGFactory.createDefault();

    @Override
    public JavaCSG getJavaCSG() {
        return csg;
    }

    @Override
    public String getName() {
        return "";
    }


    @Override
    public Geometry3D getBrick() {
        return null;
    }
}
