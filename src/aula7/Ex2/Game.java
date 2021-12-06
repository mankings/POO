package aula7.Ex2;

public class Game {
    public static void main(String[] args) {
        Robot a = new Robot(10, 10, "AV", "Avançado");
        Robot b = new Robot(10, 20, "GR", "GuardaRedes");
        Robot c = new Robot(10, 30, "D", "Defesa");

        Team Blu = new Team("BLU", "Spy");
        Blu.addRobot(a);
        Blu.addRobot(b);
        Blu.addRobot(c);
    }
}
