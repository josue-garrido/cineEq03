function validar(){
    if(document.formulario.usuario.value === ""
            || document.formulario.password.value === ""){
        alert("falta de llenar un campo");
        return false;
    }
    else{
        return submit;
    }
}


   