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

public val ThinGroup.Greaterthan: ImageVector
    get() {
        if (_greaterthan != null) {
            return _greaterthan!!
        }
        _greaterthan = Builder(name = "Greaterthan", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(220.0f, 128.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -2.29f, 3.62f)
                lineToRelative(-152.0f, 72.0f)
                arcTo(3.85f, 3.85f, 0.0f, false, true, 64.0f, 204.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -1.71f, -7.62f)
                lineTo(206.66f, 128.0f)
                lineTo(62.29f, 59.62f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 3.42f, -7.23f)
                lineToRelative(152.0f, 72.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 220.0f, 128.0f)
                close()
            }
        }
        .build()
        return _greaterthan!!
    }

private var _greaterthan: ImageVector? = null
