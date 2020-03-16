package by.bsuir.cos.calculation;

import com.vm.jcomplex.Complex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FunctionCalculator {
    private static FunctionCalculator INSTANCE = new FunctionCalculator();
    private Complex w;
    private static List<Complex> listOfDFT;

    public static FunctionCalculator getInstance() {
        return INSTANCE;
    }

    public void setW(int externalNumber) {
        this.w = new Complex(Math.cos(2*Math.PI/externalNumber),
                (Math.sin(2*Math.PI/externalNumber) * (-1)));
    }

    public void setLists(int externalNumber) {
        listOfDFT = convertToComplexArray(getSourceFunctionDots(externalNumber));
    }

    public static List<Double> getSourceFunctionDots(int externalNumber) {
        List<Double> sourceDots = new ArrayList<>();
        double y;
        for(int i = 0; i < externalNumber; i++) {
            y = Math.sin(2 * i * Math.PI * 2 / externalNumber) + Math.cos(7 * i * Math.PI * 2 / externalNumber);
            sourceDots.add(y);
        }
        System.out.println(sourceDots);
        return sourceDots;
    }

    public static List<Double> getAmplitudeDFT(int externalNumber) {
        //math.sqrt(np.real(dot)**2 + np.imag(dot)**2)
        double two = 2.0;
        List<Double> dots = new ArrayList<>();
        for(int i = 0; i < externalNumber; i++) {
            dots.add(Math.sqrt(Math.pow(listOfDFT.get(i).getReal(), two) +
                     Math.pow(listOfDFT.get(i).getImaginary(), two)));
        }
        return dots;
    }

    public static List<Double> getPhaseDFT(int externalNumber) {
        //math.atan(np.real(dot) / np.imag(dot) if np.imag(dot) != 0 else 1)
        return null;
    }

    public static List<Double> getReverseDFT(int externalNumber) {
        //w = math.exp(2 * math.pi / number_of_counts) ** -1j
//        for k in range(number_of_counts):
//        for m in range(number_of_counts):
//        res_arr[k] += dots_list[m] * (w ** (k * m * mark))
//        res_arr[k] /= delimiter
        return null;
    }

    public static List<Double> getAmplitudeFFT(int externalNumber) {
        //math.sqrt(np.real(dot)**2 + np.imag(dot)**2)
        return null;
    }

    public static List<Double> getPhaseFFT(int externalNumber) {
        //math.atan(np.real(dot) / np.imag(dot) if np.imag(dot) != 0 else 1)
        return null;
    }

    public static List<Double> getReverseFFT(int externalNumber) {
        return null;
    }

    private List<Complex> convertToComplexArray(List<Double> numbers) {
        Complex[] complexNumbers = new Complex[numbers.size()];
        for(int k = 0; k < numbers.size(); k++) {
            for(int m = 0; m < numbers.size(); m++) {
                complexNumbers[k] = complexNumbers[k].add( w.pow(k*m).multiply(numbers.get(m)));
            }
        }
        return Arrays.asList(complexNumbers);
    }
}
