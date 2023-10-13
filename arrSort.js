const arr1 = [30,10,15,20]; 
const arr2 = [4,3,1,7,10]; 

function arrSort(arr) { 
	arr.sort((a,b)=>b-a); 
	return arr; 
} 

console.log(arrSort(arr1)); 
console.log(arrSort(arr2));

