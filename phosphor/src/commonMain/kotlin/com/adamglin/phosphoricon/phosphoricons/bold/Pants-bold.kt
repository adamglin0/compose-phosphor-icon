package com.adamglin.phosphoricon.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.BoldGroup

public val BoldGroup.`Pants-bold`: ImageVector
    get() {
        if (`_pants-bold` != null) {
            return `_pants-bold`!!
        }
        `_pants-bold` = Builder(name = "Pants-bold", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(227.85f, 213.52f)
                lineToRelative(-22.0f, -176.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 186.0f, 20.0f)
                lineTo(70.0f, 20.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 50.15f, 37.52f)
                lineToRelative(-22.0f, 176.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 48.0f, 236.0f)
                lineTo(88.69f, 236.0f)
                arcTo(19.94f, 19.94f, 0.0f, false, false, 108.07f, 221.0f)
                lineToRelative(19.93f, -77.0f)
                lineToRelative(19.91f, 76.94f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 167.31f, 236.0f)
                lineTo(208.0f, 236.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 19.85f, -22.48f)
                close()
                moveTo(182.47f, 44.0f)
                lineToRelative(2.0f, 16.0f)
                lineTo(71.53f, 60.0f)
                lineToRelative(2.0f, -16.0f)
                close()
                moveTo(85.6f, 212.0f)
                lineTo(52.53f, 212.0f)
                lineToRelative(11.2f, -89.6f)
                arcTo(44.11f, 44.11f, 0.0f, false, false, 95.81f, 84.0f)
                lineTo(116.0f, 84.0f)
                lineTo(116.0f, 94.47f)
                close()
                moveTo(170.41f, 212.0f)
                lineTo(140.0f, 94.47f)
                lineTo(140.0f, 84.0f)
                horizontalLineToRelative(20.19f)
                arcToRelative(44.09f, 44.09f, 0.0f, false, false, 32.08f, 38.39f)
                lineTo(203.47f, 212.0f)
                close()
            }
        }
        .build()
        return `_pants-bold`!!
    }

private var `_pants-bold`: ImageVector? = null
