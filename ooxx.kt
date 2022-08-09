fun main()
{
    //draw the game-map,the map nust be like:
    //  0   1   2
    //0   |   |
    // -----------
    //1   |   |
    // -----------
    //2   |   |
    //init the map 
    val map: ArrayList<ArrayList<String>> = arrayListOf(
        arrayListOf("-","-","-"),
        arrayListOf("-","-","-"),
        arrayListOf("-","-","-")
    )

    //create a check if game ended
    var game_end_check = true

    while(game_end_check)
    {
        var chooser:Int = 0 

        if(chooser%2 == 0) //it mean that the O place their symbol 
        {
            //user input
            println("Choose the position you want to put O (｢･O ･)｢")
            print("Enter the row:")
            val input_1 = readLine()!!.toInt()
            print("Enter the column:")
            val input_2 = readLine()!!.toInt()
        
            map[input_2][input_1] = "O"
            //print the map
            for(i in map.indices)
            {
                println(map[i].toString())
            }
            chooser+=1
            println(check_if_win(map))
        }

        //######################## I'M SPLIT LINE ########################//

        if(chooser%2 == 1) //it mean the X place their symbol 
        {
            //user input
            println("Choose the position you want to put X (｢･X ･)｢")
            print("Enter the row:")
            val input_1 = readLine()!!.toInt()
            print("Enter the column:")
            val input_2 = readLine()!!.toInt()
        
            map[input_2][input_1] = "X"
            //print the map
            for(i in map.indices)
            {
                println(map[i].toString())
            }
            chooser+=1

            //let the game end
            if(chooser == 8)
            {
                game_end_check = false
            }   
            println(check_if_win(map))
        }

        
    }  
}

fun check_if_win(map:ArrayList<ArrayList<String>>):String
{   
    //check row and column
    for(i in 0..2)
    {
        if(map[i][0] == map[i][1] && map[i][1] == map[i][2] && map[i][0] != "-") 
        {
            return "YOU WIN!"
        }
        else if(map[0][i] == map[1][i] && map[1][i] == map[2][i] && map[0][i] != "-")
        {
            return "YOU WIN!"
        }
        else break
    }

    
    //check 

    return " "
}

