/*Take a sentence as an input and reverse every word in that sentence.
Example - This is a sunny day > shiT si a ynnus yad.*/


const sentence = "This is a sunny day";
const reversedSentence = sentence.split('').reverse().join('');

console.log(reversedSentence) ;