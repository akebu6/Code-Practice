// Imagine that you want to play the "Rock-Paper-Scissors" game and you need to write a function makeDecision() that returns Rock, Paper, or Scissors depending on a random number from 1 to 3.

function makeDecision(){

    var randomNumber = Math.floor(Math.random()*3 + 1);
    console.log(randomNumber);

    switch(randomNumber){
        case 1:
            console.log("Rock");
            break;
        case 2:
            console.log("Paper");
            break;
        case 3:
            console.log("Scissor");
            break;
        default:
            console.log("error");
    }   
}

makeDecision();
