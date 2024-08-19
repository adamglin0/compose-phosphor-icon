package com.adamglin.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.LightGroup

public val LightGroup.Patreonlogo: ImageVector
    get() {
        if (_patreonlogo != null) {
            return _patreonlogo!!
        }
        _patreonlogo = Builder(name = "Patreonlogo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(186.61f, 33.84f)
                curveToRelative(-18.45f, -7.54f, -40.41f, -9.74f, -61.84f, -6.17f)
                curveToRelative(-23.0f, 3.82f, -42.93f, 13.72f, -57.58f, 28.62f)
                curveTo(56.31f, 67.36f, 43.13f, 88.94f, 42.06f, 128.94f)
                curveToRelative(-0.69f, 26.23f, 4.34f, 54.87f, 13.46f, 76.62f)
                curveToRelative(8.77f, 20.92f, 20.13f, 32.44f, 32.0f, 32.44f)
                curveToRelative(21.72f, 0.0f, 31.72f, -19.53f, 41.39f, -38.41f)
                curveToRelative(7.08f, -13.82f, 14.4f, -28.11f, 26.21f, -36.12f)
                horizontalLineToRelative(0.0f)
                curveToRelative(6.0f, -4.11f, 14.09f, -7.21f, 22.61f, -10.5f)
                curveTo(201.0f, 144.0f, 230.0f, 132.81f, 230.0f, 93.17f)
                curveTo(230.0f, 66.75f, 214.19f, 45.13f, 186.61f, 33.84f)
                close()
                moveTo(173.41f, 141.78f)
                curveToRelative(-9.17f, 3.54f, -17.84f, 6.88f, -25.0f, 11.76f)
                curveToRelative(-14.36f, 9.73f, -22.75f, 26.12f, -30.15f, 40.58f)
                curveTo(109.47f, 211.23f, 101.9f, 226.0f, 87.52f, 226.0f)
                curveToRelative(-5.0f, 0.0f, -13.18f, -6.59f, -20.94f, -25.08f)
                curveToRelative(-8.49f, -20.26f, -13.17f, -47.0f, -12.52f, -71.66f)
                curveToRelative(0.75f, -28.16f, 8.45f, -51.09f, 21.69f, -64.55f)
                curveToRelative(18.45f, -18.78f, 44.57f, -26.65f, 68.86f, -26.65f)
                arcTo(100.32f, 100.32f, 0.0f, false, true, 182.07f, 45.0f)
                curveTo(213.33f, 57.74f, 218.0f, 80.65f, 218.0f, 93.17f)
                curveTo(218.0f, 124.58f, 196.34f, 132.93f, 173.41f, 141.78f)
                close()
            }
        }
        .build()
        return _patreonlogo!!
    }

private var _patreonlogo: ImageVector? = null
