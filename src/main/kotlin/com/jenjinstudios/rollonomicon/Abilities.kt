package com.jenjinstudios.rollonomicon

/**
 * Represents character abilities
 */
data class Abilities(
        /** The strength ability score of this character. */
        var strength: Int,
        /** The dexterity ability score of this character. */
        var dexterity: Int,
        /** The constitution ability score of this character. */
        var constitution: Int,
        /** The intelligence ability score of this character. */
        var intelligence: Int,
        /** The wisdom ability score of this character. */
        var wisdom: Int,
        /** The charisma ability score of this character. */
        var charisma: Int
) {
    operator fun get(ability: Ability) {
        when (ability) {
            Ability.STRENGTH -> strength
            Ability.DEXTERITY -> dexterity
            Ability.CONSTITUTION -> constitution
            Ability.INTELLIGENCE -> intelligence
            Ability.WISDOM -> wisdom
            Ability.CHARISMA -> charisma
        }
    }

    operator fun set(ability: Ability, value: Int) {
        when (ability) {
            Ability.STRENGTH -> strength = value
            Ability.DEXTERITY -> dexterity = value
            Ability.CONSTITUTION -> constitution = value
            Ability.INTELLIGENCE -> intelligence = value
            Ability.WISDOM -> wisdom = value
            Ability.CHARISMA -> charisma = value
        }
    }
}