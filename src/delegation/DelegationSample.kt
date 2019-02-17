package delegation

/*
* In delegation, an object handles a request by delegating to a second object (the delegate).
* The delegate is a helper object, but with the original context.
* With language-level support for delegation,
* this is done implicitly by having self in the delegate
* refer to the original (sending) object, not the delegate (receiving object).
* */
interface AttackType{
    fun getAttackType() : String
}

class Ranged : AttackType{
    override fun getAttackType(): String = "This is Ranged"
}

interface HeroType{
    fun getHeroType() : String
}

class Strength : HeroType{
    override fun getHeroType() : String = "This is Strength"
}

class Huskar : AttackType by Ranged(), HeroType by Strength()