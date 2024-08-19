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

public val BoldGroup.`Sun-horizon-bold`: ImageVector
    get() {
        if (`_sun-horizon-bold` != null) {
            return `_sun-horizon-bold`!!
        }
        `_sun-horizon-bold` = Builder(name = "Sun-horizon-bold", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.0f, 148.0f)
                lineTo(203.89f, 148.0f)
                curveToRelative(0.07f, -1.33f, 0.11f, -2.66f, 0.11f, -4.0f)
                arcToRelative(76.0f, 76.0f, 0.0f, false, false, -152.0f, 0.0f)
                curveToRelative(0.0f, 1.34f, 0.0f, 2.67f, 0.11f, 4.0f)
                lineTo(16.0f, 148.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                lineTo(240.0f, 172.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                close()
                moveTo(76.0f, 144.0f)
                arcToRelative(52.0f, 52.0f, 0.0f, false, true, 104.0f, 0.0f)
                curveToRelative(0.0f, 1.34f, -0.07f, 2.67f, -0.17f, 4.0f)
                lineTo(76.17f, 148.0f)
                curveTo(76.07f, 146.67f, 76.0f, 145.34f, 76.0f, 144.0f)
                close()
                moveTo(220.0f, 200.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                lineTo(48.0f, 212.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                lineTo(208.0f, 188.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 220.0f, 200.0f)
                close()
                moveTo(12.62f, 92.21f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 15.17f, -7.59f)
                lineToRelative(12.0f, 4.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -7.58f, 22.77f)
                lineToRelative(-12.0f, -4.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 12.62f, 92.21f)
                close()
                moveTo(68.62f, 43.8f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 22.76f, -7.59f)
                lineToRelative(4.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, true, true, 72.62f, 55.8f)
                close()
                moveTo(208.62f, 103.8f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 7.59f, -15.18f)
                lineToRelative(12.0f, -4.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 7.58f, 22.77f)
                lineToRelative(-12.0f, 4.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -15.17f, -7.59f)
                close()
                moveTo(160.62f, 48.21f)
                lineTo(164.62f, 36.21f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 22.76f, 7.59f)
                lineToRelative(-4.0f, 12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -22.76f, -7.59f)
                close()
            }
        }
        .build()
        return `_sun-horizon-bold`!!
    }

private var `_sun-horizon-bold`: ImageVector? = null
