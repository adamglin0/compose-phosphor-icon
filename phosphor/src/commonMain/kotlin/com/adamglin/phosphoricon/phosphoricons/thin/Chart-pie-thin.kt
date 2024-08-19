package com.adamglin.phosphoricon.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.ThinGroup

public val ThinGroup.`Chart-pie-thin`: ImageVector
    get() {
        if (`_chart-pie-thin` != null) {
            return `_chart-pie-thin`!!
        }
        `_chart-pie-thin` = Builder(name = "Chart-pie-thin", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 28.0f)
                arcTo(100.0f, 100.0f, 0.0f, true, false, 228.0f, 128.0f)
                arcTo(100.11f, 100.11f, 0.0f, false, false, 128.0f, 28.0f)
                close()
                moveTo(205.58f, 78.59f)
                lineTo(132.0f, 121.07f)
                verticalLineToRelative(-85.0f)
                arcTo(92.07f, 92.07f, 0.0f, false, true, 205.58f, 78.59f)
                close()
                moveTo(124.0f, 36.09f)
                verticalLineToRelative(89.6f)
                lineTo(46.42f, 170.48f)
                arcTo(92.0f, 92.0f, 0.0f, false, true, 124.0f, 36.09f)
                close()
                moveTo(128.0f, 220.0f)
                arcToRelative(92.0f, 92.0f, 0.0f, false, true, -77.58f, -42.59f)
                lineTo(209.58f, 85.52f)
                arcTo(92.0f, 92.0f, 0.0f, false, true, 128.0f, 220.0f)
                close()
            }
        }
        .build()
        return `_chart-pie-thin`!!
    }

private var `_chart-pie-thin`: ImageVector? = null
