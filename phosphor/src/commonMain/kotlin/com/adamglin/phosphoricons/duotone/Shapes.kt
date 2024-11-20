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

public val DuotoneGroup.Shapes: ImageVector
    get() {
        if (_shapes != null) {
            return _shapes!!
        }
        _shapes = Builder(name = "Shapes", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(64.0f, 64.0f)
                lineToRelative(40.0f, 120.0f)
                lineTo(24.0f, 184.0f)
                close()
                moveTo(200.0f, 76.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, true, false, -44.0f, 44.0f)
                arcTo(44.0f, 44.0f, 0.0f, false, false, 200.0f, 76.0f)
                close()
                moveTo(136.0f, 152.0f)
                verticalLineToRelative(56.0f)
                horizontalLineToRelative(88.0f)
                lineTo(224.0f, 152.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 144.0f)
                lineTo(136.0f, 144.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineToRelative(56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f)
                horizontalLineToRelative(88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f)
                lineTo(232.0f, 152.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 224.0f, 144.0f)
                close()
                moveTo(216.0f, 200.0f)
                lineTo(144.0f, 200.0f)
                lineTo(144.0f, 160.0f)
                horizontalLineToRelative(72.0f)
                close()
                moveTo(71.59f, 61.47f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -15.18f, 0.0f)
                lineToRelative(-40.0f, 120.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 24.0f, 192.0f)
                horizontalLineToRelative(80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 7.59f, -10.53f)
                close()
                moveTo(35.1f, 176.0f)
                lineTo(64.0f, 89.3f)
                lineTo(92.9f, 176.0f)
                close()
                moveTo(208.0f, 76.0f)
                arcToRelative(52.0f, 52.0f, 0.0f, true, false, -52.0f, 52.0f)
                arcTo(52.06f, 52.06f, 0.0f, false, false, 208.0f, 76.0f)
                close()
                moveTo(120.0f, 76.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, true, 36.0f, 36.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, true, 120.0f, 76.0f)
                close()
            }
        }
        .build()
        return _shapes!!
    }

private var _shapes: ImageVector? = null
