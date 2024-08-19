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

public val LightGroup.`Flag-checkered-light`: ImageVector
    get() {
        if (`_flag-checkered-light` != null) {
            return `_flag-checkered-light`!!
        }
        `_flag-checkered-light` = Builder(name = "Flag-checkered-light", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(226.49f, 50.5f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.42f, 0.92f)
                curveToRelative(-29.0f, 25.11f, -53.28f, 13.08f, -81.41f, -0.84f)
                curveToRelative(-27.92f, -13.82f, -59.57f, -29.49f, -94.59f, 0.84f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 42.0f, 56.0f)
                lineTo(42.0f, 224.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                lineTo(54.0f, 178.78f)
                curveToRelative(28.08f, -22.79f, 51.88f, -11.0f, 79.34f, 2.59f)
                curveToRelative(27.92f, 13.82f, 59.58f, 29.48f, 94.59f, -0.85f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 230.0f, 176.0f)
                lineTo(230.0f, 56.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 226.49f, 50.5f)
                close()
                moveTo(218.0f, 68.0f)
                verticalLineToRelative(45.2f)
                curveToRelative(-15.53f, 12.6f, -29.75f, 14.65f, -44.0f, 11.65f)
                lineTo(174.0f, 76.88f)
                curveTo(188.0f, 79.33f, 202.64f, 77.78f, 218.0f, 68.0f)
                close()
                moveTo(162.0f, 73.87f)
                verticalLineToRelative(47.4f)
                curveToRelative(-7.6f, -2.85f, -15.31f, -6.66f, -23.34f, -10.64f)
                curveToRelative(-9.16f, -4.53f, -18.71f, -9.26f, -28.66f, -12.5f)
                lineTo(110.0f, 50.71f)
                arcToRelative(255.17f, 255.17f, 0.0f, false, true, 23.34f, 10.63f)
                curveTo(142.5f, 65.87f, 152.05f, 70.59f, 162.0f, 73.83f)
                close()
                moveTo(98.0f, 47.13f)
                lineTo(98.0f, 95.0f)
                curveToRelative(-14.0f, -2.45f, -28.64f, -0.89f, -44.0f, 8.93f)
                lineTo(54.0f, 58.75f)
                curveTo(69.53f, 46.15f, 83.75f, 44.13f, 98.0f, 47.13f)
                close()
                moveTo(86.63f, 154.0f)
                curveTo(76.13f, 154.0f, 65.24f, 156.79f, 54.0f, 164.0f)
                lineTo(54.0f, 118.79f)
                curveToRelative(15.53f, -12.61f, 29.75f, -14.65f, 44.0f, -11.65f)
                verticalLineToRelative(47.93f)
                arcTo(66.32f, 66.32f, 0.0f, false, false, 86.63f, 154.0f)
                close()
                moveTo(110.0f, 158.11f)
                lineTo(110.0f, 110.72f)
                curveToRelative(7.6f, 2.84f, 15.31f, 6.66f, 23.34f, 10.63f)
                curveToRelative(9.16f, 4.53f, 18.71f, 9.26f, 28.66f, 12.5f)
                verticalLineToRelative(47.39f)
                curveToRelative(-7.6f, -2.85f, -15.31f, -6.66f, -23.34f, -10.63f)
                curveTo(129.5f, 166.07f, 120.0f, 161.35f, 110.0f, 158.11f)
                close()
                moveTo(174.0f, 184.81f)
                lineTo(174.0f, 136.89f)
                arcToRelative(66.32f, 66.32f, 0.0f, false, false, 11.37f, 1.0f)
                curveToRelative(10.5f, 0.0f, 21.39f, -2.78f, 32.63f, -10.0f)
                verticalLineToRelative(45.24f)
                curveTo(202.47f, 185.79f, 188.25f, 187.81f, 174.0f, 184.81f)
                close()
            }
        }
        .build()
        return `_flag-checkered-light`!!
    }

private var `_flag-checkered-light`: ImageVector? = null
