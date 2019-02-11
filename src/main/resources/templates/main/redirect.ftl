<#ftl output_format="HTML"/>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>redirect</title>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script>
        $(function () {
            var redirect = 5;
            $('.content').text('Redirecting in ' + redirect + ' seconds...');
            setInterval(function () {
                redirect -= 1;
                if (redirect === 0) {
                    window.location.href = "/main/test";
                }
                $('.content').text('Redirecting in ' + redirect + ' seconds...');
            }, 1000);

        });

    </script>
</head>
<body>
<p>Fetch success!</p>
<p class="content"></p>
</body>
</html>