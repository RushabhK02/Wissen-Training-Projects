(function(){function r(e,n,t){function o(i,f){if(!n[i]){if(!e[i]){var c="function"==typeof require&&require;if(!f&&c)return c(i,!0);if(u)return u(i,!0);var a=new Error("Cannot find module '"+i+"'");throw a.code="MODULE_NOT_FOUND",a}var p=n[i]={exports:{}};e[i][0].call(p.exports,function(r){var n=e[i][1][r];return o(n||r)},p,p.exports,r,e,n,t)}return n[i].exports}for(var u="function"==typeof require&&require,i=0;i<t.length;i++)o(t[i]);return o}return r})()({1:[function(require,module,exports){
console.log("-index.js-")

let greet=require("nexwave-wissen-greet");
let question=require("./wissen-greet");

greet.greet();
question();
question("en");
},{"./wissen-greet":5,"nexwave-wissen-greet":4}],2:[function(require,module,exports){


//------------------------------------------
// var o={
//     doWork:function(){
//         console.log('im mod2');
//     }
// };
//------------------------------------------
// var global = global || {};
// (function () {
//     global.mod3.doWork();
//     var o = {
//         doWork: function () {
//             console.log('im mod2');
//         }
//     };
//     global.mod2=o;
// })();

//------------------------------------------

console.log('-greet/en.js-');
function greet(){
    console.log('Hello..');
}
module.exports=greet;
},{}],3:[function(require,module,exports){


//------------------------------------------
// var o={
//     doWork:function(){
//         console.log('im mod3');
//     }
// };
//------------------------------------------
// var global = global || {};
// (function () {
//     var o = {
//         doWork: function () {
//             console.log('im mod3');
//         }
//     };
//     global.mod3 = o;
// })();

//------------------------------------------
console.log('-greet/es.js-');
function greet(){
    console.log('Ola..');
}
module.exports=greet;
},{}],4:[function(require,module,exports){


//------------------------------------------
// var o={
//     doWork:function(){
//         console.log('im mod1');
//     }
// };
//------------------------------------------

// var global = global || {};

// (function () {
//     var i = 0;
//     global.mod2.doWork();
//     var o = {
//         doWork: function () {
//             console.log('im mod1');
//         }
//     };
//     global.mod1 = o; // export
// })();

//------------------------------------------

console.log('-greet/index.js-');
let message = "good noon";
let en = require('./en');
let es = require('./es');
function greet(lang) {
    if (lang === "en") {
        en(); return;
    }
    if (lang === "es") {
        es(); return;
    }
    console.log('give me ur lang, ill greet you');
}
// greet();
module.exports = {
    greet
}
},{"./en":2,"./es":3}],5:[function(require,module,exports){
console.log("-local-package-");
let en =require("./quesEng");
let guj=require("./quesGuj");

function question(lang){
    if(lang==="en"){
        en();
        return;
    }
    if(lang==="guj"){
        guj();
        return;
    }
    console.log("-wissen-ques/index.js-");
}

module.exports=question;
},{"./quesEng":6,"./quesGuj":7}],6:[function(require,module,exports){
console.log("-quesEng.js-");
function question(){
    console.log("How are you?");
}
module.exports=question;
},{}],7:[function(require,module,exports){
console.log("-quesGuj.js-");
function question(){
    console.log("kem cho?");
}
module.exports=question;
},{}]},{},[1]);
