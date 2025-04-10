package org.abstractica.bricksystem;

import org.abstractica.javacsg.Geometry3D;
import org.abstractica.javacsg.JavaCSG;

public interface Brick {
    JavaCSG getJavaCSG();
    String getName();
    Geometry3D getBrick();
}
