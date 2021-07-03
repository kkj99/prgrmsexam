public class StepedNumbers
{
	/**
	 * 정수 x와 자연수 n을 입력 받아,
	 * x부터 시작해 x씩 증가하는 숫자를 n개 지니는 리스트를 리턴해야 합니다.
	 * @param x -10000000 이상, 10000000 이하인 정수
	 * @param n 1000 이하인 자연수
	 */
	public long[] solution(int x, int n) {
		long[] answer = new long[n];
		for(int i=0;i<n;i++)
		{
			answer[i] = (i==0 ? 0 : answer[i-1]) + (long)x;
		}
		return answer;
	}
}
