Names: 
 
	 Chen Maman

	 Tom Suad

	 David Yehezkel

	 Roie Yadai

Programming language: This project was implemented with Java language.
Purpose: Find the shortest route from starting point to destination point without crossing through the black-list points ,that indicate that the route is not valid.
Problem: Finding the shortest route from starting point to destination point.
Solution: Analyzing the graph by the following way:
Define starting point and destination point on the graph, and calculate the length of lines, that represents the distance between the points. Then we choose the shortest route.

Example: We want to go from point A to C.

Point 
	
	a - > b = 6.5
        
        b - > c = 2 
        
        a - > c = 10 					

After calculating the distance between the points, we prefer to go through A to B, and then B to C, since in total this is the shortest route.
Problem: Build route without crossing black-list points.
Solution: We set all lines that go through the black-list points with max-value, to make sure       	   that when calculating the shortest route we will not pick these lines.

Example: We want to go from point A to C.	

points(point 'b' on the black list )  :
	
	  a - > b = 6.5
	
	  b - > c = 2
	
	  a - > c = 10

	We define B as black-list point. We set all the lines that start from point B, to the 
	Max-value, therefore the shortest way will not go through point B for sure. And the 
	route will be from A to C.

Open Source: We choose to work with Dijkstra algorithm open source, since we think it is the most practical and efficient way to implement the project.
Sources: open source - http://algs4.cs.princeton.edu/code/
	 open source additional information – 
	 http://www.cswiki.org/wiki/index.php?title=Dijkstra
	 https://www.youtube.com/watch?v=eJC3Ql2e3CU .    
