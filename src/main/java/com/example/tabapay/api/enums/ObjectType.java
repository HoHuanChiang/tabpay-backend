package com.example.tabapay.api.enums;

public enum ObjectType {
    Folder(0), Location(1);

    private int ObjectTypeId;

    ObjectType(int id){
        ObjectTypeId = id;
    }

    public int GetObjectTypeId(){
        return this.ObjectTypeId;
    }
}
