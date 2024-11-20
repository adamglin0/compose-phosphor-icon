package com.adamglin.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.RegularGroup

public val RegularGroup.FireSimple: ImageVector
    get() {
        if (_fireSimple != null) {
            return _fireSimple!!
        }
        _fireSimple = Builder(name = "FireSimple", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(143.38f, 17.85f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -12.63f, 3.41f)
                lineToRelative(-22.0f, 60.41f)
                lineTo(84.59f, 58.26f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.93f, 0.89f)
                curveTo(51.0f, 87.53f, 40.0f, 116.08f, 40.0f, 144.0f)
                arcToRelative(88.0f, 88.0f, 0.0f, false, false, 176.0f, 0.0f)
                curveTo(216.0f, 84.55f, 165.21f, 36.0f, 143.38f, 17.85f)
                close()
                moveTo(128.0f, 216.0f)
                arcToRelative(72.08f, 72.08f, 0.0f, false, true, -72.0f, -72.0f)
                curveToRelative(0.0f, -22.0f, 8.09f, -44.79f, 24.06f, -67.84f)
                lineToRelative(26.37f, 25.58f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 13.09f, -3.0f)
                lineToRelative(22.27f, -61.07f)
                curveTo(164.21f, 58.08f, 200.0f, 97.91f, 200.0f, 144.0f)
                arcTo(72.08f, 72.08f, 0.0f, false, true, 128.0f, 216.0f)
                close()
            }
        }
        .build()
        return _fireSimple!!
    }

private var _fireSimple: ImageVector? = null
