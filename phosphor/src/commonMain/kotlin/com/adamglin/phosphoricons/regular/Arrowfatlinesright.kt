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

public val RegularGroup.ArrowFatLinesRight: ImageVector
    get() {
        if (_arrowFatLinesRight != null) {
            return _arrowFatLinesRight!!
        }
        _arrowFatLinesRight = Builder(name = "ArrowFatLinesRight", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(237.66f, 122.34f)
                lineToRelative(-96.0f, -96.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 128.0f, 32.0f)
                lineTo(128.0f, 72.0f)
                lineTo(104.0f, 72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineToRelative(96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 13.66f, 5.66f)
                lineToRelative(96.0f, -96.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 237.66f, 122.34f)
                close()
                moveTo(144.0f, 204.69f)
                lineTo(144.0f, 176.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, -8.0f)
                lineTo(112.0f, 168.0f)
                lineTo(112.0f, 88.0f)
                horizontalLineToRelative(24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f)
                lineTo(144.0f, 51.31f)
                lineTo(220.69f, 128.0f)
                close()
                moveTo(48.0f, 80.0f)
                verticalLineToRelative(96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(32.0f, 80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                close()
                moveTo(80.0f, 80.0f)
                verticalLineToRelative(96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(64.0f, 80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                close()
            }
        }
        .build()
        return _arrowFatLinesRight!!
    }

private var _arrowFatLinesRight: ImageVector? = null
