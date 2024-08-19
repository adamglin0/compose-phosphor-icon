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

public val LightGroup.Codesimple: ImageVector
    get() {
        if (_codesimple != null) {
            return _codesimple!!
        }
        _codesimple = Builder(name = "Codesimple", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(92.0f, 68.49f)
                lineTo(25.0f, 128.0f)
                lineToRelative(67.0f, 59.52f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, -8.0f, 9.0f)
                lineToRelative(-72.0f, -64.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -9.0f)
                lineToRelative(72.0f, -64.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 8.0f, 9.0f)
                close()
                moveTo(244.0f, 123.49f)
                lineTo(172.0f, 59.49f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -8.0f, 9.0f)
                lineTo(231.0f, 128.0f)
                lineToRelative(-67.0f, 59.52f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, 8.0f, 9.0f)
                lineToRelative(72.0f, -64.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -9.0f)
                close()
            }
        }
        .build()
        return _codesimple!!
    }

private var _codesimple: ImageVector? = null
