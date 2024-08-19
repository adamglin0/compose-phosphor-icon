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

public val BoldGroup.Handgrabbing: ImageVector
    get() {
        if (_handgrabbing != null) {
            return _handgrabbing!!
        }
        _handgrabbing = Builder(name = "Handgrabbing", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(188.0f, 76.0f)
                arcToRelative(31.85f, 31.85f, 0.0f, false, false, -11.21f, 2.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, -48.79f, -11.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 76.0f, 92.0f)
                verticalLineToRelative(16.0f)
                lineTo(68.0f, 108.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, -32.0f, 32.0f)
                verticalLineToRelative(12.0f)
                arcToRelative(92.0f, 92.0f, 0.0f, false, false, 184.0f, 0.0f)
                lineTo(220.0f, 108.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 188.0f, 76.0f)
                close()
                moveTo(196.0f, 152.0f)
                arcToRelative(68.0f, 68.0f, 0.0f, false, true, -136.0f, 0.0f)
                lineTo(60.0f, 140.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(20.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                lineTo(100.0f, 92.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                verticalLineToRelative(28.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                lineTo(140.0f, 92.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                verticalLineToRelative(28.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                lineTo(180.0f, 108.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                close()
            }
        }
        .build()
        return _handgrabbing!!
    }

private var _handgrabbing: ImageVector? = null
