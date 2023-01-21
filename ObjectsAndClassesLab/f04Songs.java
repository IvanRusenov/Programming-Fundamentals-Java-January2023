package ObjectsAndClassesLab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class f04Songs {

    public static class Song {

        private String typeList;
        private String name;
        private String time;

        public Song (String typeList, String name, String time) {

            this.typeList = typeList;
            this.time = time;
            this.name = name;
        }

        public String getTypeList() {
            return typeList;
        }

        public String getName() {
            return name;
        }

        public String getTime() {
            return time;
        }
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numberOfSongs = Integer.parseInt(scan.nextLine());

        List<Song> songList = new ArrayList<>();

        for (int i = 0; i < numberOfSongs; i++) {

            String[] input = scan.nextLine().split("_");

            Song song = new Song(input[0], input[1], input[2]);

            songList.add(song);

        }
        String tList = scan.nextLine();

        if (tList.equals("all")) {

            for (Song item : songList) {

                System.out.println(item.getName());


            }

        } else {

            for (Song item : songList) {

                if (tList.equals(item.getTypeList())) {
                    System.out.println(item.getName());
                }

            }

        }


    }
}
