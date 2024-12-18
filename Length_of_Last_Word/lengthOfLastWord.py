def length_of_last_word(text):
    words=text.split()
    last_word = words[-1]
    length_last_word = len(last_word)
    print(f"The last word is {last_word} with length {length_last_word}.")

length_of_last_word("Hello World")
length_of_last_word("Fly me to the moon")
length_of_last_word("Luffy is still joyboy")
length_of_last_word("Luffy is the king of pirates")
