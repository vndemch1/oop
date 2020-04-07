public class Start {
    public static void main(String[] args) {
        Wall wall = new Wall();
        wall.setHeight(150); // в см, для реальности
        RaceTrack raceTrack = new RaceTrack();
        raceTrack.setDistance(2000); // в метрах
        Sporter sporter1 = new Sporter("Sporter1",140,1900);
        sporter1.canJump(wall.getHeight());
        sporter1.canRun(raceTrack.getDistance());
        Sporter sporter2 = new Sporter("Sporter2",155,1950);
        sporter2.canJump(wall.getHeight());
        sporter2.canRun(raceTrack.getDistance());
        Sporter sporter3 = new Sporter("Sporter3",140,2100);
        sporter3.canJump(wall.getHeight());
        sporter3.canRun(raceTrack.getDistance());
        Sporter sporter4 = new Sporter("Sporter4",170,2500);
        sporter4.canJump(wall.getHeight());
        sporter4.canRun(raceTrack.getDistance());
    }
}
/* вывод программы:
"C:\Program Files\Java\jdk1.8.0_161\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2019.2.1\lib\idea_rt.jar=50388:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2019.2.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\Program Files\Java\jdk1.8.0_161\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.8.0_161\jre\lib\deploy.jar;C:\Program Files\Java\jdk1.8.0_161\jre\lib\ext\access-bridge-64.jar;C:\Program Files\Java\jdk1.8.0_161\jre\lib\ext\cldrdata.jar;C:\Program Files\Java\jdk1.8.0_161\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.8.0_161\jre\lib\ext\jaccess.jar;C:\Program Files\Java\jdk1.8.0_161\jre\lib\ext\jfxrt.jar;C:\Program Files\Java\jdk1.8.0_161\jre\lib\ext\localedata.jar;C:\Program Files\Java\jdk1.8.0_161\jre\lib\ext\nashorn.jar;C:\Program Files\Java\jdk1.8.0_161\jre\lib\ext\sunec.jar;C:\Program Files\Java\jdk1.8.0_161\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.8.0_161\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk1.8.0_161\jre\lib\ext\sunpkcs11.jar;C:\Program Files\Java\jdk1.8.0_161\jre\lib\ext\zipfs.jar;C:\Program Files\Java\jdk1.8.0_161\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.8.0_161\jre\lib\jce.jar;C:\Program Files\Java\jdk1.8.0_161\jre\lib\jfr.jar;C:\Program Files\Java\jdk1.8.0_161\jre\lib\jfxswt.jar;C:\Program Files\Java\jdk1.8.0_161\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.8.0_161\jre\lib\management-agent.jar;C:\Program Files\Java\jdk1.8.0_161\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.8.0_161\jre\lib\resources.jar;C:\Program Files\Java\jdk1.8.0_161\jre\lib\rt.jar;D:\java\oop\lesson1_2\target\classes" Start
Sporter1 не в состоянии преодолеть высоту, равную 150
Sporter1 не в состоянии пробежать дистанцию, равную 2000
Sporter2 успешно преодолел высоту, равную 150
Sporter2 не в состоянии пробежать дистанцию, равную 2000
Sporter3 не в состоянии преодолеть высоту, равную 150
Sporter3 успешно пробежал дистанцию, равную 2000
Sporter4 успешно преодолел высоту, равную 150
Sporter4 успешно пробежал дистанцию, равную 2000

Process finished with exit code 0

 */