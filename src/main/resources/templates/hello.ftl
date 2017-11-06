<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>hello</title>
    <style>
        html,body{
            height: 100%;
        }
        #container{
            position: absolute;
            top:0;
            left:10px;
            right:10px;
            bottom: 0;
            width: 80%;
            margin:auto;
            /*height: 100%;*/
        }
        #header{
            height:100px;
            background-color: lightseagreen;
            margin:0;
            padding: 0;
        }
        #header span{
            line-height:100px;
            display: block;
            text-align: center;
            padding: 100px auto;
            font-size: 3em;
        }
        #menu{
            margin:0;
            padding: 0;
            height: 80px;
            background-color: darkgreen;
        }
        #menu li{
            float: left;
            text-align: center;
            font-size: 2em;
            display: block;
            width: 24%;
            line-height: 80px;
            font-family: "AR PL UKai CN";
        }
        #menu ul{
            margin:0;
            padding:0;
            list-style-type: none;
        }
        #slide{
            height: 900px;
            width:20% ;
            background-color: orangered;
            float: left;
        }
        #main{
            height: 900px;
            float: right;
            width:80% ;
            background-color: black;
        }
        #footer{
            height: 60px;
            background-color: grey;
            clear: both;
        }
    </style>
</head>
<body>
<div id="container">
    <div id="header">
            <span>I am ${name1}</span>
    </div>
    <div id="menu">
        <ul>
            <li>Home11</li>
            <li>Contact</li>
            <li>About</li>
            <li>Join us</li>
        </ul>
    </div>
    <div id="slide"></div>
    <div id="main"></div>
    <div id="footer"></div>
</div>
</body>
</html>