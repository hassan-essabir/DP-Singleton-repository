package dp;

public class Singleton {
	private static final Singleton singLeton;
	private int compteur;
	static {
		singLeton = new Singleton();
	}

	private Singleton() {
		System.out.println("Instanciation du singleton");
	}

	public static Singleton getInstance() {
		return singLeton;
	}

	public void traiter(String taskName) {
		System.out.println("......traitement de la tâche " + taskName);
		for (int i = 1; i <= 5; i++) {
			synchronized (this) {
				++compteur;
			}
			System.out.println(".." + compteur);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		System.out.println("fin du traitement de la tâche " + taskName
				+ " compteur = " + compteur);
	}
}
