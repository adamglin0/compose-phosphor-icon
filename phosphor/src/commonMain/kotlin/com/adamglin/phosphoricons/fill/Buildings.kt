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

public val FillGroup.Buildings: ImageVector
    get() {
        if (_buildings != null) {
            return _buildings!!
        }
        _buildings = Builder(name = "Buildings", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(239.73f, 208.0f)
                lineTo(224.0f, 208.0f)
                lineTo(224.0f, 96.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f)
                lineTo(164.0f, 80.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                lineTo(160.0f, 208.0f)
                lineTo(144.0f, 208.0f)
                lineTo(144.0f, 32.41f)
                arcToRelative(16.43f, 16.43f, 0.0f, false, false, -6.16f, -13.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -18.72f, -0.69f)
                lineTo(39.12f, 72.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 32.0f, 85.34f)
                lineTo(32.0f, 208.0f)
                lineTo(16.27f, 208.0f)
                arcTo(8.18f, 8.18f, 0.0f, false, false, 8.0f, 215.47f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 16.0f, 224.0f)
                lineTo(240.0f, 224.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.53f)
                arcTo(8.18f, 8.18f, 0.0f, false, false, 239.73f, 208.0f)
                close()
                moveTo(76.0f, 184.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.53f, 8.0f)
                arcTo(8.18f, 8.18f, 0.0f, false, true, 60.0f, 183.72f)
                lineTo(60.0f, 168.27f)
                arcTo(8.19f, 8.19f, 0.0f, false, true, 67.47f, 160.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 76.0f, 168.0f)
                close()
                moveTo(76.0f, 128.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.53f, 8.0f)
                arcTo(8.19f, 8.19f, 0.0f, false, true, 60.0f, 127.72f)
                lineTo(60.0f, 112.27f)
                arcTo(8.19f, 8.19f, 0.0f, false, true, 67.47f, 104.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 76.0f, 112.0f)
                close()
                moveTo(116.0f, 184.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.53f, 8.0f)
                arcToRelative(8.18f, 8.18f, 0.0f, false, true, -7.47f, -8.26f)
                lineTo(100.0f, 168.27f)
                arcToRelative(8.19f, 8.19f, 0.0f, false, true, 7.47f, -8.26f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.53f, 8.0f)
                close()
                moveTo(116.0f, 128.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.53f, 8.0f)
                arcToRelative(8.19f, 8.19f, 0.0f, false, true, -7.47f, -8.26f)
                lineTo(100.0f, 112.27f)
                arcToRelative(8.19f, 8.19f, 0.0f, false, true, 7.47f, -8.26f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.53f, 8.0f)
                close()
            }
        }
        .build()
        return _buildings!!
    }

private var _buildings: ImageVector? = null
