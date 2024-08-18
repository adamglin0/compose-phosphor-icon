package com.adamglin.phosphor.phosphoricon.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphor.phosphoricon.RegularGroup

public val RegularGroup.Percent: ImageVector
    get() {
        if (_percent != null) {
            return _percent!!
        }
        _percent = Builder(name = "Percent", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(205.66f, 61.64f)
                lineToRelative(-144.0f, 144.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, -11.32f)
                lineToRelative(144.0f, -144.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, 11.31f)
                close()
                moveTo(50.54f, 101.44f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, true, 50.92f, -50.91f)
                horizontalLineToRelative(0.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, true, -50.92f, 50.91f)
                close()
                moveTo(56.0f, 76.0f)
                arcTo(20.0f, 20.0f, 0.0f, true, false, 90.14f, 61.84f)
                horizontalLineToRelative(0.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 56.0f, 76.0f)
                close()
                moveTo(216.0f, 180.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, true, -10.54f, -25.46f)
                horizontalLineToRelative(0.0f)
                arcTo(35.76f, 35.76f, 0.0f, false, true, 216.0f, 180.0f)
                close()
                moveTo(200.0f, 180.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, false, -5.86f, 14.14f)
                arcTo(19.87f, 19.87f, 0.0f, false, false, 200.0f, 180.0f)
                close()
            }
        }
        .build()
        return _percent!!
    }

private var _percent: ImageVector? = null
