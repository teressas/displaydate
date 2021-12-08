function date() {
var txt;
if (confirm("This is a date template")) {
	txt = "Yes";
} else {
	txt = "No";
}
	document.getElementById("date").innerHTML = txt;
}

function time() {
var txt;
if (confirm("This is a time template")) {
	txt = "Yes";
} else {
	txt = "No";
}
	document.getElementById("time").innerHTML = txt;
}
