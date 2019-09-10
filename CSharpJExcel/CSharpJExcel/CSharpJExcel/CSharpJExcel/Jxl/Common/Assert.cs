/*********************************************************************
*
*      Copyright (C) 2006 Andrew Khan
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


namespace CSharpJExcel.Jxl.Common
	{
	/**
	 * Simple assertion mechanism for use during development
	 */
	public sealed class Assert
		{
		/**
		 * Throws an AssertionFailed exception if the specified condition is
		 * false
		 * 
		 * @param condition The assertion condition which must be true
		 */
		public static void verify(bool condition)
			{
			if (!condition)
				{
				throw new AssertionFailed();
				}
			}

		/**
		 * If the condition evaluates to false, an AssertionFailed is thrown
		 * 
		 * @param message A message thrown with the failed assertion
		 * @param condition If this evaluates to false, an AssertionFailed is thrown
		 */
		public static void verify(bool condition,string message)
			{
			if (!condition)
				{
				throw new AssertionFailed(message);
				}
			}
		}
	}







