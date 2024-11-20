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

public val FillGroup.Sailboat: ImageVector
    get() {
        if (_sailboat != null) {
            return _sailboat!!
        }
        _sailboat = Builder(name = "Sailboat", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(160.0f, 140.0f)
                lineTo(160.0f, 72.85f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 7.0f, -2.69f)
                lineToRelative(55.0f, 60.46f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.43f, 10.26f)
                arcToRelative(8.24f, 8.24f, 0.0f, false, true, -6.58f, 3.12f)
                lineTo(164.0f, 144.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 160.0f, 140.0f)
                close()
                moveTo(247.21f, 172.53f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 240.0f, 168.0f)
                lineTo(144.0f, 168.0f)
                lineTo(144.0f, 8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -14.21f, -5.0f)
                lineToRelative(-104.0f, 128.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 32.0f, 144.0f)
                horizontalLineToRelative(96.0f)
                verticalLineToRelative(24.0f)
                lineTo(16.0f, 168.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -6.25f, 13.0f)
                lineToRelative(29.6f, 37.0f)
                arcToRelative(15.93f, 15.93f, 0.0f, false, false, 12.49f, 6.0f)
                lineTo(204.16f, 224.0f)
                arcToRelative(15.93f, 15.93f, 0.0f, false, false, 12.49f, -6.0f)
                lineToRelative(29.6f, -37.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 247.21f, 172.53f)
                close()
            }
        }
        .build()
        return _sailboat!!
    }

private var _sailboat: ImageVector? = null
