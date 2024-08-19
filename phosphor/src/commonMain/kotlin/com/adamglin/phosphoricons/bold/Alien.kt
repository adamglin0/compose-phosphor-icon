package com.adamglin.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.BoldGroup

public val BoldGroup.Alien: ImageVector
    get() {
        if (_alien != null) {
            return _alien!!
        }
        _alien = Builder(name = "Alien", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 12.0f)
                arcTo(100.11f, 100.11f, 0.0f, false, false, 28.0f, 112.0f)
                curveToRelative(0.0f, 24.86f, 12.86f, 56.8f, 34.41f, 85.44f)
                curveTo(70.63f, 208.36f, 99.64f, 244.0f, 128.0f, 244.0f)
                reflectiveCurveToRelative(57.37f, -35.64f, 65.59f, -46.56f)
                curveTo(215.14f, 168.8f, 228.0f, 136.86f, 228.0f, 112.0f)
                arcTo(100.11f, 100.11f, 0.0f, false, false, 128.0f, 12.0f)
                close()
                moveTo(174.41f, 183.0f)
                curveToRelative(-13.83f, 18.38f, -34.21f, 37.0f, -46.41f, 37.0f)
                reflectiveCurveToRelative(-32.58f, -18.61f, -46.41f, -37.0f)
                curveTo(63.34f, 158.75f, 52.0f, 131.54f, 52.0f, 112.0f)
                arcToRelative(76.0f, 76.0f, 0.0f, false, true, 152.0f, 0.0f)
                curveTo(204.0f, 131.54f, 192.66f, 158.75f, 174.41f, 183.0f)
                close()
                moveTo(104.0f, 148.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, true, -36.0f, -36.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, -12.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, true, 36.0f, 36.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 104.0f, 148.0f)
                close()
                moveTo(188.0f, 112.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, true, -36.0f, 36.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, -12.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, true, 36.0f, -36.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 188.0f, 112.0f)
                close()
                moveTo(152.0f, 184.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                lineTo(116.0f, 196.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                horizontalLineToRelative(24.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 152.0f, 184.0f)
                close()
            }
        }
        .build()
        return _alien!!
    }

private var _alien: ImageVector? = null
