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

public val FillGroup.Heartstraightbreak: ImageVector
    get() {
        if (_heartstraightbreak != null) {
            return _heartstraightbreak!!
        }
        _heartstraightbreak = Builder(name = "Heartstraightbreak", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(113.29f, 55.31f)
                arcTo(58.0f, 58.0f, 0.0f, false, false, 32.93f, 139.0f)
                lineToRelative(89.37f, 90.66f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.4f, 0.0f)
                lineTo(223.0f, 139.0f)
                arcToRelative(58.0f, 58.0f, 0.0f, false, false, -82.0f, -82.1f)
                horizontalLineToRelative(0.0f)
                lineToRelative(-24.4f, 23.0f)
                lineTo(143.0f, 106.32f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 11.32f)
                lineToRelative(-20.69f, 20.69f)
                arcTo(8.0f, 8.0f, 0.0f, true, true, 111.0f, 127.0f)
                lineToRelative(15.0f, -15.0f)
                lineTo(99.5f, 85.42f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.22f, -11.53f)
                lineToRelative(13.55f, -12.78f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -5.8f)
                close()
            }
        }
        .build()
        return _heartstraightbreak!!
    }

private var _heartstraightbreak: ImageVector? = null
