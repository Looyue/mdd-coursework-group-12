# XCSS
An improved version of CSS

## Introduction
In this project, we implement an improved version of CSS with the help of xText.

This new language has some new features CSS doesn't have.

## Usage
1. Import the five folders whose name include "mdd.coursework.xcss" into Eclipse

2. Right click on the folder "mdd.coursework.xcss" and select Run as -> Eclipse Application

3. In the opened runtime eclipse application, create a new project and create a new file whose suffix is xcss in the src folder

4. Write code in the xcss file and save it, then a css file will be generated in the src-gen folder

For running the project, it is essential to install Xtext(2.24.0) and Xsemantics(1.10.2)

## XCSS demo
```
$color = #ffffff
$pixel = 1px
$size = $pixel * 2
$zIndex = 10

html, body:hover
	$color = #000000
	height: 10px
	color: $color
	width: $size
	
.header
	z-index: $zIndex
```