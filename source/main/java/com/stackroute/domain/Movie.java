package com.stackroute.domain;

public class Movie {

    //Movie dependency
    Actor actor;

    //Setter for actor bean.
    public void setActor(Actor actor) {
        this.actor = actor;
    }

    //To read actor information
    public void readInfo()
    {
        actor.actorInfo();
    }
}
