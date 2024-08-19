package com.adamglin.phosphoricons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.DuotoneGroup

public val DuotoneGroup.Patreonlogo: ImageVector
    get() {
        if (_patreonlogo != null) {
            return _patreonlogo!!
        }
        _patreonlogo = Builder(name = "Patreonlogo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(224.0f, 93.16f)
                curveToRelative(0.0f, 49.0f, -48.17f, 49.0f, -72.25f, 65.34f)
                curveTo(121.88f, 178.76f, 119.64f, 232.0f, 87.52f, 232.0f)
                reflectiveCurveToRelative(-61.74f, -125.0f, -16.0f, -171.51f)
                curveTo(119.64f, 11.49f, 224.0f, 27.82f, 224.0f, 93.16f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(187.37f, 32.0f)
                curveToRelative(-18.79f, -7.68f, -41.14f, -9.92f, -62.93f, -6.3f)
                curveToRelative(-23.44f, 3.9f, -43.73f, 14.0f, -58.68f, 29.2f)
                curveToRelative(-11.12f, 11.32f, -24.62f, 33.35f, -25.7f, 74.0f)
                curveToRelative(-0.7f, 26.49f, 4.39f, 55.44f, 13.61f, 77.45f)
                reflectiveCurveTo(74.61f, 240.0f, 87.52f, 240.0f)
                curveToRelative(22.94f, 0.0f, 33.23f, -20.08f, 43.17f, -39.5f)
                curveToRelative(7.0f, -13.6f, 14.16f, -27.66f, 25.55f, -35.38f)
                curveToRelative(5.86f, -4.0f, 13.8f, -7.0f, 22.21f, -10.28f)
                curveToRelative(23.86f, -9.2f, 53.55f, -20.66f, 53.55f, -61.67f)
                curveTo(232.0f, 65.9f, 215.73f, 43.6f, 187.37f, 32.0f)
                close()
                moveTo(172.69f, 139.91f)
                curveToRelative(-9.28f, 3.58f, -18.05f, 7.0f, -25.43f, 12.0f)
                curveToRelative(-14.78f, 10.0f, -23.3f, 26.66f, -30.81f, 41.33f)
                curveTo(106.67f, 212.3f, 100.05f, 224.0f, 87.52f, 224.0f)
                curveToRelative(-4.52f, 0.0f, -12.18f, -7.37f, -19.09f, -23.85f)
                curveToRelative(-8.39f, -20.0f, -13.0f, -46.49f, -12.37f, -70.83f)
                curveToRelative(0.73f, -27.66f, 8.23f, -50.11f, 21.11f, -63.21f)
                curveTo(95.23f, 47.74f, 120.79f, 40.0f, 144.57f, 40.0f)
                arcToRelative(98.48f, 98.48f, 0.0f, false, true, 36.74f, 6.76f)
                curveToRelative(13.0f, 5.3f, 34.69f, 18.38f, 34.69f, 46.37f)
                curveTo(216.0f, 123.21f, 195.93f, 131.0f, 172.69f, 139.91f)
                close()
            }
        }
        .build()
        return _patreonlogo!!
    }

private var _patreonlogo: ImageVector? = null
