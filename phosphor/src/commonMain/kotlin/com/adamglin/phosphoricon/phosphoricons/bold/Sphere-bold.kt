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

public val BoldGroup.`Sphere-bold`: ImageVector
    get() {
        if (`_sphere-bold` != null) {
            return `_sphere-bold`!!
        }
        `_sphere-bold` = Builder(name = "Sphere-bold", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 20.0f)
                arcTo(108.0f, 108.0f, 0.0f, true, false, 236.0f, 128.0f)
                arcTo(108.12f, 108.12f, 0.0f, false, false, 128.0f, 20.0f)
                close()
                moveTo(212.0f, 127.86f)
                curveToRelative(-0.56f, 1.41f, -5.7f, 7.11f, -22.88f, 12.33f)
                arcToRelative(157.26f, 157.26f, 0.0f, false, true, -17.57f, 4.15f)
                curveToRelative(0.3f, -5.44f, 0.45f, -10.91f, 0.45f, -16.34f)
                curveToRelative(0.0f, -27.85f, -3.95f, -56.83f, -12.25f, -77.75f)
                arcTo(84.13f, 84.13f, 0.0f, false, true, 212.0f, 127.86f)
                close()
                moveTo(127.86f, 44.0f)
                curveToRelative(1.41f, 0.56f, 7.11f, 5.7f, 12.33f, 22.88f)
                curveToRelative(5.0f, 16.6f, 7.81f, 38.31f, 7.81f, 61.12f)
                curveToRelative(0.0f, 6.56f, -0.24f, 13.0f, -0.68f, 19.32f)
                curveToRelative(-6.29f, 0.44f, -12.76f, 0.68f, -19.32f, 0.68f)
                curveToRelative(-22.81f, 0.0f, -44.52f, -2.78f, -61.12f, -7.81f)
                curveTo(49.7f, 135.0f, 44.56f, 129.27f, 44.0f, 127.86f)
                arcTo(84.1f, 84.1f, 0.0f, false, true, 127.86f, 44.0f)
                close()
                moveTo(50.25f, 159.75f)
                curveTo(71.17f, 168.05f, 100.15f, 172.0f, 128.0f, 172.0f)
                curveToRelative(5.43f, 0.0f, 10.9f, -0.15f, 16.34f, -0.46f)
                arcToRelative(156.93f, 156.93f, 0.0f, false, true, -4.15f, 17.58f)
                curveTo(135.0f, 206.3f, 129.27f, 211.44f, 127.86f, 212.0f)
                arcTo(84.13f, 84.13f, 0.0f, false, true, 50.25f, 159.75f)
                close()
                moveTo(159.75f, 205.75f)
                curveToRelative(4.19f, -10.57f, 7.28f, -23.2f, 9.3f, -36.7f)
                curveToRelative(13.5f, -2.0f, 26.13f, -5.11f, 36.7f, -9.3f)
                arcTo(84.42f, 84.42f, 0.0f, false, true, 159.75f, 205.75f)
                close()
            }
        }
        .build()
        return `_sphere-bold`!!
    }

private var `_sphere-bold`: ImageVector? = null
