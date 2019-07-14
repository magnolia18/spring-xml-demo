package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("com/stackroute/beans.xml");
        System.out.println("Beans.xml file loaded.");
        Movie movie = context.getBean("movie", Movie.class);
        movie.readInfo();
    }
}
