#
#Feature: verify the videgame Api
#
#Scenario:verify the get request for all
#Given the videogame endpoint "/videogames"
#When I have send the get request
#Then the videogame response status should be 404
#And the videogame json should have "id"
#
#Scenario:verify post request for all
#Given I have given the endpoint "/videogames"
#When I send the POST request with an body for video game
#Then the video game response status code is 404
#And the video game response body should contains the "ID"
#
#
#Scenario:verify the put request for videogame
#Given I had the endpoint for put "/videogames/2"
#When I send the put request with an body in video game 
#Then the video game response status code be 404 
#
#
#Scenario:verify the delete for videogame
#Given I had able to get the endpoint for delete "/videogame/1"
#When I send the delete request for videogame
#Then video game response status code must be 404