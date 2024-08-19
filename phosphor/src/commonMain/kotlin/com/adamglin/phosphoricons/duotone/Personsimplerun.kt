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

public val DuotoneGroup.Personsimplerun: ImageVector
    get() {
        if (_personsimplerun != null) {
            return _personsimplerun!!
        }
        _personsimplerun = Builder(name = "Personsimplerun", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(176.0f, 56.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, -24.0f, -24.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 176.0f, 56.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(152.0f, 88.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, -32.0f, -32.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 152.0f, 88.0f)
                close()
                moveTo(152.0f, 40.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, -16.0f, 16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 152.0f, 40.0f)
                close()
                moveTo(219.31f, 140.68f)
                curveToRelative(-0.61f, 0.28f, -7.49f, 3.28f, -19.67f, 3.28f)
                curveToRelative(-13.85f, 0.0f, -34.55f, -3.88f, -60.69f, -20.0f)
                arcToRelative(169.31f, 169.31f, 0.0f, false, true, -15.41f, 32.34f)
                arcToRelative(104.29f, 104.29f, 0.0f, false, true, 31.31f, 15.81f)
                curveTo(173.92f, 186.65f, 184.0f, 207.35f, 184.0f, 232.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                curveToRelative(0.0f, -41.7f, -34.69f, -56.71f, -54.14f, -61.85f)
                curveToRelative(-0.55f, 0.7f, -1.12f, 1.41f, -1.69f, 2.1f)
                curveToRelative(-19.64f, 23.8f, -44.25f, 36.18f, -71.63f, 36.18f)
                arcTo(92.29f, 92.29f, 0.0f, false, true, 31.2f, 208.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 32.8f, 192.0f)
                curveToRelative(25.92f, 2.59f, 48.47f, -7.49f, 67.0f, -30.0f)
                curveToRelative(12.49f, -15.14f, 21.0f, -33.61f, 25.25f, -47.0f)
                curveTo(86.13f, 92.34f, 61.27f, 111.63f, 61.0f, 111.84f)
                arcTo(8.0f, 8.0f, 0.0f, true, true, 51.0f, 99.36f)
                curveToRelative(1.5f, -1.2f, 37.22f, -29.0f, 89.51f, 6.57f)
                curveToRelative(45.47f, 30.91f, 71.93f, 20.31f, 72.18f, 20.19f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 6.63f, 14.56f)
                close()
            }
        }
        .build()
        return _personsimplerun!!
    }

private var _personsimplerun: ImageVector? = null
