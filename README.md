# AqFer-Robot_Problem

Solution Description 
  At first the input get from the command line argument and it splited as two string, First string has the source value and second string has the target value. The values inside it are string have to change the co-ordinates to integer and split them by "," and store the value in Point class. Point class are the one that carry the source and target co-ordinates and the direction. By using switch method(direction) problem can be solved, 
1)In case if the direction is N and source y co-ordinate is less than target y co-ordinate it has to be MOVE FORWARD  or else direction is changed from N to W(Turning Left).  
2)In case if the direction is W and source x co-ordinate is greater than target x co-ordinate it has to be MOVE FORWARD  or else direction is changed from W to S(Turning Left)
3)In case if the direction is S and source y co-ordinate is greater than target y co-ordinate it has to be MOVE FORWARD  or else direction is changed from S to E(Turning Left)
4)In case if the direction is W and source x co-ordinate is less than target x co-ordinate it has to be MOVE FORWARD  or else direction is changed from E to N(Turning Left)
This 1 to 4 process run repeatedly until this condion  while((S.x!=T.x) || (S.y!=T.y)|| (S.d!=T.d))   become false

Now the source and target(destination) in same co-ordinate and direction 

OS version: WINDOWS 11
Java version: jdk-18.0.2.1

INPUT
0,0,S 2,3,N

OUTPUT
Source: 0 0 S, Destination: 2 3 N
Steps:
Turn Left:    0 0 E
Move Forward: 1 0 E
Move Forward: 2 0 E
Turn Left:    2 0 N
Move Forward:  2 1 N
Move Forward:  2 2 N
Move Forward:  2 3 N
Summary:
Total Steps  : 7
Move Forward  : 5
Turn Left  : 2
