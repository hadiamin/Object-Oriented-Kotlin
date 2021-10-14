class SimpleAgent(override val name: String) : Actor {

    override fun perceive(vararg facts: Percept) {
        TODO("Not yet implemented")
    }

    override fun act() : Action {
        return ForageAction()
    }

    override fun toString(): String {
        return "This is a simple agent"
    }
}