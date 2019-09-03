package com.dorizu.umovie;

import java.util.ArrayList;

public class MovieData {
//    private String judul;
//    private String tanggalRilis;
//    private String overview;
//    private String durasi;
//    private String bahasa;
//    private String director;
//    private String genre;
//    private String thunail;

    public static String[][] movieData = new String[][]{
            {"The Old Man & the Gun",
                    "September 28, 2018",
                    "The true story of Forrest Tucker, from his audacious escape from San Quentin at the age of 70 to an unprecedented string of heists that confounded authorities and enchanted the public. Wrapped up in the pursuit are a detective, who becomes captivated with Forrest’s commitment to his craft, and a woman, who loves him in spite of his chosen profession.",
                    "1h 33m",
                    "English",
                    "David Lowery",
                    "Comedy\nCrime\nDrama",
                    "https://image.tmdb.org/t/p/w600_and_h900_bestv2/a4BfxRK8dBgbQqbRxPs8kmLd8LG.jpg"},
            {"Fast & Furious Presents: Hobbs & Shaw",
                    "August 2, 2019",
                    "A spinoff of The Fate of the Furious, focusing on Johnson's US Diplomatic Security Agent Luke Hobbs forming an unlikely alliance with Statham's Deckard Shaw.",
                    "2h 16m",
                    "English",
                    "David Leitch",
                    "Action",
                    "https://image.tmdb.org/t/p/w300_and_h450_bestv2/keym7MPn1icW1wWfzMnW3HeuzWU.jpg"},
            {"John Wick: Chapter 3 – Parabellum",
                    "May 17, 2019",
                    "Super-assassin John Wick returns with a $14 million price tag on his head and an army of bounty-hunting killers on his trail. After killing a member of the shadowy international assassin’s guild, the High Table, John Wick is excommunicado, but the world’s most ruthless hit men and women await his every turn.",
                    "2h 11m",
                    "English",
                    "Chad Stahelski",
                    "Crime\nThriller",
                    "https://image.tmdb.org/t/p/w300_and_h450_bestv2/ziEuG1essDuWuC5lpWUaw1uXY2O.jpg"},
            {"Hello, Love, Goodbye",
                    "July 31, 2019",
                    "A love story of Joy and Ethan, Filipino workers based in Hong Kong. Ethan, a bartender, is keen on romantically pursuing Joy, a domestic helper who is wholly dedicated to providing for her family.",
                    "-",
                    "Tagalog",
                    "Cathy Garcia-Molina",
                    "Romance\nDrama",
                    "https://image.tmdb.org/t/p/w300_and_h450_bestv2/kTca5fpKhFOKIiG0tz8tynhsWs5.jpg"},
            {"The Lion King",
                    "July 19, 2019",
                    "Simba idolises his father, King Mufasa, and takes to heart his own royal destiny. But not everyone in the kingdom celebrates the new cub's arrival. Scar, Mufasa's brother—and former heir to the throne—has plans of his own. The battle for Pride Rock is ravaged with betrayal, tragedy and drama, ultimately resulting in Simba's exile. With help from a curious pair of newfound friends, Simba will have to figure out how to grow up and take back what is rightfully his.",
                    "1h 58m",
                    "English",
                    "Jon Favreau",
                    "ADVENTURE",
                    "https://image.tmdb.org/t/p/w300_and_h450_bestv2/2bXbqYdUdNVa8VIWXVfclP2ICtT.jpg"},
            {"Aladdin",
                    "May 24, 2019",
                    "A kindhearted street urchin named Aladdin embarks on a magical adventure after finding a lamp that releases a wisecracking genie while a power-hungry Grand Vizier vies for the same lamp that has the power to make their deepest wishes come true.",
                    "2h 8m",
                    "English",
                    "Guy Ritchie",
                    "ADVENTURE",
                    "https://image.tmdb.org/t/p/w300_and_h450_bestv2/3iYQTLGoy7QnjcUYRJy4YrAgGvp.jpg"},
            {"Dark Phoenix",
                    "June 7, 2019",
                    "The X-Men face their most formidable and powerful foe when one of their own, Jean Grey, starts to spiral out of control. During a rescue mission in outer space, Jean is nearly killed when she's hit by a mysterious cosmic force. Once she returns home, this force not only makes her infinitely more powerful, but far more unstable. The X-Men must now band together to save her soul and battle aliens that want to use Grey's new abilities to rule the galaxy.",
                    "1h 54m",
                    "English",
                    "Simon Kinberg",
                    "SCIENCE FICTION",
                    "https://image.tmdb.org/t/p/w300_and_h450_bestv2/cCTJPelKGLhALq3r51A9uMonxKj.jpg"},
            {"Spider-Man: Far from Home",
                    "July 2, 2019",
                    "Peter Parker and his friends go on a summer trip to Europe. However, they will hardly be able to rest - Peter will have to agree to help Nick Fury uncover the mystery of creatures that cause natural disasters and destruction throughout the continent.",
                    "2h 9m",
                    "English",
                    "Jon Watts",
                    "SCIENCE FICTION",
                    "https://image.tmdb.org/t/p/w300_and_h450_bestv2/lcq8dVxeeOqHvvgcte707K0KVx5.jpg"},
            {"Godzilla: King of the Monsters",
                    "May 31, 2019",
                    "Follows the heroic efforts of the crypto-zoological agency Monarch as its members face off against a battery of god-sized monsters, including the mighty Godzilla, who collides with Mothra, Rodan, and his ultimate nemesis, the three-headed King Ghidorah. When these ancient super-species - thought to be mere myths - rise again, they all vie for supremacy, leaving humanity's very existence hanging in the balance.",
                    "2h 12m",
                    "English",
                    "Michael Dougherty",
                    "SCIENCE FICTION",
                    "https://image.tmdb.org/t/p/w300_and_h450_bestv2/pU3bnutJU91u3b4IeRPQTOP8jhV.jpg"},
            {"Cars",
                    "June 9, 2006",
                    "Lightning McQueen, a hotshot rookie race car driven to succeed, discovers that life is about the journey, not the finish line, when he finds himself unexpectedly detoured in the sleepy Route 66 town of Radiator Springs. On route across the country to the big Piston Cup Championship in California to compete against two seasoned pros, McQueen gets to know the town's offbeat characters.",
                    "1h 57m",
                    "English",
                    "John Lasseter",
                    "ANIMATION",
                    "https://image.tmdb.org/t/p/w300_and_h450_bestv2/jpfkzbIXgKZqCZAkEkFH2VYF63s.jpg"},
            {"It: Chapter Two",
                    "September 6, 2019",
                    "27 years after overcoming the malevolent supernatural entity Pennywise, the former members of the Losers' Club, who have grown up and moved away from Derry, are brought back together by a devastating phone call.",
                    "2h 49m",
                    "English",
                    "Andy Muschietti",
                    "Horror",
                    "https://image.tmdb.org/t/p/w300_and_h450_bestv2/wF6SNPcUrTKFA4fOFfukm7zQ3ob.jpg"},
            {"Avengers: Endgame",
                    "April 26, 2019",
                    "After the devastating events of Avengers: Infinity War, the universe is in ruins due to the efforts of the Mad Titan, Thanos. With the help of remaining allies, the Avengers must assemble once more in order to undo Thanos' actions and restore order to the universe once and for all, no matter what consequences may be in store.",
                    "3h 1m",
                    "English",
                    "Joe Russo",
                    "SCIENCE FICTION",
                    "https://image.tmdb.org/t/p/w300_and_h450_bestv2/or06FN3Dka5tukK1e9sl16pB3iy.jpg"}
    };

    public static ArrayList<Movie> getListData(){
        ArrayList<Movie> list = new ArrayList<>();
        Movie movie = null;
        for (int i = 0; i < movieData.length ; i++) {
            movie = new Movie();
            movie.setJudul(movieData[i][0]);
            movie.setTanggalRilis(movieData[i][1]);
            movie.setOverview(movieData[i][2]);
            movie.setDurasi(movieData[i][3]);
            movie.setBahasa(movieData[i][4]);
            movie.setDirector(movieData[i][5]);
            movie.setGenre(movieData[i][6]);
            movie.setThunail(movieData[i][7]);

            list.add(movie);
        }
        return list;
    };
}
