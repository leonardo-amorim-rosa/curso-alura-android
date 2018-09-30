package br.com.alura.agenda;

import android.app.Activity;
import android.widget.EditText;
import android.widget.RatingBar;

import br.com.alura.agenda.modelo.Aluno;

public class FormularioHelper {

    private final EditText nome;
    private final EditText endereco;
    private final EditText telefone;
    private final EditText site;
    private final RatingBar nota;
    private Aluno aluno;

    public FormularioHelper(Activity activity) {
        aluno = new Aluno();
        nome = activity.findViewById(R.id.formulario_nome);
        endereco = activity.findViewById(R.id.formulario_endereco);
        telefone = activity.findViewById(R.id.formulario_telefone);
        site = activity.findViewById(R.id.formulario_site);
        nota = activity.findViewById(R.id.formulario_nota);
    }

    public Aluno pegaAluno() {
        aluno.setNome(nome.getText().toString());
        aluno.setEndereco(endereco.getText().toString());
        aluno.setTelefone(telefone.getText().toString());
        aluno.setSite(site.getText().toString());
        aluno.setNota(Double.valueOf(nota.getRating()));
        return aluno;
    }

    public void preencheFormulario(Aluno aluno) {
        this.aluno = aluno;
        this.nome.setText(aluno.getNome());
        this.endereco.setText(aluno.getEndereco());
        this.telefone.setText(aluno.getTelefone());
        this.site.setText(aluno.getSite());
        this.nota.setRating(aluno.getNota().floatValue());
    }
}
