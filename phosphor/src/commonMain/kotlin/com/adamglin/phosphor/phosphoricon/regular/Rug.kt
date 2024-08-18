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

public val RegularGroup.Rug: ImageVector
    get() {
        if (_rug != null) {
            return _rug!!
        }
        _rug = Builder(name = "Rug", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(200.0f, 16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                lineTo(192.0f, 40.0f)
                lineTo(160.0f, 40.0f)
                lineTo(160.0f, 24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                lineTo(144.0f, 40.0f)
                lineTo(112.0f, 40.0f)
                lineTo(112.0f, 24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                lineTo(96.0f, 40.0f)
                lineTo(64.0f, 40.0f)
                lineTo(64.0f, 24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                lineTo(48.0f, 232.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(64.0f, 216.0f)
                lineTo(96.0f, 216.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(112.0f, 216.0f)
                horizontalLineToRelative(32.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(160.0f, 216.0f)
                horizontalLineToRelative(32.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(208.0f, 24.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 200.0f, 16.0f)
                close()
                moveTo(64.0f, 56.0f)
                lineTo(192.0f, 56.0f)
                lineTo(192.0f, 200.0f)
                lineTo(64.0f, 200.0f)
                close()
                moveTo(128.0f, 176.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 6.86f, -3.88f)
                lineToRelative(24.0f, -40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -8.24f)
                lineToRelative(-24.0f, -40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -13.72f, 0.0f)
                lineToRelative(-24.0f, 40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 8.24f)
                lineToRelative(24.0f, 40.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 128.0f, 176.0f)
                close()
                moveTo(128.0f, 103.55f)
                lineTo(142.67f, 128.0f)
                lineTo(128.0f, 152.45f)
                lineTo(113.33f, 128.0f)
                close()
            }
        }
        .build()
        return _rug!!
    }

private var _rug: ImageVector? = null
