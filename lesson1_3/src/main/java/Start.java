public class Start {
    public static void main(String[] args) {
        // Команда из 10 участников
        Sporter member1 = new Sporter("Member1",2000,140);
        Sporter member2 = new Sporter("Member2",1000,90);
        Sporter member3 = new Sporter("Member3",3000,170);
        Sporter member4 = new Sporter("Member4",1500,100);
        Sporter member5 = new Sporter("Member5",2800,240);
        Sporter member6 = new Sporter("Member6",2500,150);
        Sporter member7 = new Sporter("Member7",1000,240);
        Sporter member8 = new Sporter("Member8",2000,160);
        Sporter member9 = new Sporter("Member9",2300,190);
        Sporter member10 = new Sporter("Member10",2000,180);
        Sporter[] members = {member1,member2,member3,member4,member5,member6,member7,member8,member9,member10};
        // Полоса препятствий
        Barrier obstacle1 = new Wall();
        obstacle1.setMeasure(150);
        Barrier obstacle3 = new Wall();
        obstacle3.setMeasure(160);
        Barrier obstacle5 = new Wall();
        obstacle5.setMeasure(100);
        Barrier obstacle7 = new Wall();
        obstacle7.setMeasure(120);

        Barrier obstacle2 = new RaceTrack();
        obstacle2.setMeasure(1500);
        Barrier obstacle4 = new RaceTrack();
        obstacle4.setMeasure(1800);
        Barrier obstacle6 = new RaceTrack();
        obstacle6.setMeasure(1800);
        Barrier obstacle8 = new RaceTrack();
        obstacle8.setMeasure(1000);
        Barrier[] obstacles = {obstacle1,obstacle2,obstacle3,obstacle4,obstacle5,obstacle6,obstacle7,obstacle8};

        for (Sporter member: members) {
            for(Barrier obstacle: obstacles) {
                member.canDoIt(obstacle.getType(),obstacle.getMeasure());
            }
        }

        for (Sporter member: members) {
            if (member.getParticipate() == 1) {
                System.out.println(member.getName() + " преодолел все препятствия");
            } else {
                System.out.println(member.getName() + " не смог пройти полосу");
            }
        }
    }
}

/* Вывод программы
"C:\Program Files\Java\jdk1.8.0_161\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2019.2.1\lib\idea_rt.jar=50986:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2019.2.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\Program Files\Java\jdk1.8.0_161\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.8.0_161\jre\lib\deploy.jar;C:\Program Files\Java\jdk1.8.0_161\jre\lib\ext\access-bridge-64.jar;C:\Program Files\Java\jdk1.8.0_161\jre\lib\ext\cldrdata.jar;C:\Program Files\Java\jdk1.8.0_161\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.8.0_161\jre\lib\ext\jaccess.jar;C:\Program Files\Java\jdk1.8.0_161\jre\lib\ext\jfxrt.jar;C:\Program Files\Java\jdk1.8.0_161\jre\lib\ext\localedata.jar;C:\Program Files\Java\jdk1.8.0_161\jre\lib\ext\nashorn.jar;C:\Program Files\Java\jdk1.8.0_161\jre\lib\ext\sunec.jar;C:\Program Files\Java\jdk1.8.0_161\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.8.0_161\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk1.8.0_161\jre\lib\ext\sunpkcs11.jar;C:\Program Files\Java\jdk1.8.0_161\jre\lib\ext\zipfs.jar;C:\Program Files\Java\jdk1.8.0_161\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.8.0_161\jre\lib\jce.jar;C:\Program Files\Java\jdk1.8.0_161\jre\lib\jfr.jar;C:\Program Files\Java\jdk1.8.0_161\jre\lib\jfxswt.jar;C:\Program Files\Java\jdk1.8.0_161\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.8.0_161\jre\lib\management-agent.jar;C:\Program Files\Java\jdk1.8.0_161\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.8.0_161\jre\lib\resources.jar;C:\Program Files\Java\jdk1.8.0_161\jre\lib\rt.jar;D:\java\oop\lesson1_3\target\classes" Start
Member1 не смог прыгуть на высоту 150
Member1 сходит с дистанции
Member2 не смог прыгуть на высоту 150
Member2 сходит с дистанции
Member3 успешно прыгнул на высоту 150
Member3 успешно пробежал дистанцию в 1500
Member3 успешно прыгнул на высоту 160
Member3 успешно пробежал дистанцию в 1800
Member3 успешно прыгнул на высоту 100
Member3 успешно пробежал дистанцию в 1800
Member3 успешно прыгнул на высоту 120
Member3 успешно пробежал дистанцию в 1000
Member4 не смог прыгуть на высоту 150
Member4 сходит с дистанции
Member5 успешно прыгнул на высоту 150
Member5 успешно пробежал дистанцию в 1500
Member5 успешно прыгнул на высоту 160
Member5 успешно пробежал дистанцию в 1800
Member5 успешно прыгнул на высоту 100
Member5 успешно пробежал дистанцию в 1800
Member5 успешно прыгнул на высоту 120
Member5 успешно пробежал дистанцию в 1000
Member6 успешно прыгнул на высоту 150
Member6 успешно пробежал дистанцию в 1500
Member6 не смог прыгуть на высоту 160
Member6 сходит с дистанции
Member7 успешно прыгнул на высоту 150
Member7 не смог пробежать дистанцию 1500
Member7 сходит с дистанции
Member8 успешно прыгнул на высоту 150
Member8 успешно пробежал дистанцию в 1500
Member8 успешно прыгнул на высоту 160
Member8 успешно пробежал дистанцию в 1800
Member8 успешно прыгнул на высоту 100
Member8 успешно пробежал дистанцию в 1800
Member8 успешно прыгнул на высоту 120
Member8 успешно пробежал дистанцию в 1000
Member9 успешно прыгнул на высоту 150
Member9 успешно пробежал дистанцию в 1500
Member9 успешно прыгнул на высоту 160
Member9 успешно пробежал дистанцию в 1800
Member9 успешно прыгнул на высоту 100
Member9 успешно пробежал дистанцию в 1800
Member9 успешно прыгнул на высоту 120
Member9 успешно пробежал дистанцию в 1000
Member10 успешно прыгнул на высоту 150
Member10 успешно пробежал дистанцию в 1500
Member10 успешно прыгнул на высоту 160
Member10 успешно пробежал дистанцию в 1800
Member10 успешно прыгнул на высоту 100
Member10 успешно пробежал дистанцию в 1800
Member10 успешно прыгнул на высоту 120
Member10 успешно пробежал дистанцию в 1000

Member1 не смог пройти полосу
Member2 не смог пройти полосу
Member3 преодолел все препятствия
Member4 не смог пройти полосу
Member5 преодолел все препятствия
Member6 не смог пройти полосу
Member7 не смог пройти полосу
Member8 преодолел все препятствия
Member9 преодолел все препятствия
Member10 преодолел все препятствия

Process finished with exit code 0

 */