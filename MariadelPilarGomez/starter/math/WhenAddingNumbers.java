package starter.math;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Narrative;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import starter.steps.MathWizSteps;

@RunWith(SerenityRunner.class)
@Narrative(text={"Maths is important."})
public class WhenAddingNumbers {

    @Steps
    MathWizSteps pilar;

    @Test

    public void addingSums() {
        // Given
        pilar.tiene(1);

        // When
        pilar.suma(2);

        // Then
        pilar.deberia_tener(3);
    }
}
