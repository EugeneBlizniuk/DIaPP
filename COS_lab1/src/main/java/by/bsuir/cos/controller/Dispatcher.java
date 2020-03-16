package by.bsuir.cos.controller;

import by.bsuir.cos.calculation.FunctionCalculator;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class Dispatcher {
    private int N = 64;
    private List<Integer> xLabels = new ArrayList<>();

    Dispatcher() {
        for(int i = 0; i < N; i++) {
            xLabels.add(i);
        }
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView welcomePage() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("WelcomePage");
        return modelAndView;
    }
    @RequestMapping(value = "/source-function", method = RequestMethod.GET)
    public ModelAndView sourceFunction() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("SourceFunction");
        modelAndView.addObject("labelArrayX", xLabels);
        modelAndView.addObject("sourceDots", FunctionCalculator.getSourceFunctionDots(N));
        return modelAndView;
    }
    @RequestMapping(value = "/amplitude-dft", method = RequestMethod.GET)
    public ModelAndView amplitudeDFT() {
        ModelAndView modelAndView = new ModelAndView();
        FunctionCalculator.getInstance().setW(N);
        FunctionCalculator.getInstance().setLists(N);
        modelAndView.addObject("labelArrayX", xLabels);
        modelAndView.addObject("sourceDots", FunctionCalculator.getAmplitudeDFT(N));
        modelAndView.setViewName("SourceFunction");
        return modelAndView;
    }
    @RequestMapping(value = "/phase-dft", method = RequestMethod.GET)
    public ModelAndView phaseDFT() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("labelArrayX", xLabels);
        modelAndView.addObject("sourceDots", FunctionCalculator.getPhaseDFT(N));
        modelAndView.setViewName("PhaseDFT");
        return modelAndView;
    }
    @RequestMapping(value = "/reverse-dft", method = RequestMethod.GET)
    public ModelAndView reverseDFT() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("labelArrayX", xLabels);
        modelAndView.addObject("sourceDots", FunctionCalculator.getReverseDFT(N));
        modelAndView.setViewName("ReverseDFT");
        return modelAndView;
    }
    @RequestMapping(value = "/amplitude-fft", method = RequestMethod.GET)
    public ModelAndView amplitudeFFT() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("labelArrayX", xLabels);
        modelAndView.addObject("sourceDots", FunctionCalculator.getAmplitudeFFT(N));
        modelAndView.setViewName("AmplitudeFFT");
        return modelAndView;
    }
    @RequestMapping(value = "/phase-fft", method = RequestMethod.GET)
    public ModelAndView sixth() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("labelArrayX", xLabels);
        modelAndView.addObject("sourceDots", FunctionCalculator.getPhaseFFT(N));
        modelAndView.setViewName("PhaseFFT");
        return modelAndView;
    }
    @RequestMapping(value = "/reverse-fft", method = RequestMethod.GET)
    public ModelAndView seventh() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("labelArrayX", xLabels);
        modelAndView.addObject("sourceDots", FunctionCalculator.getReverseFFT(N));
        modelAndView.setViewName("ReverseFFT");
        return modelAndView;
    }
}
