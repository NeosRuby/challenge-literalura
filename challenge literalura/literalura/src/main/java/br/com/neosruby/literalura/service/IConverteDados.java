package br.com.neosruby.literalura.service;

public interface IConverteDados {
    <T> T  obterDados(String json, Class<T> classe);
}
