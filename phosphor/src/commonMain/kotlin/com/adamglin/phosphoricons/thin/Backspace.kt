package com.adamglin.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.ThinGroup

public val ThinGroup.Backspace: ImageVector
    get() {
        if (_backspace != null) {
            return _backspace!!
        }
        _backspace = Builder(name = "Backspace", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 44.0f)
                lineTo(68.53f, 44.0f)
                arcToRelative(12.06f, 12.06f, 0.0f, false, false, -10.29f, 5.83f)
                lineTo(12.57f, 125.94f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 4.12f)
                lineToRelative(45.67f, 76.11f)
                arcTo(12.06f, 12.06f, 0.0f, false, false, 68.53f, 212.0f)
                lineTo(216.0f, 212.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(228.0f, 56.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 216.0f, 44.0f)
                close()
                moveTo(220.0f, 200.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(68.53f, 204.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.43f, -1.94f)
                lineTo(20.67f, 128.0f)
                lineTo(65.1f, 53.94f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 68.53f, 52.0f)
                lineTo(216.0f, 52.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                close()
                moveTo(162.83f, 106.83f)
                lineTo(141.66f, 128.0f)
                lineToRelative(21.17f, 21.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.66f, 5.66f)
                lineTo(136.0f, 133.66f)
                lineToRelative(-21.17f, 21.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.66f, -5.66f)
                lineTo(130.34f, 128.0f)
                lineToRelative(-21.17f, -21.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.66f, -5.66f)
                lineTo(136.0f, 122.34f)
                lineToRelative(21.17f, -21.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 5.66f, 5.66f)
                close()
            }
        }
        .build()
        return _backspace!!
    }

private var _backspace: ImageVector? = null
