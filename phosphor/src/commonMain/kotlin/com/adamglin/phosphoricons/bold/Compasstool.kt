package com.adamglin.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.BoldGroup

public val BoldGroup.CompassTool: ImageVector
    get() {
        if (_compassTool != null) {
            return _compassTool!!
        }
        _compassTool = Builder(name = "CompassTool", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(218.68f, 125.46f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, -21.37f, -10.92f)
                arcToRelative(75.15f, 75.15f, 0.0f, false, true, -27.66f, 29.64f)
                lineToRelative(-13.5f, -30.39f)
                arcTo(44.0f, 44.0f, 0.0f, false, false, 140.0f, 37.68f)
                lineTo(140.0f, 24.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -24.0f, 0.0f)
                lineTo(116.0f, 37.68f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, false, -16.15f, 76.11f)
                lineTo(53.0f, 219.12f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 59.13f, 235.0f)
                arcTo(11.86f, 11.86f, 0.0f, false, false, 64.0f, 236.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 11.0f, -7.13f)
                lineToRelative(23.67f, -53.26f)
                arcTo(99.52f, 99.52f, 0.0f, false, false, 128.0f, 180.0f)
                arcToRelative(102.81f, 102.81f, 0.0f, false, false, 29.39f, -4.32f)
                lineTo(181.0f, 228.87f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 192.0f, 236.0f)
                arcToRelative(11.85f, 11.85f, 0.0f, false, false, 4.86f, -1.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 203.0f, 219.12f)
                lineToRelative(-23.51f, -52.9f)
                arcTo(99.39f, 99.39f, 0.0f, false, false, 218.68f, 125.46f)
                close()
                moveTo(128.0f, 60.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, -20.0f, 20.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 128.0f, 60.0f)
                close()
                moveTo(128.0f, 156.0f)
                arcToRelative(75.8f, 75.8f, 0.0f, false, true, -19.52f, -2.53f)
                lineToRelative(13.3f, -29.92f)
                arcToRelative(43.21f, 43.21f, 0.0f, false, false, 12.44f, 0.0f)
                lineToRelative(13.33f, 30.0f)
                arcTo(79.11f, 79.11f, 0.0f, false, true, 128.0f, 156.0f)
                close()
            }
        }
        .build()
        return _compassTool!!
    }

private var _compassTool: ImageVector? = null
