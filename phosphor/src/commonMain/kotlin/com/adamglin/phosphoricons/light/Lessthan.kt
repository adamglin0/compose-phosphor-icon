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

public val LightGroup.LessThan: ImageVector
    get() {
        if (_lessThan != null) {
            return _lessThan!!
        }
        _lessThan = Builder(name = "LessThan", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(205.42f, 202.57f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -8.0f, 2.85f)
                lineToRelative(-152.0f, -72.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -10.84f)
                lineToRelative(152.0f, -72.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 5.14f, 10.84f)
                lineTo(62.0f, 128.0f)
                lineToRelative(140.55f, 66.58f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 205.42f, 202.57f)
                close()
            }
        }
        .build()
        return _lessThan!!
    }

private var _lessThan: ImageVector? = null
