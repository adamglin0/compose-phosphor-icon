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

public val FillGroup.Applelogo: ImageVector
    get() {
        if (_applelogo != null) {
            return _applelogo!!
        }
        _applelogo = Builder(name = "Applelogo", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.23f, 30.0f)
                arcTo(40.0f, 40.0f, 0.0f, false, true, 167.0f, 0.0f)
                horizontalLineToRelative(1.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                horizontalLineToRelative(-1.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, -23.24f, 18.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -15.5f, -4.0f)
                close()
                moveTo(223.3f, 169.59f)
                arcToRelative(8.07f, 8.07f, 0.0f, false, false, -2.8f, -3.4f)
                curveTo(203.53f, 154.53f, 200.0f, 134.64f, 200.0f, 120.0f)
                curveToRelative(0.0f, -17.67f, 13.47f, -33.06f, 21.5f, -40.67f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -11.62f)
                curveTo(208.82f, 55.74f, 187.82f, 48.0f, 168.0f, 48.0f)
                arcToRelative(72.23f, 72.23f, 0.0f, false, false, -40.0f, 12.13f)
                arcToRelative(71.56f, 71.56f, 0.0f, false, false, -90.71f, 9.09f)
                arcTo(74.63f, 74.63f, 0.0f, false, false, 16.0f, 123.4f)
                arcToRelative(127.0f, 127.0f, 0.0f, false, false, 40.14f, 89.73f)
                arcTo(39.8f, 39.8f, 0.0f, false, false, 83.59f, 224.0f)
                horizontalLineToRelative(87.68f)
                arcToRelative(39.84f, 39.84f, 0.0f, false, false, 29.12f, -12.57f)
                arcToRelative(125.0f, 125.0f, 0.0f, false, false, 17.82f, -24.6f)
                curveTo(225.23f, 174.0f, 224.33f, 172.0f, 223.3f, 169.59f)
                close()
            }
        }
        .build()
        return _applelogo!!
    }

private var _applelogo: ImageVector? = null
