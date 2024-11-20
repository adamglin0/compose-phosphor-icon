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

public val ThinGroup.Alien: ImageVector
    get() {
        if (_alien != null) {
            return _alien!!
        }
        _alien = Builder(name = "Alien", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 20.0f)
                arcToRelative(92.1f, 92.1f, 0.0f, false, false, -92.0f, 92.0f)
                curveToRelative(0.0f, 23.19f, 12.26f, 53.33f, 32.8f, 80.63f)
                curveTo(84.58f, 213.6f, 108.41f, 236.0f, 128.0f, 236.0f)
                reflectiveCurveToRelative(43.42f, -22.4f, 59.2f, -43.37f)
                curveTo(207.74f, 165.33f, 220.0f, 135.19f, 220.0f, 112.0f)
                arcTo(92.1f, 92.1f, 0.0f, false, false, 128.0f, 20.0f)
                close()
                moveTo(180.8f, 187.82f)
                curveTo(162.44f, 212.23f, 141.71f, 228.0f, 128.0f, 228.0f)
                reflectiveCurveToRelative(-34.44f, -15.77f, -52.8f, -40.18f)
                curveTo(56.0f, 162.24f, 44.0f, 133.19f, 44.0f, 112.0f)
                arcToRelative(84.0f, 84.0f, 0.0f, false, true, 168.0f, 0.0f)
                curveTo(212.0f, 133.19f, 200.05f, 162.24f, 180.8f, 187.82f)
                close()
                moveTo(116.0f, 136.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, -36.0f, -36.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, 36.0f, 36.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 116.0f, 136.0f)
                close()
                moveTo(104.0f, 140.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, -28.0f, -28.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, 28.0f, 28.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 104.0f, 140.0f)
                close()
                moveTo(176.0f, 100.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, -36.0f, 36.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, 36.0f, -36.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 176.0f, 100.0f)
                close()
                moveTo(152.0f, 140.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, 28.0f, -28.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, true, 152.0f, 140.0f)
                close()
                moveTo(148.0f, 184.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(112.0f, 188.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                horizontalLineToRelative(32.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 148.0f, 184.0f)
                close()
            }
        }
        .build()
        return _alien!!
    }

private var _alien: ImageVector? = null
