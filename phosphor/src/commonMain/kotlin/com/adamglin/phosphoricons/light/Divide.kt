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

public val LightGroup.Divide: ImageVector
    get() {
        if (_divide != null) {
            return _divide!!
        }
        _divide = Builder(name = "Divide", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(222.0f, 128.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                lineTo(40.0f, 134.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                lineTo(216.0f, 122.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 222.0f, 128.0f)
                close()
                moveTo(128.0f, 78.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, true, false, -14.0f, -14.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 128.0f, 78.0f)
                close()
                moveTo(128.0f, 178.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, true, false, 14.0f, 14.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 128.0f, 178.0f)
                close()
            }
        }
        .build()
        return _divide!!
    }

private var _divide: ImageVector? = null
