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

public val DuotoneGroup.Dropsimple: ImageVector
    get() {
        if (_dropsimple != null) {
            return _dropsimple!!
        }
        _dropsimple = Builder(name = "Dropsimple", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(208.0f, 144.0f)
                arcToRelative(80.0f, 80.0f, 0.0f, false, true, -160.0f, 0.0f)
                curveToRelative(0.0f, -72.0f, 80.0f, -128.0f, 80.0f, -128.0f)
                reflectiveCurveTo(208.0f, 72.0f, 208.0f, 144.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(174.0f, 47.75f)
                arcToRelative(254.19f, 254.19f, 0.0f, false, false, -41.45f, -38.3f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -9.18f, 0.0f)
                arcTo(254.19f, 254.19f, 0.0f, false, false, 82.0f, 47.75f)
                curveTo(54.51f, 79.32f, 40.0f, 112.6f, 40.0f, 144.0f)
                arcToRelative(88.0f, 88.0f, 0.0f, false, false, 176.0f, 0.0f)
                curveTo(216.0f, 112.6f, 201.49f, 79.32f, 174.0f, 47.75f)
                close()
                moveTo(128.0f, 216.0f)
                arcToRelative(72.08f, 72.08f, 0.0f, false, true, -72.0f, -72.0f)
                curveToRelative(0.0f, -57.23f, 55.47f, -105.0f, 72.0f, -118.0f)
                curveToRelative(16.53f, 13.0f, 72.0f, 60.75f, 72.0f, 118.0f)
                arcTo(72.08f, 72.08f, 0.0f, false, true, 128.0f, 216.0f)
                close()
            }
        }
        .build()
        return _dropsimple!!
    }

private var _dropsimple: ImageVector? = null
