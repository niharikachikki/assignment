function reverseWordsInSentence(sentence) {
    
    const words = sentence.split(' ');

    const reversedWords = words.map(word => reverseWord(word));

    const reversedSentence = reversedWords.join(' ');

    return reversedSentence;
}

function reverseWord(word) {
    return word.split('').reverse().join('');
}
 const inputSentence = "Take a sentence as an input";
 const reversedSentence = reverseWordsInSentence(inputSentence);
 console.log("Original Sentence: " + inputSentence);
 console.log("Reversed Sentence: " + reversedSentence);
