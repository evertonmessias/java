idd = 0;

function alterar(x) {
    idd = 0;
    $("#ausuario").val("");
    $("#atel").val("");
    $("#aemail").val("");
    $('tr.linha').css({ 'background-color': '#fff' });
    $('#alterar').css({ 'display': 'block' });
    $('#linha' + x).css({ 'background-color': '#ccc' });
    var usuario = $(".tusuario" + x).text();
    var telefone = $(".ttelefone" + x).text();
    var email = $(".temail" + x).text();
    $("#ausuario").val(usuario);
    $("#atel").val(telefone);
    $("#aemail").val(email);
    idd = x;
    $("#botaoalterar").click(function () {        
        if ($("#ausuario").val().length < 2 || $("#aemail").val().length < 2 || $("#atel").val().length < 2) {
            $("#quadro").fadeIn(); $("#mensagem").html("Digite os campos corretamente !");
            $("#ausuario").val('').focus(); $("#aemail").val(''); $("#atel").val('');
            return false;
        }
        else {
            var botaoalterar = $("#botaoalterar").val();
            var usuario = $("#ausuario").val();
            var email = $("#aemail").val();
            var tel = $("#atel").val();
            $.post("./app/model/acao.php", {botaoalterar:botaoalterar , idd: idd, usuario: usuario, email: email, tel: tel }, function (mostrar) {
                $("#quadro").fadeIn(); $("#mensagem").html(mostrar);
            });
        }
    });
}
function apagar(y) {
    idd = 0;
    $('tr.linha').css({ 'background-color': '#fff' });
    $('#apagar').css({ 'display': 'block' });
    $('#linha' + y).css({ 'background-color': '#ccc' });
    idd = y;
    $("#botaoapagar").click(function () {               
        $.post("app/validar.jsp", { botao:"botaoapagar",idd: idd }, function (mostrar) {
            $("#quadro").fadeIn(); $("#mensagem").html(mostrar);
        });
    });
}

function inserir(z){
	//console.log(z);
}

$(function () {

    $("#quadro").click(function () {
        $(this).fadeOut();
    });

    $("#botaoinserir").click(function () {
        if ($("#usuario").val().length < 2 || $("#email").val().length < 2 || $("#tel").val().length < 2) {
            $("#quadro").fadeIn(); $("#mensagem").html("Digite os campos corretamente !");
            $("#usuario").val('').focus();
            $("#email").val(''); $("#tel").val('');
            return false;
        } else {
            var botaoinserir = $("#botaoinserir").val();
            var usuario = $("#usuario").val();
            var email = $("#email").val();
            var tel = $("#tel").val();
            $.post("./app/model/acao.php", {botaoinserir:botaoinserir,usuario: usuario, email: email, tel: tel }, function (mostrar) {
                $("#quadro").fadeIn(); $("#mensagem").html(mostrar);
            });
        }
    });

    $("#botaologin").click(function () {
        if ($("#usuario").val().length < 2 || $("#senha").val().length < 2) {
            $("#quadro").fadeIn(); $("#mensagem").html("Digite o Login corretamente !");
            $("#usuario").val('').focus();
            $("#senha").val('');
            return false;
        } else {
            var usuario = $("#usuario").val();
            var senha = $("#senha").val();           
            $.post("app/validar.jsp", {botao:"botaologin",usuario: usuario, senha: senha }, function (mostrar) {
                $("#quadro").fadeIn(); $("#mensagem").html(mostrar);
            });
        }
    });

    $("#botaocontatos").click(function () {
        if ($("#cusuario").val().length < 2 || $("#cemail").val().length < 2 || $("#cmsg").val().length < 2) {
            $("#quadro").fadeIn(); $("#mensagem").html("Digite os campos corretamente !");
            $("#cusuario").val('').focus();
            $("#cemail").val(''); $("#cmsg").val('');
            return false;
        } else {
            var botaocontatos = $("#botaocontatos").val();
            var usuario = $("#cusuario").val();
            var email = $("#cemail").val();
            var msg = $("#cmsg").val();
            $.post("./app/model/acao.php", {botaocontatos:botaocontatos, usuario: usuario, email: email, msg: msg }, function (mostrar) {
                $("#quadro").fadeIn(); $("#mensagem").html(mostrar);$("#cusuario").val('').focus();
                $("#cemail").val(''); $("#cmsg").val('');
            });
        }
    });

})