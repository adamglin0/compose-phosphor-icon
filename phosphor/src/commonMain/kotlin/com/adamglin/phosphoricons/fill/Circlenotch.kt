package com.adamglin.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.FillGroup

public val FillGroup.CircleNotch: ImageVector
    get() {
        if (_circleNotch != null) {
            return _circleNotch!!
        }
        _circleNotch = Builder(name = "CircleNotch", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 24.0f)
                arcTo(104.0f, 104.0f, 0.0f, true, false, 232.0f, 128.0f)
                arcTo(104.11f, 104.11f, 0.0f, false, false, 128.0f, 24.0f)
                close()
                moveTo(128.0f, 200.0f)
                arcTo(72.0f, 72.0f, 0.0f, false, true, 92.0f, 65.64f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, 13.85f)
                arcToRelative(56.0f, 56.0f, 0.0f, true, false, 56.0f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -13.85f)
                arcTo(72.0f, 72.0f, 0.0f, false, true, 128.0f, 200.0f)
                close()
            }
        }
        .build()
        return _circleNotch!!
    }

private var _circleNotch: ImageVector? = null
