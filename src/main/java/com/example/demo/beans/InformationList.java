package com.example.demo.beans;

import java.util.ArrayList;
import java.util.List;


public class InformationList
{
    private List<Information> informationList;
     
    public List<Information> getInformationList() {
        if(informationList == null) {
            informationList = new ArrayList<>();
        }
        return informationList;
    }
  
    public void setInformationList(List<Information> informationList) {
        this.informationList = informationList;
    }
}
