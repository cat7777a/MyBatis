<%--
  Created by IntelliJ IDEA.
  User: cat77
  Date: 8/27/2020
  Time: 8:04 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <script src="WEB-INF/js/axios-0.18.0.js"></script>
    <script src="WEB-INF/js/vuejs-2.5.16.js"></script>
    <script src="WEB-INF/js/jquery-2.1.0.min.js"></script>
    <meta charset="UTF-8">
    <title>Title</title>
    <style>
        #main {
            margin: auto;
            width: 600px;
            height: 400px;
            border: 10px solid grey;

        }

        tr td:first-child {
            text-align: right;
            font-size: 20px;
            width: 150px;
        }

        tr td:last-child input[type='text'], input[type='date'], select {
            margin-left: 15px;
            width: 250px;
            border-radius: 5px;
            outline: 0px;
            font-size: 20px;
        }

        body {
            background: darkgray;
        }

        input[type="submit"] {
            margin-left: 15px;
            width: 120px;
            height: 35px;
            font-size: 16px;

        }

        .error {
            color: red;
        }

        .ok {
            color: green;
        }

        span {
            margin-left: 5px;
        }
    </style>

</head>
<body>


<table id="main">

    <tr>
        <td><label>消费事宜</label></td>
        <td><input type="text" value="" onblur="check1(this.value)"> <span class="error">格式有误</span></td>
    </tr>
    <tr>
        <td><label>消费金额</label></td>
        <td><input type="text" value="" onblur="check2(this.value)"> <span class="ok">格式正确</span></td>
    </tr>
    <tr>
        <td><label>支付方式</label></td>
        <td><select>
            <option>请选择支付方式</option>
            <option>支付宝</option>
            <option>微信</option>
            <option>银联</option>
            <option>现金</option>

        </select></td>
    </tr>
    <tr>
        <td><label>消费时间</label></td>
        <td><input type="date"></td>
    </tr>

    <tr>
        <td></td>
        <td><input type="submit" value="添加账务"></td>
    </tr>


</table>
</body>
<script>
    var spanEle1 = document.getElementsByClassName("error");

    function check1(value) {

        var reg = /^.{3,10}$/;
        var flag = reg.test(value);

        if (flag) {
            spanEle1.innerHTML = "<font color = 'green'>格式正确</font>"
        } else {
            spanEle1.innerHTML = "<font color = 'red'>格式有误</font>"
        }

    }

    var spanEle2 = document.getElementsByClassName("ok");

    function check2(value) {
        var reg = /^[0-9]+.\d{2}$/;
        var flag = reg.test(value);

        if (flag) {
            spanEle2.innerHTML = "<font color = 'green'>格式正确</font>"
        } else {
            spanEle2.innerHTML = "<font color = 'red'>格式有误</font>"
        }
    }

  
</script>
</html>
