
    
DROP TABLE ITEM;

CREATE TABLE ITEM 
(
  ITEMID NUMBER(14, 0) NOT NULL 
, PRODUCTID VARCHAR2(10) NOT NULL 
, NAME VARCHAR2(30) NOT NULL 
, DESCRIPTION VARCHAR2(500) NOT NULL 
, IMAGEURL VARCHAR2(155) 
, IMAGETHUMBURL VARCHAR2(155) 
, IMAGE BLOB DEFAULT EMPTY_BLOB()
, IMAGETHUMB BLOB DEFAULT EMPTY_BLOB() 
, PRICE NUMBER(14, 0) NOT NULL
, PRIMARY KEY (ITEMID)
);

CREATE SEQUENCE ITEM_SEQ INCREMENT BY 1 START WITH 100;

CREATE SEQUENCE HIBERNATE_SEQUENCE INCREMENT BY 1 START WITH 100;


INSERT INTO item VALUES(1, 'feline01', 'Friendly Cat', 'This black and white colored cat is super friendly. Anyone passing by your front yard will find him puring at their feet and trying to make a new friend. His name is Anthony, but I call him Ant as a nickname since he loves to eat ants and other insects.', 'images/anthony.jpg','images/anthony-s.jpg', NULL, NULL, 307.10);
INSERT INTO item VALUES(2, 'feline01', 'Fluffy Cat', 'A great pet for a hair stylist! Have fun combing Bailey''s silver mane. Maybe trim his whiskers? He is very patient and loves to be pampered.', 'images/bailey.jpg','images/bailey-s.jpg', NULL, NULL, 307);
INSERT INTO item VALUES(3, 'feline02', 'Sneaky Cat', 'My cat is so sneaky. He is so curious that he just has to poke his nose into everything going on in the house. Everytime I turn around, BAM, he is in the room peaking at what I am doing. Nothing escapes his keen eye. He should be a spy in the CIA!', 'images/bob.jpg','images/bob-s.jpg', NULL, NULL, 307.20);
INSERT INTO item VALUES(4, 'feline02', 'Lazy Cat', 'A great pet to lounge on the sofa with. If you want a friend to watch TV with, this is the cat for you. Plus, she wont even ask for the remote! Really, could you ask for a better friend to lounge with?', 'images/chantelle.jpg','images/chantelle-s.jpg', NULL, NULL, 307.30);
INSERT INTO item VALUES(5, 'feline01', 'Old Cat', 'A great old pet retired from duty in the circus. This fully-trained tiger is looking for a place to retire. Loves to roam free and loves to eat other animals.', 'images/charlie.jpg','images/charlie-s.jpg', NULL, NULL, 307);
INSERT INTO item VALUES(6, 'feline02', 'Young Female cat', 'A great young pet to chase around. Loves to play with a ball of string. Bring some instant energy into your home.', 'images/elkie.jpg','images/elkie-s.jpg', NULL, NULL, 307.40);
INSERT INTO item VALUES(7, 'feline01', 'Playful Female Cat', 'A needy pet. This cat refuses to grow up. Do you like playful spirits? I need lots of attention. Please do not leave me alone, not even for a minute.', 'images/faith.jpg','images/faith-s.jpg', NULL, NULL, 307);
INSERT INTO item VALUES(8, 'feline01', 'White Fluffy Cat', 'This fluffy white cat looks like a snowball. Plus, she likes playing outside in the snow and it looks really cool to see this snowball cat run around on the ski slopes. I hope you have white carpet as this cat sheds lots of hair.', 'images/gaetano.jpg','images/gaetano-s.jpg', NULL, NULL, 307.50);
INSERT INTO item VALUES(9, 'feline02', 'Tiger Stripe Cat', 'This little tiger thinks it has big teeth. A great wild pet for an adventurous person. May eat your other pets so be careful- just kidding. This little tiger is affectionate.', 'images/harmony.jpg','images/harmony-s.jpg', NULL, NULL, 307);
INSERT INTO item VALUES(10, 'feline02', 'Alley Cat', 'Meow Meow in the back alley cat fights! This cat keeps the racoons away, but still has class.', 'images/katzen.jpg','images/katzen-s.jpg', NULL, NULL, 307.60);
INSERT INTO item VALUES(11, 'feline02', 'Speedy Cat', 'Fastest and coolest cat in town. If you always wanted to own a cheetah, this cat is even faster and better looking. No dog could ever catch this bolt of lightening.', 'images/mario.jpg','images/mario-s.jpg', NULL, NULL, 307);
INSERT INTO item VALUES(12, 'feline01', 'Stylish Cat', 'A high maintenance cat for an owner with time. This cat needs pampering: comb it hair, brush its teeth, wash its fur, paint its claws. For all you debutantes, let the world know you have arrived in style with this snooty cat in your purse!', 'images/mimi.jpg','images/mimi-s.jpg', NULL, NULL, 307.70);
INSERT INTO item VALUES(13, 'feline01', 'Smelly Cat', 'A great pet with its own song to sing with your fiends. "Smelly cat, Smelly cat ..." Need an excuse for that funky odor in your house? Smelly cat is the answer.', 'images/monique.jpg','images/monique-s.jpg', NULL, NULL, 307.80);
INSERT INTO item VALUES(14, 'feline01', 'Saber Cat', 'A great watch pet. Want to keep your roommates from stealing the beer from your refrigerator? This big-toothed crazy cat is better than a watchdog. Just place him on top of the refrigerator and watch him pounce when so-called friends try to sneak a beer. This cat is great fun at parties.', 'images/olie.jpg','images/olie-s.jpg', NULL, NULL, 307.90);
INSERT INTO item VALUES(15, 'feline01', 'Sophisticated Cat', 'This cat is from Paris. It has a very distinguished history and is looking for a castle to play in. This sophisticated cat has class and taste. No chasing on string, no catnip habits. Only the habits of royalty in this cats blood.', 'images/paris.jpg','images/paris-s.jpg', NULL, NULL, 307);
INSERT INTO item VALUES(16, 'feline01', 'Princess cat', 'Just beauty and elegance. She will charm you from the moment she enters the room.', 'images/princess.jpg','images/princess-s.jpg', NULL, NULL, 307);
INSERT INTO item VALUES(17, 'feline02', 'Lazy cat', 'Wow! This cat is cool. It has a beautiful tan coat. I wish I could get a sun tan of that color.', 'images/simba.jpg','images/simba-s.jpg', NULL, NULL, 307);
INSERT INTO item VALUES(18, 'feline02', 'Scapper male cat', 'A scappy cat that likes to cause trouble. If you are looking for a challenge to your cat training skills, this scapper is the test!', 'images/thaicat.jpg','images/thaicat-s.jpg', NULL, NULL, 307);
INSERT INTO item VALUES(19, 'feline01', 'Super Lazy cat', 'Buy me please. I love to sleep.', 'images/cat1.gif','images/cat1.gif', NULL, NULL, 307);
INSERT INTO item VALUES(20, 'feline01', 'Older Cat', 'A great old pet retired from duty in the circus. This fully-trained tiger is looking for a place to retire. Loves to roam free and loves to eat other animals.', 'images/cat2.gif','images/cat2.gif', NULL, NULL, 200);
INSERT INTO item VALUES(21, 'feline01', 'Young Cat', 'A great young pet to chase around. Loves to play with a ball of string.', 'images/cat3.gif','images/cat3.gif', NULL, NULL, 350);
INSERT INTO item VALUES(22, 'feline01', 'Scrappy Cat', 'A real trouble-maker in the neighborhood. Looking for some T.L.C', 'images/cat4.gif','images/cat4.gif', NULL, NULL, 417);
INSERT INTO item VALUES(23, 'feline01', 'Sweety Alley Cat', 'Loves to play in the alley outside my apartment, but looking for a warmer and safer place to spend its nights.', 'images/cat5.gif','images/cat5.gif', NULL, NULL, 307);
INSERT INTO item VALUES(24, 'feline02', 'Playful Cat', 'Come play with me. I am looking for fun.', 'images/cat7.gif','images/cat7.gif', NULL, NULL, 190);
INSERT INTO item VALUES(25, 'feline02', 'Long Haired Cat', 'Buy this fancy cat.', 'images/cat8.gif', 'images/cat8.gif', NULL, NULL, 199);
INSERT INTO item VALUES(26, 'feline02', 'Fresh Cat', 'Just need a nice bath and i will be fresh as a kitten.', 'images/cat9.gif','images/cat9.gif', NULL, NULL, 303);
INSERT INTO item VALUES(27, 'feline02', 'Wild Cat', 'This wild tiger loves to play.', 'images/cat10.gif', 'images/cat10.gif', NULL, NULL, 527);
INSERT INTO item VALUES(28, 'feline02', 'Young Saber Cat', 'Buy me', 'images/cat11.gif', 'images/cat11.gif', NULL, NULL, 237);
INSERT INTO item VALUES(29, 'feline02', 'Snappy Cat', 'Buy Me.', 'images/cat12.gif', 'images/cat12.gif', NULL, NULL, 337);

