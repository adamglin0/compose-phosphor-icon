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

public val BoldGroup.`Chart-pie-slice-bold`: ImageVector
    get() {
        if (`_chart-pie-slice-bold` != null) {
            return `_chart-pie-slice-bold`!!
        }
        `_chart-pie-slice-bold` = Builder(name = "Chart-pie-slice-bold", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(93.82f, 116.64f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 100.0f, 106.15f)
                lineTo(100.0f, 40.74f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 83.0f, 29.83f)
                arcTo(108.26f, 108.26f, 0.0f, false, false, 20.0f, 128.0f)
                curveToRelative(0.0f, 3.37f, 0.16f, 6.76f, 0.47f, 10.1f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 17.76f, 9.38f)
                close()
                moveTo(76.0f, 62.06f)
                verticalLineToRelative(37.0f)
                lineTo(44.81f, 116.36f)
                arcTo(84.39f, 84.39f, 0.0f, false, true, 76.0f, 62.06f)
                close()
                moveTo(128.0f, 20.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f)
                verticalLineToRelative(89.53f)
                lineTo(39.18f, 166.27f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -4.3f, 16.46f)
                arcTo(108.0f, 108.0f, 0.0f, true, false, 128.0f, 20.0f)
                close()
                moveTo(128.0f, 212.0f)
                arcToRelative(84.47f, 84.47f, 0.0f, false, true, -65.57f, -31.5f)
                lineTo(134.0f, 138.79f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 6.0f, -10.37f)
                lineTo(140.0f, 44.85f)
                arcTo(84.0f, 84.0f, 0.0f, false, true, 128.0f, 212.0f)
                close()
            }
        }
        .build()
        return `_chart-pie-slice-bold`!!
    }

private var `_chart-pie-slice-bold`: ImageVector? = null
