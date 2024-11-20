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

public val ThinGroup.LessThan: ImageVector
    get() {
        if (_lessThan != null) {
            return _lessThan!!
        }
        _lessThan = Builder(name = "LessThan", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(203.61f, 201.71f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 200.0f, 204.0f)
                arcToRelative(3.85f, 3.85f, 0.0f, false, true, -1.71f, -0.39f)
                lineToRelative(-152.0f, -72.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -7.23f)
                lineToRelative(152.0f, -72.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 3.42f, 7.23f)
                lineTo(57.34f, 128.0f)
                lineToRelative(144.37f, 68.38f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 203.61f, 201.71f)
                close()
            }
        }
        .build()
        return _lessThan!!
    }

private var _lessThan: ImageVector? = null
