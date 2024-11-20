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

public val RegularGroup.Alien: ImageVector
    get() {
        if (_alien != null) {
            return _alien!!
        }
        _alien = Builder(name = "Alien", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 16.0f)
                arcToRelative(96.11f, 96.11f, 0.0f, false, false, -96.0f, 96.0f)
                curveToRelative(0.0f, 24.0f, 12.56f, 55.06f, 33.61f, 83.0f)
                curveToRelative(21.18f, 28.15f, 44.5f, 45.0f, 62.39f, 45.0f)
                reflectiveCurveToRelative(41.21f, -16.81f, 62.39f, -45.0f)
                curveToRelative(21.05f, -28.0f, 33.61f, -59.0f, 33.61f, -83.0f)
                arcTo(96.11f, 96.11f, 0.0f, false, false, 128.0f, 16.0f)
                close()
                moveTo(177.61f, 185.42f)
                curveTo(160.24f, 208.49f, 140.31f, 224.0f, 128.0f, 224.0f)
                reflectiveCurveToRelative(-32.24f, -15.51f, -49.61f, -38.58f)
                curveTo(59.65f, 160.5f, 48.0f, 132.37f, 48.0f, 112.0f)
                arcToRelative(80.0f, 80.0f, 0.0f, false, true, 160.0f, 0.0f)
                curveTo(208.0f, 132.37f, 196.35f, 160.5f, 177.61f, 185.42f)
                close()
                moveTo(120.0f, 136.0f)
                arcTo(40.0f, 40.0f, 0.0f, false, false, 80.0f, 96.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, 16.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, 40.0f, 40.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 120.0f, 136.0f)
                close()
                moveTo(80.0f, 112.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, 24.0f, 24.0f)
                horizontalLineToRelative(0.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 80.0f, 112.0f)
                close()
                moveTo(176.0f, 96.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, -40.0f, 40.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, 40.0f, -40.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 176.0f, 96.0f)
                close()
                moveTo(152.0f, 136.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, 24.0f, -24.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 152.0f, 136.0f)
                close()
                moveTo(152.0f, 184.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                lineTo(112.0f, 192.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(32.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 152.0f, 184.0f)
                close()
            }
        }
        .build()
        return _alien!!
    }

private var _alien: ImageVector? = null
