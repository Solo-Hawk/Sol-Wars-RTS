# Sol-Wars-RTS

![](https://github.com/Solo-Hawk/Sol-Wars-RTS/blob/master/android/assets/solWars/title.png?raw=true)

To learn and understand how to make a game I am learning LibGDX to make a 2D RTS Game as a way of learning both the 
steps in making a game from start to finish as well as understanding how to make a simple AI to compliment my RTS game

**Contents**

- About the Game
    - The Idea
    - My Twist(s)
        - Smart Squadding
        - Minimalistic
    - Inspiration and Original Concept
        - BOID
        - SolWars Original (Game Development Coursework Module)
        - Ashes of the Singularity

- Development
    - To-Do / Progress
    - Notes
          
- Acknowledgments

# About the Game

My game will be a 2D RTS Game (I may move to 3D but not in LibGDX) themed in Space Warfare, I want to create quick
paced battles that needs quick reactions to work straight from the start, removing elements like multi resources and 
control points

The game was thought of from two elements
1. BOID - A game on Steam with a nice and simple RTS design
2. My Game Development module - At College I did a Game Dev Module which I used to make a simple game, from that I
thought of expanding upon it further

Some basic information is covered in this readme but you can find more detail in my wiki (WIP)

## The Idea

The reasons I picked the space theme was because I like the simplicity on how the enviroment for such a theme would
work like Gravity. My favorite game genre is Real Time Strategy and across all the strategy games I've played, I always
think there is something missing, that is why I have the motivation to make my own.

The design / look of the game I'm not to sure on and from my past experience in making more simple games, I would think
to use free assets and work on designs later (since I don't really do visual design as much as I programme)

## My Twist(s)

### Smart Squadding

I wanted to make something that I don't frequently see in RTS Games, while control groups and manually setting teams in
any army is cool, I wanted to make it a bit more automated and follow a formation in design, this would be having a
sort of structure to the units in an RTS somewhere similar to Ashes of the Singularity, where a large Capital unit can
be in command and lead smaller units like Special and Grunt type units.

This system wouldn't simply be something that help just group units but determine how they fight when not being managed
by the user. If the squad consisted of basic grunt type units, they would play aggressive and use their speed and small
size to their advantage while if teamed with a special type of unit they would aim to intercept and support on that
special unit's target.

What I expect is a system where a player can feel more focused in certain fights and has more freedom to leave a combat
scene while the AI does the rest. Though I see this as possible a big aim with the mention of AI I have thought of
ideas that may seem feasible and I want to try before looking away from this.

### Minimalistic

When I see some RTS Games though I do find micro managing fun sometime or longed out games I lose sight on many
elements, I want to make my game have a simple path from start to finish. How? I'm not too sure but I would see
ideas being the use of no resources to construct units, few unit types or no secondary objectives

## Inspiration and Original Concept

### BOID
![](http://vignette3.wikia.nocookie.net/steamtradingcards/images/e/e5/Boid_Logo.jpg/revision/latest?cb=20150401201235)

BOID was a very large inspiration for wanting to make a strategy game, I came across this game while checking out some
Indie Games at EGX 2013, I got hold of the game when it was released and saw its style of gameplay very unique and
simple, so I wanted to look at that aspect from this game, all I saw was that this game felt a bit slow at times and
hard to maneuver.

### SolWars Original (Game Development Coursework Module)

**In Progress** - I am building my github.io where my code for this currently is so I'll talk about this part once I'm 
finished

### Ashes of the Singularity
![](http://cdn.edgecast.steamstatic.com/steam/apps/507490/header.jpg?t=1506015473)

Ashes of the Singularity is a very large RTS Game made for long and sustained warfare, the use of managing large groups
of armies under the flagship of a large dreadnought made me think of how making a structured army / platoon / squad
would work to make synergy a more amazing aspect of an RTS game. This gave me the idea of 'smart squadding' and making
more automated combat, to an extent

# Development

## To-Do / Progress

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


## Notes

When I commit with the Comment "End of Day" that's me pushing to move my work that I may not have finished from College
to work at Home

As I continue to build the game I will probably come up with more game types / ideas that I could use in the main game
or add as a extra feature, this will be built upon Stage 5

# Acknowledgments   

Kenney's Assets Pack - Space Shooter Redux and v2   
