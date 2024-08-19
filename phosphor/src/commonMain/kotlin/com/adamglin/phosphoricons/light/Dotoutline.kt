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

public val LightGroup.Dotoutline: ImageVector
    get() {
        if (_dotoutline != null) {
            return _dotoutline!!
        }
        _dotoutline = Builder(name = "Dotoutline", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 98.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, true, false, 30.0f, 30.0f)
                arcTo(30.0f, 30.0f, 0.0f, false, false, 128.0f, 98.0f)
                close()
                moveTo(128.0f, 146.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, true, true, 18.0f, -18.0f)
                arcTo(18.0f, 18.0f, 0.0f, false, true, 128.0f, 146.0f)
                close()
            }
        }
        .build()
        return _dotoutline!!
    }

private var _dotoutline: ImageVector? = null
