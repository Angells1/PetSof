/*********************************************************************
*
*      Copyright (C) 2002 Andrew Khan
*
* This library is free software; you can redistribute it and/or
* modify it under the terms of the GNU Lesser General Public
* License as published by the Free Software Foundation; either
* version 2.1 of the License, or (at your option) any later version.
*
* This library is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
* Lesser General Public License for more details.
*
* You should have received a copy of the GNU Lesser General Public
* License along with this library; if not, write to the Free Software
* Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA
***************************************************************************/

// Port to C# 
// Chris Laforet
// Wachovia, a Wells-Fargo Company
// Feb 2010


using CSharpJExcel.Jxl.Biff;


namespace CSharpJExcel.Jxl.Read.Biff
	{
	/**
	 * Contains the default column width for cells in this sheet
	 */
	class DefaultRowHeightRecord : RecordData
		{
		/**
		 * The default row height, in 1/20ths of a point
		 */
		private int height;

		/**
		 * Constructs the def col width from the raw data
		 *
		 * @param t the raw data
		 */
		public DefaultRowHeightRecord(Record t)
			: base(t)
			{
			byte[] data = t.getData();

			if (data.Length > 2)
				{
				height = IntegerHelper.getInt(data[2],data[3]);
				}
			}

		/**
		 * Accessor for the default height
		 *
		 * @return the height
		 */
		public int getHeight()
			{
			return height;
			}
		}
	}