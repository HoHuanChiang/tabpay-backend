# TabaPay Project

Deploy Link: https://hohuanchiang.github.io/tabapay (Expires on 6/1)\
Front-End Github Link: https://github.com/HoHuanChiang/tabapay \
Back-End Github Link: https://github.com/HoHuanChiang/tabpay-backend

# Database Configuration

You can find SQL configuration in 'application.properties' file

# Tables

**Folder**
Column Name  | Type
------------- | -------------
id  | bigint (identity)
create_time | datetime
name | varchar(255)
parent_folder_id | bigint

**Destination**
Column Name  | Type
------------- | -------------
id  | bigint (identity)
name | varchar(255)
folder_id | bigint

**Location**
Column Name  | Type
------------- | -------------
id  | bigint (identity)
address | varchar
name | varchar(255)
description | nvarchar(MAX)
website | varchar(255)
destination_id | bigint


**associate_image**
Column Name  | Type
------------- | -------------
id  | bigint (identity)
image_name | varchar(255)
object_type | smallint
object_type_id | bigint


# Table Data
Here is a script which you can use to insert mock data.

```
USE [TabaPay]
GO
SET IDENTITY_INSERT [dbo].[folder] ON 

INSERT [dbo].[folder] ([id], [create_time], [name], [parent_folder_id]) VALUES (1, CAST(N'2023-05-22T17:08:03.2233330' AS DateTime2), N'Destination', NULL)
INSERT [dbo].[folder] ([id], [create_time], [name], [parent_folder_id]) VALUES (2, CAST(N'2023-05-22T17:08:45.6300000' AS DateTime2), N'Asia', 1)
INSERT [dbo].[folder] ([id], [create_time], [name], [parent_folder_id]) VALUES (3, CAST(N'2023-05-22T17:08:58.7033330' AS DateTime2), N'North America', 1)
INSERT [dbo].[folder] ([id], [create_time], [name], [parent_folder_id]) VALUES (4, CAST(N'2023-05-22T17:09:01.5666670' AS DateTime2), N'Europe', 1)
INSERT [dbo].[folder] ([id], [create_time], [name], [parent_folder_id]) VALUES (5, CAST(N'2023-05-22T17:09:15.4400000' AS DateTime2), N'Japan', 2)
INSERT [dbo].[folder] ([id], [create_time], [name], [parent_folder_id]) VALUES (6, CAST(N'2023-05-22T17:09:56.2066670' AS DateTime2), N'United States', 3)
INSERT [dbo].[folder] ([id], [create_time], [name], [parent_folder_id]) VALUES (7, CAST(N'2023-05-22T17:10:33.2100000' AS DateTime2), N'Italy', 4)
SET IDENTITY_INSERT [dbo].[folder] OFF
GO
SET IDENTITY_INSERT [dbo].[destination] ON 

INSERT [dbo].[destination] ([id], [name], [folder_id]) VALUES (2, N'Taiwan', 2)
INSERT [dbo].[destination] ([id], [name], [folder_id]) VALUES (3, N'Canada', 3)
INSERT [dbo].[destination] ([id], [name], [folder_id]) VALUES (4, N'Tokyo', 5)
INSERT [dbo].[destination] ([id], [name], [folder_id]) VALUES (5, N'Kyoto', 5)
INSERT [dbo].[destination] ([id], [name], [folder_id]) VALUES (6, N'New York City', 6)
INSERT [dbo].[destination] ([id], [name], [folder_id]) VALUES (7, N'Los Angeles', 6)
INSERT [dbo].[destination] ([id], [name], [folder_id]) VALUES (8, N'Rome', 7)
INSERT [dbo].[destination] ([id], [name], [folder_id]) VALUES (9, N'Venice', 7)
SET IDENTITY_INSERT [dbo].[destination] OFF
GO
SET IDENTITY_INSERT [dbo].[location] ON 

INSERT [dbo].[location] ([id], [address], [description], [name], [website], [destination_id]) VALUES (1, N'No. 7, Section 5, Xinyi Road, Xinyi District, Taipei City, 110, Taiwan', N'Taipei 101 (Chinese: 台北101; pinyin: Táiběi yī líng yī; stylized as TAIPEI 101), formerly known as the Taipei World Financial Center, is a skyscraper in Taipei, Taiwan. The building was officially classified as the world''s tallest from its opening in 2004 until the 2009 completion of the Burj Khalifa in Dubai, UAE. Upon completion, it became the world''s first skyscraper to exceed a height of half a kilometer (about 0.3 miles). Taipei 101 is the tallest building in Taiwan.

The elevators of Taipei 101 that transport passengers from the 5th to the 89th floor in 37 seconds (attaining 60.6 km/h (37.7 mph)) set speed records. In 2011, Taipei 101 was awarded a Platinum certificate rating under the LEED certification system for energy efficiency and environmental design, becoming the tallest and largest green building in the world. The structure regularly appears as an icon of Taipei in international media, and the Taipei 101 fireworks displays are a regular feature of New Year''s Eve broadcasts and celebrations.

Taipei 101''s postmodernist architectural style evokes traditional Asian aesthetics in a modern structure employing industrial materials. Its design incorporates a number of features that enable the structure to withstand the Pacific Ring of Fire''s earthquakes and the region''s tropical storms. The tower houses offices, restaurants, shops, and indoor and outdoor observatories. The tower is adjoined by a multilevel shopping mall that has the world''s largest ruyi symbol as an exterior feature.

Taipei 101 is owned by Taipei Financial Center Corporation. The skyscraper opened on 31 December 2004 to celebrate New Year''s Eve (2005).', N'Taipei 101', N'https://www.skyscrapercenter.com/building/taipei-101/117', 2)
INSERT [dbo].[location] ([id], [address], [description], [name], [website], [destination_id]) VALUES (3, N'No.127, Wenhua St., Yuchi Township, Nantou County 555005, Taiwan (R.O.C.)', N'Sun Moon Lake (Chinese: 日月潭; pinyin: Rìyuè tán; Pe̍h-ōe-jī: Ji̍t-goa̍t-thâm; Thao: Zintun) is a lake in Yuchi Township, Nantou County, Taiwan. It is the largest body of water in Taiwan. The area around the lake is home to the Thao tribe, one of aboriginal tribes of Taiwan. Sun Moon Lake surrounds a tiny island called Lalu. The east side of the lake resembles a sun while the west side resembles a moon, hence the name.

Sun Moon Lake is located 748 m (2,454 ft) above sea level. It is 27 m (89 ft) deep and has a surface area of approximately 7.93 km2 (3.06 sq mi). The area surrounding the lake has many trails for hiking.

While swimming in Sun Moon Lake is usually not permitted, there is an annual 3-km race called the Swimming Carnival of Sun Moon Lake held around the Mid-Autumn Festival each year. The Sun Moon Lake Swimming Carnival was launched in 1983 and is listed among the Top 50 Open Water Swims in Asia and the Top 100 Open Water Swims of the World. Everyone over 10 years old and with the ability to swim long distances can join, regardless of nationality. In recent years, the participants have numbered in the tens of thousands. Other festivities held at the same time include fireworks, laser shows, and concerts.

The lake and its surrounding countryside have been designated one of thirteen national scenic areas in Taiwan. Wen Wu Temple was built after rising water levels from building a dam forced several smaller temples to be removed. Tzu-En Pagoda (慈恩塔; Cí''ēn Tǎ) was ordered constructed by late President Chiang Kai-shek in 1971 in memory of his mother. Other temples of note include Jianjing Temple, Syuentzang Temple (玄奘寺; Xuánzàng Sì) and Syuanguang Temple (玄光寺; Xuánguāng Sì).', N'Sun Moon Lake', N'https://www.sunmoonlake.gov.tw/en', 2)
INSERT [dbo].[location] ([id], [address], [description], [name], [website], [destination_id]) VALUES (6, N'11 Naitomachi, Shinjuku City, Tokyo 160-0014, Japan', N'Shinjuku Gyoen (新宿御苑) is one of Tokyo''s largest and most popular parks. Located a short walk from Shinjuku Station, the park''s spacious lawns, meandering walking paths and tranquil scenery provide a relaxing escape from the busy urban center around it. In spring Shinjuku Gyoen becomes one of the best places in the city to see cherry blossoms.

Shinjuku Gyoen originated during the Edo Period (1603-1868) as a feudal lord''s Tokyo residence. Later it was converted into a botanical garden before being transferred to the Imperial Family in 1903 who used it for recreation and the entertainment of guests. The park was almost completely destroyed during World War II, but was eventually rebuilt and reopened in 1949 as a public park.

Shinjuku Gyoen is comprised of three different types of gardens:

The oldest is a traditional Japanese landscape garden featuring large ponds dotted with islands and bridges. Well manicured shrubs and trees surround the water together with several pavilions and the Kyu Goryotei (also called the Taiwan Pavilion) which was built on the occasion of the wedding of the Showa Emperor. A chrysanthemum exhibit is held during the first two weeks of November in the Japanese garden with numerous flower displays.

The park''s other main gardens include a symmetrically arranged, formal French garden, and an English landscape garden featuring wide, open lawns surrounded by flowering cherry trees. The rest of the park consists of forested areas, lawns and several structures including a restaurant, an information center and an art gallery. There is also a beautiful greenhouse with many tropical and subtropical flowers.

Inside the greenhouse
Shinjuku Gyoen is home to a large number of cherry trees of more than a dozen different varieties. From late March to early April, more than 400 somei yoshino trees blossom around the English garden, turning the lawns into one of Tokyo''s most popular and pleasant hanami spots. In addition, the park has numerous early and late blooming cherry trees which provide an extended cherry blossom viewing season for those who miss the main season.

Shinjuku Gyoen is also nice to visit during autumn when the leaves change. There are a lot of different types of trees that change colors around the park, however the maple trees are particularly beautiful and can be seen in large numbers around the Japanese garden and Momijiyama ("maple mountain") on the park''s eastern side. The colors typically appear from mid November to mid December.

', N'Shinjuku Gyoen National Garden', N'https://www.japan-guide.com/e/e3034_001.html', 4)
INSERT [dbo].[location] ([id], [address], [description], [name], [website], [destination_id]) VALUES (8, N'4-chome-2-8 Shibakoen, Minato City, Tokyo 105-0011, Japan', N'The Tokyo Tower (東京タワー, Tōkyō tawā, officially called 日本電波塔 Nippon denpatō "Japan Radio Tower") is a communications and observation tower in the Shiba-koen district of Minato, Tokyo, Japan, built in 1958. At 332.9 meters (1,092 ft), it is the second-tallest structure in Japan. The structure is an Eiffel Tower-inspired lattice tower that is painted white and international orange to comply with air safety regulations.

The tower''s main sources of income are tourism and antenna leasing. Over 150 million people have visited the tower. FootTown, a four-story building directly under the tower, houses museums, restaurants, and shops. Departing from there, guests can visit two observation decks. The two-story Main Deck (formerly known as the Main Observatory) is at 150 meters (490 ft), while the smaller Top Deck (formerly known as the "Special Observatory") reaches a height of 249.6 meters (819 ft). The names were changed following renovation of the top deck in 2018.[4] The tower is repainted every five years, taking a year to complete the process.

In 1961, transmission antennae were added to the tower. They are used for radio and television broadcasting and now broadcast signals for Japanese media outlets such as NHK, TBS, and Fuji TV. The height of the tower was not suitable for Japan''s planned terrestrial digital broadcasting planned for July 2011 for the Tokyo area. A taller digital broadcasting tower, known as Tokyo Skytree, was completed on 29 February 2012.

Since its completion in 1958, Tokyo Tower has become a prominent landmark in the city, and frequently appears in media set in Tokyo.', N'Tokyo Tower', N'https://www.tokyotower.co.jp/en/', 4)
INSERT [dbo].[location] ([id], [address], [description], [name], [website], [destination_id]) VALUES (9, N'1-1 Yoyogikamizonocho, Shibuya City, Tokyo 151-8557, Japan', N'Meiji Shrine (明治神宮, Meiji Jingū) is a shrine dedicated to the deified spirits of Emperor Meiji and his consort, Empress Shoken. Located just beside the JR Yamanote Line''s busy Harajuku Station, Meiji Shrine and the adjacent Yoyogi Park make up a large forested area within the densely built-up city. The spacious shrine grounds offer walking paths that are great for a relaxing stroll.

The shrine was completed and dedicated to the Emperor Meiji and the Empress Shoken in 1920, eight years after the passing of the emperor and six years after the passing of the empress. The shrine was destroyed during the Second World War but was rebuilt shortly thereafter.

Emperor Meiji was the first emperor of modern Japan. He was born in 1852 and ascended to the throne in 1867 at the peak of the Meiji Restoration when Japan''s feudal era came to an end and the emperor was restored to power. During the Meiji Period, Japan modernized herself to join the world''s major powers by the time Emperor Meiji passed away in 1912.


A torii gate along the forested approach to Meiji Shrine
The main complex of shrine buildings is located a ten minute walk from both the southern entrance near Harajuku Station and the northern entrance near Yoyogi Station. Entry into the shrine grounds is marked by a massive torii gate, after which the sights and sounds of the busy city are replaced by a tranquil forest. The approximately 100,000 trees that make up Meiji Jingu''s forest were planted during the shrine''s construction and were donated from regions across the entire country.

At the middle of the forest, Meiji Jingu''s buildings also have an air of tranquility distinct from the surrounding city. Visitors can take part in typical Shinto activities, such as making offerings at the main hall, buying charms and amulets or writing out one''s wish on an ema.

Meiji Jingu is one of Japan''s most popular shrines. In the first days of the New Year, the shrine regularly welcomes more than three million visitors for the year''s first prayers (hatsumode), more than any other shrine or temple in the country. During the rest of the year, traditional Shinto weddings can often be seen taking place there.


Not far from the Harajuku shrine entrance along the approach to the shrine buildings stands the Meiji Jingu Museum, which was newly opened in 2019. Elegantly designed by star architect Kuma Kengo, the museum displays treasures from the shrine''s collection, including interesting personal belongings of the emperor and empress and the carriage which the emperor rode to the formal declaration of the Meiji Constitution in 1889.

A large area of the southern section of the shrine grounds is taken up by the Inner Garden, which requires an entrance fee to enter. The garden becomes particularly popular in mid June when many irises are in bloom. A small well, Kiyomasa''s Well, is located in the garden and named after the military commander who dug it around 400 years ago. The well had been visited by the emperor and has become a popular spiritual "power spot".', N'Meiji Shrine', N'https://www.meijijingu.or.jp/en/', 4)
INSERT [dbo].[location] ([id], [address], [description], [name], [website], [destination_id]) VALUES (12, N'68 Fukakusa Yabunouchicho, Fushimi Ward, Kyoto', N'One of Japan''s most famous shrines, the Fushimi-Inari Taisha Shrine is a must-visit when in Kyoto. Founded in AD 711 and dedicated to the goddess of rice-growing, Ukanomitama-no-mikoto, the shrine is still frequented by merchants and tradesmen who pray for prosperity.

The main building dates from 1499 and features a spectacular four-kilometer-long avenue of bright orange "torii," or arches, each dedicated by a business (it takes some two-hours to travel past the 1,000 arches lining the route). Also notable are its many sculptures of foxes, reputed to be messengers of the gods.

A great time to explore the shrine is at night. Not only will you be rewarded with a unique glimpse of this wonderfully illuminated heritage site, you''ll be rewarded with few if any crowds.

Fortify yourself with the purchase of traditional Japanese fortune cookies from the shops and stands at the shrine''s entrance. And to beat the crowds, visit as early in the day as possible (a 7am or 8am start is well worth it for the chance to avoid other visitors).', N'Fushimi-Inari Taisha Shrine', N'http://inari.jp/en/', 5)
INSERT [dbo].[location] ([id], [address], [description], [name], [website], [destination_id]) VALUES (13, N'224 Banff Avenue Banff, AB T1L 1A1', N'Banff National Park is Canada''s oldest national park, established in 1885 as Rocky Mountains Park. Located in Alberta''s Rocky Mountains, 110–180 kilometres (68–112 mi) west of Calgary, Banff encompasses 6,641 square kilometres (2,564 sq mi) of mountainous terrain, with many glaciers and ice fields, dense coniferous forest, and alpine landscapes. The Icefields Parkway extends from Lake Louise, connecting to Jasper National Park in the north. Provincial forests and Yoho National Park are neighbours to the west, while Kootenay National Park is located to the south and Kananaskis Country to the southeast. The main commercial centre of the park is the town of Banff, in the Bow River valley.

Lower Consolation Lake
The Canadian Pacific Railway was instrumental in Banff''s early years, building the Banff Springs Hotel and Chateau Lake Louise, and attracting tourists through extensive advertising. In the early 20th century, roads were built in Banff, at times by war internees from World War I, and through Great Depression-era public works projects. Since the 1960s, park accommodations have been open all year, with annual tourism visits to Banff increasing to over 5 million in the 1990s. Millions more pass through the park on the Trans-Canada Highway. As Banff has over three million visitors annually, the health of its ecosystem has been threatened. In the mid-1990s, Parks Canada responded by initiating a two-year study which resulted in management recommendations and new policies that aim to preserve ecological integrity.

Banff National Park has a subarctic climate with three ecoregions, including montane, subalpine, and alpine. The forests are dominated by Lodgepole pine at lower elevations and Engelmann spruce in higher ones below the treeline, above which is primarily rocks and ice. Mammal species such as the grizzly bear, cougar, wolverine, elk, bighorn sheep and moose are found, along with hundreds of bird species. Reptiles and amphibians are also found but only a limited number of species have been recorded. The mountains are formed from sedimentary rocks which were pushed east over newer rock strata, between 80 and 55 million years ago. Over the past few million years, glaciers have at times covered most of the park, but today are found only on the mountain slopes though they include the Columbia Icefield, the largest uninterrupted glacial mass in the Rockies. Erosion from water and ice have carved the mountains into their current shapes.', N'Banff National Park', N'https://parks.canada.ca/pn-np/ab/banff', 3)
INSERT [dbo].[location] ([id], [address], [description], [name], [website], [destination_id]) VALUES (16, N'950 Wharf St, Victoria, BC V8W 1T3, Canada', N'The Inner Harbour is Victoria''s primary tourist neighborhood. The harbor itself – home to various fishing boats and colorful floating homes – is framed by wide pedestrian streets, often frequented by street vendors and buskers. Numerous cafes and restaurants line the sidewalks and provide the perfect locale to savor an afternoon cup of tea while keeping your eyes peeled for whales playing in the open water. The Inner Harbour also hosts some of Victoria''s most popular attractions, including the Royal British Columbia Museum and the Parliament Buildings. If you''re embarking on a boat or ferry tour, this is where you''ll likely start your journey.

Although the majority of recent visitors recommended spending a few hours at the Inner Harbour for the view, some suggested devoting at least half a day as there is always something interesting to see and do. For an even more charming scene, return in the evening, when the Parliament Buildings are lit up. 

At the heart of Victoria, the Inner Harbour welcomes sightseers all day, every day. You don''t have to pay to explore, but you should keep some cash on you in case your stomach starts to grumble or a souvenir catches your eye. You''ll find the Inner Harbour across the street from the Parliament Buildings and the Fairmont Empress.', N'Victoria''s Inner Harbour', N'https://www.tourismvictoria.com/see-do/activities-attractions/statues-landmarks/inner-harbour', 3)
INSERT [dbo].[location] ([id], [address], [description], [name], [website], [destination_id]) VALUES (18, N'Manhattan, NY 10036', N'Times Square is a major commercial intersection, tourist destination, entertainment hub, and neighborhood in Midtown Manhattan, New York City, United States. It is formed by the junction of Broadway, Seventh Avenue, and 42nd Street. Together with adjacent Duffy Square, Times Square is a bowtie-shaped space five blocks long between 42nd and 47th Streets.

Times Square is brightly lit by numerous digital billboards and advertisements as well as businesses offering 24/7 service. One of the world''s busiest pedestrian areas, it is also the hub of the Broadway Theater District and a major center of the world''s entertainment industry. Times Square is one of the world''s most visited tourist attractions, drawing an estimated 50 million visitors annually. Approximately 330,000 people pass through Times Square daily, many of them tourists, while over 460,000 pedestrians walk through Times Square on its busiest days. The Times Square–42nd Street and 42nd Street–Port Authority Bus Terminal stations have consistently ranked as the busiest in the New York City Subway system, transporting more than 200,000 passengers daily.

Formerly known as Longacre Square, Times Square was renamed in 1904 after The New York Times moved its headquarters to the then newly erected Times Building, now One Times Square. It is the site of the annual New Year''s Eve ball drop, which began on December 31, 1907, and continues to attract over a million visitors to Times Square every year, in addition to a worldwide audience of one billion or more on various digital media platforms.

Times Square, specifically the intersection of Broadway and 42nd Street, is the eastern terminus of the Lincoln Highway, the first road across the United States for motorized vehicles. Times Square is sometimes referred to as "the Crossroads of the World" and "the heart of the Great White Way".', N'Times Square', N'https://www.timessquarenyc.org/', 6)
INSERT [dbo].[location] ([id], [address], [description], [name], [website], [destination_id]) VALUES (19, N'70 Vesey Street Manhattan, New York City. NY', N'World Trade Center is a terminal station on the PATH system, within the World Trade Center complex in the Financial District of Manhattan, New York City. It is served by the Newark–World Trade Center line at all times, as well as by the Hoboken–World Trade Center line on weekdays, and is the eastern terminus of both.

The World Trade Center station is near the site of the Hudson and Manhattan Railroad''s (H&M) Hudson Terminal, which opened in 1909. The Port Authority of New York and New Jersey bought the bankrupt H&M system in 1961, rebranded it as PATH, and redeveloped Hudson Terminal as part of the World Trade Center. The World Trade Center station opened on July 6, 1971, as a replacement for Hudson Terminal, which was closed and demolished as part of the construction of the World Trade Center. Following the September 11, 2001 attacks, a temporary PATH station opened in 2003 while the World Trade Center complex was being rebuilt. Work on a permanent station building commenced in 2008. The main station house, the Oculus, opened on March 3, 2016, and the terminal was renamed the World Trade Center Transportation Hub, or "World Trade Center" for short.

The station has five tracks and four platforms in the middle of a turning loop. Trains from New Jersey use the loop to turn around and head back to New Jersey. The platforms are four floors below ground level. The floor immediately above the platforms is occupied by the station''s fare mezzanine. The New York City Subway''s WTC Cortlandt station is adjacent to and above the mezzanine.

The $4 billion Oculus station house, designed by Spanish architect Santiago Calatrava, consists of white ribs that interlock high above the ground. The interior of the station house contains two underground floors, which house part of the Westfield World Trade Center mall. The transportation hub connects the various modes of transportation in Lower Manhattan, from the Fulton Center in the east to the Battery Park City Ferry Terminal in the west, and includes connections to various New York City Subway stations. It is the fifth-busiest transportation hub in the New York metropolitan area. The new station has received mixed reviews: although the hub has been praised for its design, it has also been criticized for its high costs and extended delays.', N'World Trade Center', N'https://www.officialworldtradecenter.com/en/local/learn-about-wtc/oculus-transportation-hub.html', 6)
INSERT [dbo].[location] ([id], [address], [description], [name], [website], [destination_id]) VALUES (20, N'100 Universal City Plaza, Universal City, CA 91608', N'Universal Studios Hollywood is a film studio and theme park in the San Fernando Valley area of Los Angeles County, California. About 70% of the studio lies within the unincorporated county island known as Universal City while the rest lies within the city limits of Los Angeles, California. It is one of the oldest and most famous Hollywood film studios still in use. Its official marketing headline is "The Entertainment Capital of LA". It was initially created to offer tours of the real Universal Studios sets and is the first of many full-fledged Universal Studios Theme Parks located across the world.

Outside the theme park, a new, all-digital facility near the Universal Pictures backlot was built in an effort to merge all of NBCUniversal''s West Coast operations into one area. As a result, the current home for KNBC, KVEA and NBC News with Noticias Telemundo Los Angeles Bureaus with new digital facility is on the Universal lot formerly occupied by Technicolor SA. Universal City includes hotels Universal Hilton & Towers, the Sheraton Universal Hotel, and Universal CityWalk, which offers a collection of shops, restaurants, an 18-screen Universal Cinema and a seven-story IMAX theater. In 2017, the park hosted 9.056 million guests, ranking it 15th in the world and 9th among North American parks.', N'Universal Studios Hollywood', N'https://www.universalstudioshollywood.com/web/en/us', 7)
INSERT [dbo].[location] ([id], [address], [description], [name], [website], [destination_id]) VALUES (21, N'2800 E Observatory Rd, Los Angeles, CA 90027', N'Griffith Observatory is an observatory in Los Angeles, California, on the south-facing slope of Mount Hollywood in Griffith Park. It commands a view of the Los Angeles Basin including Downtown Los Angeles to the southeast, Hollywood to the south, and the Pacific Ocean to the southwest. The observatory is a popular tourist attraction with a close view of the Hollywood Sign and an extensive array of space and science-related displays. It is named after its benefactor, Griffith J. Griffith. Admission has been free since the observatory''s opening in 1935, in accordance with the benefactor''s will.

Over 7 million people have been able to view through the 12-inch (30.5 cm) Zeiss refractor since the observatory''s 1935 opening; this is the most people to have viewed through any telescope. The space theme prevails in the interior.', N'Griffith Observatory', N'https://griffithobservatory.org/', 7)
INSERT [dbo].[location] ([id], [address], [description], [name], [website], [destination_id]) VALUES (23, N'Piazza del Colosseo, 1, 00184 Roma RM, Italy', N'The Colosseum (/ˌkɒləˈsiːəm/ KOL-ə-SEE-əm; Italian: Colosseo [kolosˈsɛːo]) is an elliptical amphitheatre in the centre of the city of Rome, Italy, just east of the Roman Forum. It is the largest ancient amphitheatre ever built, and is still the largest standing amphitheatre in the world, despite its age. Construction began under the emperor Vespasian (r. 69–79 AD) in 72 and was completed in 80 AD under his successor and heir, Titus (r. 79–81). Further modifications were made during the reign of Domitian (r. 81–96). The three emperors who were patrons of the work are known as the Flavian dynasty, and the amphitheatre was named the Flavian Amphitheatre (Latin: Amphitheatrum Flavium; Italian: Anfiteatro Flavio [aɱfiteˈaːtro ˈflaːvjo]) by later classicists and archaeologists for its association with their family name (Flavius).

The Colosseum is built of travertine limestone, tuff (volcanic rock), and brick-faced concrete. It could hold an estimated 50,000 to 80,000 spectators at various points in its history, having an average audience of some 65,000; it was used for gladiatorial contests and public spectacles including animal hunts, executions, re-enactments of famous battles, and dramas based on Roman mythology, and briefly mock sea battles. The building ceased to be used for entertainment in the early medieval era. It was later reused for such purposes as housing, workshops, quarters for a religious order, a fortress, a quarry, and a Christian shrine.

Although substantially ruined by earthquakes and stone robbers taking spolia, the Colosseum is still a renowned symbol of Imperial Rome and was listed as one of the New 7 Wonders of the World. It is one of Rome''s most popular tourist attractions and also has links to the Roman Catholic Church, as each Good Friday the Pope leads a torchlit "Way of the Cross" procession that starts in the area around the Colosseum. The Colosseum is depicted on the Italian version of the five-cent euro coin.', N'Colosseum', N'https://romecolosseumtickets.tours/', 8)
INSERT [dbo].[location] ([id], [address], [description], [name], [website], [destination_id]) VALUES (24, N'Piazza San Pietro, 00120 Città del Vaticano, Vatican City', N'The Papal Basilica of Saint Peter in the Vatican (Italian: Basilica Papale di San Pietro in Vaticano), or simply Saint Peter''s Basilica (Latin: Basilica Sancti Petri), is a church built in the Renaissance style located in Vatican City, the papal enclave that is within the city of Rome, Italy. It was initially planned by Pope Nicholas V and then Pope Julius II to replace the aging Old St. Peter''s Basilica, which was built in the fourth century by Roman emperor Constantine the Great. Construction of the present basilica began on 18 April 1506 and was completed on 18 November 1626.

Designed principally by Donato Bramante, Michelangelo, Carlo Maderno and Gian Lorenzo Bernini, St. Peter''s is the most renowned work of Renaissance architecture and the largest church in the world by interior measure. While it is neither the mother church of the Catholic Church nor the cathedral of the Diocese of Rome (these equivalent titles being held by the Archbasilica of Saint John Lateran in Rome), St. Peter''s is regarded as one of the holiest Catholic shrines. It has been described as "holding a unique position in the Christian world", and as "the greatest of all churches of Christendom."

Catholic tradition holds that the basilica is the burial site of Saint Peter, chief among Jesus''s apostles and also the first Bishop of Rome (Pope). Saint Peter''s tomb is supposedly directly below the high altar of the basilica, also known as the Altar of the Confession. For this reason, many popes have been interred at St. Peter''s since the Early Christian period.

St. Peter''s is famous as a place of pilgrimage and for its liturgical functions. The pope presides at a number of liturgies throughout the year both within the basilica or the adjoining St. Peter''s Square; these liturgies draw audiences numbering from 15,000 to over 80,000 people. St. Peter''s has many historical associations, with the Early Christian Church, the Papacy, the Protestant Reformation and Catholic Counter-reformation and numerous artists, especially Michelangelo. As a work of architecture, it is regarded as the greatest building of its age. St. Peter''s is one of the four churches in the world that hold the rank of Major papal basilica, all four of which are in Rome, and is also one of the Seven Pilgrim Churches of Rome. Contrary to popular misconception, it is not a cathedral because it is not the seat of a bishop; the cathedra of the pope as bishop of Rome is at Saint John Lateran.', N'St. Peter’s Basilica', N'https://www.rome.net/st-peters-basilica', 8)
INSERT [dbo].[location] ([id], [address], [description], [name], [website], [destination_id]) VALUES (25, N'P.za San Marco, 30100 Venezia VE, Italy', N'Piazza San Marco (Italian pronunciation: [ˈpjattsa sam ˈmarko]; Venetian: Piasa San Marco), often known in English as St Mark''s Square, is the principal public square of Venice, Italy, where it is generally known just as la Piazza ("the Square"). Almost all the other urban spaces in the city (except the Piazzetta and the Piazzale Roma) are called campi ("fields"). The Piazzetta ("little Piazza/Square") is an extension of the Piazza towards San Marco basin in its southeast corner (see plan). The two spaces together form the social, religious and political centre of Venice and are referred to together. This article relates to both of them.

A remark usually attributed (though without proof) to Napoleon calls the Piazza San Marco "the drawing room of Europe".', N'Saint Mark''s Square', N'http://www.basilicasanmarco.it/?lang=en', 9)
INSERT [dbo].[location] ([id], [address], [description], [name], [website], [destination_id]) VALUES (26, N'P.za San Marco, 328, 30100 Venezia VE, Italy', N'The Patriarchal Cathedral Basilica of Saint Mark (Italian: Basilica Cattedrale Patriarcale di San Marco), commonly known as St Mark''s Basilica (Italian: Basilica di San Marco; Venetian: Baxéłega de San Marco), is the cathedral church of the Catholic Patriarchate of Venice; it became the episcopal seat of the Patriarch of Venice in 1807, replacing the earlier cathedral of San Pietro di Castello. It is dedicated to and holds the relics of Saint Mark the Evangelist, the patron saint of the city.

The church is located on the eastern end of Saint Mark''s Square, the former political and religious centre of the Republic of Venice, and is attached to the Doge''s Palace. Prior to the fall of the republic in 1797, it was the chapel of the Doge and was subject to his jurisdiction, with the concurrence of the procurators of Saint Mark de supra for administrative and financial affairs.

The present structure is the third church, begun probably in 1063 to express Venice''s growing civic consciousness and pride. Like the two earlier churches, its model was the sixth-century Church of the Holy Apostles in Constantinople, although accommodations were made to adapt the design to the limitations of the physical site and to meet the specific needs of Venetian state ceremonies. Middle-Byzantine, Romanesque, and Islamic influences are also evident, and Gothic elements were later incorporated. To convey the republic''s wealth and power, the original brick façades and interior walls were embellished over time with precious stones and rare marbles, primarily in the thirteenth century. Many of the columns, reliefs, and sculptures were spoils stripped from the churches, palaces, and public monuments of Constantinople as a result of the Venetian participation in the Fourth Crusade. Among the plundered artefacts brought back to Venice were the four ancient bronze horses that were placed prominently over the entry.

The interior of the domes, the vaults, and the upper walls were slowly covered with gold-ground mosaics depicting saints, prophets, and biblical scenes. Many of these mosaics were later retouched or remade as artistic tastes changed and damaged mosaics had to be replaced, such that the mosaics represent eight hundred years of artistic styles. Some of them derive from traditional Byzantine representations and are masterworks of Medieval art; others are based on preparatory drawings made by prominent Renaissance artists from Venice and Florence, including Paolo Veronese, Tintoretto, Titian, Paolo Uccello, and Andrea del Castagno.', N'Basilica di San Marco', N'http://www.basilicasanmarco.it/?lang=en', 9)
SET IDENTITY_INSERT [dbo].[location] OFF
GO
SET IDENTITY_INSERT [dbo].[associate_image] ON 

INSERT [dbo].[associate_image] ([id], [image_name], [object_type], [object_type_id]) VALUES (3, N'taipei101.jpg', 1, 1)
INSERT [dbo].[associate_image] ([id], [image_name], [object_type], [object_type_id]) VALUES (4, N'taipei101_2.jpg', 1, 1)
INSERT [dbo].[associate_image] ([id], [image_name], [object_type], [object_type_id]) VALUES (5, N'taipei101_3.jpg', 1, 1)
INSERT [dbo].[associate_image] ([id], [image_name], [object_type], [object_type_id]) VALUES (6, N'sunmoonlake.jpg', 1, 3)
INSERT [dbo].[associate_image] ([id], [image_name], [object_type], [object_type_id]) VALUES (7, N'sunmoonlake_2.jpg', 1, 3)
INSERT [dbo].[associate_image] ([id], [image_name], [object_type], [object_type_id]) VALUES (8, N'sunmoonlake_3.jpg', 1, 3)
INSERT [dbo].[associate_image] ([id], [image_name], [object_type], [object_type_id]) VALUES (9, N'shinjuku.jpg', 1, 6)
INSERT [dbo].[associate_image] ([id], [image_name], [object_type], [object_type_id]) VALUES (10, N'shinjuku_2.jpg', 1, 6)
INSERT [dbo].[associate_image] ([id], [image_name], [object_type], [object_type_id]) VALUES (11, N'shinjuku_3.jpg', 1, 6)
INSERT [dbo].[associate_image] ([id], [image_name], [object_type], [object_type_id]) VALUES (12, N'tokyotower.jpg', 1, 8)
INSERT [dbo].[associate_image] ([id], [image_name], [object_type], [object_type_id]) VALUES (13, N'tokyotower_2.jpg', 1, 8)
INSERT [dbo].[associate_image] ([id], [image_name], [object_type], [object_type_id]) VALUES (14, N'meijishrine.jpg', 1, 9)
INSERT [dbo].[associate_image] ([id], [image_name], [object_type], [object_type_id]) VALUES (15, N'meijishrine_2.jpg', 1, 9)
INSERT [dbo].[associate_image] ([id], [image_name], [object_type], [object_type_id]) VALUES (16, N'fushimi.jpg', 1, 12)
INSERT [dbo].[associate_image] ([id], [image_name], [object_type], [object_type_id]) VALUES (17, N'fushimi_2.jpg', 1, 12)
INSERT [dbo].[associate_image] ([id], [image_name], [object_type], [object_type_id]) VALUES (18, N'banff.jpg', 1, 13)
INSERT [dbo].[associate_image] ([id], [image_name], [object_type], [object_type_id]) VALUES (19, N'banff_2.jpg', 1, 13)
INSERT [dbo].[associate_image] ([id], [image_name], [object_type], [object_type_id]) VALUES (20, N'victoria.jpg', 1, 16)
INSERT [dbo].[associate_image] ([id], [image_name], [object_type], [object_type_id]) VALUES (21, N'victoria_2.jpg', 1, 16)
INSERT [dbo].[associate_image] ([id], [image_name], [object_type], [object_type_id]) VALUES (22, N'timesquare.jpg', 1, 18)
INSERT [dbo].[associate_image] ([id], [image_name], [object_type], [object_type_id]) VALUES (23, N'timesquare_2.jpg', 1, 18)
INSERT [dbo].[associate_image] ([id], [image_name], [object_type], [object_type_id]) VALUES (24, N'worldtradecenter.jpg', 1, 19)
INSERT [dbo].[associate_image] ([id], [image_name], [object_type], [object_type_id]) VALUES (25, N'worldtradecenter_2.jpg', 1, 19)
INSERT [dbo].[associate_image] ([id], [image_name], [object_type], [object_type_id]) VALUES (26, N'universal.jpg', 1, 20)
INSERT [dbo].[associate_image] ([id], [image_name], [object_type], [object_type_id]) VALUES (27, N'universal_2.jpg', 1, 20)
INSERT [dbo].[associate_image] ([id], [image_name], [object_type], [object_type_id]) VALUES (28, N'griffith.jpg', 1, 21)
INSERT [dbo].[associate_image] ([id], [image_name], [object_type], [object_type_id]) VALUES (29, N'griffith_2.jpg', 1, 21)
INSERT [dbo].[associate_image] ([id], [image_name], [object_type], [object_type_id]) VALUES (30, N'collosseum.jpg', 1, 23)
INSERT [dbo].[associate_image] ([id], [image_name], [object_type], [object_type_id]) VALUES (31, N'collosseum_2.jpg', 1, 23)
INSERT [dbo].[associate_image] ([id], [image_name], [object_type], [object_type_id]) VALUES (32, N'collosseum_3.jpg', 1, 23)
INSERT [dbo].[associate_image] ([id], [image_name], [object_type], [object_type_id]) VALUES (33, N'peter.jpg', 1, 24)
INSERT [dbo].[associate_image] ([id], [image_name], [object_type], [object_type_id]) VALUES (34, N'peter_2.jpg', 1, 24)
INSERT [dbo].[associate_image] ([id], [image_name], [object_type], [object_type_id]) VALUES (35, N'peter_3.jpg', 1, 24)
INSERT [dbo].[associate_image] ([id], [image_name], [object_type], [object_type_id]) VALUES (36, N'basilica.jpg', 1, 25)
INSERT [dbo].[associate_image] ([id], [image_name], [object_type], [object_type_id]) VALUES (37, N'basilica_2.jpg', 1, 25)
INSERT [dbo].[associate_image] ([id], [image_name], [object_type], [object_type_id]) VALUES (38, N'mark.jpeg', 1, 26)
INSERT [dbo].[associate_image] ([id], [image_name], [object_type], [object_type_id]) VALUES (39, N'mark_2.jpg', 1, 26)
INSERT [dbo].[associate_image] ([id], [image_name], [object_type], [object_type_id]) VALUES (40, N'mark_3.jpg', 1, 26)
SET IDENTITY_INSERT [dbo].[associate_image] OFF
GO
```


