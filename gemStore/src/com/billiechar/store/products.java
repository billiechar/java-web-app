package com.billiechar.store;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
 
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * Servlet implementation class products
 */
@WebServlet("/products")
public class products extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public products() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String customers = 
				"["
		  + "		{"
		  + "			\"name\": \"Azurite\","
		  + "			\"description\": \"Some gems have hidden qualities beyond their luster, beyond their shine... Azurite is one of those gems.\","
		  + "			\"shine\": 8,"
		  + "			\"price\": 110.50,"
		  + "			\"rarity\": 7,"
		  + "			\"color\": \"#CCC\","
		  + "			\"faces\": 14,"
		  + "			\"images\": ["
		  + "				\"img/gem-02.gif\","
		  + "				\"img/gem-05.gif\","
		  + "		   		\"img/gem-09.gif\""
		  + "			],"
		  + "			\"reviews\": []"
		  + "		},"
		  + "		{"
		  + "			\"name\": \"Bloodstone\","
		  + "			\"description\": \"Origin of the Bloodstone is unknown, hence its low value. It has a very high shine and 12 sides, however.\","
		  + "			\"shine\": 9,"
		  + "			\"price\": 22.90,"
		  + "			\"rarity\": 6,"
		  + "			\"color\": \"#EEE\","
		  + "			\"faces\": 12,"
		  + "			\"images\": ["
		  + "				\"img/gem-01.gif\","
		  + "				\"img/gem-03.gif\","
		  + "		   		\"img/gem-04.gif\""
		  + "			],"
		  + "			\"reviews\": []"
		  + "		},"
		  + "		{"
		  + "			\"name\": \"Zircon\","
		  + "			\"description\": \"Zircon is our most coveted and sought after gem. You will pay much to be the proud owner of this gorgeous and high shine gem.\","
		  + "			\"shine\": 70,"
		  + "			\"price\": 1100,"
		  + "			\"rarity\": 2,"
		  + "			\"color\": \"#000\","
		  + "			\"faces\": 6,"
		  + "			\"images\": ["
		  + "				\"img/gem-06.gif\","
		  + "				\"img/gem-07.gif\","
		  + "		   		\"img/gem-08.gif\""
		  + "			],"
		  + "			\"reviews\": []"
		  + "		}"
		  + "	]";

		
		response.setContentType("application/json");
		response.addHeader("Access-Control-Allow-Origin", "http://billiechar.com");
		PrintWriter out = response.getWriter();
		
		out.print(customers);
		out.flush();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
