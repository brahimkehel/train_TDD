package com.sqli.train;

import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

public class TrainFactory {

    public List<Wagon> create(String wagons){
        List<Wagon> wagonsList=new ArrayList<>();
        for(int index=0;index<wagons.length();index++){
            if(wagons.charAt(index)=='H' && index==0){
                wagonsList.add(new FirstHead());
            }
            else if(wagons.charAt(index)=='H' && index==wagons.length()-1){
                wagonsList.add(new LastHead());
            }
            else if(wagons.charAt(index)=='P'){
                wagonsList.add(new Passenger());
            }
            else if(wagons.charAt(index)=='R'){
                wagonsList.add(new Restaurant());
            }
            else if(wagons.charAt(index)=='C'){
                wagonsList.add(new EmptyCargo());
            }
        }
        return wagonsList;
    }
}
