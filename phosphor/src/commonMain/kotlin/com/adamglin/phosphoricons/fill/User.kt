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

public val FillGroup.User: ImageVector
    get() {
        if (_user != null) {
            return _user!!
        }
        _user = Builder(name = "User", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(230.93f, 220.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -6.93f, 4.0f)
                horizontalLineTo(32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -6.92f, -12.0f)
                curveToRelative(15.23f, -26.33f, 38.7f, -45.21f, 66.09f, -54.16f)
                arcToRelative(72.0f, 72.0f, 0.0f, true, true, 73.66f, 0.0f)
                curveToRelative(27.39f, 8.95f, 50.86f, 27.83f, 66.09f, 54.16f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 230.93f, 220.0f)
                close()
            }
        }
        .build()
        return _user!!
    }

private var _user: ImageVector? = null
