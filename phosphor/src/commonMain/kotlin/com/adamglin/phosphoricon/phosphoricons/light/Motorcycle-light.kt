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

public val LightGroup.`Motorcycle-light`: ImageVector
    get() {
        if (`_motorcycle-light` != null) {
            return `_motorcycle-light`!!
        }
        `_motorcycle-light` = Builder(name = "Motorcycle-light", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 122.0f)
                arcToRelative(38.48f, 38.48f, 0.0f, false, false, -7.87f, 0.82f)
                lineTo(200.9f, 104.0f)
                arcToRelative(57.83f, 57.83f, 0.0f, false, true, 15.1f, -2.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                lineTo(195.51f, 90.0f)
                lineTo(181.6f, 53.85f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 176.0f, 50.0f)
                lineTo(144.0f, 50.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineToRelative(27.88f)
                lineToRelative(10.77f, 28.0f)
                lineTo(152.0f, 90.0f)
                curveToRelative(-18.0f, 0.0f, -32.58f, 4.15f, -42.1f, 12.0f)
                arcTo(18.05f, 18.05f, 0.0f, false, true, 91.0f, 104.35f)
                curveTo(77.9f, 98.38f, 30.4f, 79.19f, 26.0f, 77.46f)
                lineToRelative(-5.72f, -2.24f)
                arcTo(14.66f, 14.66f, 0.0f, false, false, 16.0f, 74.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -2.15f, 11.6f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.46f, 0.18f, 47.13f, 18.26f, 72.23f, 29.67f)
                arcToRelative(30.12f, 30.12f, 0.0f, false, false, 31.47f, -4.0f)
                curveToRelative(7.34f, -6.0f, 19.25f, -9.25f, 34.46f, -9.25f)
                horizontalLineToRelative(24.89f)
                arcToRelative(70.0f, 70.0f, 0.0f, false, false, -28.32f, 39.13f)
                arcTo(17.85f, 17.85f, 0.0f, false, true, 131.32f, 154.0f)
                lineTo(77.52f, 154.0f)
                arcToRelative(38.0f, 38.0f, 0.0f, true, false, 0.0f, 12.0f)
                horizontalLineToRelative(53.8f)
                arcToRelative(29.9f, 29.9f, 0.0f, false, false, 28.81f, -21.64f)
                arcToRelative(58.0f, 58.0f, 0.0f, false, true, 29.58f, -36.0f)
                lineToRelative(7.23f, 18.8f)
                arcTo(38.0f, 38.0f, 0.0f, true, false, 216.0f, 122.0f)
                close()
                moveTo(40.0f, 166.0f)
                lineTo(65.29f, 166.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, true, true, 0.0f, -12.0f)
                lineTo(40.0f, 154.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                close()
                moveTo(216.0f, 186.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, true, -14.68f, -47.45f)
                lineToRelative(9.08f, 23.6f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 11.2f, -4.3f)
                lineToRelative(-9.08f, -23.61f)
                arcTo(26.64f, 26.64f, 0.0f, false, true, 216.0f, 134.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, true, 0.0f, 52.0f)
                close()
            }
        }
        .build()
        return `_motorcycle-light`!!
    }

private var `_motorcycle-light`: ImageVector? = null
