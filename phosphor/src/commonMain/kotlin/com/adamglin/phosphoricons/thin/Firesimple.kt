package com.adamglin.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.ThinGroup

public val ThinGroup.FireSimple: ImageVector
    get() {
        if (_fireSimple != null) {
            return _fireSimple!!
        }
        _fireSimple = Builder(name = "FireSimple", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(140.82f, 20.92f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -6.31f, 1.71f)
                lineToRelative(-24.15f, 66.2f)
                lineTo(81.81f, 61.13f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -6.0f, 0.44f)
                curveTo(54.71f, 89.25f, 44.0f, 117.0f, 44.0f, 144.0f)
                arcToRelative(84.0f, 84.0f, 0.0f, false, false, 168.0f, 0.0f)
                curveTo(212.0f, 86.24f, 162.22f, 38.69f, 140.82f, 20.92f)
                close()
                moveTo(128.0f, 220.0f)
                arcToRelative(76.08f, 76.08f, 0.0f, false, true, -76.0f, -76.0f)
                curveToRelative(0.0f, -24.07f, 9.25f, -48.93f, 27.5f, -74.0f)
                lineToRelative(29.71f, 28.83f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 6.55f, -1.5f)
                lineToRelative(24.3f, -66.6f)
                curveTo(162.27f, 50.09f, 204.0f, 93.18f, 204.0f, 144.0f)
                arcTo(76.08f, 76.08f, 0.0f, false, true, 128.0f, 220.0f)
                close()
            }
        }
        .build()
        return _fireSimple!!
    }

private var _fireSimple: ImageVector? = null
