package com.syahrido.mualim.example.subbmissionsatu.data

import com.syahrido.mualim.example.subbmissionsatu.model.Character

class DataSource {
    fun listCharacters(): List<Character> {
        return listOf(
            Character(
                id = 1,
                name = "Aqua Morty",
                status = "Unknown",
                gender = "Male",
                location = "Citadel of Ricks",
                type = "Fish-Person",
                imageUrl = "https://rickandmortyapi.com/api/character/avatar/21.jpeg"
            ),
            Character(
                id = 2,
                name = "Aqua Rick",
                status = "Unknown",
                gender = "Male",
                location = "Citadel of Ricks",
                type = "Fish-Person",
                imageUrl = "https://rickandmortyapi.com/api/character/avatar/22.jpeg"
            ),
            Character(
                id = 3,
                name = "Arcade Alien",
                status = "Unknown",
                gender = "Male",
                location = "Immortality Field Resort",
                type = null,
                imageUrl = "https://rickandmortyapi.com/api/character/avatar/23.jpeg"
            ),
            Character(
                id = 4,
                name = "Armagheadon",
                status = "Alive",
                gender = "Male",
                location = "Signus 5 Expanse",
                type = "Cromulon",
                imageUrl = "https://rickandmortyapi.com/api/character/avatar/24.jpeg"
            ),
            Character(
                id = 5,
                name = "Armothy",
                status = "Unknown",
                gender = "Male",
                location = "Post-Apocalyptic Earth",
                type = "Self-aware arm",
                imageUrl = "https://rickandmortyapi.com/api/character/avatar/25.jpeg"
            ),
            Character(
                id = 6,
                name = "Arthricia",
                status = "Alive",
                gender = "Female",
                location = "Purge Planet",
                type = "Cat-Person",
                imageUrl = "https://rickandmortyapi.com/api/character/avatar/26.jpeg"
            ),
            Character(
                id = 7,
                name = "Artist Morty",
                status = "Dead",
                gender = "Male",
                location = "Citadel of Ricks",
                type = null,
                imageUrl = "https://rickandmortyapi.com/api/character/avatar/27.jpeg"
            ),
            Character(
                id = 8,
                name = "Attila Starwar",
                status = "Alive",
                gender = "Male",
                location = "Interdimensional Cable",
                type = null,
                imageUrl = "https://rickandmortyapi.com/api/character/avatar/28.jpeg"
            ),
            Character(
                id = 9,
                name = "Baby Legs",
                status = "Alive",
                gender = "Male",
                location = "Interdimensional Cable",
                type = "Human with baby legs",
                imageUrl = "https://rickandmortyapi.com/api/character/avatar/29.jpeg"
            ),
            Character(
                id = 10,
                name = "Baby Poopybutthole",
                status = "Alive",
                gender = "Male",
                location = "unknown",
                type = null,
                imageUrl = "https://rickandmortyapi.com/api/character/avatar/30.jpeg"
            )
        )
    }
}