package com.bridgelabz;

import java.util.HashSet;
import java.util.Set;

public class BirdRepository {
    private static BirdRepository birdRepository;
    private BirdRepository (){

    }
    private Set<Bird> set = new HashSet<Bird>();
    public static BirdRepository getInstance(){
        if (birdRepository == null){
            birdRepository = new BirdRepository();
        }
        return  birdRepository;
    }

    public void addBird(Bird bird){
    set.add(bird);
        System.out.println(set.size());
    }
    public Set getBirdList(){
        System.out.println(set.size());
        return set;
    }
}
