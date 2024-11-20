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

public val RegularGroup.Acorn: ImageVector
    get() {
        if (_acorn != null) {
            return _acorn!!
        }
        _acorn = Builder(name = "Acorn", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.0f, 104.0f)
                arcToRelative(56.06f, 56.06f, 0.0f, false, false, -56.0f, -56.0f)
                lineTo(136.0f, 48.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, 24.0f, -24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, -40.0f, 40.0f)
                lineTo(80.0f, 48.0f)
                arcToRelative(56.06f, 56.06f, 0.0f, false, false, -56.0f, 56.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 8.0f, 13.83f)
                lineTo(32.0f, 128.0f)
                curveToRelative(0.0f, 35.53f, 33.12f, 62.12f, 59.74f, 83.49f)
                curveTo(103.66f, 221.07f, 120.0f, 234.18f, 120.0f, 240.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                curveToRelative(0.0f, -5.82f, 16.34f, -18.93f, 28.26f, -28.51f)
                curveTo(190.88f, 190.12f, 224.0f, 163.53f, 224.0f, 128.0f)
                lineTo(224.0f, 117.83f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 232.0f, 104.0f)
                close()
                moveTo(80.0f, 64.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(40.06f, 40.06f, 0.0f, false, true, 40.0f, 40.0f)
                lineTo(40.0f, 104.0f)
                arcTo(40.0f, 40.0f, 0.0f, false, true, 80.0f, 64.0f)
                close()
                moveTo(154.25f, 199.0f)
                curveToRelative(-10.62f, 8.52f, -20.0f, 16.0f, -26.25f, 23.37f)
                curveToRelative(-6.25f, -7.32f, -15.63f, -14.85f, -26.25f, -23.37f)
                curveTo(77.8f, 179.79f, 48.0f, 155.86f, 48.0f, 128.0f)
                verticalLineToRelative(-8.0f)
                lineTo(208.0f, 120.0f)
                verticalLineToRelative(8.0f)
                curveTo(208.0f, 155.86f, 178.2f, 179.79f, 154.25f, 199.0f)
                close()
            }
        }
        .build()
        return _acorn!!
    }

private var _acorn: ImageVector? = null
