package com.kunal.GameArea.playGround;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.math.Vector2;
import com.kunal.AllVariables;
import com.kunal.AllVariables;
import com.kunal.MainGame;

public class Player_moves {

    private float len = 2;
    private static boolean front = true;
    public static float FootLevel = 0.12f;

    private boolean HandsMovingPermission = true;


    public Player_moves() {
    }

    // to convert radian to degree the formula is
    //radian * (180/PI)
    public void balancer(){
        display();

        //for making the character in straight position
        //front--------------------------------

        if (AllVariables.Front_leg_Balance) {
            if ((AllVariables.Front_leg.getAngle() * (180 / Math.PI)) < -5) {
                AllVariables.Front_leg.applyForce(new Vector2(AllVariables.Front_leg.getAngle() / (MainGame.PPM / 3), 0), new Vector2(AllVariables.Front_leg.getWorldCenter().x, AllVariables.Front_leg.getWorldCenter().y + len * 4), true);
            }
            if ((AllVariables.Front_leg.getAngle() * (180 / Math.PI)) > -5) {
                if (AllVariables.Front_leg.getAngle() * (180 / Math.PI) > 0)
                    AllVariables.Front_leg.applyForce(new Vector2(AllVariables.Front_leg.getAngle() / (MainGame.PPM / 3), 0), new Vector2(AllVariables.Front_leg.getWorldCenter().x, AllVariables.Front_leg.getWorldCenter().y + len * 4), true);
                else
                    AllVariables.Front_leg.applyForce(new Vector2(-AllVariables.Front_leg.getAngle() / (MainGame.PPM / 3), 0), new Vector2(AllVariables.Front_leg.getWorldCenter().x, AllVariables.Front_leg.getWorldCenter().y + len * 4), true);
            }
        }

        if(AllVariables.Front_Thai_Balance) {
            if ((AllVariables.Front_Thai.getAngle() * (180 / Math.PI)) < -5f) {
                AllVariables.Front_Thai.applyForce(new Vector2(AllVariables.Front_Thai.getAngle() / (MainGame.PPM / 5), 0), new Vector2(AllVariables.Front_Thai.getWorldCenter().x, AllVariables.Front_Thai.getWorldCenter().y + len * 5), true);
            }


            if ((AllVariables.Front_Thai.getAngle() * (180 / Math.PI)) > -5) {
                if ((AllVariables.Front_Thai.getAngle() * (180 / Math.PI)) >= 0)
                    AllVariables.Front_Thai.applyForce(new Vector2(AllVariables.Front_Thai.getAngle() / (MainGame.PPM / 5), 0), new Vector2(AllVariables.Front_Thai.getWorldCenter().x, AllVariables.Front_Thai.getWorldCenter().y + len * 5), true);
                else
                    AllVariables.Front_Thai.applyForce(new Vector2(AllVariables.Front_Thai.getAngle() / (MainGame.PPM / 5), 0), new Vector2(AllVariables.Front_Thai.getWorldCenter().x, AllVariables.Front_Thai.getWorldCenter().y + len * 5), true);
            }
        }

        if(AllVariables.Front_foot1_Balance) {
            if (AllVariables.Front_foot1.getAngle() * (180 / Math.PI) < 0) {
                AllVariables.Front_foot1.setAngularVelocity(200);
            }
            AllVariables.Back_foot1.setLinearVelocity(0,-1f);
        }


        //back---------------------------------
        if(AllVariables.Back_leg_Balance) {
            if ((AllVariables.Back_leg.getAngle() * (180 / Math.PI)) < -5f) {
                AllVariables.Back_leg.applyForce(new Vector2(AllVariables.Back_leg.getAngle() / (MainGame.PPM / 3), 0), new Vector2(AllVariables.Back_leg.getWorldCenter().x, AllVariables.Back_leg.getWorldCenter().y + len * 4), true);
            }
            if ((AllVariables.Back_leg.getAngle() * (180 / Math.PI)) > -5f) {
                if (AllVariables.Back_leg.getAngle() * (180 / Math.PI) > 0)
                    AllVariables.Back_leg.applyForce(new Vector2(AllVariables.Back_leg.getAngle() / (MainGame.PPM / 3), 0), new Vector2(AllVariables.Back_leg.getWorldCenter().x, AllVariables.Back_leg.getWorldCenter().y + len * 4), true);
                else
                    AllVariables.Back_leg.applyForce(new Vector2(-AllVariables.Back_leg.getAngle() / (MainGame.PPM / 3), 0), new Vector2(AllVariables.Back_leg.getWorldCenter().x, AllVariables.Back_leg.getWorldCenter().y + len * 4), true);

            }
        }

        if(AllVariables.Back_Thai_Balance) {
            if ((AllVariables.Back_Thai.getAngle() * (180 / Math.PI)) <= -5) {
                AllVariables.Back_Thai.applyForce(new Vector2(AllVariables.Back_Thai.getAngle() / (MainGame.PPM / 5), 0), new Vector2(AllVariables.Back_Thai.getWorldCenter().x, AllVariables.Back_Thai.getWorldCenter().y + len * 5), true);
            }

            if ((AllVariables.Back_Thai.getAngle() * (180 / Math.PI)) > -5) {
                if ((AllVariables.Back_Thai.getAngle() * (180 / Math.PI)) >= 0)
                    AllVariables.Back_Thai.applyForce(new Vector2(AllVariables.Back_Thai.getAngle() / (MainGame.PPM / 5), 0), new Vector2(AllVariables.Back_Thai.getWorldCenter().x, AllVariables.Back_Thai.getWorldCenter().y + len * 5), true);
                else
                    AllVariables.Back_Thai.applyForce(new Vector2(AllVariables.Back_Thai.getAngle() / (MainGame.PPM / 5), 0), new Vector2(AllVariables.Back_Thai.getWorldCenter().x, AllVariables.Back_Thai.getWorldCenter().y + len * 5), true);

            }
        }

        if(AllVariables.Back_foot1_Balance) {
            if (AllVariables.Back_foot1.getAngle() * (180 / Math.PI) < 0) {
                AllVariables.Back_foot1.setAngularVelocity(200);
            }
            AllVariables.Back_foot1.setLinearVelocity(0,-1f);
        }

        //commom ---------------------------

        if (AllVariables.stomach1_Balance) {
            if ((AllVariables.Stomach1.getAngle() * (180 / Math.PI)) > 1f) {
                AllVariables.Stomach1.applyForce(new Vector2(AllVariables.Stomach1.getAngle() / (MainGame.PPM / 3), 0), new Vector2(AllVariables.Stomach1.getWorldCenter().x, AllVariables.Stomach1.getWorldCenter().y + len * 5), true);
            }
            if ((AllVariables.Stomach1.getAngle() * (180 / Math.PI)) <= 1f) {
                AllVariables.Stomach1.applyForce(new Vector2(AllVariables.Stomach1.getAngle() / (MainGame.PPM / 3), 0), new Vector2(AllVariables.Stomach1.getWorldCenter().x, AllVariables.Stomach1.getWorldCenter().y + len * 5), true);
            }
        }

        if (AllVariables.stomach2_Balance) {
            if ((AllVariables.Stomach2.getAngle() * (180 / Math.PI)) <= -2f) {
                AllVariables.Stomach2.applyForce(new Vector2(AllVariables.Stomach2.getAngle() / (MainGame.PPM / 2), 0), new Vector2(AllVariables.Stomach2.getWorldCenter().x, AllVariables.Stomach2.getWorldCenter().y + len * 5), true);
            }

            if ((AllVariables.Stomach2.getAngle() * (180 / Math.PI)) > -2) {
                AllVariables.Stomach2.applyForce(new Vector2(AllVariables.Stomach2.getAngle() / (MainGame.PPM / 2), 0), new Vector2(AllVariables.Stomach2.getWorldCenter().x, AllVariables.Stomach2.getWorldCenter().y + len * 5), true);
            }
        }

        if (AllVariables.stomach3_Balance) {
            if ((AllVariables.Stomach3.getAngle() * (180 / Math.PI)) <= -2f) {
                AllVariables.Stomach3.applyForce(new Vector2(AllVariables.Stomach3.getAngle() / (MainGame.PPM / 2), 0), new Vector2(AllVariables.Stomach3.getWorldCenter().x, AllVariables.Stomach3.getWorldCenter().y + len * 5), true);
            }

            if ((AllVariables.Stomach3.getAngle() * (180 / Math.PI)) > -2) {
                AllVariables.Stomach3.applyForce(new Vector2(AllVariables.Stomach3.getAngle() / (MainGame.PPM / 2), 0), new Vector2(AllVariables.Stomach3.getWorldCenter().x, AllVariables.Stomach3.getWorldCenter().y + len * 5), true);
            }
        }

        if (AllVariables.neck_Balance) {
            if ((AllVariables.neck.getAngle() * (180 / Math.PI)) < -1f) {
                AllVariables.neck.applyForce(new Vector2(AllVariables.neck.getAngle() / (MainGame.PPM / 2), 0), new Vector2(AllVariables.neck.getWorldCenter().x, AllVariables.neck.getWorldCenter().y + len * 5), true);
            }

            if ((AllVariables.neck.getAngle() * (180 / Math.PI)) > -1) {
                AllVariables.neck.applyForce(new Vector2(AllVariables.neck.getAngle() / (MainGame.PPM / 2), 0), new Vector2(AllVariables.neck.getWorldCenter().x, AllVariables.neck.getWorldCenter().y + len * 5), true);
            }
        }

        if (AllVariables.head_Balance) {
            if ((AllVariables.head.getAngle() * (180 / Math.PI)) < -1f) {
                AllVariables.head.applyForce(new Vector2(AllVariables.head.getAngle() / (MainGame.PPM / 2), 0), new Vector2(AllVariables.head.getWorldCenter().x, AllVariables.head.getWorldCenter().y + len * 5), true);
            }

            if ((AllVariables.head.getAngle() * (180 / Math.PI)) > -1) {
                AllVariables.head.applyForce(new Vector2(AllVariables.head.getAngle() / (MainGame.PPM / 2), 0), new Vector2(AllVariables.head.getWorldCenter().x, AllVariables.head.getWorldCenter().y + len * 5), true);
            }
        }

    }

    private void display(){
        //System.out.println(AllVariables.Front_Thai.getAngle() * (180/Math.PI));

    }

    public void walkingWithBigSteps(){
        //AllVariables.Stomach3.setAngularVelocity(40);

        if (AllVariables.Front_foot2.getWorldCenter().y < 0.12f && AllVariables.Back_foot2.getWorldCenter().y < 0.12f) {
            if(AllVariables.Front_foot2.getWorldCenter().x > AllVariables.Back_foot2.getWorldCenter().x)
                front = false;
            else
                front = true;
        }

        //AllVariables.Stomach1.applyForceToCenter(2,-2, true);
        //AllVariables.Stomach1.setLinearVelocity(0,-2);


        //-------------------------front leg --------------------------
        if(front){

            if(HandsMovingPermission){
                if(AllVariables.Back_arm.getAngle() * (180/Math.PI) > 30)
                    AllVariables.Back_arm.setAngularVelocity(-20);
                else
                    AllVariables.Back_arm.setAngularVelocity(20);

                if(AllVariables.Front_arm.getAngle() * (180/Math.PI) < -30)
                    AllVariables.Front_arm.setAngularVelocity(20);
                else
                    AllVariables.Front_arm.setAngularVelocity(-20);

            }


            AllVariables.Back_foot1.applyForceToCenter(0, -20, true);

            AllVariables.Stomach1.setLinearVelocity(6,AllVariables.Stomach1.getLinearVelocity().y);
            if(AllVariables.Front_Thai.getAngle() * (180 / Math.PI) <80)
                AllVariables.Front_Thai.setAngularVelocity(70f);

            if(AllVariables.Front_foot2.getPosition().x >= AllVariables.Back_foot2.getPosition().x){
                AllVariables.Front_foot2.setLinearVelocity(0, -5);
                if ((AllVariables.Front_foot2.getAngle() * (180/ Math.PI)) < 0){
                    AllVariables.Front_foot2.setAngularVelocity(7);
                }else {
                    //AllVariables.Front_foot2.setAngularVelocity(0);
                }
            }else{
                AllVariables.Front_foot2.setLinearVelocity(0, 5);
            }

            //AllVariables.Back_leg.setAngularVelocity(-20);
        }
        //---------------Back Leg----------------
        else{

            if(HandsMovingPermission){
                if(AllVariables.Front_arm.getAngle() * (180/Math.PI) > 30)
                    AllVariables.Front_arm.setAngularVelocity(-20);
                else
                    AllVariables.Front_arm.setAngularVelocity(20);

                if(AllVariables.Back_arm.getAngle() * (180/Math.PI) < -30)
                    AllVariables.Back_arm.setAngularVelocity(20);
                else
                    AllVariables.Back_arm.setAngularVelocity(-20);


            }

            AllVariables.Front_foot1.applyForceToCenter(0, -20, true);

            AllVariables.Stomach1.setLinearVelocity(6,AllVariables.Stomach1.getLinearVelocity().y);

            if(AllVariables.Back_Thai.getAngle() * (180 / Math.PI) < 80)
                AllVariables.Back_Thai.setAngularVelocity(70f);


            if(AllVariables.Back_foot2.getPosition().x >= AllVariables.Front_foot2.getPosition().x){
                AllVariables.Back_foot2.setLinearVelocity(0, -5);

                if ((AllVariables.Back_foot2.getAngle() * (180/ Math.PI)) < 0){
                    AllVariables.Back_foot2.setAngularVelocity(7);
                }else {
                    //AllVariables.Back_foot2.setAngularVelocity(0);
                }
            }else{
                AllVariables.Back_foot2.setLinearVelocity(0, 5);
            }
            //AllVariables.Front_leg.setAngularVelocity(-20);

        }

        //AllVariables.Front_leg.setAngularVelocity(10);


        //AllVariables.Front_foot2.applyForceToCenter(0,-5,true);
        //AllVariables.Back_foot2.applyForceToCenter(0,-5,true);


        //AllVariables.Front_Thai.setAngularVelocity(50f);
        //AllVariables.Back_Thai.setAngularVelocity(50f);


        //AllVariables.Front_leg.setAngularVelocity(-50);
        //AllVariables.Back_leg.setAngularVelocity(10);

    }

    public void walkingimproper(){

        //AllVariables.Stomach1.setAngularVelocity(-30);

        //AllVariables.Stomach2.setAngularVelocity(20);


        if (AllVariables.Front_foot2.getWorldCenter().y < FootLevel+0.02 && AllVariables.Back_foot2.getWorldCenter().y < FootLevel+0.02) {
            if(AllVariables.Front_foot2.getWorldCenter().x > AllVariables.Back_foot2.getWorldCenter().x)
                front = false;
            else
                front = true;
        }

        AllVariables.Stomach1.setLinearVelocity(2f,AllVariables.Stomach1.getLinearVelocity().y);



        //-------------------------front leg --------------------------
        if(front){

            AllVariables.Back_foot1.applyForceToCenter(0, -5, true);

            if(AllVariables.Front_Thai.getAngle() * (180 / Math.PI) <30)
                AllVariables.Front_Thai.setAngularVelocity(50f);

            if(AllVariables.Front_foot2.getPosition().x >= AllVariables.Back_foot2.getPosition().x){
                AllVariables.Front_foot2.setLinearVelocity(0, -2);
                if ((AllVariables.Front_foot2.getAngle() * (180/ Math.PI)) < 0){
                    AllVariables.Front_foot2.setAngularVelocity(7);
                }else {
                    //AllVariables.Front_foot2.setAngularVelocity(0);
                }
            }else{
                AllVariables.Front_foot2.setLinearVelocity(0, 10);
                AllVariables.Back_foot2.applyForceToCenter(0, -30, true);
            }

            //AllVariables.Back_leg.setAngularVelocity(-20);
        }


        //---------------Back Leg----------------
        else{

            AllVariables.Front_foot1.applyForceToCenter(0, -5, true);

            if(AllVariables.Back_Thai.getAngle() * (180 / Math.PI) < 30)
                AllVariables.Back_Thai.setAngularVelocity(50f);


            if(AllVariables.Back_foot2.getPosition().x >= AllVariables.Front_foot2.getPosition().x){
                AllVariables.Back_foot2.setLinearVelocity(0, -2);

                if ((AllVariables.Back_foot2.getAngle() * (180/ Math.PI)) < 0){
                    AllVariables.Back_foot2.setAngularVelocity(7);
                }else {
                    //AllVariables.Back_foot2.setAngularVelocity(0);
                }
            }else{
                AllVariables.Back_foot2.setLinearVelocity(0, 10);
                AllVariables.Front_foot2.applyForceToCenter(0, -30, true);
            }
            //AllVariables.Front_leg.setAngularVelocity(-20);
        }
    }

    public void walking(){
        if (AllVariables.Front_foot2.getWorldCenter().y < FootLevel && AllVariables.Back_foot2.getWorldCenter().y < FootLevel) {
            if(AllVariables.Front_foot2.getWorldCenter().x > AllVariables.Back_foot2.getWorldCenter().x) {
                front = false;
                AllVariables.Back_foot2.applyForceToCenter(0,2,true);

            }
            else {
                front = true;
                AllVariables.Front_foot2.applyForceToCenter(0,2,true);

            }
        }

        System.out.println(AllVariables.Front_foot2.getWorldCenter().y + "\t" + AllVariables.Back_foot2.getWorldCenter().y);




        //-------------------------front leg --------------------------
        if(front){
            if(AllVariables.Front_Thai.getAngle() * (180/ Math.PI) >30)
                AllVariables.Front_Thai.setAngularVelocity(50);
            else
                AllVariables.Front_Thai.setAngularVelocity(-20);

            if(AllVariables.Back_Thai.getAngle() * (180/ Math.PI) < 30)
                AllVariables.Back_Thai.setAngularVelocity(50);
            else
                AllVariables.Back_Thai.setAngularVelocity(-20);



        }


        //---------------Back Leg----------------
        else{

            if(AllVariables.Back_Thai.getAngle() * (180/ Math.PI) >30)
                AllVariables.Back_Thai.setAngularVelocity(50);
            else
                AllVariables.Back_Thai.setAngularVelocity(-20);

            if(AllVariables.Front_Thai.getAngle() * (180/ Math.PI) < -30)
                AllVariables.Front_Thai.setAngularVelocity(50);
            else
                AllVariables.Front_Thai.setAngularVelocity(-20);



        }
    }

    public void tester(){
        AllVariables.Front_leg.setAngularVelocity(-30);
        AllVariables.Back_leg.setAngularVelocity(-30);
        AllVariables.Stomach1.setLinearVelocity(0,-5);


    }

    public void running () {

        AllVariables.Stomach1.setAngularVelocity(-13);
        AllVariables.Stomach2.setAngularVelocity(-13);
        AllVariables.Stomach3.setAngularVelocity(-13);




        if(AllVariables.Front_Thai.getAngle() * (180 / Math.PI) > 68 + AllVariables.Stomach1.getAngle() * (180/Math.PI)
                && AllVariables.Back_Thai.getAngle() * (180 / Math.PI) < -20 - AllVariables.Stomach1.getAngle() * (180/Math.PI)/2
                && AllVariables.Front_foot2.getWorldCenter().y < FootLevel+0.2f && front == true
                && (int)(AllVariables.Back_foot1.getLinearVelocity().y) ==0) {
            front = false;
            //AllVariables.Stomach1.applyForceToCenter(15,0,true);
            AllVariables.Stomach1.setLinearVelocity(50*MainGame.FrameAffector,0);
        }
        if (AllVariables.Front_Thai.getAngle() * (180 / Math.PI) < -20 - AllVariables.Stomach1.getAngle() * (180/Math.PI)/2
                && AllVariables.Back_Thai.getAngle() * (180 / Math.PI) > 68 + AllVariables.Stomach1.getAngle() * (180/Math.PI)
                && AllVariables.Back_foot2.getWorldCenter().y < FootLevel+0.2f && front == false
                && (int)(AllVariables.Front_foot1.getLinearVelocity().y) ==0) {
                front = true;
            //AllVariables.Stomach1.applyForceToCenter(15,0,true);
            AllVariables.Stomach1.setLinearVelocity(50*MainGame.FrameAffector,0);

        }

        //System.out.println(AllVariables.Front_Thai.getAngle()*(180/Math.PI) + "\t\t" + AllVariables.Back_Thai.getAngle()*(180/Math.PI));
        //System.out.println(AllVariables.Front_Thai.getAngle() * (180/Math.PI) + "\t" + AllVariables.Back_Thai.getAngle() * (180 / Math.PI));



        if(front){
            AllVariables.Back_Thai_Balance = false;
            AllVariables.Front_Thai_Balance = true;
            //movement of thais
            if(AllVariables.Front_Thai.getAngle() * (180/Math.PI) < 65) {
                AllVariables.Front_Thai.setAngularVelocity(43 * MainGame.FrameAffector);
                //AllVariables.Stomach1.setLinearVelocity(0,-5);
            }else{
                //AllVariables.Stomach1.applyForceToCenter(0,-5, true);
            }
            if(AllVariables.Back_Thai.getAngle() * (180/Math.PI) > -25) {
                AllVariables.Back_Thai.setAngularVelocity(-30 * MainGame.FrameAffector);
            }

            //movement of leg
            AllVariables.Front_leg.setAngularVelocity(-50*MainGame.FrameAffector);
            //AllVariables.Back_leg.setAngularVelocity(100);



            //downward force by foots
            if(AllVariables.Front_foot2.getWorldCenter().x > AllVariables.Back_foot2.getWorldCenter().x){
                AllVariables.Back_foot2.applyForceToCenter(0,-10, true);
                AllVariables.Front_foot1.applyForceToCenter(0,-2, true);
            }else{
                AllVariables.Back_foot1.applyForceToCenter(0,-5, true);
            }

        }



        else{
            AllVariables.Front_Thai_Balance = false;
            AllVariables.Back_Thai_Balance =true;

            if(AllVariables.Front_Thai.getAngle() * (180/Math.PI) > -25)
                AllVariables.Front_Thai.setAngularVelocity(-30* MainGame.FrameAffector);
            if(AllVariables.Back_Thai.getAngle() * (180/Math.PI) < 65) {
                AllVariables.Back_Thai.setAngularVelocity(43 * MainGame.FrameAffector);
                //AllVariables.Stomach1.setLinearVelocity(0,-5);
            }else{
                //AllVariables.Stomach1.applyForceToCenter(0,-5, true);
            }

            AllVariables.Back_leg.setAngularVelocity(-50*MainGame.FrameAffector);
            //AllVariables.Front_leg.setAngularVelocity(100);



            //downward force by foots
            if(AllVariables.Front_foot2.getWorldCenter().x < AllVariables.Back_foot2.getWorldCenter().x){
                AllVariables.Front_foot2.applyForceToCenter(0,-10, true);
                AllVariables.Front_foot1.applyForceToCenter(0,-2, true);
            }else{
                AllVariables.Front_foot1.applyForceToCenter(0,-5, true);
            }

        }

        //System.out.println(AllVariables.Front_Thai.getAngle() * (180/Math.PI) + "\t" + AllVariables.Back_Thai.getAngle() * (180/Math.PI));





    }


    public void backflip () {

        //Step Assigner

        //stepwise moves over here
        if(AllVariables.stuntStep == 1){

        }

        else if(AllVariables.stuntStep == 2){
            AllVariables.BackFlip = false;
        }

    }


}
