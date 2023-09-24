/**
 * @param {string[]} strs
 * @return {string[][]}
 */
var groupAnagrams = function(strs) {
     const map = {};

    for(const str of strs){
        const s = str.split('').sort().join('')
        if(map[s]){
            map[s].push(str);
        }
        else {map[s]=[str];}
    }
        return Object.values(map);
};