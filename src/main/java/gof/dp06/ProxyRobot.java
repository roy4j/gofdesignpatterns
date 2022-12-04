package gof.dp06;

public class ProxyRobot implements Robot {
    private RealRobot realRobot;

    public void talk(String s) {
        if (realRobot == null) {
            realRobot = new RealRobot();
        }
        realRobot.talk(s);
    }
}