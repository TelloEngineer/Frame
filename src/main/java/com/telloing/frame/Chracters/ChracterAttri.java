/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.telloing.frame.Chracters;

import java.util.Hashtable;

import com.telloing.frame.Frames.Animations;
import java.awt.Rectangle;

/**
 *
 * @author josue
 */
public class ChracterAttri {
    private int x;
    private int y;
    private int speed;
    
    private boolean collision;
    private Rectangle solidArea; // rectangle = x, y, width, height
    
    private Hashtable<String, Animations> listAnimations;
    

    public Hashtable<String, Animations> getListAnimations() {
        return listAnimations;
    }

    public ChracterAttri(int x, int y, int speed, Hashtable<String, Animations> listAnimations) {
        this.x = x;
        this.y = y;
        this.speed = speed;
        this.listAnimations = listAnimations;
        this.collision = false;
        this.solidArea = new Rectangle(0, 0, 32, 32);
    }

    public void setChracterAttri(ChracterAttri attri){
        this.speed = attri.getSpeed();
        this.x = attri.getX();
        this.y = attri.getY();
        this.listAnimations.clear();
        this.listAnimations.putAll(attri.getListAnimations());
    }
    
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
    
    public void setCollision(boolean collision) {
        this.collision = collision;
    }
    
    public boolean getCollision() {
        return this.collision;
    }
    
    public void setSolidArea(Rectangle solidArea) {
        this.solidArea = solidArea;
    }
    
    public Rectangle getSolidArea() {
        return this.solidArea;
    }

    @Override
    public String toString() {
        return "ChracterAttri{" + "x=" + x + ", y=" + y + ", speed=" + speed + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 19 * hash + this.x;
        hash = 19 * hash + this.y;
        hash = 19 * hash + this.speed;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ChracterAttri other = (ChracterAttri) obj;
        if (this.x != other.x) {
            return false;
        }
        if (this.y != other.y) {
            return false;
        }
        return this.speed == other.speed;
    }
}
