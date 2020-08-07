package com.febryandana.topgames

object GameData {
    private var gameNames = arrayOf(
        "The Legend of Zelda: Ocarina of Time",
        "Tony Hawks\'s Pro Skater 2",
        "Grand Theft Auto IV",
        "SoulCalibur",
        "Grand Theft Auto IV",
        "Super Mario Galaxy",
        "Super Mario Galaxy 2",
        "Red Dead Redemption 2",
        "Grand Theft Auto V",
        "Grand Theft Auto V",
        "Grand Theft Auto V",
        "Tony Hawk's Pro Skater 2",
        "The Legend of Zelda: Breath of the Wild",
        "Tony Hawk's Pro Skater 3",
        "Perfect Dark",
        "Red Dead Redemption 2",
        "Grand Theft Auto V",
        "Metroid Prime",
        "Grand Theft Auto III",
        "Super Mario Odyssey")

    private var gamePlatforms = arrayOf("Nintendo 64", "PlayStation", "PlayStation 3", "Dreamcast", "Xbox 360", "Wii","Wii", "Xbox One", "Xbox One", "PlayStation 3",
        "Xbox 360", "Dreamcast","Switch","PlayStation 2","Nintendo 64","PlayStation 4","PlayStation 4","GameCube","PlayStation 2","Switch")

    private var gameRelease = arrayOf(
        "November 23, 1998",
        "September 20, 2000",
        "April 29, 2008",
        "September 8,1999",
        "April 29, 2008",
        "November 12, 2007",
        "May 23, 2010",
        "Oktober 26, 2018",
        "November 18, 2014",
        "September 17, 2013",
        "September 17, 2013",
        "November 6, 2000",
        "March 3, 2017",
        "October 28, 2001",
        "May 22, 2000",
        "October 26, 2018",
        "November 18, 2014",
        "November 17, 2002",
        "October 22, 2001",
        "October 27, 2017")

    private var gameScores = arrayOf(
        "Metascore: 99\nUser Score: 9.1",
        "Metascore: 98\nUser Score: 7.5",
        "Metascore: 98\nUser Score: 7.6",
        "Metascore: 98\nUser Score: 8.5",
        "Metascore: 98\nUser Score: 7.9",
        "Metascore: 97\nUser Score: 9.0",
        "Metascore: 97\nUser Score: 9.1",
        "Metascore: 97\nUser Score: 7.9",
        "Metascore: 97\nUser score: 7.8",
        "Metascore: 97\nUser Score: 8.3",
        "Metascore: 97\nUser Score: 8.3",
        "Metascore: 97\nUser Score: 6.1",
        "Metascore: 97\nUser Score: 8.6",
        "Metascore: 97\nUser Score: 7.6",
        "Metascore: 97\nUser Score: 8.9",
        "Metascore: 97\nUser Score: 8.4",
        "Metascore: 97\nUser Score: 8.4",
        "Metascore: 97\nUser Score: 9.2",
        "Metascore: 97\nUser Score: 8.4",
        "Metascore: 97\nUser Score: 8.9")

    private var gameDetails = arrayOf(
        "As a young boy, Link is tricked by Ganondorf, the King of the Gerudo Thieves. The evil human uses Link to gain access to the Sacred Realm, where he places his tainted hands on Triforce and transforms the beautiful Hyrulean landscape into a barren wasteland. Link is determined to fix the problems he helped to create, so with the help of Rauru he travels through time gathering the powers of the Seven Sages.",
        "As most major publishers\' development efforts shift to any number of next-generation platforms, Tony Hawk 2 will likely stand as one of the last truly fantastic games to be released on the PlayStation.",
        "[Metacritic\'s 2008 PS3 Game of the Year; Also known as \"GTA IV\"] What does the American Dream mean today? For Niko Belic, fresh off the boat from Europe. It\'s the hope he can escape his past. For his cousin, Roman, it is the vision that together they can find fortune in Liberty City, gateway to the land of opportunity. As they slip into debt and are dragged into a criminal underworld by a series of shysters, thieves and sociopaths, they discover that the reality is very different from the dream in a city that worships money and status, and is heaven for those who have them an a living nightmare for those who don\'t. [Rockstar Games]",
        "This is a tale of souls and swords, transcending the world and all its history, told for all eternity... The greatest weapons-based fighter returns, this time on Sega Dreamcast. Soul Calibur unleashes incredible graphics, fantastic fighters, and combos so amazing they\'ll make your head spin!",
        "[Metacritic\'s 2008 Xbox 360 Game of the Year; Also known as \"GTA IV\"] What does the American Dream mean today? For Niko Belic, fresh off the boat from Europe. It\'s the hope he can escape his past. For his cousin, Roman, it is the vision that together they can find fortune in Liberty City, gateway to the land of opportunity. As they slip into debt and are dragged into a criminal underworld by a series of shysters, thieves and sociopaths, they discover that the reality is very different from the dream in a city that worships money and status, and is heaven for those who have them an a living nightmare for those who don\'t. [Rockstar Games]",
        "[Metacritic\'s 2007 Wii Game of the Year] The ultimate Nintendo hero is taking the ultimate step ... out into space. Join Mario as he ushers in a new era of video games, defying gravity across all the planets in the galaxy. When some creature escapes into space with Princess Peach, Mario gives chase, exploring bizarre planets all across the galaxy. Mario, Peach and enemies new and old are here. Players run, jump and battle enemies as they explore all the planets in the galaxy. Since this game makes full use of all the features of the Wii Remote, players have to do all kinds of things to succeed: pressing buttons, swinging the Wii Remote and the Nunchuk, and even pointing at and dragging things with the pointer. Since he\'s in space, Mario can perform mind-bending jumps unlike anything he\'s done before. He\'ll also have a wealth of new moves that are all based around tilting, pointing and shaking the Wii Remote. Shake, tilt and point! Mario takes advantage of all the unique aspects of the Wii Remote and Nunchuk controller, unleashing new moves as players shake the controller and even point at and drag items with the pointer. [Nintendo]",
        "Super Mario Galaxy 2, the sequel to the galaxy-hopping original game, includes the gravity-defying, physics-based exploration from the first game, but is loaded with entirely new galaxies and features to challenge players. On some stages, Mario can pair up with his dinosaur buddy Yoshi and use his tongue to grab items and spit them back at enemies. Players can also have fun with new items such as a drill that lets our hero tunnel through solid rock. [Nintendo]",
        "Developed by the creators of Grand Theft Auto V and Red Dead Redemption, Red Dead Redemption 2 is an epic tale of life in America’s unforgiving heartland. The game’s vast and atmospheric world also provides the foundation for a brand new online multiplayer experience. America, 1899. The end of the Wild West era has begun. After a robbery goes badly wrong in the western town of Blackwater, Arthur Morgan and the Van der Linde gang are forced to flee. With federal agents and the best bounty hunters in the nation massing on their heels, the gang has to rob, steal and fight their way across the rugged heartland of America in order to survive. As deepening internal fissures threaten to tear the gang apart, Arthur must make a choice between his own ideals and loyalty to the gang that raised him. [Rockstar]",
        "Grand Theft Auto 5 melds storytelling and gameplay in unique ways as players repeatedly jump in and out of the lives of the game\'s three protagonists, playing all sides of the game\'s interwoven story.",
        "Los Santos is a vast, sun-soaked metropolis full of self-help gurus, starlets and once-important, formerly-known-as celebrities. The city was once the envy of the Western world, but is now struggling to stay afloat in an era of economic uncertainty and reality TV. Amidst the chaos, three unique criminals plot their own chances of survival and success: Franklin, a former street gangster in search of real opportunities and serious cheddar; Michael, a professional ex-con whose retirement is a lot less rosy than he hoped it would be; and Trevor, a violent maniac driven by the chance of a cheap high and the next big score. Quickly running out of options, the crew risks it all in a sequence of daring and dangerous heists that could set them up for life.",
        "Los Santos is a sprawling sun-soaked metropolis full of self-help gurus, starlets and once-important stars. The city was once the envy of the Western world, but is now struggling to stay relevant in an era of economic uncertainty and reality TV. Amidst the chaos, three very different criminals chart their own chances of survival and success: Franklin, a former street gangster, now looking for real opportunities and fat stacks of cash; Michael, a professional ex-con whose retirement is significantly less rosy than he hoped it would be; and Trevor, a violent maniac driven by the chance of a cheap high and the next big score. Rapidly running out of options, the crew risks everything in a series of bolt and dangerous heists that could set them up for the long haul.",
        "Hawk's back - with new technology, new pros and new tricks! THPS2, the legend rides on! Skate as legendary Tony Hawk or any one of 12 other pro skaters. Create your own custom skaters. Multiple play modes including 1-Player, Career and Free Skate modes, as well as 2-player modes such as Trick Attack, Graffiti Tag and Horse. Build your own custom skate parks with the real-time 3D park editor.",
        "Forget everything you know about The Legend of Zelda games. Step into a world of discovery, exploration and adventure in The Legend of Zelda: Breath of the Wild, a boundary-breaking new game in the acclaimed series. Travel across fields, through forests and to mountain peaks as you discover what has become of the ruined kingdom of Hyrule in this open-air adventure. Explore the wilds of Hyrule any way you like.",
        "Challenge up to four friends in online competitions over a LAN or the Internet. Take them on in both Trick Attack and Graffiti modes. [Activision]",
        "Step into the Dark... As Carrington Institute's most promising new Agent, Joanna Dark must uncover the truth behind the dataDyne Corporation's recent technological breakthroughs - breakthroughs which could have serious consequences for mankind.",
        "Developed by the creators of Grand Theft Auto V and Red Dead Redemption, Red Dead Redemption 2 is an epic tale of life in America’s unforgiving heartland. The game’s vast and atmospheric world also provides the foundation for a brand new online multiplayer experience. America, 1899. The end of the Wild West era has begun. After a robbery goes badly wrong in the western town of Blackwater, Arthur Morgan and the Van der Linde gang are forced to flee. With federal agents and the best bounty hunters in the nation massing on their heels, the gang has to rob, steal and fight their way across the rugged heartland of America in order to survive. As deepening internal fissures threaten to tear the gang apart, Arthur must make a choice between his own ideals and loyalty to the gang that raised him. [Rockstar]",
        "The sprawling sun-soaked metropolis of Los Santos is chock full of self-help coaches, starlets and C-List celebrities, once on top of the media world, now struggling to stay relevant in time of economic malaise and lowest-common-denominator reality TV. Amidst this madness, three unique criminals plan their own chances of survival and success: Franklin, a street-level hustler in search of opportunities for serious money; Michael, an ex-con whose \"retirement\" is a less rosy than he hoped it would be; and Trevor, a violent dude driven by the chance for a quick high and the next big score. Nearly out of options, the crew risks it all in a series of daring and dangerous heists that could set them up for life - one way or the other.",
        "Samus returns in a new mission to unravel the mystery behind the ruined walls scattered across Tallon IV. In Metroid Prime, you'll play the role of this bounty hunter and view the world through her visor, which displays information ranging from current energy levels to ammunition. Equipped with a Power Beam and Gravity Suit, you must shoot locked switches, solve puzzles, and eliminate enemies. It's up to you to explore the world and recover more power-ups and weapons, which gradually open more gameplay areas.",
        "Players are put at the heart of their very own gangster movie, and let loose in a fully-realised 3 dimensional city with a cast of hundreds, 50 plus vehicles, ranging from sports cars to ice cream trucks and from boats to buses, 3 hours of music, including opera, reggae, house, drum and bass, pop and disco, and a huge array of street ready weapons. [Rockstar Games]",
        "New Evolution of Mario Sandbox-Style Gameplay. Mario embarks on a new journey through unknown worlds, running and jumping through huge 3D worlds in the first sandbox-style Mario game since Super Mario 64 and Super Mario Sunshine. Set sail between expansive worlds aboard an airship, and perform all-new actions, such as throwing Mario's cap."



    )

    private var gamePoster = intArrayOf(
        R.drawable.tloz_ocarina_of_time,
        R.drawable.tony_hawks_pro_skater_2,
        R.drawable.gta_iv_ps3,
        R.drawable.soulcalibur,
        R.drawable.gta_iv_xbox_360,
        R.drawable.super_mario_galaxy,
        R.drawable.super_mario_galaxy_2,
        R.drawable.red_dead_redemption_2,
        R.drawable.gta_v_xbox_one,
        R.drawable.gta_v_ps3,
        R.drawable.gta_v_xbox_360,
        R.drawable.tony_hawks_pro_skater_2,
        R.drawable.tloz_breath_of_the_wild,
        R.drawable.tony_hawks_pro_skater_3,
        R.drawable.perfect_dark,
        R.drawable.red_dead_redemption_2_ps4,
        R.drawable.gta_v_ps4,
        R.drawable.metroid_prime,
        R.drawable.gta_iii,
        R.drawable.super_mario_odyssey
    )

    val listData: ArrayList<Game>
    get() {
        val list = ArrayList<Game>()
        for (position in gameNames.indices){
            val game = Game()
            game.name = gameNames[position]
            game.platform = gamePlatforms[position]
            game.release = gameRelease[position]
            game.score = gameScores[position]
            game.detail = gameDetails[position]
            game.poster = gamePoster[position]
            list.add(game)
        }
        return list
    }
}