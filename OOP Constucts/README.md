# OOP Constructs

## Scenario Question

You are developing a simple geometry application in Java. The application needs to represent points in a 2D space and perform basic operations such as retrieving coordinates, updating them, and calculating distances.

1. Implement a class called `Point` with the following requirements:
	- It should have two private fields: `x` and `y` of type `double`.
	- Provide public getter and setter methods for both `x` and `y`.
	- Include a constructor that initializes the point with given `x` and `y` values.
	- Implement a method `distance()` that returns the distance of the point from the origin $(0, 0)$.
	- Implement an overloaded method `distance(Point p)` that returns the distance between the current point and another point `p`.

2. Demonstrate how you would use this class to:
	- Create two points: one at $(3, 4)$ and another at $(6, 8)$.
	- Print the distance of the first point from the origin.
	- Print the distance between the two points.

## Expected Output

```
Distance of p1 from origin: 5.0
Distance between p1 and p2: 5.0
```
