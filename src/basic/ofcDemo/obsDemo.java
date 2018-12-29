package basic.ofcDemo;

import java.util.*;

public class obsDemo {
    public static void main(String[] args) {
        Map<Integer, String> flag = new HashMap<Integer, String>();
        Map<Obs, String> diagnosisObs = new HashMap<Obs, String>();
        List<String> icons = Arrays.asList("a", "b", "c", "d", "e");
        Map<String, String> doctors = new HashMap<String, String>();
        List<Obs> obsList = new ArrayList<Obs>();
        Obs obs1 = new Obs(1, "Fever");
        Obs obs2 = new Obs(1, "Headache");
        Obs obs3 = new Obs(2, "Abdominal");
        Obs obs4 = new Obs(3, "Pain");
        Obs obs5 = new Obs(4, "pain pera");
        obsList.add(obs1);
        obsList.add(obs2);
        obsList.add(obs3);
        obsList.add(obs4);
        obsList.add(obs5);
        int index = 0;
        for (Obs obs : obsList) {
            Integer docId = obs.getDoctorId();
            if (flag.containsKey(docId)) {
                String icon = flag.get(docId);
                diagnosisObs.put(obs, icon);

            } else {
                doctors.put(obs.getDoctorId().toString(), icons.get(index));
                diagnosisObs.put(obs, icons.get(index));
                flag.put(docId, icons.get(index));
                index++;
            }
        }
        for (Map.Entry<Obs, String> m : diagnosisObs.entrySet()) {
            System.out.println(m.getKey().getDiagonesisName() + "  -> " + "" + m.getKey().getDoctorId() + "   ->   " + m.getValue());
        }

    }
}
