package com.adamglin.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.RegularGroup

public val RegularGroup.Target: ImageVector
    get() {
        if (_target != null) {
            return _target!!
        }
        _target = Builder(name = "Target", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(221.87f, 83.16f)
                arcTo(104.1f, 104.1f, 0.0f, true, true, 195.67f, 49.0f)
                lineToRelative(22.67f, -22.68f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, 11.32f)
                lineToRelative(-96.0f, 96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, -11.32f)
                lineToRelative(27.72f, -27.72f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, false, 17.87f, 31.09f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 16.0f, -0.9f)
                arcToRelative(56.0f, 56.0f, 0.0f, true, true, -22.38f, -41.65f)
                lineTo(184.3f, 60.39f)
                arcToRelative(87.88f, 87.88f, 0.0f, true, false, 23.13f, 29.67f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 14.44f, -6.9f)
                close()
            }
        }
        .build()
        return _target!!
    }

private var _target: ImageVector? = null
