package com.adamglin.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.FillGroup

public val FillGroup.ArrowFatLineDown: ImageVector
    get() {
        if (_arrowFatLineDown != null) {
            return _arrowFatLineDown!!
        }
        _arrowFatLineDown = Builder(name = "ArrowFatLineDown", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(72.0f, 40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                lineTo(80.0f, 48.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 72.0f, 40.0f)
                close()
                moveTo(231.39f, 132.94f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 224.0f, 128.0f)
                lineTo(184.0f, 128.0f)
                lineTo(184.0f, 72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, -8.0f)
                lineTo(80.0f, 64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineToRelative(56.0f)
                lineTo(32.0f, 128.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -5.66f, 13.66f)
                lineToRelative(96.0f, 96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.32f, 0.0f)
                lineToRelative(96.0f, -96.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 231.39f, 132.94f)
                close()
            }
        }
        .build()
        return _arrowFatLineDown!!
    }

private var _arrowFatLineDown: ImageVector? = null
