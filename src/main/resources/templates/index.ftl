<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link href="/webjars/bootstrap/4.3.1/css/bootstrap.css" rel="stylesheet">
    <script src="/webjars/bootstrap/4.3.1/js/bootstrap.js"></script>
    <title>Login</title>
</head>
<body>
<br><br><br><br>
    <div class="conteiner">
        <div class="row">
            <div class="card" style="width: 50%;margin: 0 auto;">
                <article class="card-body">
                    <h4 class="card-title mb-4 mt-1 text-center">Entrar</h4>
                    <#if user?? >
                        <div>${user.getUsuario()}</div>
                    <#else>
                    <form role="form" action="/entrar" method="get" class="form-group">
                        <div class="form-group">
                            <label>Usuario</label>
                            <input type="text" class="form-control" id="usuario" name="usuario">
                        </div> <!-- form-group// -->
                        <div class="form-group">
                            <label>Clave</label>
                            <input class="form-control" id="contraisenia" name="contraisenia" placeholder="******" type="password">
                        </div> <!-- form-group// -->
                        <div class="form-group">
                            <button type="submit" class="btn btn-primary btn-block"> Login  </button>
                        </div> <!-- form-group// -->
                    </form>
                    </#if>
                </article>
            </div>
        </div>
    </div>
</body>
</html>