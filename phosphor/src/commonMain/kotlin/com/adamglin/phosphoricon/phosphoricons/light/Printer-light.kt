package com.adamglin.phosphoricon.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.LightGroup

public val LightGroup.`Printer-light`: ImageVector
    get() {
        if (`_printer-light` != null) {
            return `_printer-light`!!
        }
        `_printer-light` = Builder(name = "Printer-light", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(214.67f, 74.0f)
                lineTo(198.0f, 74.0f)
                lineTo(198.0f, 40.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, -6.0f)
                lineTo(64.0f, 34.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                lineTo(58.0f, 74.0f)
                lineTo(41.33f, 74.0f)
                curveTo(28.47f, 74.0f, 18.0f, 83.87f, 18.0f, 96.0f)
                verticalLineToRelative(80.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, 6.0f)
                lineTo(58.0f, 182.0f)
                verticalLineToRelative(34.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, 6.0f)
                lineTo(192.0f, 222.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, -6.0f)
                lineTo(198.0f, 182.0f)
                horizontalLineToRelative(34.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, -6.0f)
                lineTo(238.0f, 96.0f)
                curveTo(238.0f, 83.87f, 227.53f, 74.0f, 214.67f, 74.0f)
                close()
                moveTo(70.0f, 46.0f)
                lineTo(186.0f, 46.0f)
                lineTo(186.0f, 74.0f)
                lineTo(70.0f, 74.0f)
                close()
                moveTo(186.0f, 210.0f)
                lineTo(70.0f, 210.0f)
                lineTo(70.0f, 158.0f)
                lineTo(186.0f, 158.0f)
                close()
                moveTo(226.0f, 170.0f)
                lineTo(198.0f, 170.0f)
                lineTo(198.0f, 152.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, -6.0f)
                lineTo(64.0f, 146.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                verticalLineToRelative(18.0f)
                lineTo(30.0f, 170.0f)
                lineTo(30.0f, 96.0f)
                curveToRelative(0.0f, -5.51f, 5.08f, -10.0f, 11.33f, -10.0f)
                lineTo(214.67f, 86.0f)
                curveTo(220.92f, 86.0f, 226.0f, 90.49f, 226.0f, 96.0f)
                close()
                moveTo(198.0f, 116.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, -10.0f, -10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 198.0f, 116.0f)
                close()
            }
        }
        .build()
        return `_printer-light`!!
    }

private var `_printer-light`: ImageVector? = null
