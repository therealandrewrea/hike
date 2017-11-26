# Capstone Project Plan

Andrew Rea - Take a Hike

## Overview
Take a hike is a web application that lets users contribute and categorize local hiking trails to make discovering hikes easier for casual and experienced hikers and walkers.  Knowing where to go, what the terrain will be like, and how long or difficult a particular hike is important but difficult to suss out from the provided resources.  So how can local hikers easily exchange information about new trails or the unique character of each?

Take A Hike relies on a user-contributed database of hikes that have customizable tags.  The users create and adopt new tags to refine how hikes are identified.  When a user adds a new hike, they can provide the basics (name, length, difficulty, location) as well as additional tags that they create themselves or select from the existing pool.  These tags and the base characteristics of each hike are searchable from the main page by any visitor to the site.

## Features
User Login - users can create an account that allows them to add new hikes and tabs, as well as apply tags to an existing hike.

Search - the tags, trail descriptions and characteristics are all searchable by strings and return results to the main landing page.

Create Hike - Users are presented a form to add required basic hike information along with a name.  They are then give the option to add tags from an existing pool of choices or to add new ones.

GPS/Search by proximity - Integrate Google Maps API to drop a pin at the trailhead and search based on proximity or display an overhead map of search results.

## Technologies
Java
MAMP/MySQL
Springboot
Thymeleaf
Bootstrap
Google Maps API

## What I'll Have to Learn
I'd like to make it look clean and consistent, which is going to stretch my limited CSS and Bootstrap experience.  I may need to use some JavaScript to get the API to work as well, which feels like a stretch but we'll see.  Hosting and deploying a full database outside of MAMP is new to me as well.  I know all of the Java pieces fairly well but I need to get much more comfortable adjusting and building out a full application under my own steam.

## Possible Features
User Profile - users can favorite hikes and view their list of edits and additions
Admin access - an admin can edit and remove tags, correct spelling, and refine the database
Photos - User uploaded photos.  May require admin approval after upload.
Trail closures - banner for closed trails or hazardous trail conditions, applied by admin when notified by user.
