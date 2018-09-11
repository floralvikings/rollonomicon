package com.jenjinstudios.rollonomicon

/**
 * Represents a player character.
 */
data class PlayerCharacter(
        /** The name of the player controlling this character. */
        val playerName: String,
        /** The name of this character. */
        val characterName: String,
        /** The race of this character. */
        val race: CharacterRace,
        /** The class of this character. */
        val characterClass: CharacterClass,
        /** The secondary class of this character, if any. */
        val secondaryClass: CharacterClass? = null,
        /** The abilities of this character. */
        val abilities: Abilities,
        /** The alignment of this character. */
        val alignment: Alignment,
        /** The number of experience points this character has. */
        var experiencePoints: Int
)
