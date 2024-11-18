rootProject.name = "app"
include("src:main:java:hexlet:games")
findProject(":src:main:java:hexlet:games")?.name = "games"
