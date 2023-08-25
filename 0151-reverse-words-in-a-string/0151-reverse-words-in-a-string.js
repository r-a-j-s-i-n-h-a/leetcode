/**
 * @param {string} s
 * @return {string}
 */
var reverseWords = function(s) {
     return s.trim().split(/[\s,\t,\n]+/).reverse().join().replaceAll(',',' ');
    
};