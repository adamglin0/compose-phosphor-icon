package com.adamglin.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.FillGroup

public val FillGroup.Flame: ImageVector
    get() {
        if (_flame != null) {
            return _flame!!
        }
        _flame = Builder(name = "Flame", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(173.79f, 51.48f)
                arcToRelative(221.25f, 221.25f, 0.0f, false, false, -41.67f, -34.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.24f, 0.0f)
                arcTo(221.25f, 221.25f, 0.0f, false, false, 82.21f, 51.48f)
                curveTo(54.59f, 80.48f, 40.0f, 112.47f, 40.0f, 144.0f)
                arcToRelative(88.0f, 88.0f, 0.0f, false, false, 176.0f, 0.0f)
                curveTo(216.0f, 112.47f, 201.41f, 80.48f, 173.79f, 51.48f)
                close()
                moveTo(96.0f, 184.0f)
                curveToRelative(0.0f, -27.67f, 22.53f, -47.28f, 32.0f, -54.3f)
                curveToRelative(9.48f, 7.0f, 32.0f, 26.63f, 32.0f, 54.3f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, -64.0f, 0.0f)
                close()
            }
        }
        .build()
        return _flame!!
    }

private var _flame: ImageVector? = null
