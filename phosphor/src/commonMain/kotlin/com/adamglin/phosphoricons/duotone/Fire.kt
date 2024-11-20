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

public val DuotoneGroup.Fire: ImageVector
    get() {
        if (_fire != null) {
            return _fire!!
        }
        _fire = Builder(name = "Fire", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(208.0f, 144.0f)
                arcToRelative(80.0f, 80.0f, 0.0f, false, true, -160.0f, 0.0f)
                curveToRelative(0.0f, -30.57f, 14.42f, -58.26f, 31.0f, -80.0f)
                lineToRelative(33.0f, 32.0f)
                lineToRelative(26.27f, -72.0f)
                curveTo(159.86f, 41.92f, 208.0f, 88.15f, 208.0f, 144.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(183.89f, 153.34f)
                arcToRelative(57.6f, 57.6f, 0.0f, false, true, -46.56f, 46.55f)
                arcTo(8.75f, 8.75f, 0.0f, false, true, 136.0f, 200.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -1.32f, -15.89f)
                curveToRelative(16.57f, -2.79f, 30.63f, -16.85f, 33.44f, -33.45f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 15.78f, 2.68f)
                close()
                moveTo(216.0f, 144.0f)
                arcToRelative(88.0f, 88.0f, 0.0f, false, true, -176.0f, 0.0f)
                curveToRelative(0.0f, -27.92f, 11.0f, -56.47f, 32.66f, -84.85f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.93f, -0.89f)
                lineToRelative(24.12f, 23.41f)
                lineToRelative(22.0f, -60.41f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 12.63f, -3.41f)
                curveTo(165.21f, 36.0f, 216.0f, 84.55f, 216.0f, 144.0f)
                close()
                moveTo(200.0f, 144.0f)
                curveToRelative(0.0f, -46.09f, -35.79f, -85.92f, -58.21f, -106.33f)
                lineTo(119.52f, 98.74f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -13.09f, 3.0f)
                lineTo(80.06f, 76.16f)
                curveTo(64.09f, 99.21f, 56.0f, 122.0f, 56.0f, 144.0f)
                arcToRelative(72.0f, 72.0f, 0.0f, false, false, 144.0f, 0.0f)
                close()
            }
        }
        .build()
        return _fire!!
    }

private var _fire: ImageVector? = null
