package com.adamglin.phosphor.phosphoricon.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphor.phosphoricon.RegularGroup

public val RegularGroup.Taxi: ImageVector
    get() {
        if (_taxi != null) {
            return _taxi!!
        }
        _taxi = Builder(name = "Taxi", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.0f, 104.0f)
                lineTo(228.64f, 104.0f)
                lineTo(201.25f, 56.06f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 187.36f, 48.0f)
                lineTo(165.42f, 48.0f)
                lineToRelative(-12.0f, -29.94f)
                arcTo(15.93f, 15.93f, 0.0f, false, false, 138.58f, 8.0f)
                lineTo(117.42f, 8.0f)
                arcToRelative(15.93f, 15.93f, 0.0f, false, false, -14.86f, 10.06f)
                lineTo(90.58f, 48.0f)
                lineTo(68.64f, 48.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -13.89f, 8.06f)
                lineTo(27.36f, 104.0f)
                lineTo(16.0f, 104.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(80.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                lineTo(64.0f, 216.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(80.0f, 184.0f)
                horizontalLineToRelative(96.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineToRelative(24.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(232.0f, 120.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
                moveTo(117.42f, 24.0f)
                horizontalLineToRelative(21.16f)
                lineToRelative(9.6f, 24.0f)
                lineTo(107.82f, 48.0f)
                close()
                moveTo(68.64f, 64.0f)
                lineTo(187.36f, 64.0f)
                lineToRelative(22.85f, 40.0f)
                lineTo(45.79f, 104.0f)
                close()
                moveTo(64.0f, 200.0f)
                lineTo(40.0f, 200.0f)
                lineTo(40.0f, 184.0f)
                lineTo(64.0f, 184.0f)
                close()
                moveTo(192.0f, 200.0f)
                lineTo(192.0f, 184.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(16.0f)
                close()
                moveTo(216.0f, 168.0f)
                lineTo(40.0f, 168.0f)
                lineTo(40.0f, 120.0f)
                lineTo(216.0f, 120.0f)
                close()
                moveTo(56.0f, 144.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                lineTo(80.0f, 136.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                lineTo(64.0f, 152.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 56.0f, 144.0f)
                close()
                moveTo(168.0f, 144.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                lineTo(176.0f, 152.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 168.0f, 144.0f)
                close()
            }
        }
        .build()
        return _taxi!!
    }

private var _taxi: ImageVector? = null
