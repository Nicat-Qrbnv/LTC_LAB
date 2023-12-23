package Lesson24.task;

import java.util.ArrayList;
import java.util.List;

public class MovieCasting {
    public static void main(String[] args) {

        Actor a1 = new Actor("Leonardo DiCaprio", 48, 9);
        Actor a2 = new Actor("Jennifer Lawrence", 33, 7);
        Actor a3 =new Actor("Robert Downey Jr.", 57, 7);
        Actor a4 =new Actor("Charlize Theron", 47, 8);
        Actor a5 =new Actor("Chris Hemsworth", 40, 6);
        Actor a6 =new Actor("Emma Stone", 35, 6);

        Role r1 = new Role("The Small-Town Cop", 40, 60);
        Role r2 = new Role("The Ambitious Journalist", 30, 37);
        Role r3 = new Role("The Dedicated Teacher", 30, 50);
        Role r4 = new Role("The Friendly Barista", 27, 35);
        Role r5 = new Role("The Reluctant Detective", 40, 50);
        Role r6 = new Role("The Neighbor", 30, 60);

        ArrayList <Actor> actors = new ArrayList<>(List.of(a1, a2, a3, a4, a5, a6));
        actors.sort(new SortActorsByActingSkill().reversed());

        ArrayList <Role> roles = new ArrayList<>(List.of(r1, r2, r3, r4, r5, r6));
        roles.sort(new SortRolesByMinAge());

        for (Role r : roles) {
            System.out.print (r);
            for (Actor a : actors) {
                if (checkSuitability(r, a)) {
                    a.setHasRole(true);
                    System.out.println (a);
                    System.out.println ();
                    break;
                }
            }
        }
    }

    private static boolean checkSuitability (Role role, Actor actor) {
        return (actor.getAge() >= role.getMinAge()) && (actor.getAge() <= role.getMaxAge()) && !actor.isHasRole();
    }
}
