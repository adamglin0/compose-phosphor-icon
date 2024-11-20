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

public val FillGroup.Fan: ImageVector
    get() {
        if (_fan != null) {
            return _fan!!
        }
        _fan = Builder(name = "Fan", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(233.0f, 135.0f)
                arcToRelative(60.0f, 60.0f, 0.0f, false, false, -89.62f, -35.45f)
                lineToRelative(16.39f, -65.44f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -3.45f, -8.68f)
                arcTo(60.0f, 60.0f, 0.0f, true, false, 95.69f, 128.91f)
                lineTo(30.82f, 147.44f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -5.8f, 7.32f)
                arcToRelative(60.0f, 60.0f, 0.0f, false, false, 44.42f, 60.66f)
                arcToRelative(60.52f, 60.52f, 0.0f, false, false, 15.62f, 2.07f)
                arcToRelative(60.07f, 60.07f, 0.0f, false, false, 59.88f, -62.0f)
                lineToRelative(48.48f, 46.92f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 9.25f, 1.35f)
                arcTo(60.0f, 60.0f, 0.0f, false, false, 233.0f, 135.0f)
                close()
                moveTo(130.44f, 147.85f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, 17.41f, -22.29f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 130.44f, 147.85f)
                close()
            }
        }
        .build()
        return _fan!!
    }

private var _fan: ImageVector? = null
