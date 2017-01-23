package graph;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

public class Graph_view extends Frame implements ActionListener,WindowListener {
	
	private Button button1 = new Button("BarChart");
	private Button button2 = new Button("LineChart");
 

	
	public Graph_view(){
		addWindowListener(this);
		setTitle("Graph");
		
		DefaultCategoryDataset data = new DefaultCategoryDataset();
		
		data.addValue(300, "USA", "2005");
		data.addValue(500, "USA", "2006");
		data.addValue(120, "USA", "2007");
		
		data.addValue(200, "China", "2005");
		data.addValue(400, "China", "2006");
		data.addValue(320, "China", "2007");
		
		JFreeChart chart = ChartFactory.createBarChart3D("Import Volume","Year","Ton",data,PlotOrientation.VERTICAL,true,false,false);
		ChartPanel cpanel = new ChartPanel(chart);
		
		add(cpanel, BorderLayout.CENTER);
		
		cpanel.add(button1);
		button1.addActionListener(this);
	
		cpanel.add(button2);
		button2.addActionListener(this);
		

	}

	@Override
	public void windowActivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent arg0) {
		// TODO Auto-generated method stub
	
	}

	@Override
	public void windowClosing(WindowEvent arg0) {
		// TODO Auto-generated method stub
		System.exit(0);
	}

	@Override
	public void windowDeactivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowOpened(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		DefaultCategoryDataset data = new DefaultCategoryDataset();
		
		data.addValue(300, "USA", "2005");
		data.addValue(500, "USA", "2006");
		data.addValue(120, "USA", "2007");
		
		data.addValue(200, "China", "2005");
		data.addValue(400, "China", "2006");
		data.addValue(320, "China", "2007");
		
		if(e.getSource()== button1){		
			setTitle("Graph1");

			JFreeChart chart = ChartFactory.createBarChart("Import Volume","Year","Ton",data,PlotOrientation.VERTICAL,true,false,false);
			ChartPanel cpanel = new ChartPanel(chart);
			add(cpanel, BorderLayout.CENTER);

			invalidate();
			validate();
			
		}else if(e.getSource()== button2){
			setTitle("Graph2");
			
			JFreeChart chart = ChartFactory.createLineChart("Import Volume","Year","Ton",data,PlotOrientation.VERTICAL,true,false,false);
			ChartPanel cpanel = new ChartPanel(chart);
			add(cpanel, BorderLayout.CENTER);
			
			invalidate();
			validate();

			}
		
		}	
		
}

