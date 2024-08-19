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

public val RegularGroup.Compass: ImageVector
    get() {
        if (_compass != null) {
            return _compass!!
        }
        _compass = Builder(name = "Compass", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
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
                moveTo(172.42f, 72.84f)
                lineToRelative(-64.0f, 32.0f)
                arcToRelative(8.05f, 8.05f, 0.0f, false, false, -3.58f, 3.58f)
                lineToRelative(-32.0f, 64.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 80.0f, 184.0f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, 3.58f, -0.84f)
                lineToRelative(64.0f, -32.0f)
                arcToRelative(8.05f, 8.05f, 0.0f, false, false, 3.58f, -3.58f)
                lineToRelative(32.0f, -64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -10.74f, -10.74f)
                close()
                moveTo(138.0f, 138.0f)
                lineTo(97.89f, 158.11f)
                lineTo(118.0f, 118.0f)
                lineToRelative(40.15f, -20.07f)
                close()
            }
        }
        .build()
        return _compass!!
    }

private var _compass: ImageVector? = null
