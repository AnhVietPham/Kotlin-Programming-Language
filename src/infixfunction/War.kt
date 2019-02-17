package infixfunction

class War(var hp : Int, var ap: Int){
    infix fun attack(anotherWar : War){
        anotherWar.hp -= this.ap
    }
}