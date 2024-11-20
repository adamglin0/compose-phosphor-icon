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

public val RegularGroup.GasCan: ImageVector
    get() {
        if (_gasCan != null) {
            return _gasCan!!
        }
        _gasCan = Builder(name = "GasCan", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(200.0f, 24.0f)
                lineTo(123.31f, 24.0f)
                arcTo(15.86f, 15.86f, 0.0f, false, false, 112.0f, 28.69f)
                lineTo(101.66f, 39.0f)
                lineTo(91.31f, 28.69f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -22.62f, 0.0f)
                lineToRelative(-24.0f, 24.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 0.0f, 22.62f)
                lineTo(55.0f, 85.66f)
                lineTo(44.69f, 96.0f)
                arcTo(15.86f, 15.86f, 0.0f, false, false, 40.0f, 107.31f)
                lineTo(40.0f, 216.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                lineTo(200.0f, 232.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(216.0f, 40.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 200.0f, 24.0f)
                close()
                moveTo(56.0f, 64.0f)
                lineTo(80.0f, 40.0f)
                lineTo(90.34f, 50.34f)
                lineToRelative(-24.0f, 24.0f)
                close()
                moveTo(200.0f, 216.0f)
                lineTo(56.0f, 216.0f)
                lineTo(56.0f, 107.31f)
                lineToRelative(16.0f, -16.0f)
                horizontalLineToRelative(0.0f)
                lineTo(123.31f, 40.0f)
                lineTo(200.0f, 40.0f)
                close()
                moveTo(128.0f, 64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                horizontalLineToRelative(40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                lineTo(136.0f, 72.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 128.0f, 64.0f)
                close()
                moveTo(180.8f, 126.4f)
                lineTo(141.33f, 156.0f)
                lineToRelative(39.47f, 29.6f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -9.6f, 12.8f)
                lineTo(128.0f, 166.0f)
                lineTo(84.8f, 198.4f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -9.6f, -12.8f)
                lineTo(114.67f, 156.0f)
                lineTo(75.2f, 126.4f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 9.6f, -12.8f)
                lineTo(128.0f, 146.0f)
                lineToRelative(43.2f, -32.4f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 9.6f, 12.8f)
                close()
            }
        }
        .build()
        return _gasCan!!
    }

private var _gasCan: ImageVector? = null
