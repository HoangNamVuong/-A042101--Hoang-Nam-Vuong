//////////////////////////////////////////// compare three numbers a b c
var a =3,b=4,c=5 ;
var answer ;
// code 1
if (a == b) {
    if (a == c) {
        answer = "all are equal" ;
    }else {
        answer = "a and b are equal" ;
    }
}else {
    if (a == c) {
        answer = "a and c are equal" ;
    }else {
        if (b == c) {
            answer = "b and c are equal" ;
        }else {
            answer = "all are diffrient" ;
        }
    }
}
// code 2
if (a == b) {
    if (a == c) {
        answer = "all are equal" ;
    }else {
        answer = "a and b are equal" ;
    }
}else if (a == c) {
    answer = "a and c are equal" ;
}else if (b == c) {
    answer = "b and c are equa;" ;
}else {
    answer = " all diffrient" ;
}
//////////////////////////////////////////// check parity
var a = parseInt(prompt("input a number")) ;
if (a > 0) {
    if (a % 2 == 0) {
        alert ("This is an even positive number") ;
    }else {
        alert ("This is a positive number") ;
    }
}else if (a = 0) {
    alert ("This is number 0") ;
}else if (a % 2 ==0) {
    alert ("This is an even negative number") ;
}else {
    alert ("This is a negative odd number")
}
