
let alertBox = document.getElementById("AlertBox");
let greetBtn = document.getElementById("GreetBtn");
let showBtn = document.getElementById("ShowBtn");
let hideBtn = document.getElementById("HideBtn");
let getDataBtn = document.getElementById("getDataBtn");
let showText = document.getElementById("ShowText");
let wordOfTheDay = ["petrichor", "evanescene", "amnesia"];
let WOTDBox = document.getElementById("WOTD");
let idx = 0;


showBtn.setAttribute("disabled", true);
showText.style.display = "none";
WOTDBox.style.display = "none";


setInterval(() => {
    WOTDBox.style.display = "";
    idx++;
    if (idx === wordOfTheDay.length) idx = 0;
    WOTDBox.innerText = wordOfTheDay[idx];
}, 1000)

greetBtn.addEventListener("click", () => {
    alertBox.innerHTML = "Have a great day!";
})

showBtn.addEventListener("click", () => {

    alertBox.innerHTML = "Welcome to Wissen!";
    alertBox.style.display = "";
    showBtn.setAttribute("disabled", true);
    hideBtn.removeAttribute('disabled');

})

hideBtn.addEventListener("click", () => {

    alertBox.style.display = "none";
    showBtn.removeAttribute("disabled");
    hideBtn.setAttribute("disabled", true);

})

getDataBtn.addEventListener("click", () => {

    showText.style.display = "";
    let apiUrl = "https://jsonplaceholder.typicode.com/users?_limit=5";
    let promise = fetch(apiUrl);
    promise.then((response) => response.json())
        .then(users => {
            showText.innerHTML = JSON.stringify(users);
        });

})