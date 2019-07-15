package com.stackroute.domain;

public class Movie {

   private Actor actor;

    public Movie(Actor actor) {
        this.actor = actor;
    }

    public Actor getActor() {
        return actor;
    }

    public void display(){
package com.stackroute.domain;

public class Movie {

   private Actor actorr;

    @Override
    public String toString() {
        return "Movie{" +
                "actor=" + actorr +
                '}';
    }

    public Actor getActorr() {
        return actorr;
    }

    public void setActorr(Actor actorr) {
        this.actorr = actorr;
    }
}

        System.out.println("Actor name: "+actor.getName()+"\nAge : "+actor.getAge()+"\nGender: "+actor.getGender());
    }
}
