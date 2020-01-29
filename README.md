# Decorator
CSCD349
Assignment 3: Decorator Pattern
The winter holidays will be here (again) before you know it! Being the organized individual you are, you have a plan for next year's holiday tree.  Implement a software system that allows you to calculate the price of any tree plus any combination of decorations. The system must be easily extendable in the sense that whenever new decorations are added in the store you will have to at most add one class. 	holiday tree

Here are two tables representing costs of trees and decorations, respectively

Name 	Cost
Fraser Fir 	35
Douglas Fir 	30
Balsam Fir 	25
Colorado Blue Spruce 	50

 
Name 	Cost
Star 	4
Ruffles 	1
Balls Red 	1
Balls Silver 	3
Balls Blue 	2
Ribbons 	2
Lights 	5
LEDs 	10


A very important requirement is that a tree can only have one star. When a user wants to decorate a tree containing a star with a new star, you must print a warning that the tree already has a star and not add the price of a star to tree. Users must be able to continue decorating their tree if they attempt to add another star to it.  The following code snippet (which you are NOT required to use on your assignment) illustrates the problem:

Tree mytree = new BlueSpruce();
mytree = new Star(mytree);
mytree = new Ruffles(mytree);
mytree = new Star(mytree); //this is problematic and should not be permitted
mytree = new Ruffles(mytree);
printtree(mytree);

should lead to something like:

Tree already has a star!
Blue spruce tree decorated with, a Star, Ruffles, Ruffles costs $56.00

You should design your solution such that adding an additional star is not allowed.  While stars are decorations, they are special.  Consider how you might avoid the problem in the sample above and implement an appropriate solution.  An important consideration is what class should be responsible for enforcing a single star on a tree.  Try and minimize the effect dealing with a star has on class relations in your solution.
