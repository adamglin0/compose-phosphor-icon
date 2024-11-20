package com.adamglin.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.ThinGroup

public val ThinGroup.Folders: ImageVector
    get() {
        if (_folders != null) {
            return _folders!!
        }
        _folders = Builder(name = "Folders", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 68.0f)
                lineTo(153.33f, 68.0f)
                lineToRelative(-28.8f, -21.6f)
                arcToRelative(12.05f, 12.05f, 0.0f, false, false, -7.2f, -2.4f)
                lineTo(72.0f, 44.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 60.0f, 56.0f)
                lineTo(60.0f, 76.0f)
                lineTo(40.0f, 76.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 28.0f, 88.0f)
                lineTo(28.0f, 200.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                lineTo(192.89f, 212.0f)
                arcTo(11.12f, 11.12f, 0.0f, false, false, 204.0f, 200.89f)
                lineTo(204.0f, 180.0f)
                horizontalLineToRelative(20.89f)
                arcTo(11.12f, 11.12f, 0.0f, false, false, 236.0f, 168.89f)
                lineTo(236.0f, 80.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 224.0f, 68.0f)
                close()
                moveTo(196.0f, 200.89f)
                arcToRelative(3.12f, 3.12f, 0.0f, false, true, -3.11f, 3.11f)
                lineTo(40.0f, 204.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                lineTo(36.0f, 88.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                lineTo(85.33f, 84.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 2.4f, 0.8f)
                lineToRelative(29.87f, 22.4f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.4f, 0.8f)
                horizontalLineToRelative(72.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                close()
                moveTo(228.0f, 168.89f)
                arcToRelative(3.12f, 3.12f, 0.0f, false, true, -3.11f, 3.11f)
                lineTo(204.0f, 172.0f)
                lineTo(204.0f, 112.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, -12.0f)
                lineTo(121.33f, 100.0f)
                lineTo(92.53f, 78.4f)
                arcToRelative(12.05f, 12.05f, 0.0f, false, false, -7.2f, -2.4f)
                lineTo(68.0f, 76.0f)
                lineTo(68.0f, 56.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                horizontalLineToRelative(45.33f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 2.4f, 0.8f)
                lineTo(149.6f, 75.2f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.4f, 0.8f)
                horizontalLineToRelative(72.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                close()
            }
        }
        .build()
        return _folders!!
    }

private var _folders: ImageVector? = null
