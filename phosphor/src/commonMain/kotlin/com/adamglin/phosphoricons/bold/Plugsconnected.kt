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

public val BoldGroup.PlugsConnected: ImageVector
    get() {
        if (_plugsConnected != null) {
            return _plugsConnected!!
        }
        _plugsConnected = Builder(name = "PlugsConnected", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.49f, 15.51f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.0f, 0.0f)
                lineTo(173.94f, 65.09f)
                lineToRelative(-2.54f, -2.55f)
                arcToRelative(36.05f, 36.05f, 0.0f, false, false, -50.91f, 0.0f)
                lineTo(100.0f, 83.0f)
                lineToRelative(-3.51f, -3.52f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.0f, 17.0f)
                lineTo(83.0f, 100.0f)
                lineTo(62.54f, 120.49f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, 0.0f, 50.91f)
                lineToRelative(2.55f, 2.54f)
                lineTo(15.51f, 223.51f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 17.0f, 17.0f)
                lineToRelative(49.57f, -49.58f)
                lineToRelative(2.54f, 2.55f)
                arcToRelative(36.06f, 36.06f, 0.0f, false, false, 50.91f, 0.0f)
                lineTo(156.0f, 173.0f)
                lineToRelative(3.51f, 3.52f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 17.0f, -17.0f)
                lineTo(173.0f, 156.0f)
                lineToRelative(20.49f, -20.49f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, 0.0f, -50.91f)
                lineToRelative(-2.55f, -2.54f)
                lineToRelative(49.58f, -49.57f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 240.49f, 15.51f)
                close()
                moveTo(118.54f, 176.51f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -17.0f, 0.0f)
                lineTo(79.51f, 154.43f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -17.0f)
                lineTo(100.0f, 117.0f)
                lineToRelative(39.0f, 39.0f)
                close()
                moveTo(176.54f, 118.56f)
                horizontalLineToRelative(0.0f)
                lineTo(156.0f, 139.0f)
                lineToRelative(-39.0f, -39.0f)
                lineToRelative(20.49f, -20.49f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.0f, 0.0f)
                lineToRelative(22.06f, 22.06f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 17.0f)
                close()
                moveTo(85.27f, 33.37f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 21.46f, -10.74f)
                lineToRelative(8.0f, 16.0f)
                arcTo(12.0f, 12.0f, 0.0f, true, true, 93.27f, 49.37f)
                close()
                moveTo(17.27f, 90.63f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 16.1f, -5.36f)
                lineToRelative(16.0f, 8.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -10.74f, 21.46f)
                lineToRelative(-16.0f, -8.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 17.27f, 90.63f)
                close()
                moveTo(238.73f, 165.37f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -16.1f, 5.36f)
                lineToRelative(-16.0f, -8.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 10.74f, -21.46f)
                lineToRelative(16.0f, 8.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 238.73f, 165.37f)
                close()
                moveTo(170.73f, 222.63f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -21.46f, 10.74f)
                lineToRelative(-8.0f, -16.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 21.46f, -10.74f)
                close()
            }
        }
        .build()
        return _plugsConnected!!
    }

private var _plugsConnected: ImageVector? = null
