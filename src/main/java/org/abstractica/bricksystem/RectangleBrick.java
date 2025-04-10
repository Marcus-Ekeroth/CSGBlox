package org.abstractica.bricksystem;

import org.abstractica.clicksystem.ClickSystem;
import org.abstractica.clicksystem.ClickSystemFactory;
import org.abstractica.javacsg.Geometry3D;
import org.abstractica.javacsg.JavaCSG;
import org.abstractica.javacsg.JavaCSGFactory;

public class RectangleBrick implements Brick {

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
        ClickSystem cs = ClickSystemFactory.system_12_8_6_medium(getJavaCSG());
        double unit = cs.getUnit();
        int xSize = 3;
        int ySize = 2;
        int zSize = 1;
        Geometry3D brick = csg.box3D(unit *xSize, unit * ySize, unit *zSize, false);
        brick = csg.translate3D(0.5*unit*xSize,0.5*unit*ySize,0 ).transform(brick);
        return brick;
    }
}
