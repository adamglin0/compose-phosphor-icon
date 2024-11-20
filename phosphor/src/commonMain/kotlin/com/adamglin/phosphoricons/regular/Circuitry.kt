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

public val RegularGroup.Circuitry: ImageVector
    get() {
        if (_circuitry != null) {
            return _circuitry!!
        }
        _circuitry = Builder(name = "Circuitry", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 32.0f)
                horizontalLineTo(48.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 32.0f, 48.0f)
                verticalLineTo(208.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineTo(208.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                verticalLineTo(48.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 208.0f, 32.0f)
                close()
                moveTo(88.0f, 160.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -8.0f, 8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 88.0f, 160.0f)
                close()
                moveTo(48.0f, 48.0f)
                horizontalLineTo(80.0f)
                verticalLineToRelative(97.38f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, false, 16.0f, 0.0f)
                verticalLineTo(115.31f)
                lineToRelative(48.0f, 48.0f)
                verticalLineTo(208.0f)
                horizontalLineTo(48.0f)
                close()
                moveTo(208.0f, 208.0f)
                horizontalLineTo(160.0f)
                verticalLineTo(160.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -2.34f, -5.66f)
                lineTo(96.0f, 92.69f)
                verticalLineTo(48.0f)
                horizontalLineToRelative(32.0f)
                verticalLineTo(72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 2.34f, 5.66f)
                lineToRelative(16.0f, 16.0f)
                arcTo(23.74f, 23.74f, 0.0f, false, false, 144.0f, 104.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, false, 24.0f, -24.0f)
                arcToRelative(23.74f, 23.74f, 0.0f, false, false, -10.34f, 2.35f)
                lineTo(144.0f, 68.69f)
                verticalLineTo(48.0f)
                horizontalLineToRelative(64.0f)
                verticalLineTo(208.0f)
                close()
                moveTo(168.0f, 96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -8.0f, 8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 168.0f, 96.0f)
                close()
            }
        }
        .build()
        return _circuitry!!
    }

private var _circuitry: ImageVector? = null
