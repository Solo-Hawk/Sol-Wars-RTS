# Sol-Wars-RTS
To learn and understand how to make a game I am learning LibGDX to make a 2D RTS Game as a way of learning both the 
steps in making a game from start to finish as well as understanding how to make a simple AI to compliment my RTS game

**Contents**

- About the Game
    - The Idea
    - My Twist(s)
    - Inspiration and Original Concept

- Development
    - To-Do / Progress
    - Notes
   
- Downloading the Current Build
    - Getting Started
    - Prerequisites
    - Setup
        - Guide to Setting up Android SDK
        - Guide to Setting up the Desktop Launcher

# About the Game

My game will be a 2D RTS Game (I may move to 3D but not in LibGDX) themed in Space Warfare, I want to create quick
paced battles that needs quick reactions to work straight from the start, removing elements like multi resources and 
control points

The game was thought of from two elements
1. BOID - A game on Steam with a nice and simple RTS design
2. My Game Development module - At College I did a Game Dev Module which I used to make a simple game, from that I
thought of expanding upon it further

## The Idea

The reasons I picked the space theme was because I like the simplicity on how the enviroment for such a theme would
work like Gravity. My favorite game genre is Real Time Strategy and across all the strategy games I've played, I always
think there is something missing, that is why I have the motivation to make my own.

The design / look of the game I'm not to sure on and from my past experience in making more simple games, I would think
to use free assets and work on designs later (since I don't really do visual design as much as I programme)

## My Twist(s)



## Inspiration and Original Concept

# Development

## To-Do / Progress

Over the course of starting this project I've have gone through plenty of iterations of just starting to think how to
make this game and whats some of the best ways to start.

I have since then settled on how I plan to do this and how to start recording all progress made, aiming to not even 
start making the game but making the menu as a platform of understanding what to use and where to use certain functions

**Stage 1 - Making the Menu**

- [ ] Main Screen
- [ ] Basic Settings Screen
- [ ] Create a transition handler (Changing from Main to Settings)

**Stage 2 - Building the Game (MVP)**

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

**Stage 5 - Improvents and Explorable Features**

- [ ] Squading System (A twist on control groups to multi task)
- [ ] Wave Mode (A game mode where you create waves that spawn every 1-3 minutes to have a gradully increasing paced
game with limited resources)
- [ ] Multiplayer (Something I'm not too sure I want to attempt this in LibGDX)


## Notes

When I commit with the Comment "End of Day" that's me pushing to move my work that I may not have finished from College
to work at Home

As I continue to build the game I will probably come up with more game types / ideas that I could use in the main game
or add as a extra feature, this will be built upon Stage 5

# Downloading the Current Build

To get the code for the current game you can clone the release branch or if you want to see where I'm currently at clone
the release build

## Getting Started

Below is a guide on how to take a copy of the latest game build from the 'release' branch and test the progress so far 

## Prerequisites

- Java JDK 8
- Java JRE 8
- IntelliJ
- Android Studio (Latest)

**Optional**
- LibGDX Setup app - get it [here](https://libgdx.badlogicgames.com/download.html)

## Setup - Not complete (I myself haven't cloned my work from my source machine so I'm going through understanding the
steps of cloning a gradle project)
    
Clone the 'release' branch latest build.

Open the working directory in IntelliJ and Setup the Android SDK

### Guide to setting up the Android SDK

Use this guide if you haven't got an Android SDK Setup in IntelliJ
```
1. Open the Project Structure and Locate the SDK Menu and at the top click the '+' then 'Android SDK'
```
![alt](https://github.com/Solo-Hawk/Sol-Wars-RTS/blob/master/images/Android%20Setup/open_PS.png?raw=true)
```
2. Locate the 'Home Directory' of your SDK
```
For Windows users this is normally located in you C:\Users\[Account Name]\AppData\Local\Android\sdk

![alt](https://github.com/Solo-Hawk/Sol-Wars-RTS/blob/master/images/Android%20Setup/Locate_Home_Directory.png?raw=true)
```
3. At the Create New Android SDK dialog check that the Java SDK if your latest version and that the Build Target matches
your Android API Version
```
![alt](https://github.com/Solo-Hawk/Sol-Wars-RTS/blob/master/images/Android%20Setup/Create_SDK.png?raw=true)
```
4. Once done you should be fine with the Android SDK being added to your IntelliJ Project Strucute
```
![alt](https://github.com/Solo-Hawk/Sol-Wars-RTS/blob/master/images/Android%20Setup/Setup.png?raw=true)
```
5. Goto the modules tab and locate the android module

6. On the right side of the menu set the Module SDK to the android SDK that you just added to your IntelliJ
```
![alt](https://github.com/Solo-Hawk/Sol-Wars-RTS/blob/master/images/Android%20Setup/Add%20to%20Module.png?raw=true)


### Guide to setting up the Desktop Launcher

So you can run the app on your machine as a desktop version and not an android version you need to configure a launcher 
for running this on the desktop
```
1. Select the dropdown next to the build button

2. Select Edit Configurations
```
![alt](https://github.com/Solo-Hawk/Sol-Wars-RTS/blob/master/images/Config%20Launcher/open_config.png?raw=true)
```
3. Click the '+' to create a new launch configuration

4. Select 'Application' as the configuration type
```
![alt](https://github.com/Solo-Hawk/Sol-Wars-RTS/blob/master/images/Config%20Launcher/make_application_config.png?raw=true)
```
5. Name the launch configuration Desktop (or something that makes it clear that its the desktop config)

6. Assign the main class of the launcher to the DesktopLauncher class (Click '...' on the right to find the module)

7. Set the working directory to the assest folder located in ...\Sol-Wars-RTS\android\assets

8. Set the class path module to the desktop module
```
![alt](https://github.com/Solo-Hawk/Sol-Wars-RTS/blob/master/images/Config%20Launcher/configure_desktop_launcher.png?raw=true)

Once you've done that the launch configuration should appear where you oringally went to edit the configuration (Top Right)
of the IDE (If it still says Android click the dropdown and select Desktop)

