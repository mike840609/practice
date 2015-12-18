<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
    <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
    
    <title>英聽報名表</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="css/andy/english.css" />
  
</head>

<body>
 <%@include file="sa_navbar.jspf" %>
    <form action="" class="register">
        <h1>英聽報名表</h1>
        <fieldset class="row1">
            <legend>基本資料
            </legend>
            <p>
                <label class="account">帳號:
                </label>
                <input type="text" name="account" />
            </p>
            <div class="sex">
                <label>性別:
                </label>
                <select>
                    <option value="0">男生
                    </option>
                    <option value="1">女生
                    </option>
                </select>
            </div>
            <div class="name1">
                <p>
                    <label class="name ">姓名:
                    </label>
                    <input type="text" name="name" />
                </p>
            </div>
            <label class="date1">生日:
            </label>
            <input type="date" name="date" />
            <p>
                <label class="id ">身分證:
                </label>
                <input type="text" name="id" />
            </p>
            <!--  -->
        </fieldset>
        <fieldset class="row2">
            <legend>聯絡資訊
            </legend>
            <p>
                <label>地址:
                </label>
                <input type="text" class="long" />
            </p>
            <br>
            <br>
            <p>
                <label>電話:
                </label>
                <input type="text" maxlength="10" />
            </p>
            <p>
                <br>
                <label>Email
                </label>
                <input type="text" maxlength="10" />
            </p>
        </fieldset>
        <fieldset class="row3">
            <legend>考試資訊填寫
            </legend>
            <div class="zone">
                <label>考區:
                </label>
                <select>
                    <option value="0">北區
                    </option>
                    <option value="1">中區
                    </option>
                </select>
            </div>
            <p>
                <div class="zone">
                    <label>補助身分:
                    </label>
                    <select>
                        <option value="0">一般生
                        </option>
                        <option value="1">低收入戶
                        </option>
                        <option value="1">中低收入戶
                        </option>
                    </select>
                </div>
            </p>
            <p>
                <label class="area">特殊備註:
                </label>
                <br>
                <textarea class="area1" rows="2" cols="20"  style="border:3px black double;">
                </textarea>
            </p>
        </fieldset>
        <div>
            <button class="button1">Register &raquo;</button>
        </div>
    </form>
    
</body>

</html>
