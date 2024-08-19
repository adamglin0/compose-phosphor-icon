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

public val RegularGroup.Numbertwo: ImageVector
    get() {
        if (_numbertwo != null) {
            return _numbertwo!!
        }
        _numbertwo = Builder(name = "Numbertwo", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(176.0f, 208.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                horizontalLineTo(88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -6.4f, -12.8f)
                lineToRelative(71.94f, -95.92f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, -51.1f, -38.53f)
                arcToRelative(32.5f, 32.5f, 0.0f, false, false, -3.78f, 6.46f)
                arcTo(8.0f, 8.0f, 0.0f, true, true, 84.0f, 68.8f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, true, 82.33f, 48.09f)
                lineTo(104.0f, 200.0f)
                horizontalLineToRelative(64.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 176.0f, 208.0f)
                close()
            }
        }
        .build()
        return _numbertwo!!
    }

private var _numbertwo: ImageVector? = null
