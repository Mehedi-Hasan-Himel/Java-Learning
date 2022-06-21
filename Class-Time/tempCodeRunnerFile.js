 /* nested loop

for (let i = 0; i <= 10; i++) {
  console.log('This is Number ' + i);
  for (let j = 0; j <= 10; j++) {
    console.log(j);
  }
}
*/ 

for (let i = 0; i <= 10; i++) {
  console.log(2);
  for (let j = 0; j <= 10; j++) {
    console.log('This is number '+j);
    for (let k = 0; k <= 10; k++) {
      console.log(j);
    }
  }
}
