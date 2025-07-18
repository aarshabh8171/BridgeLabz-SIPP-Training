package workshop02;

class Show {
    String name;
    int time;




    public Show(String name, int time) {
        this.name = name;
        this.time = time;
    }


    void print() {
        int hour = time / 60;
        int minute = time % 60;
        System.out.println(name + " at " + hour + ":" + minute);
    }
}



public class MovieTime {



    public static void main(String[] args) {
        Show[] shows = new Show[10];  
        int count = 0;  
                    

        count = addShow(shows, count, "Spider-Man", 660);  
        count = addShow(shows, count, "Batman", 720);      
        count = addShow(shows, count, "Superman", 780);    
        count = addShow(shows, count, "The Flash", 690);  


        System.out.println("Upcoming Shows:");
        for (int i = 0; i < count; i++) {
            shows[i].print();
        }
    }





    static int addShow(Show[] shows, int count, String name, int time) {
        int i = count - 1;
        while (i >= 0 && shows[i].time > time) {
            shows[i + 1] = shows[i];  
            i--;
        }
        shows[i + 1] = new Show(name, time);  
        return count + 1;
    }
}
