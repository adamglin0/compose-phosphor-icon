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

public val ThinGroup.Notches: ImageVector
    get() {
        if (_notches != null) {
            return _notches!!
        }
        _notches = Builder(name = "Notches", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(210.83f, 130.83f)
                lineToRelative(-80.0f, 80.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, -5.66f, -5.66f)
                lineToRelative(80.0f, -80.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 5.66f, 5.66f)
                close()
                moveTo(194.83f, 37.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.66f, 0.0f)
                lineToRelative(-152.0f, 152.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.66f, 5.66f)
                lineToRelative(152.0f, -152.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 194.83f, 37.17f)
                close()
            }
        }
        .build()
        return _notches!!
    }

private var _notches: ImageVector? = null
