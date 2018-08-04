package com.kunal.GameArea.playGround;

import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.World;
import com.badlogic.gdx.physics.box2d.joints.RevoluteJointDef;
import com.kunal.MainGame;
import com.kunal.utils.BodyGeneraton;

public class objectCreation {

    private World world;
    private float len = 2;


    public objectCreation(World world) {
        this.world = world;
    }

    public void bodycreatation(){
        BodyGeneraton.BodyAssemble(world, true, "land", new Vector2(0,-2),
                new Vector2(5000,5),1, MainGame.Bit_land, (short)(MainGame.Bit_enimes | MainGame.Bit_Player_Front | MainGame.Bit_Player_Back | MainGame.Bit_Tool));

        //tester
        MainGame.tester = BodyGeneraton.BodyAssembleKin(world, true, "test", new Vector2(60,150),
                new Vector2(len,len), (short) (MainGame.Bit_Player_Front | MainGame.Bit_Player_Back), (short)(MainGame.Bit_enimes | MainGame.Bit_land | MainGame.Bit_Player_Front | MainGame.Bit_Player_Back | MainGame.Bit_Tool));
        MainGame.tester2 = BodyGeneraton.BodyAssembleKin(world, true, "test", new Vector2(80,150),
                new Vector2(len,len), (short) (MainGame.Bit_Player_Front | MainGame.Bit_Player_Back), (short)(MainGame.Bit_enimes | MainGame.Bit_land | MainGame.Bit_Player_Front | MainGame.Bit_Player_Back | MainGame.Bit_Tool));


        MainGame.Front_foot1 = BodyGeneraton.BodyAssemble(world, false, "player", new Vector2(0,50), new Vector2(len + len,len),1,
                MainGame.Bit_Player_Front,
                (short)(MainGame.Bit_enimes | MainGame.Bit_land | MainGame.Bit_Player_Front | MainGame.Bit_Tool));

        MainGame.Back_foot1 = BodyGeneraton.BodyAssemble(world, false, "player", new Vector2(0,50), new Vector2(len + len,len),1,
                MainGame.Bit_Player_Back,
                (short)(MainGame.Bit_enimes | MainGame.Bit_land | MainGame.Bit_Player_Back | MainGame.Bit_Tool));

        MainGame.Front_foot2 = BodyGeneraton.BodyAssemble(world, false, "player", new Vector2(8,50), new Vector2(len*3/*for testin puttin 10 otherwise it is 3*/,len),0.8f,
                MainGame.Bit_Player_Front,
                (short)(MainGame.Bit_enimes | MainGame.Bit_land |MainGame.Bit_Player_Front | MainGame.Bit_Tool));

        MainGame.Back_foot2 = BodyGeneraton.BodyAssemble(world, false, "player", new Vector2(8,50), new Vector2(len*3/*for testin puttin 10 otherwise it is 3*/,len),0.8f,
                MainGame.Bit_Player_Back,
                (short)(MainGame.Bit_enimes | MainGame.Bit_land |MainGame.Bit_Player_Back | MainGame.Bit_Tool));

        MainGame.Front_leg = BodyGeneraton.BodyAssemble(world, false, "player", new Vector2(-4,63), new Vector2(len,len*4f),0.8f,
                MainGame.Bit_Player_Front,
                (short)(MainGame.Bit_enimes | MainGame.Bit_land | MainGame.Bit_Player_Front | MainGame.Bit_Tool));

        MainGame.Back_leg = BodyGeneraton.BodyAssemble(world, false, "player", new Vector2(-4,63), new Vector2(len,len*4f),0.8f,
                MainGame.Bit_Player_Back,
                (short)(MainGame.Bit_enimes | MainGame.Bit_land | MainGame.Bit_Player_Back | MainGame.Bit_Tool));


        MainGame.Front_Thai = BodyGeneraton.BodyAssemble(world, false, "player", new Vector2(-4,80), new Vector2(len,len*5f),0.7f,
                MainGame.Bit_Player_Front,
                (short)(MainGame.Bit_enimes | MainGame.Bit_land | MainGame.Bit_Player_Front | MainGame.Bit_Tool));

        MainGame.Back_Thai = BodyGeneraton.BodyAssemble(world, false, "player", new Vector2(-4,80), new Vector2(len,len*5f),0.7f,
                MainGame.Bit_Player_Back,
                (short)(MainGame.Bit_enimes | MainGame.Bit_land | MainGame.Bit_Player_Back | MainGame.Bit_Tool));

        MainGame.Stomach1 = BodyGeneraton.BodyAssemble(world, false, "player", new Vector2(-4,90), new Vector2(len*1.5f,len*2.5f),0.5f,
                (short) (MainGame.Bit_Player_Front | MainGame.Bit_Player_Back),
                (short)(MainGame.Bit_enimes | MainGame.Bit_land | MainGame.Bit_Player_Front | MainGame.Bit_Player_Back | MainGame.Bit_Tool));

        MainGame.Stomach2 = BodyGeneraton.BodyAssemble(world, false, "player", new Vector2(-4,100), new Vector2(len*1.5f,len*2.5f),0.4f,
                (short) (MainGame.Bit_Player_Front | MainGame.Bit_Player_Back),
                (short)(MainGame.Bit_enimes | MainGame.Bit_land | MainGame.Bit_Player_Front | MainGame.Bit_Player_Back | MainGame.Bit_Tool));

        MainGame.Stomach3 = BodyGeneraton.BodyAssemble(world, false, "player", new Vector2(-4,110), new Vector2(len*2,len*3.5f),0.3f,
                (short) (MainGame.Bit_Player_Front | MainGame.Bit_Player_Back),
                (short)(MainGame.Bit_enimes | MainGame.Bit_land | MainGame.Bit_Player_Front | MainGame.Bit_Player_Back | MainGame.Bit_Tool));

        MainGame.neck = BodyGeneraton.BodyAssemble(world, false, "player", new Vector2(-4,120), new Vector2(len,len*2.5f),0.3f,
                (short) (MainGame.Bit_Player_Front | MainGame.Bit_Player_Back),
                (short)(MainGame.Bit_enimes | MainGame.Bit_land | MainGame.Bit_Player_Front | MainGame.Bit_Player_Back | MainGame.Bit_Tool));

        MainGame.head = BodyGeneraton.BodyAssemble(world, false, "player", new Vector2(-4,130), new Vector2(len*3f,len*3.5f),0.3f,
                (short) (MainGame.Bit_Player_Front | MainGame.Bit_Player_Back),
                (short)(MainGame.Bit_enimes | MainGame.Bit_land | MainGame.Bit_Player_Front | MainGame.Bit_Player_Back | MainGame.Bit_Tool));



    }


    public void joints() {
        RevoluteJointDef rdef = new RevoluteJointDef();
        rdef.bodyA = MainGame.Front_foot1;
        rdef.bodyB = MainGame.Front_leg;
        rdef.collideConnected = false;
        rdef.localAnchorA.set(-(len/MainGame.PPM),0);
        rdef.localAnchorB.set(0,-((len*5 - (len/2))/MainGame.PPM));
        rdef.lowerAngle = (float) (-0.2f * Math.PI);
        rdef.upperAngle = (float) (0.07f * Math.PI);
        rdef.enableLimit = true;

        world.createJoint(rdef);

        rdef.bodyB = MainGame.Front_foot2;
        rdef.localAnchorA.set((len + len/2)/MainGame.PPM,0);
        rdef.localAnchorB.set(-((len*2 + (len/2))/MainGame.PPM),0);
        rdef.lowerAngle = 0;
        rdef.upperAngle = (float) (0.2f * Math.PI);
        rdef.enableLimit = true;

        world.createJoint(rdef);

        rdef.bodyB = MainGame.Front_leg;
        rdef.bodyA = MainGame.Front_Thai;
        rdef.localAnchorA.set(0,-(len*5 - (len/2))/MainGame.PPM);
        rdef.localAnchorB.set(0,((len*4 - (len/2))/MainGame.PPM));
        rdef.upperAngle = 0;
        rdef.lowerAngle = -(float) (0.7f * Math.PI);
        rdef.enableLimit = true;

        world.createJoint(rdef);

        rdef.bodyB = MainGame.Stomach1;
        rdef.localAnchorA.set(0,(len*5 - (len/2))/MainGame.PPM);
        rdef.localAnchorB.set(0,-(len*2)/MainGame.PPM);
        rdef.upperAngle = (float) (0.04f * Math.PI);
        rdef.lowerAngle = (float) (-0.5f * Math.PI);
        rdef.enableLimit = true;

        world.createJoint(rdef);

        rdef.bodyA = MainGame.Stomach2;
        rdef.localAnchorA.set(0, -(len*2)/MainGame.PPM);
        rdef.localAnchorB.set(0 , (len*2)/MainGame.PPM);
        rdef.upperAngle = (float) (0.1f * Math.PI);
        rdef.lowerAngle = -(float) (0.05f * Math.PI);

        world.createJoint(rdef);

        rdef.bodyB = MainGame.Stomach3;
        rdef.localAnchorA.set( 0, (len*2)/MainGame.PPM);
        rdef.localAnchorB.set(-(len/2) /MainGame.PPM, -(len*3)/MainGame.PPM);
        rdef.upperAngle = 0;
        rdef.lowerAngle = -(float) (0.05f * Math.PI);

        world.createJoint(rdef);

        rdef.bodyA = MainGame.neck;
        rdef.localAnchorA.set(0 , -(len*2)/MainGame.PPM);
        rdef.localAnchorB.set(-(len/2)/MainGame.PPM , (len*3)/MainGame.PPM);
        rdef.upperAngle = (float) (0.05f * Math.PI);
        rdef.lowerAngle = (float) (-0.05f * Math.PI);

        world.createJoint(rdef);

        rdef.bodyB = MainGame.head;
        rdef.localAnchorA.set(0 , (len*2)/MainGame.PPM);
        rdef.localAnchorB.set(-(len/2)/MainGame.PPM , -(len*2.5f)/MainGame.PPM);
        rdef.upperAngle = (float) (0.1f * Math.PI);
        rdef.lowerAngle = (float) (-0.1f * Math.PI);

        world.createJoint(rdef);


        //bqck joiminh
        rdef.bodyA = MainGame.Back_foot1;
        rdef.bodyB = MainGame.Back_leg;
        rdef.localAnchorA.set(-(len/MainGame.PPM),0);
        rdef.localAnchorB.set(0,-((len*5 - (len/2))/MainGame.PPM));
        rdef.lowerAngle = (float) (-0.2f * Math.PI);
        rdef.upperAngle = (float) (0.07f * Math.PI);
        rdef.enableLimit = true;

        world.createJoint(rdef);

        rdef.bodyB = MainGame.Back_foot2;
        rdef.localAnchorA.set((len + len/2)/MainGame.PPM,0);
        rdef.localAnchorB.set(-((len*2 + (len/2))/MainGame.PPM),0);
        rdef.lowerAngle = 0;
        rdef.upperAngle = (float) (0.2f * Math.PI);
        rdef.enableLimit = true;

        world.createJoint(rdef);

        rdef.bodyB = MainGame.Back_leg;
        rdef.bodyA = MainGame.Back_Thai;
        rdef.localAnchorA.set(0,-(len*5 - (len/2))/MainGame.PPM);
        rdef.localAnchorB.set(0,((len*4 - (len/2))/MainGame.PPM));
        rdef.upperAngle = 0;
        rdef.lowerAngle = -(float) (0.7f * Math.PI);
        rdef.enableLimit = true;

        world.createJoint(rdef);

        rdef.bodyB = MainGame.Stomach1;
        rdef.localAnchorA.set(0,(len*5 - (len/2))/MainGame.PPM);
        rdef.localAnchorB.set(0,-(len*2)/MainGame.PPM);
        rdef.upperAngle = (float) (0.04f * Math.PI);
        rdef.lowerAngle = (float) (-0.5f * Math.PI);
        rdef.enableLimit = true;

        world.createJoint(rdef);


    }

}
