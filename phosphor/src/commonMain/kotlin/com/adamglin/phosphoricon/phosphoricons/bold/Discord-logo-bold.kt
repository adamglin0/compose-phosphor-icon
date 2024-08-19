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

public val BoldGroup.`Discord-logo-bold`: ImageVector
    get() {
        if (`_discord-logo-bold` != null) {
            return `_discord-logo-bold`!!
        }
        `_discord-logo-bold` = Builder(name = "Discord-logo-bold", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(108.0f, 136.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, -16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 108.0f, 136.0f)
                close()
                moveTo(164.0f, 120.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, false, 16.0f, 16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 164.0f, 120.0f)
                close()
                moveTo(240.07f, 196.56f)
                lineTo(173.07f, 226.27f)
                arcTo(20.15f, 20.15f, 0.0f, false, true, 146.0f, 214.9f)
                lineToRelative(-8.54f, -23.13f)
                curveToRelative(-3.13f, 0.14f, -6.27f, 0.24f, -9.45f, 0.24f)
                reflectiveCurveToRelative(-6.32f, -0.1f, -9.45f, -0.24f)
                lineTo(110.0f, 214.9f)
                arcToRelative(20.19f, 20.19f, 0.0f, false, true, -27.08f, 11.37f)
                lineToRelative(-67.0f, -29.71f)
                arcTo(19.93f, 19.93f, 0.0f, false, true, 4.62f, 173.41f)
                lineTo(34.15f, 57.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 50.37f, 42.19f)
                lineToRelative(36.06f, -5.93f)
                arcTo(20.26f, 20.26f, 0.0f, false, true, 109.22f, 51.1f)
                lineToRelative(4.41f, 17.41f)
                curveToRelative(4.74f, -0.33f, 9.52f, -0.51f, 14.37f, -0.51f)
                reflectiveCurveToRelative(9.63f, 0.18f, 14.37f, 0.51f)
                lineToRelative(4.41f, -17.41f)
                arcToRelative(20.25f, 20.25f, 0.0f, false, true, 22.79f, -14.84f)
                lineToRelative(36.06f, 5.93f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 221.85f, 57.0f)
                lineToRelative(29.53f, 116.38f)
                arcTo(19.93f, 19.93f, 0.0f, false, true, 240.07f, 196.56f)
                close()
                moveTo(227.28f, 176.0f)
                lineTo(199.23f, 65.46f)
                lineToRelative(-30.07f, -4.94f)
                lineToRelative(-2.84f, 11.17f)
                curveToRelative(2.9f, 0.58f, 5.78f, 1.2f, 8.61f, 1.92f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -5.86f, 23.27f)
                arcTo(168.43f, 168.43f, 0.0f, false, false, 128.0f, 92.0f)
                arcToRelative(168.43f, 168.43f, 0.0f, false, false, -41.07f, 4.88f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -5.86f, -23.27f)
                curveToRelative(2.83f, -0.72f, 5.71f, -1.34f, 8.61f, -1.92f)
                lineTo(86.85f, 60.52f)
                lineTo(56.77f, 65.46f)
                lineTo(28.72f, 176.0f)
                lineToRelative(60.22f, 26.7f)
                lineToRelative(5.0f, -13.57f)
                curveToRelative(-4.37f, -0.76f, -8.67f, -1.65f, -12.88f, -2.71f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 5.86f, -23.28f)
                arcTo(168.43f, 168.43f, 0.0f, false, false, 128.0f, 168.0f)
                arcToRelative(168.43f, 168.43f, 0.0f, false, false, 41.07f, -4.88f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 5.86f, 23.28f)
                curveToRelative(-4.21f, 1.06f, -8.51f, 1.95f, -12.88f, 2.71f)
                lineToRelative(5.0f, 13.57f)
                close()
            }
        }
        .build()
        return `_discord-logo-bold`!!
    }

private var `_discord-logo-bold`: ImageVector? = null
