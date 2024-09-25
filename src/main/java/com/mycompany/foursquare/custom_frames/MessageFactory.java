/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.foursquare.custom_frames;


/**
 *
 * @author Vlamydir
 */
public class MessageFactory {

    public static MessageFrame createMessage(String title, String content){
           return ShowMessage.getInstance(title, content);
    }

    public static MessageFrame infoMessage(String content){
           return ShowMessage.getInstance("Info", content);
    }

    public static MessageFrame warningMessage(String content){
           return ShowMessage.getInstance("Warning", content);
    }
}

