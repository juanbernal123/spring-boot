package appPalindrome.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controlador para verificar si una palabra es palindrome
 */
@RestController
public class PalindromeController {

    /**
     * Endpoint para validar si una palabra es palindrome
     * @param word Palabra a evaluar
     * @return Si la parabra ingresada es o no palindrome
     */
    @GetMapping("/validar-palindrome/{word}")
    public String palindrome(@PathVariable String word) {
        if (isPalindrome(word))
        {
            return "La palabra " + word + " es palíndrome";
        }
        return "La palabra " + word + " NO es palíndrome";
    }

    /**
     * metodo para realizar la evaluacion
     * @param word Palabra a evaluar
     * @return Si es true la palabra es palindrome de lo contrario false
     */
    private Boolean isPalindrome(String word) {
        int length = word.length();
        for (int i = 0; i < length / 2; i++) {
            if (word.charAt(i) != word.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
