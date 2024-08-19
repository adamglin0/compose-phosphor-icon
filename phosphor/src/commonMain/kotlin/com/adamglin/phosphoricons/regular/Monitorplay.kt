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

public val RegularGroup.Monitorplay: ImageVector
    get() {
        if (_monitorplay != null) {
            return _monitorplay!!
        }
        _monitorplay = Builder(name = "Monitorplay", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 40.0f)
                lineTo(48.0f, 40.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, false, 24.0f, 64.0f)
                lineTo(24.0f, 176.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, 24.0f, 24.0f)
                lineTo(208.0f, 200.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, 24.0f, -24.0f)
                lineTo(232.0f, 64.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, false, 208.0f, 40.0f)
                close()
                moveTo(216.0f, 176.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                lineTo(48.0f, 184.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f)
                lineTo(40.0f, 64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                lineTo(208.0f, 56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, 8.0f)
                close()
                moveTo(168.0f, 224.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                lineTo(96.0f, 232.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(64.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 168.0f, 224.0f)
                close()
                moveTo(164.44f, 113.34f)
                lineTo(116.44f, 81.34f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 104.0f, 88.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 12.44f, 6.66f)
                lineToRelative(48.0f, -32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -13.32f)
                close()
                moveTo(120.0f, 137.05f)
                lineTo(120.0f, 103.0f)
                lineToRelative(25.58f, 17.0f)
                close()
            }
        }
        .build()
        return _monitorplay!!
    }

private var _monitorplay: ImageVector? = null
