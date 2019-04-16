# LandVille.java-Project
LandVille is an one-player game where the player can build his or her dream house on a land, but needs to follow the building rules and regulations. 

Both the number of row and column should be between 0 and 10. "0" stands for land; "1" stands for fence;  "8" stands for house. Fence and house need to built on top of land. 

Apart from that, the difference between the row of the house and the row of the land must be >= 2. This rule also applies to the column of house and land. if any of the input parameters do not satisfy this condition, an error message will be shown.

There are four options you can choose from as following:
1. Build the house
2. Display land
3. Clear land
4. Quit

**Build the house** can build both fence and house, but you have to follow this specific order such as building the fence first and then building the house. As I mentioned before, #row(land) - #row(fence) >=2, #row(fence) - #row(house) >=2 and the same rule applies to the column. 

**Display land** works to display your current work after you type in the row and column number. 

__Clear land__ works to reverse all your current work to initial value which is 0. 

__Quit__ is for the time you have finished building the house and you are ready to end the game.

## Built with 
* Java

### Prequisites
* JDK8 or higher version

### Run the project in the terminal

```
cd folder directory
```

```
javac LandVille.java
```

```
java LandVille
```
 


