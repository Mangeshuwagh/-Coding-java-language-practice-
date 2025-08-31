import speech_recognition as sr
import pyttsx3

# Initialize the text-to-speech engine
engine = pyttsx3.init()

def speak(text):
    engine.say(text)
    engine.runAndWait()

def listen_and_recognize():
    # Initialize the recognizer
    recognizer = sr.Recognizer()
    with sr.Microphone() as source:
        print("Listening... Please speak now.")
        try:
            # Adjust for ambient noise and record the audio
            recognizer.adjust_for_ambient_noise(source)
            audio = recognizer.listen(source)
            
            # Recognize speech using Google's Speech Recognition
            text = recognizer.recognize_google(audio)
            print("You said: " + text)
            return text
        except sr.UnknownValueError:
            print("Sorry, I could not understand what you said.")
            return None
        except sr.RequestError:
            print("Request failed, please check your internet connection.")
            return None

if __name__ == "__main__":
    # Get text input from the user
    text_input = input("Please enter a line of text: ")
    print("You entered: " + text_input)
    
    # Make the program speak the text
    speak("You entered: " + text_input)
    
    # Use voice recognition to listen and recognize speech
    spoken_text = listen_and_recognize()
    if spoken_text:
        speak("You said: " + spoken_text)
