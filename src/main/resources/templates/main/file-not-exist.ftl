<#ftl output_format="HTML"/>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>redirect</title>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
    <script>
        $(function () {
            var redirect = 5;
            $('.content').text('Redirecting to hello in ' + redirect + ' seconds...');
            setInterval(function () {
                redirect -= 1;
                if (redirect === 0) {
                    window.location.href = "/main/test";
                }
                $('.content').text('Redirecting to hello in ' + redirect + ' seconds...');
            }, 1000);

        });

    </script>
</head>
<body>
<div class="col-md-12">
    <p class="alert alert-danger col-md-2">File Not Exist!</p>
</div>
<div class="col-md-12">
    <p class="content"></p>
</div>
</body>
</html>