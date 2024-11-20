package com.adamglin.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.LightGroup

public val LightGroup.Numpad: ImageVector
    get() {
        if (_numpad != null) {
            return _numpad!!
        }
        _numpad = Builder(name = "Numpad", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(78.0f, 48.0f)
                arcTo(14.0f, 14.0f, 0.0f, true, true, 64.0f, 34.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 78.0f, 48.0f)
                close()
                moveTo(128.0f, 34.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, true, false, 14.0f, 14.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 128.0f, 34.0f)
                close()
                moveTo(192.0f, 62.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, true, false, -14.0f, -14.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 192.0f, 62.0f)
                close()
                moveTo(64.0f, 90.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, true, false, 14.0f, 14.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 64.0f, 90.0f)
                close()
                moveTo(128.0f, 90.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, true, false, 14.0f, 14.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 128.0f, 90.0f)
                close()
                moveTo(192.0f, 90.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, true, false, 14.0f, 14.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 192.0f, 90.0f)
                close()
                moveTo(64.0f, 146.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, true, false, 14.0f, 14.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 64.0f, 146.0f)
                close()
                moveTo(128.0f, 146.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, true, false, 14.0f, 14.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 128.0f, 146.0f)
                close()
                moveTo(128.0f, 202.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, true, false, 14.0f, 14.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 128.0f, 202.0f)
                close()
                moveTo(192.0f, 146.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, true, false, 14.0f, 14.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 192.0f, 146.0f)
                close()
            }
        }
        .build()
        return _numpad!!
    }

private var _numpad: ImageVector? = null
