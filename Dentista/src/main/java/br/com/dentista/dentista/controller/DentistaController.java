package br.com.dentista.dentista.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import br.com.dentista.dentista.entity.Dentista;
import br.com.dentista.dentista.entity.Especialidade;
import br.com.dentista.dentista.service.DentistaService;
import br.com.dentista.dentista.service.EspecialidadeService;

@Controller
@RequestMapping("/dentistas")
public class DentistaController {
    @Autowired
    private DentistaService dentistaService;
    @Autowired
    private EspecialidadeService especialidadeService;

    @GetMapping("/listar")
    public String listar(Model model) {
        List<Dentista> dentistas = dentistaService.findAll();
        model.addAttribute("dentistas", dentistas);
        return "dentista/listaDentistas";
    }

    @GetMapping("/criar")
    public String criarForm(Model model) {
        model.addAttribute("dentista", new Dentista());
        List<Especialidade> especialidades = especialidadeService.findAll();
        model.addAttribute("especialidades", especialidades);
        return "dentista/formularioDentista";
    }

    @PostMapping("/salvar")
    public String salvar(@ModelAttribute Dentista dentista) {
        dentistaService.save(dentista);
        return "redirect:/dentistas/listar";
    }

    @GetMapping("/excluir/{id}")
    public String excluir(@PathVariable Integer id) {
        dentistaService.deleteById(id);
        return "redirect:/dentistas/listar";
    }

    @GetMapping("/editar/{id}")
    public String editarForm(@PathVariable Integer id, Model model) {
        Dentista dentista = dentistaService.findById(id);
        List<Especialidade> especialidades = especialidadeService.findAll();
        model.addAttribute("especialidades", especialidades);
        model.addAttribute("dentista", dentista);
        return "dentista/formularioDentista";
    }
} 