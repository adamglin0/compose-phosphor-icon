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

public val RegularGroup.Keyhole: ImageVector
    get() {
        if (_keyhole != null) {
            return _keyhole!!
        }
        _keyhole = Builder(name = "Keyhole", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 24.0f)
                arcTo(104.0f, 104.0f, 0.0f, true, false, 232.0f, 128.0f)
                arcTo(104.11f, 104.11f, 0.0f, false, false, 128.0f, 24.0f)
                close()
                moveTo(128.0f, 216.0f)
                arcToRelative(88.0f, 88.0f, 0.0f, true, true, 88.0f, -88.0f)
                arcTo(88.1f, 88.1f, 0.0f, false, true, 128.0f, 216.0f)
                close()
                moveTo(168.0f, 112.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, false, -65.94f, 30.44f)
                lineTo(88.68f, 172.77f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 96.0f, 184.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 7.32f, -11.23f)
                lineToRelative(-13.38f, -30.33f)
                arcTo(40.14f, 40.14f, 0.0f, false, false, 168.0f, 112.0f)
                close()
                moveTo(136.68f, 143.0f)
                lineToRelative(11.0f, 25.05f)
                lineTo(108.27f, 168.05f)
                lineToRelative(11.0f, -25.05f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 116.0f, 132.79f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, 24.0f, 0.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 136.68f, 143.0f)
                close()
            }
        }
        .build()
        return _keyhole!!
    }

private var _keyhole: ImageVector? = null
