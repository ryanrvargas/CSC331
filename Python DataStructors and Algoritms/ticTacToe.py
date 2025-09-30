#Here is the promted I was asked to code for AWS intership

print("Hello")
grid = [["-","-","-"],
        ["-","-","-"],
        ["-","-","-"]]

x = 0
o = 0

def checkBox(p1, p2):
    #if x or o in grid return 1, otherwise return 0
    print(p1, p2)
    if grid[int(p1)][int(p2)] == "X" or grid[int(p1)][int(p2)] == "O":
        return 1
    return 0

def displayGrid():
    for x in grid:
        print(x)

def checkWinner(grid):
    #Check rows
    for row in grid:
        if row[0] == row[1] == row[2] and row[0] != "-":
            return row[0]
        
    #Check colums
    for col in range(len(grid)):
        if grid[0][col] == grid[1][col] == grid[2][col] and grid[0][col] != "-":
            return grid[0][col]
    
    if grid[0][0] == grid[1][1] == grid[2][2] and grid[0][0] != "-":
        return grid[0][0]
    
    if grid[0][2] == grid[1][1] == grid[2][0] and grid[0][2] != "-":
        return grid[0][0]

def play():
    while True:
        #Get input
        p1 = input("P1:Input Row,Coloum. First number then comman then next number no spaces\n")
        positionP1 = p1.split(",")
        
        #Check block
        while checkBox(int(positionP1[0]), int(positionP1[1])) == 1:
            p1 = input("Try again:\nPlayer 1:Input Row,Coloum. First number then comman then next number no spaces\n")
            positionP1 = p1.split(",")
            if checkBox(positionP1[0], positionP1[1]) == 0:
                break
            
        #Set value in block
        grid[int(positionP1[0])][int(positionP1[1])] = "X"
        displayGrid()  
        if checkWinner(grid) == "X":
            print("Player 1 wins")
            break

        #Check and get user input
        p2 = input("Player 2:Input Row,Coloum. First number then comman then next number no spaces\n")
        positionP2 = p2.split(",")
        while checkBox(positionP2[0], positionP2[1]) == 1:
            p2 = input("Try again: \nPlayer 2:Input Row,Coloum. First number then comman then next number no spaces\n")
            positionP2 = p2.split(",")
            if checkBox(positionP2[0], positionP2[1]) == 0:
                break
        
        #Set value in block
        grid[int(positionP2[0])][int(positionP2[1])] = "O"
        displayGrid()    
        if checkWinner(grid) == "O":
            print("Player 2 wins")
            break   



displayGrid()
play()



