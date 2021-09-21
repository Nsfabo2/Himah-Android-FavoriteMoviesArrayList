
fun main(){
/**/

    //Create an ArrayList
    val MoviesArray = arrayListOf<String>()

    //The user must enter at least 3 items
    var counter = 0
    println("What are your favorite movies?")
    while (counter < 3){
        //Ask the user to enter their favorite movies
        var movie = readLine()!!.toString()
        //Add each item to the ArrayList
        MoviesArray.add(movie)
        //If the ArrayList has 3 or more items ask the user if they want to continue
        if (MoviesArray.size >= 3){
            print("Would you like to continue adding your fav movies?(yes/no) >>")
            var User_Choice = readLine()!!.toString()
            //If the user says yes, allow them to enter another movie
            if (User_Choice.toLowerCase() == "yes"){
                movie = readLine()!!.toString()
                MoviesArray.add(movie)
                println("Your favorite movies are:")
                println(MoviesArray)
            } else if (User_Choice.toLowerCase() == "no"){
                //If the user says no, print all movies with a for loop
                println("Your favorite movies are:")
                for (element in MoviesArray){
                    println(element)
                }
                println("Good taste!")

            } else {
                print("bye")
                break
            }

        }
        counter++
    }

}
