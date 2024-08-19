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

public val BoldGroup.`Cigarette-bold`: ImageVector
    get() {
        if (`_cigarette-bold` != null) {
            return `_cigarette-bold`!!
        }
        `_cigarette-bold` = Builder(name = "Cigarette-bold", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 124.0f)
                lineTo(32.0f, 124.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -20.0f, 20.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                lineTo(224.0f, 196.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(244.0f, 144.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 224.0f, 124.0f)
                close()
                moveTo(36.0f, 148.0f)
                lineTo(76.0f, 148.0f)
                verticalLineToRelative(24.0f)
                lineTo(36.0f, 172.0f)
                close()
                moveTo(220.0f, 172.0f)
                lineTo(100.0f, 172.0f)
                lineTo(100.0f, 148.0f)
                lineTo(220.0f, 148.0f)
                close()
                moveTo(201.67f, 55.89f)
                curveToRelative(7.53f, -12.71f, 7.12f, -19.63f, 5.07f, -21.1f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 216.67f, 13.0f)
                arcToRelative(25.9f, 25.9f, 0.0f, false, true, 13.8f, 15.79f)
                curveToRelative(3.6f, 10.92f, 0.86f, 24.17f, -8.14f, 39.38f)
                curveToRelative(-7.53f, 12.7f, -7.12f, 19.63f, -5.07f, 21.1f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -9.93f, 21.84f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, true, -13.8f, -15.79f)
                curveTo(189.93f, 84.34f, 192.67f, 71.09f, 201.67f, 55.89f)
                close()
                moveTo(153.67f, 55.89f)
                curveToRelative(7.53f, -12.71f, 7.12f, -19.63f, 5.07f, -21.1f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 168.67f, 13.0f)
                arcToRelative(25.9f, 25.9f, 0.0f, false, true, 13.8f, 15.79f)
                curveToRelative(3.6f, 10.92f, 0.86f, 24.17f, -8.14f, 39.38f)
                curveToRelative(-7.53f, 12.7f, -7.12f, 19.63f, -5.07f, 21.1f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -9.93f, 21.84f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, true, -13.8f, -15.79f)
                curveTo(141.93f, 84.34f, 144.67f, 71.09f, 153.67f, 55.89f)
                close()
            }
        }
        .build()
        return `_cigarette-bold`!!
    }

private var `_cigarette-bold`: ImageVector? = null
