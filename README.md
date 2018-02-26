# EPQ Branch - https://github.com/Solo-Hawk/Sol-Wars-RTS/tree/EPQ

# Investigation into Steering Behaviours in LibGDX - Java

My EPQ could a big turn from its original plan (Investigation into the Game Development Process in Java - LibGDX. There is a lot to be said on how my expections were defeated by reality and in turn made me more interested in the minior detail of the whole process.

My project started being **Investigation into the game development process in Java - LibGDX,** my idea here was that the project felt reasonable, something I could achieve and meet with standard and quality. I have the necessary tools to do this so all is good.

## My Investigation into the Game Development Process - Sept 18th 2018

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

After concepting and getting foundations on the ground and seeing how I would work on this project I started development Oct 6th 2018

### To-Do / Progress

Over the course of starting this project I've have gone through plenty of iterations of just starting to think how to
make this game and whats some of the best ways to start.

I have since then settled on how I plan to do this and how to start recording all progress made, aiming to not even 
start making the game but making the menu as a platform of understanding what to use and where to use certain functions. 

Each stage I marked with the predicated days, setting my time frame very simply, it was clear where I should be and each 5 days refered to one week

**Stage 1 - Making the Menu** - 10 Days

- [ ] Main Screen
- [ ] Basic Settings Screen
- [ ] Create a transition handler (Changing from Main to Settings)

**Stage 2 - Building the Game** - 20 Days

The end of this stage I should have a Ship class that I can use to extend from and the basic version of an AI to build
upon. This will help build the game further

- [ ] Create a basic design of spawning and killing sprites (Ships)
- [ ] Learning how to make a simple form of AI (Just moving randomly in a general direction to fight player)

**Stage 3 - Expanding the game to have Ship classes** - 20 Days

- [ ] Using the basic sprite make a Ship class that all different ship types will be extended from
- [ ] Improve the AI and make the AI Unique to each ship type

**Stage 4 - Build the UI and factory game mechanics** - 20 Days

- [ ] Build a factory model that will be used to produce ships
- [ ] Make AI types for more adaptive game play (Aggressive, Defensive e.c.t)
- [ ] Create or find someone to outsource art work for the game (Not sure what kind of style I want yet but I have a
few ideas)

**Stage 5 - Improvements and Explorable Features** - 10+ Days

- [ ] Squading System (A twist on control groups to multi task)
- [ ] Wave Mode (A game mode where you create waves that spawn every 1-3 minutes to have a gradully increasing paced
game with limited resources)
- [ ] Multiplayer (Something I'm not too sure I want to attempt this in LibGDX)

This planing was reflecting into a Gantt Chart.

https://github.com/Solo-Hawk/Sol-Wars-RTS/blob/EPQ/images/EPQ/EPQ%20-%20Gantt.png?raw=true

![https://github.com/Solo-Hawk/Sol-Wars-RTS/blob/EPQ/images/EPQ/EPQ%20-%20Gantt.png?raw=true](https://github.com/Solo-Hawk/Sol-Wars-RTS/blob/EPQ/images/EPQ/EPQ%20-%20Gantt.png?raw=true)



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
# Mid Project Review - Supervisor Meeting

When it came to the mid point of my project, I had to look a the whole picture to understand where I was at and it took a lot time to start to consider that I should scale down the project to just a small part of my concepted game.

Here I took a meeting with my supervisor to discuss how I feel with the project and what action I think are necessary to change.

I discuessed with my Supervisor;

 - How I feel the scope I orignally had was too large
 - What I see is more achievalbe
 - How I will achieve the new objective
 - What to take from this

This then led to...

# The Change of Investigation

This was where I had my mid-project review and saw that the scope of my project was way more than what I could bite. So what I needed was to lower the scope drastically. However no major changes were needed.

My scope change was as simple are reaching a new marked MVP of my game which wouldn’t make the original level of a ‘Alpha’ build of a game, but focus of the movement mechanic that would be used in this game if it was to be made into a complete game and here was where I saw the Investigation scope changed drastically and hence at mid project the final project title was:

**Investigation into the Games Development Process in Java - LibGDX -----> Investigation into Steering Behaviour in LibGDX - Java**

## ToDo Changes

Following this change the need to cut down the todo list happened and some modifications.

**S̶t̶a̶g̶e̶ ̶1̶ ̶-̶ ̶M̶a̶k̶i̶n̶g̶ ̶t̶h̶e̶ ̶M̶e̶n̶u̶** - 10 Days - Completed in 5 Days

- [x] Main Screen
- [x] Basic Settings Screen
- [x] Create a transition handler (Changing from Main to Settings)

**Stage 2 -Investigating Steering Behaviours** - 80 Days

- [x] Investigate Steering Behaviours - 10 Days
- [ ] Learn Steering Behaviour Models - 15 Days
- [ ] Learn Steeting Behaviour Implentation - 15 Days
- [ ] Develop Basic Steering Models into LibGDX - 10 Days
- [ ] Design Steering Model Interface in LibGDX  - 10 Days
- [ ] Finalise Steering Model and functional code - 20 Days

 **Second Gantt Here**
 
 https://github.com/Solo-Hawk/Sol-Wars-RTS/blob/EPQ/images/EPQ/EPQ%20-%20Gantt%202.png?raw=true
 ![https://github.com/Solo-Hawk/Sol-Wars-RTS/blob/EPQ/images/EPQ/EPQ%20-%20Gantt%202.png?raw=true](https://github.com/Solo-Hawk/Sol-Wars-RTS/blob/EPQ/images/EPQ/EPQ%20-%20Gantt%202.png?raw=true)
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

- [x] Learn Steering Behaviour Models
***
This was a large change of pace, though I got to better orient to the new scope and better place my plan for the the work ahead
***
## Nov 28 2017
https://github.com/Solo-Hawk/Sol-Wars-RTS/tree/3ca6757ba81db6691403169c2b1e479d3c38a226  

Following with what I decided from my Mid Project Review I spent a lot of time building these new movement behaviours, here I build some of the “Core” Behaviours I’ve come across and groups entities to follow each other in groups, though there are a lot of floors I’ve reached a clearly successful creation of this AI Movement Behaviour. Just some minor details are needed to finish this.
- [x] Learn Steeting Behaviour Implentation
***
Here I felt for comfortable with the change, I felt better settling into this scope and saw it as a more achievable objective.
***
## Dec 15 2017
https://github.com/Solo-Hawk/Sol-Wars-RTS/tree/38789d1999b359c324db71cfe306be6ac8ffffc3 

Using what I’ve learnt I took time to see how I could improve and better manage elements of my code, I took the time to review my code, evaluate and see what I could improve. This resulted a faster running application. Here I came close to a final product.

- [x] Develop Basic Steering Models into LibGDX
- [x] Design Steering Model Interface in LibGDX
***
I felt more relieved in the change of project aim as I reached this point, seeing how long it took me just to reach this point to where I could evaluate my code made me see where I would've had to make more sacrafices just to make a whole game
***
## Jan 7 2017
https://github.com/Solo-Hawk/Sol-Wars-RTS/tree/f124f52f360fe97f530c64472d504b3de3226ea0 

With all the core movement behaviours that I’ve made, I saw that I needed to make some changes, I still see issues that I’m not too sure how to tackle but nothing that stops it from being called a final product.
- [x] Finalise Steering Model and functional code
***
This was the last stage, the only issues here was general debug, some trial and error can fix this stage and it was very smooth reaching the final product from here.
***
# The Final Product

Reach Jan 7th was the finaly stage of cleaning up very minior details within the same day of making the commit documentation, something my problems are easier than I think.

The Final Product is a demonstration of what I created using LibGDX, AI Steering Behaviours, this with the use of Kenney's Assets for visulsation allows me to show my work and how it performed. 

## Screenshots
For the purpose of printed out documentation, screenshots are used to show my work in basic form to prove that it worked and that I created something that is real. 
The following screenshots show the basic development of Following Movement Behaviour (Sprite A goes to Sprite B)

![](https://github.com/Solo-Hawk/Sol-Wars-RTS/blob/EPQ/images/EPQ/SS%20Demo%20One.png?raw=true)

This was within the first stages of development, getting the simple stage of models working, movement at a basic level. Green Lines indicated the current facing and Red is the intended direction

![](https://github.com/Solo-Hawk/Sol-Wars-RTS/blob/EPQ/images/EPQ/SS%20Demo%20Two.png?raw=true)

This is me improving my code, being able to handle more entities at a smaller level has some interesting effects and helped me understand the scale of my code

## Video Demo

In order to best display my project without the need to do any complicated setup for the user I recorded a simple video demo, this is going through all the experimentation and the outcome of my Steering Behaviour Model, all my work led to a 3 Minute Video showing the first stage of where I actually had a visual product as a lot was reach that stage for 2/3rds of the development.
https://www.youtube.com/watch?v=HXI8r1umqlQ
[Video](https://www.youtube.com/watch?v=HXI8r1umqlQ)

## Compiled Application

Downloading the finished programme is also possible (Requires Java JRE 8 / JRE 9 - **may cause errors** )
https://github.com/Solo-Hawk/Sol-Wars-RTS/wiki/Setup-Guide
[Download](https://github.com/Solo-Hawk/Sol-Wars-RTS/wiki/Setup-Guide)

# Evaluation

Coming to a close my final product of developing a Steering Behaviour Model proved very successful. I feel that I have gained a lot from this project and I really see how I can apply what I've learned in future application, mainly in Computer Games Development. I've understood myself better in the project and how I find myself taking on a much larger task than usual, and I can learn from this to further prepare myself for larger projects to come.

## Planning
My planning was very basic, I used the basic use of a Gantt chart and Listing out my objective to create said Gantts as the way of planning, I use this to look ahead in my work and visualise where I should be at the end of the project, of course since I had the event to change the plan, change the aim and had to update my ToDo and Gantt but thanks to previous planning I found this trainsition very smooth, making my project easy to change, replanning was smooth and no progress was lost at the change. I feel my planning helped me do this and my effective adaptive skills allowed me to make this change.

## Implementation
Implementing my work was effective after my Mid Project Review, my product went through many iterations per milestone in order to reach each one. I kept trying to make my code more efficent and my general practice of coding standard was very good in helping me develop code quickly and efficently. Making the application run faster, smoother and allowed me to run more complex actions in between, the design / research and planning stage worked together to make my product and without it I see there was no way I could have developed what I had within the time frame.

## Outcome
My outcome was working demo of Steering Model, with this kind of project I saw that it was very digtally dependant even to showing the outcome, screenshot on paper could only show the tip of what I accomplished, video and providing the final app was the best way. The outcome proved to be on a higher level of what I expected, I gain so much I beat my expectation on the outcome and provided some very interesting outcomes. The work I learned helps me understand why its relavent, where its needed in the future and I can definelty see myself using my outcomes to better myself in my path of Games Development.

## Lessons Learnt
It was clear during the project I originally made a very large scope, putting too much on my plate, What I need to learn in the future is to think more realisticly at the start to avoid this. Though what I did also gain from having this occur was seeing the importance of making mistakes, identifying it and acting immediately, in this case. How to accept the issue and change the project parameters to better myself and still produce and acceptable outcome.

Further I've learnt more in LibGDX, being a Java Developer there are many libraries such as LibGDX that I don't understand, and learning this can help my career as a Computer Games Developer. This I see important to me, its clear learning from scratch is the best way to learn in programming and thats what I've done. 

# Conclusion
I've completed my project, and with that I've gained skills to better improve my general coding and game programming logic. This all combined has made me a better programmer as well as better in working in large sized projects. The outline here is that I feel more capable taking on projects like this and I think that in the future I will take on the first project title that I didn't complete and make a full game in LibGDX.













