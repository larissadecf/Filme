package br.usjt.filme;

import android.content.Context;
import android.graphics.drawable.Drawable;

import java.lang.reflect.Field;

import br.usjt.filme.R;

public class Util {
    public static Drawable getDrawable(Context context, String nome){
        Class<?> c = R.drawable.class;
        try {
            Field idField = c.getField(nome);
            int id = idField.getInt(idField);
            Drawable imagem = context.getResources().getDrawable(id, null);
            return imagem;
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return context.getResources().getDrawable(R.drawable.face);
    }
}
