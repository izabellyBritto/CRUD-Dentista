package br.com.dentista.dentista.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.validation.BindingResult;
import br.com.dentista.dentista.entity.Especialidade;
import br.com.dentista.dentista.service.EspecialidadeService;

@Controller
@RequestMapping("/especialidades")
public class EspecialidadeController {
    @Autowired
    private EspecialidadeService especialidadeService;

    @GetMapping("/listar")
    public String listar(Model model) {
        List<Especialidade> especialidades = especialidadeService.findAll();
        model.addAttribute("especialidades", especialidades);
        return "especialidade/listaEspecialidades";
    }

    @GetMapping("/criar")
    public String criarForm(Model model) {
        model.addAttribute("especialidade", new Especialidade());
        return "especialidade/formularioEspecialidade";
    }

    @PostMapping("/salvar")
    public String salvar(@ModelAttribute Especialidade especialidade, BindingResult result, Model model) {
        try {
            if (result.hasErrors()) {
                return "especialidade/formularioEspecialidade";
            }
            especialidadeService.save(especialidade);
            return "redirect:/especialidades/listar";
        } catch (Exception e) {
            model.addAttribute("error", "Erro ao salvar especialidade: " + e.getMessage());
            return "especialidade/formularioEspecialidade";
        }
    }

    @GetMapping("/excluir/{id}")
    public String excluir(@PathVariable Integer id, Model model) {
        try {
            especialidadeService.deleteById(id);
            return "redirect:/especialidades/listar?success=Especialidade excluída com sucesso";
        } catch (Exception e) {
            String mensagem = "Não é possível excluir a especialidade porque ela está vinculada a um ou mais dentistas.";
            return "redirect:/especialidades/listar?error=" + java.net.URLEncoder.encode(mensagem, java.nio.charset.StandardCharsets.UTF_8);
        }
    }

    @GetMapping("/editar/{id}")
    public String editarForm(@PathVariable Integer id, Model model) {
        try {
            Especialidade especialidade = especialidadeService.findById(id);
            if (especialidade == null) {
                return "redirect:/especialidades/listar?error=Especialidade não encontrada";
            }
            model.addAttribute("especialidade", especialidade);
            return "especialidade/formularioEspecialidade";
        } catch (Exception e) {
            return "redirect:/especialidades/listar?error=" + e.getMessage();
        }
    }
} 