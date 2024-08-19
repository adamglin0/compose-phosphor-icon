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

public val FillGroup.Users: ImageVector
    get() {
        if (_users != null) {
            return _users!!
        }
        _users = Builder(name = "Users", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(164.47f, 195.63f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -6.7f, 12.37f)
                lineTo(10.23f, 208.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -6.7f, -12.37f)
                arcToRelative(95.83f, 95.83f, 0.0f, false, true, 47.22f, -37.71f)
                arcToRelative(60.0f, 60.0f, 0.0f, true, true, 66.5f, 0.0f)
                arcTo(95.83f, 95.83f, 0.0f, false, true, 164.47f, 195.63f)
                close()
                moveTo(252.38f, 195.48f)
                arcToRelative(95.87f, 95.87f, 0.0f, false, false, -47.13f, -37.56f)
                arcTo(60.0f, 60.0f, 0.0f, false, false, 144.7f, 54.59f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -1.33f, 6.0f)
                arcTo(75.83f, 75.83f, 0.0f, false, true, 147.0f, 150.53f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 1.07f, 5.53f)
                arcToRelative(112.32f, 112.32f, 0.0f, false, true, 29.85f, 30.83f)
                arcToRelative(23.92f, 23.92f, 0.0f, false, true, 3.65f, 16.47f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.95f, 4.64f)
                horizontalLineToRelative(60.3f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 7.73f, -5.93f)
                arcTo(8.22f, 8.22f, 0.0f, false, false, 252.38f, 195.48f)
                close()
            }
        }
        .build()
        return _users!!
    }

private var _users: ImageVector? = null
