// program to find longest word in a given sentence
// var sentence= "The quick brown fox jumped over the lazy dog"


var str = "The quick brown fox jumped over the lazy dog";

function LongestWord(str) {
  var strSplit = str.split(" ");
  // var strSplit = str.split(' ');
  // var strSplit = ["The", "quick", "brown", "fox", "jumped", "over", "the", "lazy", "dog"];

  var longestWord = 0;
  for (var i = 0; i < strSplit.length; i++) {
    if (strSplit[i].length > longestWord) {
      longestWord = strSplit[i].length;
    }
  }
  return longestWord;
}
console.log(LongestWord(str));
