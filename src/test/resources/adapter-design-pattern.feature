Feature: Draw shapes

Scenario: Draw a rectangle
  Given I have a rectangle
  When I draw the rectangle
  Then "Drawing Rectangle" should be printed

Scenario: Draw a circle
  Given I have a circle
  When I draw the circle
  Then "Drawing Circle" should be printed

Scenario: Draw a triangle
  Given I have a triangle
  When I draw the triangle using the ShapeAdapter
  Then "Drawing Triangle" should be printed