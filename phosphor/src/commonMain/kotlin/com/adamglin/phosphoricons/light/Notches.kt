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

public val LightGroup.Notches: ImageVector
    get() {
        if (_notches != null) {
            return _notches!!
        }
        _notches = Builder(name = "Notches", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(212.24f, 132.24f)
                lineToRelative(-80.0f, 80.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, -8.48f, -8.48f)
                lineToRelative(80.0f, -80.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, 8.48f, 8.48f)
                close()
                moveTo(196.24f, 35.76f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -8.48f, 0.0f)
                lineToRelative(-152.0f, 152.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, 8.48f, 8.48f)
                lineToRelative(152.0f, -152.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 196.24f, 35.76f)
                close()
            }
        }
        .build()
        return _notches!!
    }

private var _notches: ImageVector? = null
