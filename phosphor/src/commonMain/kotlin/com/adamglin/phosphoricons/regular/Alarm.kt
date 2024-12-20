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

public val RegularGroup.Alarm: ImageVector
    get() {
        if (_alarm != null) {
            return _alarm!!
        }
        _alarm = Builder(name = "Alarm", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 40.0f)
                arcToRelative(96.0f, 96.0f, 0.0f, true, false, 96.0f, 96.0f)
                arcTo(96.11f, 96.11f, 0.0f, false, false, 128.0f, 40.0f)
                close()
                moveTo(128.0f, 216.0f)
                arcToRelative(80.0f, 80.0f, 0.0f, true, true, 80.0f, -80.0f)
                arcTo(80.09f, 80.09f, 0.0f, false, true, 128.0f, 216.0f)
                close()
                moveTo(61.66f, 37.66f)
                lineToRelative(-32.0f, 32.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 18.34f, 58.34f)
                lineToRelative(32.0f, -32.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 61.66f, 37.66f)
                close()
                moveTo(237.66f, 69.66f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, 0.0f)
                lineToRelative(-32.0f, -32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, -11.32f)
                lineToRelative(32.0f, 32.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 237.66f, 69.66f)
                close()
                moveTo(184.0f, 128.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                lineTo(128.0f, 144.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f)
                lineTo(120.0f, 80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                verticalLineToRelative(48.0f)
                close()
            }
        }
        .build()
        return _alarm!!
    }

private var _alarm: ImageVector? = null
