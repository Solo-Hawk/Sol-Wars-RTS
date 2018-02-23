# Sol Wars RTS - EPQ Branch

# Investigation into Steering Behaviours in LibGDX - Java

My EPQ could a big turn from its original plan (Investigation into the Game Development Process in Java - LibGDX. There is a lot to be said on how my expections were defeated by reality and in turn made me more interested in the minior detail of the whole process.

My project started being **Investigation into the game development process in Java - LibGDX,** my idea here was that the project felt reasonable, something I could achieve and meet with standard and quality. I have the necessary tools to do this so all is good.

## My Investigation into the Game Development Process

To get myself started I need to come up with a game idea, something basic but challenging and something I felt like I could do

To learn and understand how to make a game I am learning LibGDX to make a 2D RTS Game as a way of learning both the steps in making a game from start to finish as well as understanding how to make a simple AI to compliment my RTS game

### About the Game

My game will be a 2D RTS Game (I may move to 3D but not in LibGDX) themed in Space Warfare, I want to create quick
paced battles that needs quick reactions to work straight from the start, removing elements like multi resources and 
control points

The game was thought of from two elements
1. BOID - A game on Steam with a nice and simple RTS design
2. My Game Development module - At College I did a Game Dev Module which I used to make a simple game, from that I
thought of expanding upon it further

Some basic information is covered in this readme but you can find more detail in my wiki (WIP)

### The Idea

The reasons I picked the space theme was because I like the simplicity on how the enviroment for such a theme would
work like Gravity. My favorite game genre is Real Time Strategy and across all the strategy games I've played, I always
think there is something missing, that is why I have the motivation to make my own.

The design / look of the game I'm not to sure on and from my past experience in making more simple games, I would think
to use free assets and work on designs later (since I don't really do visual design as much as I programme)

### My Twist(s)

#### Smart Squadding

Smart squading is my own solution / idea to the other RTS games that have tried using AI to help manage the micro 
management within a RTS, this system would involve the AI making their own teams within player defined groups to pair
them up to work better with each other and provide a more effective fight while the player is away from the scene.

#### Minimalistic

When I see some RTS Games though I do find micro managing fun sometime or longed out games I lose sight on many
elements, I want to make my game have a simple path from start to finish. How? I'm not too sure but I would see
ideas being the use of no resources to construct units, few unit types or no secondary objectives

### Inspiration and Original Concept

#### BOID
![](http://vignette3.wikia.nocookie.net/steamtradingcards/images/e/e5/Boid_Logo.jpg/revision/latest?cb=20150401201235)

BOID was a very large inspiration for wanting to make a strategy game, I came across this game while checking out some
Indie Games at EGX 2013, I got hold of the game when it was released and saw its style of gameplay very unique and
simple, so I wanted to look at that aspect from this game, all I saw was that this game felt a bit slow at times and
hard to maneuver.

#### SolWars Original (Game Development Coursework Module)

**In Progress** - I am building my github.io where my code for this currently is so I'll talk about this part once I'm 
finished

#### Ashes of the Singularity
![](http://cdn.edgecast.steamstatic.com/steam/apps/507490/header.jpg?t=1506015473)

Ashes of the Singularity is a very large RTS Game made for long and sustained warfare, the use of managing large groups
of armies under the flagship of a large dreadnought made me think of how making a structured army / platoon / squad
would work to make synergy a more amazing aspect of an RTS game. This gave me the idea of 'smart squadding' and making
more automated combat, to an extent

## Development

### To-Do / Progress

Over the course of starting this project I've have gone through plenty of iterations of just starting to think how to
make this game and whats some of the best ways to start.

I have since then settled on how I plan to do this and how to start recording all progress made, aiming to not even 
start making the game but making the menu as a platform of understanding what to use and where to use certain functions

**Stage 1 - Making the Menu**

- [x] Main Screen
- [x] Basic Settings Screen
- [x] Create a transition handler (Changing from Main to Settings)

**Stage 2 - Building the Game (MVP) - Current Stage**

The end of this stage I should have a Ship class that I can use to extend from and the basic version of an AI to build
upon. This will help build the game further

- [ ] Create a basic design of spawning and killing sprites (Ships)
- [ ] Learning how to make a simple form of AI (Just moving randomly in a general direction to fight player)

**Stage 3 - Expanding the game to have Ship classes**

- [ ] Using the basic sprite make a Ship class that all different ship types will be extended from
- [ ] Improve the AI and make the AI Unique to each ship type

**Stage 4 - Build the UI and factory game mechanics**

- [ ] Build a factory model that will be used to produce ships
- [ ] Make AI types for more adaptive game play (Aggressive, Defensive e.c.t)
- [ ] Create or find someone to outsource art work for the game (Not sure what kind of style I want yet but I have a
few ideas)

**Stage 5 - Improvements and Explorable Features**

- [ ] Squading System (A twist on control groups to multi task)
- [ ] Wave Mode (A game mode where you create waves that spawn every 1-3 minutes to have a gradully increasing paced
game with limited resources)
- [ ] Multiplayer (Something I'm not too sure I want to attempt this in LibGDX)


# Development Process

So I made the plan, I listed out what I needed to do, look at and research to make this game, to me it felt easy and very simple.

## Oct 12 2017
https://github.com/Solo-Hawk/Sol-Wars-RTS/tree/365344fe9d826d8ca6e9674210140c54fc792902 

To get started with the development process I needed to get the required tools and software required to get coding, a lot is needed:

 - IntelliJ - Editor 
 - Java JDK 8 - SDK for Intellij Developer
 - Java JRE 8 - Runtime Environment for running the Application
 - Android SDK - Android SDK (If decision to make game work on mobile)
 - LWJGL - Lightweight Java Game Library - Core OpenGL library for Java
 - LibGDX Setup app - Tool used to setup a core LibGDX game

The use of these tools will require the following documentation to be able to make anything of Java and to use LibGDX:

 - Java JDK 8 Documentation
 - LibGDX Documentation 

***
Here I took the first steps, I grabbed what I needed and prepared for the track ahead, here I felt that what I was doing was still achievable and simple, I felt confident in the resources I could find out there to help me uncover what I needed for this.
***
## Oct 16 2017
https://github.com/Solo-Hawk/Sol-Wars-RTS/tree/ee4d5d01d63f3f79f07c63226143861ad5aaa7c0 

To get myself to grips with the game before I made the game mechanic elements I made a basic menu to my game, this was so I could understand the basic functions that come with LibGDX since there was much I don’t understand it would cost me time to learn from the deep end.

***
To me this felt very simple, the coding side of it was following convention in Java I was very much use to seeing as its fairly standard, where I struggled the most was getting use to the LibGDX API and understanding whats out there for me to use.
***

## Oct 18 2017
https://github.com/Solo-Hawk/Sol-Wars-RTS/tree/0af19ee897658124c653d6c3cb9e68ebd27c84b9 

So I took the time to familiarize myself with  LibGDX, to get the basics going I made a simple menu to get better the use of Graphical UI, something new to me but important for Games Development

So once I had the menu, I looked into the core mechanic of my game, this is where I looked into something known as ‘Steerables’. It took me a while to understand steerables.

Getting to this stage I took the time to source the following:

 - LibGDX - AI - Steering Behaviours
   - https://github.com/libgdx/gdx-ai/wiki/Steering-Behaviors

At this stage I discovered issues that lied with using the built-in steering behaviours that came with the LibGDX library. The reason was that in order to use it, my entities - objects that would become these moving objects - would have to follow the design of the LibGDX Model. 

***
This is first where I started to uncover the much large scope of this project, the investigation into the games development process and to see how much was "behind the curtain" per se. 
***
***
# The change of Investigation

This was where I had my mid-project review and saw that the scope of my project was way more than what I could bite. So what I needed was to lower the scope drastically. However no major changes were needed.

My scope change was as simple are reaching a new marked MVP of my game which wouldn’t make the original level of a ‘Alpha’ build of a game, but focus of the movement mechanic that would be used in this game if it was to be made into a complete game and here was where I saw the Investigation scope changed drastically and hence at mid project the final project title was:

**Investigation into the Games Development Process in Java - LibGDX -----> Investigation into Steering Behaviour in LibGDX - Java**
***
## Nov 7 2017
https://github.com/Solo-Hawk/Sol-Wars-RTS/tree/3ca6757ba81db6691403169c2b1e479d3c38a226  

From my Mid Project review I basically took a very long time taking it slow and studying into some basics of AI Movement that would be used in games. For this I looked up multiple studies on steering behaviours, and landing on a page that had full detail of all the types of commonly known behaviours.

The sources I looked at:
https://www.red3d.com/cwr/steer/ - October 22nd
https://andrewfray.wordpress.com/2013/02/20/steering-behaviours-are-doing-it-wrong/ - October 26th
https://www.gamasutra.com/blogs/JuanBelonPerez/20140724/221421/Introduction_to_Steering_Behaviours.php  - October 30th

I finally found a source that perfectly explained and added onto some of the sources listed above:

https://gamedevelopment.tutsplus.com/series/understanding-steering-behaviors--gamedev-12732 - November 3rd

This sources helped finish the outline of my own Steering behaviour and understanding how to run movement mechanics in my own way, because of this I discovered more flexibility compared to if I used built-in versions.
***
This was a large change of pace, though I got to better orient to the new scope and better place my plan for the the work ahead
***
## Nov 28 2017
https://github.com/Solo-Hawk/Sol-Wars-RTS/tree/3ca6757ba81db6691403169c2b1e479d3c38a226  

Following with what I decided from my Mid Project Review I spent a lot of time building these new movement behaviours, here I build some of the “Core” Behaviours I’ve come across and groups entities to follow each other in groups, though there are a lot of floors I’ve reached a clearly successful creation of this AI Movement Behaviour. Just some minor details are needed to finish this.

***
Here I felt for comfortable with the change, I felt better settling into this scope and saw it as a more achievable objective.
***
## Dec 15 2017
https://github.com/Solo-Hawk/Sol-Wars-RTS/tree/38789d1999b359c324db71cfe306be6ac8ffffc3 

Using what I’ve learnt I took time to see how I could improve and better manage elements of my code, I took the time to review my code, evaluate and see what I could improve. This resulted a faster running application. Here I came close to a final product.
***
I felt more relieved in the change of project aim as I reached this point, seeing how long it took me just to reach this point to where I could evaluate my code made me see where I would've had to make more sacrafices just to make a whole game
***
## Jan 7 2017
https://github.com/Solo-Hawk/Sol-Wars-RTS/tree/f124f52f360fe97f530c64472d504b3de3226ea0 

With all the core movement behaviours that I’ve made, I saw that I needed to make some changes, I still see issues that I’m not too sure how to tackle but nothing that stops it from being called a final product.
***
This was the last stage, the only issues here was general debug, some trial and error can fix this stage and it was very smooth reaching the final product from here.
***












