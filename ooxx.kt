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

    while(true)
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
        }
    }  
}


fun check_if_win()
{
    
}

