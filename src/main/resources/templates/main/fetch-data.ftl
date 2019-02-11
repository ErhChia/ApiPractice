<#ftl output_format="HTML"/>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>fetch data</title>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script>
        $(function () {
            $.getJSON('/main/get-data', function () {
                console.log('done');
                window.location.href = '/main/re-direct';
            })
                .fail(function () {
                    console.log('error');
                })
                .always(function (data) {
                    console.log(data)
                });
        });
    </script>
</head>
<body>
data fetching...
</body>
</html>