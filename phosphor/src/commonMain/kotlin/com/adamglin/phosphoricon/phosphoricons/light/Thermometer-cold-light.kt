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

public val LightGroup.`Thermometer-cold-light`: ImageVector
    get() {
        if (`_thermometer-cold-light` != null) {
            return `_thermometer-cold-light`!!
        }
        `_thermometer-cold-light` = Builder(name = "Thermometer-cold-light", defaultWidth =
                256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight =
                256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(248.29f, 75.82f)
                lineToRelative(-22.58f, 7.33f)
                lineToRelative(13.95f, 19.21f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, -9.7f, 7.06f)
                lineTo(216.0f, 90.21f)
                lineToRelative(-14.0f, 19.21f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, -9.7f, -7.06f)
                lineToRelative(13.95f, -19.21f)
                lineToRelative(-22.58f, -7.33f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, 3.71f, -11.41f)
                lineTo(210.0f, 71.74f)
                lineTo(210.0f, 48.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                lineTo(222.0f, 71.74f)
                lineToRelative(22.58f, -7.33f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 3.71f, 11.41f)
                close()
                moveTo(150.0f, 184.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, true, true, -36.0f, -29.4f)
                lineTo(114.0f, 120.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                verticalLineToRelative(34.6f)
                arcTo(30.05f, 30.05f, 0.0f, false, true, 150.0f, 184.0f)
                close()
                moveTo(138.0f, 184.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, true, false, -18.0f, 18.0f)
                arcTo(18.0f, 18.0f, 0.0f, false, false, 138.0f, 184.0f)
                close()
                moveTo(182.0f, 184.0f)
                arcTo(62.0f, 62.0f, 0.0f, true, true, 82.0f, 135.0f)
                lineTo(82.0f, 48.0f)
                arcToRelative(38.0f, 38.0f, 0.0f, false, true, 76.0f, 0.0f)
                verticalLineToRelative(87.0f)
                arcTo(62.06f, 62.06f, 0.0f, false, true, 182.0f, 184.0f)
                close()
                moveTo(170.0f, 184.0f)
                arcToRelative(50.07f, 50.07f, 0.0f, false, false, -21.43f, -41.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 146.0f, 138.0f)
                lineTo(146.0f, 48.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, false, -52.0f, 0.0f)
                verticalLineToRelative(90.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 91.43f, 143.0f)
                arcTo(50.0f, 50.0f, 0.0f, true, false, 170.0f, 184.0f)
                close()
            }
        }
        .build()
        return `_thermometer-cold-light`!!
    }

private var `_thermometer-cold-light`: ImageVector? = null
