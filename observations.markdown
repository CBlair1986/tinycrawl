Observations
============

Requirements for Lines
----------------------

Lines go from point A to point B, and in between is the focus area, the spot
in which the adventurers march along, and the monsters spawn, and combat
happens, and dungeon paths branch off. At the end of one of these lines, there
lies the dungeon boss. He is quite the charmer, once you make your way past
the evil stuff.

But I digress.

Lines. The main line, or rather the main Node (those are the ends of the
lines) would have to be the Town. The Town is capitalized, indicating that it
is rather important to you, the reader. The reader is uncapitalized, because I
am probably typing this to myself.

But I digress.

Again.

The main end of the line is the Town, the location of the Adventurer's Guild.
Or An Adventurer's Guild. There might be more than one, if I can do this
right.

But for now, imagine one. The Adventurer's Guild (AG) sits in the town, and
serves as the starting point for the Adventurers. They start their
possibly-short existences there. From there, they venture out into the world,
blindly looking to further themselves.

The simplest way to do that is to make their way towards a dungeon and kill
the innocent denizens inside. Because for some reason or another, killing a
skeleton that is minding its own business is perfectly legal, and empowering.

Of course, the killing gets boring after a while, either too easy or too
repetitive, so the Adventurer presses onwards. Eventually, he reaches the
Boss. Some time afterwards, after many, many deaths, the Boss is slain and the
dungeon crumbles, every Adventurer inside is ejected out and all the skeletons
are left in peace, and a new dungeon arises somewhere else.

Because Good Guys never die in the collapse of a dungeon, and the Bad Guys
never grow a brain.

Really, the Requirements for Lines, This Time
---------------------------------------------

Lines have a start and end Node. These can be any two random points, and
more-than-likely _will_ be in the final implementation. The Line uses the
environment variables to discern what _kind_ of Line it is, be it dungeon
Line, forest path, town road and whatnot. The environment is important, for
the simple fact that different things spawn in the forest than in the dungeon,
and not at all (or at least rarely) in the town.

A Line has a length, as well. This can be determined by the distance between
the start and end Nodes, but could also be determined randomly. Nobody said
that the paths have to be straight in the graphical representation, they could
very well end up winding around quite a bit.

The spawn rate of a Line will determine whether or not it is a deathtrap for a
single Adventurer, or a cakewalk. A rate of 0.1 would likely be towards the
deathtrap end of the spectrum, since the rate is the number of seconds between
a spawn.

The Line has a spawn variable, too. More than likely this will take the form
of a list of Mobs, which themselves are lists of Creatures.

A Line will need two separate layering mechanisms to keep track of the
positions of the Agents running around on it, and the doorways connecting it
to other Lines. Doors are just nodes that happen to be in the middle of a
Line. 

A Less Confusing Summary of the Above
-------------------------------------

* Line
    * Start Node
    * End Node
    * Length
        * Perhaps determined via the start and end nodes or
        * Perhaps determined programmatically
    * Spawn Rate
    * Spawn Mob List
    * Agent Contents
    * List of Doors, If Any

