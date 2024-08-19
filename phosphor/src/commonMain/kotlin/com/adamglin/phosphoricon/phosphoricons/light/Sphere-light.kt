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

public val LightGroup.`Sphere-light`: ImageVector
    get() {
        if (`_sphere-light` != null) {
            return `_sphere-light`!!
        }
        `_sphere-light` = Builder(name = "Sphere-light", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 26.0f)
                arcTo(102.0f, 102.0f, 0.0f, true, false, 230.0f, 128.0f)
                arcTo(102.12f, 102.12f, 0.0f, false, false, 128.0f, 26.0f)
                close()
                moveTo(218.0f, 128.0f)
                curveToRelative(0.0f, 6.59f, -12.94f, 13.24f, -24.0f, 16.94f)
                arcToRelative(167.93f, 167.93f, 0.0f, false, true, -28.92f, 6.53f)
                curveToRelative(0.62f, -7.6f, 0.94f, -15.46f, 0.94f, -23.47f)
                curveToRelative(0.0f, -26.27f, -3.44f, -51.0f, -9.68f, -69.78f)
                arcToRelative(85.57f, 85.57f, 0.0f, false, false, -8.0f, -17.91f)
                arcTo(90.16f, 90.16f, 0.0f, false, true, 218.0f, 128.0f)
                close()
                moveTo(128.0f, 38.0f)
                curveToRelative(6.59f, 0.0f, 13.24f, 12.94f, 16.94f, 24.0f)
                curveToRelative(5.84f, 17.53f, 9.06f, 41.0f, 9.06f, 66.0f)
                curveToRelative(0.0f, 8.83f, -0.4f, 17.15f, -1.11f, 24.89f)
                curveToRelative(-8.0f, 0.73f, -16.35f, 1.11f, -24.89f, 1.11f)
                curveToRelative(-54.94f, 0.0f, -90.0f, -15.4f, -90.0f, -26.0f)
                arcTo(90.1f, 90.1f, 0.0f, false, true, 128.0f, 38.0f)
                close()
                moveTo(40.31f, 148.3f)
                arcToRelative(85.57f, 85.57f, 0.0f, false, false, 17.91f, 8.0f)
                curveTo(77.0f, 162.56f, 101.73f, 166.0f, 128.0f, 166.0f)
                curveToRelative(8.0f, 0.0f, 15.86f, -0.32f, 23.45f, -0.94f)
                curveTo(146.64f, 198.2f, 136.0f, 218.0f, 128.0f, 218.0f)
                arcTo(90.16f, 90.16f, 0.0f, false, true, 40.31f, 148.3f)
                close()
                moveTo(148.31f, 215.69f)
                arcToRelative(85.57f, 85.57f, 0.0f, false, false, 8.0f, -17.91f)
                arcToRelative(184.0f, 184.0f, 0.0f, false, false, 7.43f, -34.0f)
                arcToRelative(184.0f, 184.0f, 0.0f, false, false, 34.0f, -7.43f)
                arcToRelative(85.57f, 85.57f, 0.0f, false, false, 17.91f, -8.0f)
                arcTo(90.3f, 90.3f, 0.0f, false, true, 148.3f, 215.69f)
                close()
            }
        }
        .build()
        return `_sphere-light`!!
    }

private var `_sphere-light`: ImageVector? = null
