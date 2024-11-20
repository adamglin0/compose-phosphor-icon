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

public val RegularGroup.Fan: ImageVector
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
                moveTo(112.0f, 128.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, 16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 112.0f, 128.0f)
                close()
                moveTo(80.0f, 76.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, true, 62.75f, -39.82f)
                lineTo(127.77f, 96.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 99.85f, 112.8f)
                arcTo(43.85f, 43.85f, 0.0f, false, true, 80.0f, 76.0f)
                close()
                moveTo(107.0f, 195.57f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, true, -65.86f, -34.43f)
                lineToRelative(59.31f, -16.94f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 128.0f, 160.0f)
                lineToRelative(0.91f, 0.0f)
                arcTo(43.82f, 43.82f, 0.0f, false, true, 107.0f, 195.57f)
                close()
                moveTo(213.17f, 172.57f)
                arcToRelative(43.92f, 43.92f, 0.0f, false, true, -13.0f, 14.14f)
                lineToRelative(-44.32f, -42.89f)
                arcToRelative(31.91f, 31.91f, 0.0f, false, false, -0.59f, -32.57f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, true, 57.91f, 61.32f)
                close()
            }
        }
        .build()
        return _fan!!
    }

private var _fan: ImageVector? = null
